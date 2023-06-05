package gof.designpatterns._03_behavioral._01_chainofresponsibility._02_after;

import gof.designpatterns._03_behavioral._01_chainofresponsibility._01_before.Request;

public abstract class RequestHandler {

  private RequestHandler nextHandler;

  public RequestHandler(RequestHandler nextHandler) {
    this.nextHandler = nextHandler;
  }

  public void handle(Request request) {
    if (nextHandler != null) {
      nextHandler.handle(request);
    }
  }
}
