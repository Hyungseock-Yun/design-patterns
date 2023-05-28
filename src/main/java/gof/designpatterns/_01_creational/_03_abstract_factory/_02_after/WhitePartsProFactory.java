package gof.designpatterns._01_creational._03_abstract_factory._02_after;

import gof.designpatterns._01_creational._03_abstract_factory._01_before.WhiteAnchor;

public class WhitePartsProFactory implements ShipPartsFactory {
    @Override
    public Anchor createAnchor() {
        return new WhiteAnchorPro();
    }

    @Override
    public Wheel createWheel() {
        return new WhiteWheelPro();
    }
}
