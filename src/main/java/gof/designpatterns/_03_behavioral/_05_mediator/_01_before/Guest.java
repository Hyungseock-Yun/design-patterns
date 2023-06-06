package gof.designpatterns._03_behavioral._05_mediator._01_before;

public class Guest {

  private Restaurant restaurant = new Restaurant();

  private CleaningService cleaningService = new CleaningService();

  public void getTower(int number) {
    cleaningService.getTower(this, number);
  }

  public void dinner() {
    restaurant.dinner(this);
  }
}
