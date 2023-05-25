package gof.designpatterns.singleton.multithreadsafe.crash1;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 리플렉션 사용하기
 */
public class App {
  public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
    Settings settings = Settings.getInstance();

    Constructor<Settings> constructor = Settings.class.getDeclaredConstructor();
    constructor.setAccessible(true);
    Settings settings1 = constructor.newInstance();

    System.out.println(settings != settings1);
  }
}
