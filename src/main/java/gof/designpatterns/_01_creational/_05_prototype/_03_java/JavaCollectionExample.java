package gof.designpatterns._01_creational._05_prototype._03_java;

import java.util.ArrayList;
import java.util.List;

public class JavaCollectionExample {

  public static void main(String[] args) {
    Student jinu = new Student("jinu");
    Student whiteship = new Student("whiteship");
    List<Student> students = new ArrayList<>();
    students.add(jinu);
    students.add(whiteship);

    List<Student> clone = new ArrayList<>(students);  // 생성자를 사용하여 clone
    System.out.println(clone);
  }
}
