package gof.designpatterns._03_behavioral._01_chainofresponsibility._02_after;

import gof.designpatterns._03_behavioral._01_chainofresponsibility._01_before.Request;

public class PrintRequestHandler extends RequestHandler {

  public PrintRequestHandler(RequestHandler nextHandler) {
    super(nextHandler);
  }

  @Override
  public void handle(Request request) {
    System.out.println(request.getBody());
    super.handle(request);
  }

}
