package gof.designpatterns._03_behavioral._02_command._01_before;

public class Button {

  private Light light;

  public Button(Light light) {
    this.light = light;
  }

  public void press() {
    light.on();
  }

}
