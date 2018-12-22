package com.frank.testData;

import com.frank.testData.endpoint.web.HttpVerticle;
import io.vertx.core.AbstractVerticle;
import io.vertx.core.AsyncResult;
import io.vertx.core.Future;

public class MainVerticle extends AbstractVerticle {

  private HttpVerticle httpVerticle;

  @Override
  public void start(Future<Void> startFuture) throws Exception {

    httpVerticle.start();
  }

}
