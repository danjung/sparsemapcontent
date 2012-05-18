rSmart Sparsemapcontent Changelog
=================================

org.sakaiproject.nakamura.core-1.3.4.1-rsmart
---------------------------------------------
* NOJIRA try to fix mvn release df2897f
* NOJIRA rev minor version of artifact id 94b4cc6
* ACAD-998 reconcile pom.xml with release tag c21cdf1

org.sakaiproject.nakamura.core-1.3.4
------------------------------------
* [maven-release-plugin] prepare release org.sakaiproject.nakamura.core-1.3.4 d0287f3
* SPARSE-187 update extensions core dependency to 1.3.4 badb45e
* [maven-release-plugin] prepare for next development iteration d88ae84
* [maven-release-plugin] prepare release org.sakaiproject.nakamura.core-1.3.3 48ee210
* SPARSE-175 more readme fixes. 8e3593e
* SPARSE-175 more readme fixes. 5e77cf2
* SPARSE-175 update committer list; fix typos in readme. 7d61afd
* [maven-release-plugin] prepare for next development iteration dedea7d
* [maven-release-plugin] prepare release org.sakaiproject.nakamura.core-1.3.2 68dc944
* KERN-2690 update core <version> to 1.3.2 dbe1c88
* [maven-release-plugin] prepare for next development iteration 1edf839
* [maven-release-plugin] prepare release org.sakaiproject.nakamura.core-1.3.1 627932c
* NOJIRA Setting version to 1.3.1 for upcoming release of OAE 1.2.0. b7b1e45
* KERN-2603 use entrySet() instead of keySet() b2c6a8e
* KERN-2603 Add unit test coverage for metadata on a version. 444737a
* KERN-2603 add include metadata option when saving a version e6144a9
* updating version numbers for a 1.3-20120228 tag ebbff82
* KERN-2584 Incorrect password is a user error, so it needs IllegalArgumentException instead of StorageClientException c81295d
* reduce event payload by not copying content properties during triggerRefresh and triggerRefreshAll 82c2eb7

org.sakaiproject.nakamura.core-1.3.3.2-rsmart
---------------------------------------------
* [maven-release-plugin] prepare release org.sakaiproject.nakamura.core-1.3.3.2-rsmart 4615ce6
* ACAD-1030 rollback artifact version to next release version d0e8fda
* ACAD-1030 rev'd pom to reflect cherry-picked fixes 609d95e
* ACAD-1030 merged: SPARSE-193 Do not send deleted SparseMapContent records to indexing and migrator clients 6ed6130
* reduce event payload by not copying content properties during triggerRefresh and triggerRefreshAll 63b6163
* [maven-release-plugin] prepare for next development iteration e337cfe

org.sakaiproject.nakamura.core-1.3.3.1-rsmart
---------------------------------------------
* [maven-release-plugin] prepare release org.sakaiproject.nakamura.core-1.3.3.1-rsmart 8995127
* Merge pull request #4 from rSmart/ACAD-977 d911d14
* ACAD-977 prepare for a 1.3.3.1 maint release ac31793

org.sakaiproject.nakamura.core-1.3.3-rsmart
-------------------------------------------
* [maven-release-plugin] prepare release org.sakaiproject.nakamura.core-1.3.3-rsmart-SNAPSHOT 1e6f140
* Revert "NOJIRA trying to get release plugin to run" f96030e
* [maven-release-plugin] prepare for next development iteration 5cbe382
* [maven-release-plugin] prepare release org.sakaiproject.nakamura.core-1.3.2-rsmart 3c2a49e
* NOJIRA switch back to SNAPSHOT d3d0173
* NOJIRA s/solr/sparsemapcontent dur 24fe218
* [maven-release-plugin] prepare release org.sakaiproject.nakamura.core-1.3.2-rsmart dd5b10c
* NOJIRA switch back to SNAPSHOT 62a47cc
* [maven-release-plugin] prepare release org.sakaiproject.nakamura.core-1.3.2-rsmart 115a0a9
* NOJIRA XML parse error e929b02
* NOJIRA trying to get release plugin to run 7dd6e72
* NOJIRA prepare for release plugin ecc7ac8

