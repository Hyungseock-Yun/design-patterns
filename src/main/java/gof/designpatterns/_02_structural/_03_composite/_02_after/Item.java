package gof.designpatterns._02_structural._03_composite._02_after;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Item implements Component {

  private String name;

  private int price;

//  @Override
//  public String getName() {
//    return this.name;
//  }
//
//  @Override
//  public int getPrice() {
//    return this.price;
//  }

}
