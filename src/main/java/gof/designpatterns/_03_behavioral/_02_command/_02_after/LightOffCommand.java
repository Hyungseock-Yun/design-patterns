package gof.designpatterns._03_behavioral._02_command._02_after;

import gof.designpatterns._03_behavioral._02_command._01_before.Light;

public class LightOffCommand implements Command {
  private Light light;

  public LightOffCommand(Light light) {
    this.light = light;
  }

  @Override
  public void execute() {
    light.off();
  }
}
