package gof.designpatterns._03_behavioral._10_template._02_after;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public abstract class FileProcessor {

  private String path;

  public FileProcessor(String path) {
    this.path = path;
  }

  // final을 사용하면 상속을 받을 수 없기 때문에 리스코프 치환 원칙을 어느 정도 지킬 수 있다.
  public final int process() {
    try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
      int result = 0;
      String line = null;
      while ((line = reader.readLine()) != null) {
        result = getResult(result, Integer.parseInt(line));
      }

      return result;
    } catch (IOException e) {
      throw new IllegalArgumentException(path + "에 해당하는 파일이 없습니다.", e);
    }
  }

  protected abstract int getResult(int result, int number);
}
