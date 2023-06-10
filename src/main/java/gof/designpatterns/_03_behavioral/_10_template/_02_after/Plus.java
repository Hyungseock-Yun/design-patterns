package gof.designpatterns._03_behavioral._10_template._02_after;

public class Plus extends FileProcessor {

  public Plus(String path) {
    super(path);
  }

  @Override
  protected int getResult(int result, int number) {
    return result += number;
  }
}
