/* Copyright (c) 2013 OpenPlans. All rights reserved.
 * This code is licensed under the BSD New License, available at the root
 * application directory.
 */

package org.geogit.storage.blueprints;

import org.geogit.storage.GraphDatabase;
import org.geogit.storage.ObjectDatabase;
import org.geogit.storage.RefDatabase;
import org.geogit.storage.StagingDatabase;
import org.geogit.storage.memory.HeapObjectDatabse;
import org.geogit.storage.memory.HeapRefDatabase;
import org.geogit.storage.memory.HeapStagingDatabase;

import com.google.inject.AbstractModule;
import com.google.inject.Scopes;

/**
 *
 */
public class TinkerGraphTestModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(ObjectDatabase.class).to(HeapObjectDatabse.class).in(Scopes.SINGLETON);
        bind(StagingDatabase.class).to(HeapStagingDatabase.class).in(Scopes.SINGLETON);
        bind(RefDatabase.class).to(HeapRefDatabase.class).in(Scopes.SINGLETON);
        bind(GraphDatabase.class).to(TinkerGraphDatabase.class).in(Scopes.SINGLETON);
    }

}
