package gof.designpatterns._03_behavioral._05_mediator._01_before;

public class Hotel {

  public static void main(String[] args) {
    Guest guest = new Guest();
    guest.getTower(3);
    guest.dinner();

    Restaurant restaurant = new Restaurant();
    restaurant.clean();
  }
}
