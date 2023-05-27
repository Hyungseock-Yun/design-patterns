package gof.designpatterns.creational.factory._02_after;

public class Client {
  public static void main(String[] args) {
    Client client = new Client();

    Ship whiteship = new WhiteshipFactory().orderShip("WhiteShip", "dev.jinuliz@gmail.com");
    System.out.println("whiteship = " + whiteship);

    Ship blackship = new BlackshipFactory().orderShip("Blackship", "dev.jinuliz@gmail.com");
    System.out.println("blackship = " + blackship);
  }
}
