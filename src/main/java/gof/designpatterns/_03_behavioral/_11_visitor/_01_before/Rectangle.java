package gof.designpatterns._03_behavioral._11_visitor._01_before;

public class Rectangle implements Shape {

  @Override
  public void printTo(Device device) {
    if (device instanceof Phone) {
      System.out.println("print Rectangle to phone");
    } else if (device instanceof Watch) {
      System.out.println("rint Rectangle to watch");
    }
  }
}
