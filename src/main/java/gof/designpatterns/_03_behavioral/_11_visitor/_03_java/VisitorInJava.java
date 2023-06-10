package gof.designpatterns._03_behavioral._11_visitor._03_java;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class VisitorInJava {

  public static void main(String[] args) throws IOException {
    Path startingDirectory = Path.of("C:/workSpace/design-patterns");
    SearchFileVisitor searchFileVisitor = new SearchFileVisitor("Triangle.java", startingDirectory);
    Files.walkFileTree(startingDirectory, searchFileVisitor);
  }
}
