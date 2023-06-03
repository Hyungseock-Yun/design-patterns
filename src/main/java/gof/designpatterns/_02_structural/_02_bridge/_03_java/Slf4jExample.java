package gof.designpatterns._02_structural._02_bridge._03_java;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Slf4jExample {

  // Logging 라이브러리를 뭘 쓰던지 Logger나 LoggerFactory는 바뀌지 않음.
  private static Logger logger = LoggerFactory.getLogger(Slf4jExample.class);

  public static void main(String[] args) {
    logger.info("hello logger");

  }
}
