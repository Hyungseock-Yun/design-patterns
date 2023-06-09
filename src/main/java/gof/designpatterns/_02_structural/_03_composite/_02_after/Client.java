package gof.designpatterns._02_structural._03_composite._02_after;

public class Client {

  public static void main(String[] args) {
    Item doranBlade = new Item("도란검", 450);
    Item healPotion = new Item("체력 물약", 50);

    Bag bag = new Bag();
    bag.add(doranBlade);
    bag.add(healPotion);

    Client client = new Client();
    client.printName(doranBlade);
    client.printPrice(doranBlade);
    client.printName(bag);
    client.printPrice(bag);
  }

  private void printPrice(Component item) {
    System.out.println(item.getPrice());
  }

  private void printName(Component item) {
    System.out.println(item.getName());
  }

}
