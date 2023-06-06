package gof.designpatterns._03_behavioral._05_mediator._02_after;

import java.time.LocalDateTime;

public class Restaurant {

  private FrontDesk frontDesk = new FrontDesk();

  public void reserveDinner(Integer id, LocalDateTime dateTime) {
    String roomNumber = frontDesk.getRoomNumberFor(id);
    System.out.println("dinner for " + roomNumber + " at " + dateTime.toString());
  }
}
