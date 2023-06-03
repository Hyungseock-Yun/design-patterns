package gof.designpatterns._02_structural._04_decorator._03_java;

import jakarta.servlet.http.HttpServletRequestWrapper;
import jakarta.servlet.http.HttpServletResponseWrapper;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DecoratorInJava {

  public static void main(String[] args) {
    // Collections가 제공하는 데코레이터 메소드
    ArrayList list = new ArrayList();
    list.add(new Book());

    List books = Collections.checkedList(list, Book.class);

    list.add(new Item());
    books.add(new Item());   // checkedList로 감싸주기 때문에 Book이 아니면 에러남

    List unmodifiableList = Collections.unmodifiableList(list);
    list.add(new Item());
    unmodifiableList.add(new Book());   // 불변객체인데 변경시키려하니 에러남

    // 서블릿 요청 또는 응답 wrapper
    HttpServletRequestWrapper requestWrapper;
    HttpServletResponseWrapper responseWrapper;
  }

  private static class Book {}

  private static class Item {}
}
