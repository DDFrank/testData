package com.frank.testData.dao;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Future;
import org.jooq.DSLContext;
import org.jooq.impl.DSL;
import org.jooq.impl.DataSourceConnectionProvider;

/**
 * .Description: Author: 金君良 Date: 2018/12/22 0022 上午 11:33
 */
public class DBVerticle extends AbstractVerticle {

    private DSLContext dslContext;

    @Override
    public void start(Future<Void> startFuture) throws Exception {
        //dslContext = DSL.using()

    }

}
