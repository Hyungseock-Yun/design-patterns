package gof.designpatterns.creational.singleton.multithreadsafe.simple;

/**
 * enum으로 만들면 리플렉션으로 절대 뚫을 수 없다.
 * enum은 리플렉션을 막아놓음.
 * enum은 Serializable을 상속받고 있다.
 * ( Exception in thread "main" java.lang.IllegalArgumentException: Cannot reflectively create enum objects )
 * 단점 : 1. 미리 만들어 놓는다. 2. 상속을 사용하지 못한다.
 */
public enum Settings {

  INSTANCE

}
