package gof.designpatterns._02_structural._02_bridge._02_after;

import gof.designpatterns._02_structural._02_bridge._01_before.Champion;

public class App {

  public static void main(String[] args) {
    Champion kda = new 아리(new KDA());
    kda.skillQ();
    kda.skillW();

    Champion poolParty아리 = new 아리(new PoolParty());
    poolParty아리.skillR();
    poolParty아리.skillW();
  }
}
