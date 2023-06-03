package gof.designpatterns._02_structural._04_decorator._01_before;

public class App {

  /**
   * spam filter 기능과 trim 기능을 같이 쓰려면 다중상속이 되지 않기 때문에
   * 두 기능이 들어간 클래스를 또 하나 만든 후, 각 기능의 사용 여부를 판단하는
   * 로직을 추가해야함.
   */

  public static void main(String[] args) {
    Client client = new Client(new SpamFilteringCommentService());
    client.writeComment("오징어 게임");
    client.writeComment("보는게 하는거 보다 재밌을 수가 없지...");
    client.writeComment("https://mediacategory.com");
  }
}
