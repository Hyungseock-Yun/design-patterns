package gof.designpatterns._03_behavioral._05_mediator._02_after;

import java.time.LocalDateTime;

public class FrontDesk {

  private CleaningService cleaningService = new CleaningService();

  private Restaurant restaurant = new Restaurant();

  public void getTowers(Guest guest, int number) {
    cleaningService.getTowers(guest.getId(), number);
  }

  public String getRoomNumberFor(Integer guestId) {
    return "1111";
  }

  public void ReserveDinner(Guest guest, LocalDateTime dateTime) {
    restaurant.reserveDinner(guest.getId(), dateTime);
  }
}