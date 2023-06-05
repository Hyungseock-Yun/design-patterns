package gof.designpatterns._03_behavioral._02_command._02_after;

import gof.designpatterns._03_behavioral._02_command._01_before.Light;

public class LightOnCommand implements Command {

  private Light light;

  public LightOnCommand(Light light) {
    this.light = light;
  }

  @Override
  public void execute() {
    light.on();
  }
}