1.3.2-rsmart
------------
* ACAD-751 Add sparse index fields to build (as opposed to using sparseconfig) d7b0b39

acad-1.3.1
----------
* ACAD-255 added Ian's patch to ConfigurationImpl and rev'd maven artifact to reflect local change to sparse 484c6cd

org.sakaiproject.nakamura.core-1.3
----------------------------------
* [maven-release-plugin] prepare release org.sakaiproject.nakamura.core-1.3 e2ece76
* Fixed test provided by Zach fd88f7b
* fixed #124 c437a25
* Fixed the property set test failing second time or with dirty data. 9db129c
* Fixed index names when a property name is too wide for Oracle 1af876f
* Fixed a bug in the move operation when the target has been deleted. 9a403da
* Fixed drivers poms, now using parent. 523c07a
* Fixed #126, removes just the compiled permissions that are changed from the cache. cd0a178
* Fixed #125   Anyone using an existing schema needs to run the upgrade script. d11605f
* Missed from last commit cf105ca
* Renamed default resources to more closely represent what they do (ie everything) 2fad855
* Extended integration tests to cover arrays and types. Fixed issue with wrong resource being created and clarified protocol in that respect
* Added authentication framework and parameter based processing. cbb9a9f
* Started to add integration tests 52393dd
* Fixed bug in launcher with non jar bootstraps. 9242db8
* Added default get handling for properties. a1a9391
* Fixed mapping issue in resource handler. 643e4fd
* Pulled in Solr bundle 319c8cb
* Moved webdav to a threaded based session tracker. 0d6fb30
* Unused import. f1153a8
* Test coverage for templates. e8b4a07
* Added unit tests for resource resolution. 5310df5
* fixed #121, added the resource type to the event. f3a9afc
* Added JAXRS and resources bundles to extensions build. 032c7cb
* Added the start of response binding on resolution. 35e0759
* General cleanup with conversion of supress warnings to more appropiate values for 1.6 198b743
* Added JAX-RS based resource resolver and fixed poms. a2770c2
* Mapped JAXRS to root location afc8e90
* Added javadoc to session tracker and session tracker impl cf6b4a6
* Fixed #117 07f2156
* Added JAX-RS container. 53e437d
* Rebound all poms to the latest released versions and removed relative paths from the poms. d1f1816
* [maven-release-plugin] prepare for next development iteration cc7b2f9

