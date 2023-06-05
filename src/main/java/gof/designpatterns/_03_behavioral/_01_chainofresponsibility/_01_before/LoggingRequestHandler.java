package gof.designpatterns._03_behavioral._01_chainofresponsibility._01_before;

public class LoggingRequestHandler extends RequestHandler {

  @Override
  public void handler(Request request) {
    System.out.println("로깅");
    super.handler(request);
  }
}
