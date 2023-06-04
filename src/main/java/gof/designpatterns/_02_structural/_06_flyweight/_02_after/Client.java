package gof.designpatterns._02_structural._06_flyweight._02_after;

public class Client {

  public static void main(String[] args) {
    FontFactory fontFactory = new FontFactory();
    Character c1 = new Character('h', "white", fontFactory.getFont("nanum:12"));
    Character c2 = new Character('h', "white", fontFactory.getFont("nanum:12"));
    Character c3 = new Character('h', "white", fontFactory.getFont("nanum:12"));
  }
}
