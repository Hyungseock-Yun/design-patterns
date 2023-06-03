package gof.designpatterns._02_structural._04_decorator._02_after;

public class Client {

  private CommentService commentService;

  public Client(CommentService commentService) {
    this.commentService = commentService;
  }

  public void writeComment(String comment) {
    commentService.addComment(comment);
  }
}
