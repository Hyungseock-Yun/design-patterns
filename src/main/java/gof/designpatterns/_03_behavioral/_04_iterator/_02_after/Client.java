package gof.designpatterns._03_behavioral._04_iterator._02_after;

import gof.designpatterns._03_behavioral._04_iterator._01_before.Post;

import java.util.Iterator;
import java.util.List;

public class Client {

  public static void main(String[] args) {
    Board board = new Board();
    board.addPost("디자인 패턴 게임");
    board.addPost("선생님, 저랑 디자인 패턴 하나 학습하시겠습니까?");
    board.addPost("지금 이 자리에 계신 여러분들은 모두 디자인 패턴을 학습하고 계신 분들입니다.");

    List<Post> posts = board.getPosts();
    for (Post post : posts) {
      System.out.println(post.getContent());
    }

    // TODO 최근 글 순서대로
    Iterator<Post> recentPostIterator = board.getRecencPostIterator();
    while (recentPostIterator.hasNext()) {
      System.out.println(recentPostIterator.next().getContent());
    }
  }
}
