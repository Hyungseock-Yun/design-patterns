package gof.designpatterns._01_creational._05_prototype._02_after;

import gof.designpatterns._01_creational._05_prototype._02_after.GithubIssue;
import gof.designpatterns._01_creational._05_prototype._01_before.GithubRepository;

public class App {

  public static void main(String[] args) throws CloneNotSupportedException {
    GithubRepository repository = new GithubRepository();
    repository.setUser("whiteship");
    repository.setName("live-study");

    GithubIssue githubIssue = new GithubIssue(repository);
    githubIssue.setId(1);
    githubIssue.setTitle("1주차 과제: JVM은 무엇이며 자바 코드는 어떻게 실행하는 것이가.");

    String url = githubIssue.getUrl();
    System.out.println(url);

    GithubIssue clone = (GithubIssue) githubIssue.clone();
    System.out.println(clone.getUrl());

    repository.setUser("jinu");

    System.out.println(clone != githubIssue);
    System.out.println(clone.equals(githubIssue));
    System.out.println(clone.getClass() == githubIssue.getClass());
    System.out.println(clone.getRepository() == githubIssue.getRepository());

    System.out.println(clone.getUrl());
    // TODO clone != githubIssue
    // TODO clone.equals(githubIssue) => true
  }
}