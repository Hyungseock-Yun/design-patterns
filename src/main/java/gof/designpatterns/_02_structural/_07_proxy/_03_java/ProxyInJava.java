package gof.designpatterns._02_structural._07_proxy._03_java;

import gof.designpatterns._02_structural._07_proxy._02_after.DefaultGameService;
import gof.designpatterns._02_structural._07_proxy._02_after.GameService;

import java.lang.reflect.Proxy;

public class ProxyInJava {

  public static void main(String[] args) {
    ProxyInJava proxyInJava = new ProxyInJava();
    proxyInJava.dynamicProxy();
  }

  private void dynamicProxy() {
    GameService gameService = getGameServiceProxy(new DefaultGameService());
    gameService.startGame();
  }

  private GameService getGameServiceProxy(GameService target) {
    return (GameService) Proxy.newProxyInstance(this.getClass().getClassLoader(),
      new Class[]{GameService.class}, (proxy, method, args) -> {
        System.out.println("BEFORE");
        method.invoke(target, args);
        System.out.println("AFTER");
        return null;
      });
  }
}
