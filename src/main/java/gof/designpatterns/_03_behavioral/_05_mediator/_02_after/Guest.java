package gof.designpatterns._03_behavioral._05_mediator._02_after;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class Guest {

  private Integer id;

  private FrontDesk frontDesk = new FrontDesk();

  public void getTowers(int number) {
    this.frontDesk.getTowers(this, number);
  }

  private void dinner(LocalDateTime dateTime) {
    this.frontDesk.ReserveDinner(this, dateTime);
  }

}
