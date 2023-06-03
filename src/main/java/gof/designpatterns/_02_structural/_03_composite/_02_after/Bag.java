package gof.designpatterns._02_structural._03_composite._02_after;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Bag implements Component {

  private List<Component> components = new ArrayList<>();

  public void add(Component item) {
    this.components.add(item);
  }

  public List<Component> getComponents() {
    return components;
  }


  @Override
  public String getName() {
    return components.stream()
      .map(Component::getName)
      .reduce("", String::concat);
  }

  @Override
  public int getPrice() {
    return components.stream()
      .mapToInt(Component::getPrice)
      .sum();
  }
}
