package gof.designpatterns._01_creational._05_prototype._02_after;

import gof.designpatterns._01_creational._05_prototype._01_before.GithubRepository;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class GithubIssue implements Cloneable{

  private int id;

  private String title;

  private GithubRepository repository;

  public GithubIssue(GithubRepository repository) {
    this.repository = repository;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getUrl() {
    return String.format("https://github.com/%s/%s/issues/%d",
      repository.getUser(),
      repository.getName(),
      this.getId()
    );
  }

  public GithubRepository getRepository() {
    return repository;
  }

  public void setRepository(GithubRepository repository) {
    this.repository = repository;
  }

  @Override
  protected  Object clone() throws CloneNotSupportedException {
    // deep copy
    GithubRepository repository = new GithubRepository();
    repository.setUser(this.repository.getUser());
    repository.setName(this.repository.getName());

    GithubIssue githubIssue = new GithubIssue(repository);
    githubIssue.setId(this.id);
    githubIssue.setTitle(this.title);

    return githubIssue;
  }
}
