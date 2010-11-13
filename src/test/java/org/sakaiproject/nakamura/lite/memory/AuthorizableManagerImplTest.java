package org.sakaiproject.nakamura.lite.memory;

import org.sakaiproject.nakamura.lite.authorizable.AbstractAuthorizableManagerImplTest;
import org.sakaiproject.nakamura.lite.storage.ConnectionPool;
import org.sakaiproject.nakamura.lite.storage.mem.MemoryStorageClientConnectionPool;

import com.google.common.collect.ImmutableMap;

public class AuthorizableManagerImplTest extends AbstractAuthorizableManagerImplTest {

    @Override
    protected ConnectionPool getConnectionPool() {
        MemoryStorageClientConnectionPool cp = new MemoryStorageClientConnectionPool();
        cp.activate(ImmutableMap.of("test",(Object)"test"));
        return cp;
    }

}