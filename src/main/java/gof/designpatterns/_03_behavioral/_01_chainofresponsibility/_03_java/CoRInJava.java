package gof.designpatterns._03_behavioral._01_chainofresponsibility._03_java;

import jakarta.servlet.*;

import java.io.IOException;

public class CoRInJava {

  public static void main(String[] args) {
    Filter filter = (request, response, chain) -> {
      // TODO 전처리
      chain.doFilter(request, response);
      // TODO 후처리
    };
  }

}
