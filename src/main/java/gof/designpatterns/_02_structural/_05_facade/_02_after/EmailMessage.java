package gof.designpatterns._02_structural._05_facade._02_after;

import lombok.Data;

@Data
public class EmailMessage {

  private String from;

  private String to;

  private String cc;

  private String bcc;

  private String subject;

  private String text;

}
