package gof.designpatterns._03_behavioral._11_visitor._01_before;

public class Client {

  public static void main(String[] args) {
    Shape rectangle = new Rectangle();
    rectangle.printTo(new Watch());
    Shape triangle = new Triangle();
    Shape circle = new Circle();
  }
}
