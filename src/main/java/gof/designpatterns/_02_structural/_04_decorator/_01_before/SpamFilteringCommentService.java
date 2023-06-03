package gof.designpatterns._02_structural._04_decorator._01_before;

public class SpamFilteringCommentService extends CommentService {

  @Override
  public void addComment(String comment) {
    boolean isSpam = isSpam(comment);
    if (!isSpam) super.addComment(comment);
  }

  private boolean isSpam(String comment) {
    return comment.contains("mediacategory");
  }
}
