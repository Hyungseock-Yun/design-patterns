package gof.designpatterns._03_behavioral._10_template._01_before;

public class Client {

  public static void main(String[] args) {
    FileProcessor fileProcessor = new FileProcessor("numbers.txt");
    int process = fileProcessor.process();

    System.out.println("process = " + process);
  }
}
