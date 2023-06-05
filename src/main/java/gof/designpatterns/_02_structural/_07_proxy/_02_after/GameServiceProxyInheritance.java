package gof.designpatterns._02_structural._07_proxy._02_after;

import gof.designpatterns._02_structural._07_proxy._01_before.GameService;

// 상속을 이용한 Proxy 패턴
public class GameServiceProxyInheritance extends GameService {

  @Override
  public void startGame() {
    long before = System.currentTimeMillis();
    super.startGame();
    System.out.println(System.currentTimeMillis() - before);
  }
}
