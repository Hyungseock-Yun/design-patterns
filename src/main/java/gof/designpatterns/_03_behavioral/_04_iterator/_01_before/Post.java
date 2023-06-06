package gof.designpatterns._03_behavioral._04_iterator._01_before;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Post {

  private String title;

  private String content;

  private LocalDateTime createdDateTime = LocalDateTime.now();

}
