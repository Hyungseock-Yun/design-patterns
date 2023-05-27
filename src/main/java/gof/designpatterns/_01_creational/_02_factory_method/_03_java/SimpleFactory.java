package gof.designpatterns._01_creational._02_factory_method._03_java;

import gof.designpatterns._01_creational._02_factory_method._02_after.Blackship;
import gof.designpatterns._01_creational._02_factory_method._02_after.Whiteship;

public class SimpleFactory {

  public Object createObject(String name) {
    if (name.equals("whiteship")) {
      return new Whiteship();
    } else if (name.equals("blackship")) {
      return new Blackship();
    }

    throw new IllegalArgumentException();
  }

}
