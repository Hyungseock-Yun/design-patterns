package gof.designpatterns._03_behavioral._01_chainofresponsibility._02_after;

import gof.designpatterns._03_behavioral._01_chainofresponsibility._01_before.Request;

public class LoggingRequestHandler extends RequestHandler {

  public LoggingRequestHandler(RequestHandler nextHandler) {
    super(nextHandler);
  }

  @Override
  public void handle(Request request) {
    System.out.println("로깅");
    super.handle(request);
  }

}
