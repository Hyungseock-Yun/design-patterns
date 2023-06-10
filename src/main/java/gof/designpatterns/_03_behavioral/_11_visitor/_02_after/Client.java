package gof.designpatterns._03_behavioral._11_visitor._02_after;

public class Client {

  public static void main(String[] args) {
    Shape rectangle = new Rectangle();
    Device device = new Pad();
    rectangle.accept(device);
  }
}
