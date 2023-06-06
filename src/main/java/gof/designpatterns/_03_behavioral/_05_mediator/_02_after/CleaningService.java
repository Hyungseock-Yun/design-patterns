package gof.designpatterns._03_behavioral._05_mediator._02_after;

public class CleaningService {

  private FrontDesk frontDesk = new FrontDesk();

  public void getTowers(Integer guestId, int number) {
    String roomNumber = this.frontDesk.getRoomNumberFor(guestId);
    System.out.println("provide " + number + " to " + roomNumber);
  }
}
