package gof.designpatterns._02_structural._04_decorator._02_after;

public class App {

  private static boolean enabledSpamFilter = true;

  private static boolean enabledTrimming = false;

  public static void main(String[] args) {

    CommentService commentService = new DefaultCommnetService();

    if (enabledSpamFilter) commentService = new SpamFilteringCommentDecorator(commentService);

    if (enabledTrimming) commentService = new TrimmingCommentDecorator(commentService);

    Client client = new Client(commentService);
    client.writeComment("오징어 게임");
    client.writeComment("보는게 하는거 보다 재밌을 수가 없지...");
    client.writeComment("https://mediacategory.com");
  }
}
