package gof.designpatterns._02_structural._04_decorator._01_before;

public class TrimmingCommentService extends CommentService {

  @Override
  public void addComment(String comment) {
    super.addComment(trim(comment));
  }

  private String trim(String comment) {
    return comment.replace("...", "");
  }

}
