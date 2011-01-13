/*
 * Licensed to the Sakai Foundation (SF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The SF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package org.sakaiproject.nakamura.lite.authorizable;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;

import org.apache.commons.lang.StringUtils;
import org.sakaiproject.nakamura.api.lite.StorageClientUtils;
import org.sakaiproject.nakamura.api.lite.authorizable.Authorizable;
import org.sakaiproject.nakamura.api.lite.util.Iterables;
import org.sakaiproject.nakamura.lite.storage.RemoveProperty;

import java.util.Map;
import java.util.Set;

/**
 * Base Authorizable object.
 */
public class AuthorizableImpl implements Authorizable {

    private static final Set<String> FILTER_PROPERTIES = ImmutableSet.of(PASSWORD_FIELD, ID_FIELD);

    private static final Set<String> PRIVATE_PROPERTIES = ImmutableSet.of(PASSWORD_FIELD);

    protected Map<String, Object> authorizableMap;
    protected Set<String> principals;

    protected String id;

    protected Set<String> propertiesModified;
    protected boolean principalsModified;

    public AuthorizableImpl(Map<String, Object> autorizableMap) {
        this.authorizableMap = autorizableMap;
        Object principalsB = authorizableMap.get(PRINCIPALS_FIELD);
        if (principalsB == null) {
            this.principals = Sets.newLinkedHashSet();
        } else {
            this.principals = Sets.newLinkedHashSet(Iterables.of(StringUtils.split(
                    StorageClientUtils.toString(principalsB), ';')));
        }
        this.id = StorageClientUtils.toString(authorizableMap.get(ID_FIELD));
        propertiesModified = Sets.newHashSet();
        principalsModified = false;
    }

    public String[] getPrincipals() {
        return principals.toArray(new String[principals.size()]);
    }

    public String getId() {
        return id;
    }

    // TODO: Unit test
    public Map<String, Object> getSafeProperties() {
        if ( principalsModified ) {
            authorizableMap.put(PRINCIPALS_FIELD, StringUtils.join(principals, ';'));
        }
        return StorageClientUtils.getFilterMap(authorizableMap, null, FILTER_PROPERTIES);
    }

    public static boolean isAGroup(Map<String, Object> authProperties) {
        return (authProperties != null)
                && GROUP_VALUE.equals(StorageClientUtils.toString(authProperties
                        .get(AUTHORIZABLE_TYPE_FIELD)));
    }

    public static boolean isAUser(Map<String, Object> authProperties) {
        return (authProperties != null)
                && USER_VALUE.equals(StorageClientUtils.toString(authProperties
                        .get(AUTHORIZABLE_TYPE_FIELD)));
    }

    public static boolean isAuthorizable(Map<String, Object> authProperties) {
        return (authProperties != null) && !authProperties.containsKey(AUTHORIZABLE_TYPE_FIELD);
    }

    public void setProperty(String key, Object value) {
        if (!FILTER_PROPERTIES.contains(key)) {
            Object cv = authorizableMap.get(key);
            if (!value.equals(cv)) {
                authorizableMap.put(key, value);
                propertiesModified.add(key);
            }

        }
    }

    public Object getProperty(String key) {
        if (!PRIVATE_PROPERTIES.contains(key)) {
            return authorizableMap.get(key);
        }
        return null;
    }

    public void removeProperty(String key) {
        if (authorizableMap.containsKey(key)) {
            authorizableMap.put(key,new RemoveProperty());
            propertiesModified.add(key);
        }
    }

    public void addPrincipal(String principal) {
        if (!principals.contains(principal)) {
            principals.add(principal);
            principalsModified = true;
            
        }
    }

    public void removePrincipal(String principal) {
        if (principals.contains(principal)) {
            principals.remove(principal);
            principalsModified = true;
        }
    }

    public Map<String, Object> getPropertiesForUpdate() {
        if ( principalsModified ) {
            authorizableMap.put(PRINCIPALS_FIELD, StringUtils.join(principals, ';'));
            propertiesModified.add(PRINCIPALS_FIELD);
        }
        return StorageClientUtils.getFilterMap(authorizableMap, propertiesModified, FILTER_PROPERTIES);
    }

    public void reset() {
        principalsModified = false;
        propertiesModified.clear();
    }

    public boolean isModified() {
        return principalsModified || (propertiesModified.size() > 0);
    }

    public boolean hasProperty(String name) {
        return authorizableMap.containsKey(name);
    }

}
