package gof.designpatterns._03_behavioral._10_template._02_after;

public class Multiply extends FileProcessor {

  public Multiply(String path) {
    super(path);
  }

  @Override
  protected int getResult(int result, int number) {
    return result *= number;
  }
}