org.sakaiproject.nakamura.core-1.2
----------------------------------
* [maven-release-plugin] prepare release org.sakaiproject.nakamura.core-1.2 3648b4b
* [maven-release-plugin] prepare release core-base-2 a0feb20
* Using parent source jar definition. 5c2f39c
* Fixed #105 Migration process is cache aware Also addressed issues with SQL validation. Connection.checkValid(..) is not implemented in some JDBC drivers. 7b3ee3b
* Made proxy tokens applicable to all storage types. d6a9ba8
* Fixed rendering of vivo rdf-types to transition referential links in the graph. 0f2d0e1
* Mongo tests break the build, moved to manual. More fool me should not have merged on GitHub without checking more carefully. f2c01e6
* Eliminated caching of services and cyclic dependencies. 0526e08
* Added lazy resolution of linked data with caching to proxy processor. 45f0e51
* Updated templates and proxy definitions to handle types with lazy resolution of linked data 92245c6
* Corrected some tree resolution issues. 063e979
* Added basic static application files for work woth Vivo 4893c2b
* Fixed the proxy processor to work with RDF from real sources. dfacb38
* Fixed some issues with the aliases and now using nio to deliver static files. c41a673
* Refactored to reorganise bundles and make it easier to manage static files. 52375a2
* Fixed webdav pom 36bc625
* Fixed app pom e5767d8
* Rewrote batch service and optimised 9011572
* Extracted the template service from the proxy service and created a new bundle. 88cc4e1
* Made the tests run in a reasonable ammount of time on a real network. 6498356
* Added support for static mapping and mimetypes 3543eee
* left import behind. 52ff010
* The Mongo patch was preventing normal operation, I have made its imports optional and disabled it. 1e97414
* Fixed some issues with the memory bundle not exposing config. 649b3d0
* Extended jetty config to serve static files. b2198d7
* Proxy integrated into a standalone config. 4dda821
* Refactored proxy now working for Vivo RDF. 88fe32f
* Modified the memory service to make it configurable. Fixed #111 0c58ef1
* Some additional adjustments to the last commit, may not be necessary, but belt and braces. 5daa379
* NOJIRA added validation of Connections in the ConnectionHolder.get() operation anytime the last validation was > 2 min. ago 9cd5850
* Added update method to support admin managed counts on authorizables. Deprecated maintanence mode since its been found to be unsafe. Change the name to break any upstream code that depends on it and force re-evaluation of that use. I don't like changing apis, but in this case its better than data corruption though poor api design and usage. 992be8f
* Added unit test coverage and template processing for RDF streams. d937e5f
* Added a PostProcessor to convert RDF to Json. aa8f915
* Ported all the existing proxies to the new format 100a0aa
* Added new Proxy bundle Added RDF To Json conversion utilities Added Vivo Proxy test 597ea8d
* Rebound to an OSGi version of guava, and fixed startup issues. 30909bb
* FIxed minor issues, imports, and warnings that have been checked. e5a91eb
* Fixed build issues with Zachs Gurav patch. This has not been spun up, and there may be more fixes to come. 76fabe6
* KERN-1938 upgrade one last class to guava: FileRedoReader f78e0dc
* upgrading from google collections to guava r09 46c16ac
* forward looking fix to #102 cant do anything about the 1.1 release, its gone out. 1e116fe
* fixed #103 3599889
* Added Vivo  RDF-Json support bundle. 4bbbdb8
* Bound to released versions of google collections and to dev version of core. 320394f
* Cleaned up experments in jetty bundles 3e54a9f
* Bound to released versions of core and core-base. ccfcab2
* Removed FSresource webdav implementation for the moment ba148f7
* [maven-release-plugin] prepare for next development iteration 34b2417

