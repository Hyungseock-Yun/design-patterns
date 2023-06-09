package gof.designpatterns._03_behavioral._08_state._01_before;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class OnlineCourse {

  private State state = State.DRAFT;

  private List<Student> students = new ArrayList<>();

  private List<String> reviews = new ArrayList<>();

  public void addStudent(Student student) {
    if (this.state == State.DRAFT || this.state == State.PUBLISHED) {
      this.students.add(student);
    } else if (this.state == State.PRIVATE && availableTo(student)) {
      this.students.add(student);
    } else {
      throw new UnsupportedOperationException("학생을 해당 수업에 추가할 수 없습니다.");
    }

    if (this.students.size() > 1) this.state = State.PRIVATE;
  }

  public void addReview(String review, Student student) {
    if (this.state == State.PUBLISHED) {
      this.reviews.add(review);
    } else if (this.state == State.PRIVATE && this.students.contains(student)) {
      this.reviews.add(review);
    } else {
      throw new UnsupportedOperationException("리뷰를 작성할 수 없습니다.");
    }
  }

  private boolean availableTo(Student student) {
    return student.isEnabledForPrivateClass(this);
  }

  public void changeState(State state) {
    this.state = state;
  }

  public enum State {
    DRAFT, PUBLISHED, PRIVATE
  }
}
