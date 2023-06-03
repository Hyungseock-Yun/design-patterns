package gof.designpatterns._02_structural._04_decorator._01_before;

public class Client {

  private CommentService commentService;

  private boolean enabledSpamFilter;

  private boolean enabledTrimming;

  public Client(CommentService commentService) {
    this.commentService = commentService;
  }

  public void writeComment(String comment) {
    commentService.addComment(comment);
  }

}
