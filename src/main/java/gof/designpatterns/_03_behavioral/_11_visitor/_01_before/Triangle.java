package gof.designpatterns._03_behavioral._11_visitor._01_before;

public class Triangle implements Shape {

  @Override
  public void printTo(Device device) {
    if (device instanceof Phone) {
      System.out.println("print Triangle to phone");
    } else if (device instanceof Watch) {
      System.out.println("rint Triangle to watch");
    }
  }

}
