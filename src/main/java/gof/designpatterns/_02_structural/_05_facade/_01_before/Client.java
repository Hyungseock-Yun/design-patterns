package gof.designpatterns._02_structural._05_facade._01_before;

import jakarta.mail.Message;
import jakarta.mail.MessagingException;
import jakarta.mail.Session;
import jakarta.mail.Transport;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;

import java.util.Properties;

public class Client {

  public static void main(String[] args) {
    String to = "jinu@gmail.com";
    String from = "liz@naver.com";
    String host = "127.0.0.1";

    Properties properties = System.getProperties();
    properties.setProperty("mail.smtp.host", host);

    Session session = Session.getDefaultInstance(properties);

    try {
      MimeMessage message = new MimeMessage(session);
      message.setFrom(new InternetAddress(from));
      message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
      message.setSubject("Test Mail from Java Program");
      message.setText("message");

      Transport.send(message);
    } catch (MessagingException e) {
      e.printStackTrace();
    }
  }

}
