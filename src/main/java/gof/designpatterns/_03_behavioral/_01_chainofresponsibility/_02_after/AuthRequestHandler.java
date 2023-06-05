package gof.designpatterns._03_behavioral._01_chainofresponsibility._02_after;

import gof.designpatterns._03_behavioral._01_chainofresponsibility._01_before.Request;

public class AuthRequestHandler extends RequestHandler {

  public AuthRequestHandler(RequestHandler nextHandler) {
    super(nextHandler);
  }

  @Override
  public void handle(Request request) {
    System.out.println("인증이 되었는가?");
    super.handle(request);
  }

}