org.sakaiproject.nakamura.core-1.1
----------------------------------
* [maven-release-plugin] prepare release org.sakaiproject.nakamura.core-1.1 024fa37
* [maven-release-plugin] prepare for next development iteration 70c39c4
* [maven-release-plugin] prepare release core-base-1 7013bb8
* fixed #98 26dd833
* Even more javadoc. 586a9a5
* Added more javadoc. 1883b40
* Ported memory bundle from Nakamura to eliminate dep on ResourceLoader in utils. c16fad2
* Removed ResourceLoader as it conflicts with other bundles, will need to create a lite utils package to allow memory service to work, or patch memory service not to use ResourceLoader. 1b156c2
* Fixed #94 Fixed #97 Added dependecy graph to PropertyMigrators to ensure that only those that have fully resolved dependencies run. Also added some unit test coverage. 287d211
* Excluded conflicting log4j. a4fe4bc
* fixed #93 added a service that can be used by a Servlet. 78fbe13
* Missed this on the last commit, ensures deleted files are deleted. a9f4720
* Corrected the way removeFromCache worked and fixed a remove bug in ContentManagerImpl 7763d42
* Fixed possible update of deleted item, not a perfect solution but conforms to BASIC principals. f71fb18
* Set the Content component listener to null incase the client was returned to the pool. bf90a7e
* Added missing javadoc. 682ae45
* Fixed #95 and #96 to address issues raised in https://github.com/ieb/sparsemapcontent/pull/89 see discussion there for more detail. 6e4c43a
* Prepared test cases to gather information for report. 7a222b6
* Added scaling tests, and made them comparable. 1e22110
* Added scaling tests for MySQL e6d6e04
* Added SQL for wide columns, only tested MySQL ed026b9
* Fixed issues with the lk column family b265a28
* Added locking support to Oracle ab49ae3
* Added locking queries to Derby 6a9fd9b
* Added specific lock tables for Derby and PostgreSQL 0b097f9
* Added specific tables to support the lock manager. 450d460
* Restructured webdav bundle to make way for serving content from the file system. Work in progress 0af9585
* There were some naming errors with the root folder. 7517b47
* Cleaned up locking api and made better provision for refreshing locks. 392f64f
* More javadoc clarifications. 7149533
* Logging clean up e29a010
* Fixed locking in the MiltonContentResource 04de448
* Upgraded to latest version of milton and removed litmus fixes to milton. Although milton fails to pass all litmus tests it works just find for Finder so its probably ok for now. 8ff7772
* Improved Javadoc to explain the purpose better. 3bd4360
* Integrated lock manager into the Dav Resource. Modified the Lock manager storage to store dav lock information in extra field. 489c5d5
* Completed Lock manager, with test coverage. fixed #88 2f77f7a
* Got to about 90% litmus compliance of Dav1, added Dav2 support. Added Lock manager impl (untested) Made Caching configuration more extensible for  wider range of column families 482781c
* Added request scope transactions, starting to fix propfind and propset webdav implementation d0a09e3
* Fixed some problems with litmus tests. 1c43424
* Remove Digest authentication since it relies on clear text passwords or MD5 hashes of passwords on the server and neither are secure enough, even if the password is not transmitted. Basic Auth over SSL is supported. ce64480
* Adjusted AuthN to make it work for anon users. 21e0f43
* Resolved dependencies on the milton bundle. 4ba94b6
* Added standalone app, started to add webdav support. 44efb75
* Added timings for listing child nodes. 11170ee
* Adjusted the slow query indexers to make them less intrusive b135b38
* Fixed #85. MySQL performance degredation is due to using a Key Value indexer. affee63
* Removed unsafe public char[] 0158850
* newInstance return is never null. c89fe27
* Fixed issue with unnecesary toString and in efficient inner class. 94d7371
* Fixed a bunch of potential NPEs, close issues and made sure admin is not denied access to properties. 4ed010f
* woops, broke the build. fbc6956
* Fixed out of bounds expception 056c531
* Added a parent pom fixing #84 723fde1
* fixed #82 4245752
* Added sakaiproject back in while we need thrift and cassandra from there. 2bfc392
* Corrected further bad use of constants 08e9101
* Corrected use of constants in test. 03b9843
* Incorrect release download url cea681d
* Adjusted repos 0141d1d
* [maven-release-plugin] prepare for next development iteration 0ada296

