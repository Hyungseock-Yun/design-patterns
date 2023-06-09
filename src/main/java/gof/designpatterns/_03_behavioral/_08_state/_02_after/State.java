package gof.designpatterns._03_behavioral._08_state._02_after;

public interface State {

  void addStudent(Student student);

  void addReview(String review, Student student);

}
