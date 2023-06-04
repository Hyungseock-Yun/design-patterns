package gof.designpatterns._02_structural._06_flyweight._03_java;

public class FlyweightInJava {

  public static void main(String[] args) {
    Integer i1 = Integer.valueOf(10000);
    Integer i2 = Integer.valueOf(10000);

    System.out.println(i1.equals(i2));
  }
}
