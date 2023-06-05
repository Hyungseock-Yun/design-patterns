package gof.designpatterns._03_behavioral._02_command._02_after;

import gof.designpatterns._03_behavioral._02_command._01_before.Game;

public class GameStartCommand implements Command {

  private Game game;

  public GameStartCommand(Game game) {
    this.game = game;
  }

  @Override
  public void execute() {
    game.start();
  }
}
