package gof.designpatterns._01_creational._03_abstract_factory._02_after;

import gof.designpatterns._01_creational._02_factory_method._02_after.Ship;
import gof.designpatterns._01_creational._02_factory_method._02_after.ShipFactory;

public class ShipInventory {

    public static void main(String[] args) {
        ShipFactory shipFactory = new WhiteshipFactory(new WhiteshipPartsFactory());
        Ship ship = shipFactory.createShip();
        System.out.println(ship.getAnchor().getClass());
        System.out.println(ship.getWheel().getClass());
    }
}
