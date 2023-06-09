package gof.designpatterns._03_behavioral._08_state._01_before;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Student {

  private String name;

  private List<OnlineCourse> privateCourses = new ArrayList<>();

  public Student(String name) {
    this.name = name;
  }

  public boolean isEnabledForPrivateClass(OnlineCourse onlineCourse) {
    return privateCourses.contains(onlineCourse);
  }

  public void addPrivateCourse(OnlineCourse course) {
    this.privateCourses.add(course);
  }
}
