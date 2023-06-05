package gof.designpatterns._02_structural._07_proxy._01_before;

import gof.designpatterns._02_structural._07_proxy._02_after.GameServiceProxyInheritance;

public class Client {

  public static void main(String[] args) {
    GameService gameService = new GameService();
    GameService gameServiceProxy = new GameServiceProxyInheritance();
    gameService.startGame();
  }
}