org.sakaiproject.nakamura.core-1.0
----------------------------------
* [maven-release-plugin] prepare release org.sakaiproject.nakamura.core-1.0 391254c
* KERN-2193 fixed. d921d44
* KERN-2192 Fixed. 8a0e6f0
* Follow up commit on migration, fixing some problems getting the service up in OSGi. 6bc9425
* KERN-2187 fixed d277664
* New objects cant be updated, otherwise all the things that happen when an authorizable is created, like an immutable ID, wont happen. ebd56e1
* Spelling. 3362925
* KERN-2186 Missed deleting a file, 232f496
* KERN-2186 Added MigrateContentComponent.java and PropertyMigrator.java to support migration of content objects. a7d1292
* Added stack based reference counting while compiling permissions to ensure that the session will be able to load all the ACLs, even if those acls cant be read by the current session. da3a34a
* Added Migration Utility to re-index on wide columns if requried. 2f446b4
* Removed more logging 3a6bc88
* Removed loggin left behind during testing. 1901be7
* Cleaned up Logging. 054634e
* Tests for array columns must use columns that are arrays. 9b33be4
* Added Optimized queries for wide list children and count 747f453
* Must use an array column to test array operations. b77caf0
* All content operations working, finders not completely working with Wide strings. b9edc13
* Indexing mostly written bd7af76
* Switched to generating the index table and using real column names. It should make the queries more readable. 3976769
* Fixed Unit test that was targeting the key value indexers but getting the wide column indexer. This version works in Nakamura with no harm using key value indexers. b9a4fb5
* KERN-1957 Abstracted all the indexing and finder classes into one location. The Mocked Unit tests are broken but the real tests against real databases work fine. d876914
* KERN-1957 Implemented wide table index support. f43e4a8
* Added ability to disable internal passwords. 1004356
* Removed Hbase and deps from final jar till we are certain its a good thing to add d64a813
* Hbase pulls in gurav, so we must exlude that from upstream deps. affd0fa
* Missing Hbase dependencies, were breaking the build, now fixed ee6e97c
*  KERN-2156 Missed a file. c25bb45
* KERN-2156 Fixed. The Unit test provided by Mark Triggs was run for about 2 hours in 64M with no problems. Proving no memory or resource leaks is a bit hard, but it looks like this one is fixed. If someone could test against Oracle that would confirm the fix. 97f2216
* KERN-2138 Fixed configuration bugs identified by Ray, added unit test and fixed sp in method name, which will require update to Nakamura be6e0ae
* KERN-2138 Made Sparse ID field confugurable, defaulting to _id c480649
* KERN-2130 Fixed bad Oracle SQL e700560
* Moved tests out of main build. b063a34
* Added KeyValue test to simulate current usage 0b73c74
* Added experimental to test a wide index table on Derby. 81e57b9
* Patch from Dave Roma to make it easier to work out how to run DB specific tests 5c62ee7
* Unused Imports, bad indentation and spelling. 0ef1e5d
* Implemented counting for content queries inside the driver. Tested for JDBC drivers (Derby, MySQL, PostgreSQL) Not tested for Oracl, no access to databse. See JavaDoc on ContentManager.count(...) for usage 655a831
* KERN-2117 Added mechanism to allow things that use the find methods the ability to select a custom query mechanism. Modified the listChildren method to select a custom query added a listchildren custom query to the SQL configuration for each database currently supported. Tested on Derby, MySQL and PostreSQL. Not Tested on Oracle (no access to an Oracle instance) e81c15c
* Added some protection against copying from invalid content objects, should alow admins to fix the problem or at least know there is one. 038c6af
* Exposed setMaintanenceMode in the ContentManager API. 562004d
* KERN-2096 Fixed, only when the Content Manager is in maintanence mode, is it allowed to bypass field protection. Previously all admin sessions were able to bypass field protection. 5b3a221
* Improved Logging in the Caching Manager for debug level a56c445
* KERN-2102 Added store-base-dir to config properties for all pool. Will be ignored for ones not using FS storage. 679ebe0
* Adjusted pom for releases 20e9b4f
* Some of the protected properties were incorrectly being interpreted as principals. ef5d341
* Fixed potential NPE 51db8cd
* The client impls return empty maps rather than nulls 83a75f0
* Fixed bug in content manager writeBody that would cause a writeBody on a non existent content object to fail silently. Now the content item is created. a223f0a
* Exists was returning true where an empty structure object was present, with no content object. This should have never happened, but this patch fixes that. 53f3318
* Reduced logging levels 48d3cf6
* KERN-2038 Fixed e67db92
* Problem with compenddium pulling a bad version of the servlet jar breaking upstream builds e6d773c
* KERN-2028 Fixed, some of the tests needed adjusting. 1 because the granted denied markers were not being used. 2. becuase the order in which the modifications was wrong. 7baddf8
* Fixed NPE on test failiure. 3c95a1e
* Futher edits to the legal files to cover earlier contributions 361bfa8
* Corrected some inacuracies in the legal files. 9fd1bcc
* Added missing legal files. a250146
* KERN-1942 MySQL 5.1 appears to deadlock b32c827
* KERN-2005 added SQL migration script for previous commit. c0f3928
* KERN-2005 Fixed 89e0913
* Patch from Aadish, fixes row key encoding for find records in the Cassandra client. 8cedfe1
* Reconfigured test repo a3bd067
* Added some logging to make it easier to debug configuration d5a11cf
* KERN-1991 Fixed. Configuration can be achieved in 2 ways, via a properties file on the classpath or via system property or via OSGi config on the ConfigurationImpl component. 812132d
* Getting SQL Config should not always force binding to a connection. 248bb1e
* Unused import 15b1a8a
* Missing serialVersionUID 4699ad1
* Fixed long string type test so it saves long strings under target. 6ee70cb
* Fixed unit tests so they place the file store under target and avoid creating lots of test junk. faeca4a
* KERN-1971 Potential Fix, we dont update anymore since Oracle JDBC doesnt give sufficient feedback, we delete and insert. 412a319
* KERN-1960 Slightly modified access to the Length param for streams. c6aea6d
* KERN-1962 All internal IDs are suffixed with + df26a5b
* KERN-1961 ACL keys now seperate the zone from the path with a ; 519626c
* KERN-1955 Fixed, we now consider and cache all groups that the user is a member of as well as all principals. f7725e5
* KERN-1950 Fixed, changed the interpretation of response codes for Oracle JDBC 0377f62
* KERN-1949 Fixed, added the missing columns. 155db4e
* KERN-1936 Fixed 81b898a
* KERN-1936 Switchingback to Class.forName() as there is some service registraton being missed by the OSGi classloader. 9a68025
* Fixed NPE and added log message to warn of problems with repository activation. 8beaae9
* KERN-1928 Fixed 90497c7
* KERN-1927 Added some drivers to make it easier for anyone deploying Cassandra or Postgres 9ee034f
* KERN-1927 Fixed, removed all embedded bundles other than Derby from the Sparse Build. Thrift, Cassandra and MySQL Drivers will now have to be loaded as seperate bundles. Only the MySQL JDBC jar as an OSGi manifest, all the others do not. I will create a subfolder to create those bundles by manual build. 76aded0
* KERN-1912 Fixed made StorageClientUtils a bit more sopisticated, and checked all places where it matters. f14be06
* Unused variable 3ee92be
* Added WekReference caching to LongStrings to avoid the case where toString is called many times resulting in repeated reads from the filesystem. The value should get cleaned up if the JVM is tight on memory. 40d1357
* KERN-1920 This is implemented with some limited test coverage. At the moment its disabled as it may   disable the V1 release. To enable set long-string-size to the maximum size of property strings you   want to store in the BLOB of the object. I would suggest that you set this to a value larger than   will even be encountered by a proeprty that is mentioned explicity in the code (eg > 4096). If any   property that is mentioned in the code base and cast as a (String) is treated as a LongString a   ClassCastException will be thrown. af5d07a
* Renamed Oracle tests to comform with the other Unit tests that require a DB. 000abde
* KERN-1915, Postgres Unit test should not be active by default. 2163a92
* KERN-1915 Added support for PostgreSQL, unit tests configured to work against v9, but will probably work for v8 b549870
* Removed drop statements from DDL as these are quite dangerous for those thinking of production. Dangerous == lose all your data when you restart. 77cbcdd
* KERN-1895 Fixed 7a6534e
* Changed parameter name in api to correctly indicate what it does, and added unit test coverage for the copy operation. 24ab6d6
* Corrected log message to make it more informative cabc182
* Fixed Javadoc to inform clients not to create detached Content objects and expect them to magically be connected to the the underlying content system. Fixed the listChild* iterators to respond with empty iterators where a used has created Content instance detatched from the content system and all other content items. 1071843
* KERN-1844 added some extra checks to prevent connections being used from a closing connection manager 51f4b52
* Fixed unnecessary updates to Authorizables that were not modified. Event Topic now correct, will need to adjusts OSGi listeners for UPDATED topics as well as ADDED in main code based (will do that in a moment) 4705f8e
* Allow update of protected content fields on content creation by the admin user. This patch is to allow Zach to migrate content and not modify the _created, id, _lastModified, _lastModifiedBy, _createdBy fields. 0b4abe8
* Cleaned some compile warnings. 24b1deb
* Added javadoc to the Authorizable class. 6c5392d
* Removed stray info level logging. 280d520
* Stoped system fields generating a warning. 0605e42
* KERN-1795 KERN-1800 Almost impossible to count changes in properties without knowing the status before the event was fired, so now including it in the event streem. This may have problems if there are rapid updates of property sets. ba0795c
* KERN-1652 Provided test coverage for tokens with plugins 56a4928
* Moving to next version after tag eecc13e
* KERN-1652 Increased unit test coverage for ACL Tokens and fixed some bugs. Appears to be working, but needs some more checking. c083a37
* Reverted back to snapshot 69b0bf9
