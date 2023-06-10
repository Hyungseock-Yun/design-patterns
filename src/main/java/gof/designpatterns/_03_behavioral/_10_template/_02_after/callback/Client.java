package gof.designpatterns._03_behavioral._10_template._02_after.callback;

public class Client {

  public static void main(String[] args) {
    FileProcessor fileProcessor = new FileProcessor("numbers.txt");
    int process = fileProcessor.process(((result, number) -> result += number));

    System.out.println("process = " + process);
  }
}
