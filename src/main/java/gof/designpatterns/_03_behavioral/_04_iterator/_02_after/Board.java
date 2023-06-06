package gof.designpatterns._03_behavioral._04_iterator._02_after;

import gof.designpatterns._03_behavioral._04_iterator._01_before.Post;
import lombok.Data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Data
public class Board {

  private List<Post> posts = new ArrayList<>();   // concrete aggregator

  public void addPost(String content) {
    Post post = new Post();
    post.setContent(content);

    this.posts.add(post);
  }

  public Iterator<Post> getRecencPostIterator() {
    return new RecentPostIterator(this.posts);
  }
}
