package gof.designpatterns._02_structural._02_bridge._01_before;

public class Conqueror아리 implements Champion {

  @Override
  public void move() {
    System.out.println("Conqueror 아리 move");
  }

  @Override
  public void skillQ() {
    System.out.println("Conqueror 아리 skillQ");
  }

  @Override
  public void skillW() {
    System.out.println("Conqueror 아리 skillW");
  }

  @Override
  public void skillE() {
    System.out.println("Conqueror 아리 skillE");
  }

  @Override
  public void skillR() {
    System.out.println("Conqueror 아리 skillR");
  }
}
