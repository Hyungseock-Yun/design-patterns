package gof.designpatterns._02_structural._01_adaptor._03_java;

import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.HandlerAdapter;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;

public class AdapterInSpring {
  public static void main(String[] args) {
    DispatcherServlet dispatcherServlet = new DispatcherServlet();
    HandlerAdapter handlerAdapter = new RequestMappingHandlerAdapter();
  }
}
