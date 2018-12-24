package com.frank.testData;

import com.frank.testData.dao.DBVerticle;
import com.frank.testData.endpoint.web.HttpVerticle;
import io.vertx.core.AbstractVerticle;
import io.vertx.core.AsyncResult;
import io.vertx.core.Future;

public class MainVerticle extends AbstractVerticle {

  @Override
  public void start(Future<Void> startFuture) throws Exception {
    Future<String> dbFuture = Future.future();
    // 县初始化DB，再初始化HTTP服务
    vertx.deployVerticle(new DBVerticle(), dbFuture.completer());
    dbFuture.compose(id -> {
        Future<String> httpFuture = Future.future();

        vertx.deployVerticle(new HttpVerticle(), httpFuture.completer());
        // 返回一个future接着解析
        return httpFuture;
    }).setHandler(ar -> {
        if (ar.succeeded()) {
            // 完成整个启动
            System.out.println("");
            startFuture.complete();
        } else {
            // 启动失败
            startFuture.fail(ar.cause());
        }
    });

  }

}
