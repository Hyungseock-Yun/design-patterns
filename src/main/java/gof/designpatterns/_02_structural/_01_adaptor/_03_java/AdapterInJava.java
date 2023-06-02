package gof.designpatterns._02_structural._01_adaptor._03_java;

import java.io.*;
import java.util.*;

public class AdapterInJava {
  public static void main(String[] args) throws IOException {
    // collections
    List<String> strings = Arrays.asList("a", "b", "c");
    Enumeration<String> enumeration = Collections.enumeration(strings);
    ArrayList<String> list = Collections.list(enumeration);

    // io
    try(InputStream is = new FileInputStream("input.txt");  // String을 넣었는데 InputStream이 나옴
        InputStreamReader isr = new InputStreamReader(is);  // InputStream을 넣었는데 InputStreamReader가 나옴
        BufferedReader reader = new BufferedReader(isr)) {  // InputStreamReader를 넣었는데 BufferedReader가 나옴
      while (reader.ready()) {
        System.out.println(reader.readLine());
      }
    }
  }
}
