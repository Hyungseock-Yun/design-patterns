package gof.designpatterns._03_behavioral._02_command._02_after;

import gof.designpatterns._03_behavioral._02_command._01_before.Game;

public class GameEndCommand implements Command {

  private Game game;

  public GameEndCommand(Game game) {
    this.game = game;
  }

  @Override
  public void execute() {
    game.end();
  }

  @Override
  public void undo() {
    new GameStartCommand(this.game).execute();
  }
}
