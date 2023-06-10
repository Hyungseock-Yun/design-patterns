package gof.designpatterns._03_behavioral._10_template._02_after;

public class Client {

  public static void main(String[] args) {
    FileProcessor fileProcessor = new Multiply("numbers.txt");
    int process = fileProcessor.process();

    System.out.println("process = " + process);
  }
}
