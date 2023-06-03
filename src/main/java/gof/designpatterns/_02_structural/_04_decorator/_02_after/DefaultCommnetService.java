package gof.designpatterns._02_structural._04_decorator._02_after;

public class DefaultCommnetService implements CommentService {

  @Override
  public void addComment(String comment) {
    System.out.println(comment);
  }

}
