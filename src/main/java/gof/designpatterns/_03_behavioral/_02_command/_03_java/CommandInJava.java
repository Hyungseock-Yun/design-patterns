package gof.designpatterns._03_behavioral._02_command._03_java;

import gof.designpatterns._03_behavioral._02_command._01_before.Game;
import gof.designpatterns._03_behavioral._02_command._01_before.Light;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CommandInJava {

  public static void main(String[] args) {
    Light light = new Light();
    Game game = new Game();
    ExecutorService executorService = Executors.newFixedThreadPool(4);
    executorService.submit(light::on);
    executorService.submit(game::start);
    executorService.submit(game::end);
    executorService.submit(light::off);
    executorService.shutdown();
  }
}
