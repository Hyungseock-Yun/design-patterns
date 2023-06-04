package gof.designpatterns._02_structural._05_facade._02_after;

public class Client {
  public static void main(String[] args) {
    EmailSettings emailSettings = new EmailSettings();
    emailSettings.setHost("127.0.0.1");

    EmailSender emailSender = new EmailSender(emailSettings);

    EmailMessage emailMessage = new EmailMessage();
    emailMessage.setFrom("liz@naver.com");
    emailMessage.setTo("jinu@gmail.com");
    emailMessage.setSubject("Test Mail from Java Program");
    emailMessage.setText("message");

    emailSender.sendEmail(emailMessage);
  }
}
