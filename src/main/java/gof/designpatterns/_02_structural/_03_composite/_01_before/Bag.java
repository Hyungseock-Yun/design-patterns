package gof.designpatterns._02_structural._03_composite._01_before;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Bag {

  List<Item> items = new ArrayList<>();

  public void add(Item item) {
    this.items.add(item);
  }

}
