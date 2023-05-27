package gof.designpatterns.creational.singleton.multithreadsafe.simple;

import java.io.*;
import java.lang.reflect.InvocationTargetException;

public class App {
  public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, IOException, ClassNotFoundException {
    Settings settings = Settings.INSTANCE;
//    Settings settings1 = null;
//
//    Constructor<?>[] declaredConstructors = Settings.class.getDeclaredConstructors();
//    for (Constructor<?> constructor : declaredConstructors) {
//      constructor.setAccessible(true);
//      settings1 = (Settings) constructor.newInstance("INSTANCE");
//    }
//
//    System.out.println(settings != settings1);

    Settings settings2 = null;

    try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("settings.obj"))) {
      out.writeObject(settings);
    }

    try (ObjectInput in = new ObjectInputStream(new FileInputStream("settings.obj"))) {
      settings2 = (Settings) in.readObject();
    }

    System.out.println(settings == settings2);
  }
}
