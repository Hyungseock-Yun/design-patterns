package gof.designpatterns._03_behavioral._02_command._01_before;

/**
 * 처리 방법이 바뀌면 코드도 바뀜
 * ex) Light -> Game
 */
public class MyApp {

  private Light light;

  private Game game;

  public MyApp(Light light) {
    this.light = light;
  }

  public MyApp(Game game) {
    this.game = game;
  }

  public void press() {
//    light.on();
    game.start();
  }

  public static void main(String[] args) {
    Button button = new Button(new Light());
    button.press();
    button.press();
    button.press();
    button.press();
  }
}
