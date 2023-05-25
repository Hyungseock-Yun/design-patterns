package gof.designpatterns.singleton.multithreadsafe.crash2;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 직렬화 & 역직렬화 사용하기
 * 역직렬화 사용 시, 생성자를 사용하여 반드시 새로운 객체를 생성하므로 싱글턴 패턴이 깨지게 된다.
 */
public class App {
  public static void main(String[] args) throws IOException, ClassNotFoundException {
    Settings settings = Settings.getInstance();
    Settings settings1 = null;

    try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("settings.obj"))) {
      out.writeObject(settings);
    }

    try (ObjectInput in = new ObjectInputStream(new FileInputStream("settings.obj"))) {
      settings1 = (Settings) in.readObject();
    }

    System.out.println(settings == settings1);

  }
}
