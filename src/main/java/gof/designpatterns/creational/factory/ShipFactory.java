package gof.designpatterns.creational.factory;

public class ShipFactory {

  public static Ship orderShip(String name, String email) {
    // validate
    if (name == null || name.isBlank()) {
      throw new IllegalArgumentException("배 이름을 지어주세요.");
    }

    if (email == null || email.isBlank()) {
      throw new IllegalArgumentException("연락처를 남겨주세요.");
    }

//    prepareFor(name);

    Ship ship = new Ship();
    ship.setName(name);

    // Customizing for specific name
    if (name.equalsIgnoreCase("whiteship")) {
      ship.setLogo("🚤");
    } else if (name.equalsIgnoreCase("blackship")) {
      ship.setLogo("🚢");
    }

    // coloring
    if (name.equalsIgnoreCase("whiteship")) {
      ship.setColor("white");
    } else if (name.equalsIgnoreCase("blackship")) {
      ship.setColor("black");
    }

    // notify
//    sendEmailTo(email, ship);

    return ship;
  }

}
