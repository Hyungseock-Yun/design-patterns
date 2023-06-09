package gof.designpatterns._03_behavioral._08_state._01_before;

public class Client {

  public static void main(String[] args) {
    Student student = new Student("jinu");
    OnlineCourse onlineCourse = new OnlineCourse();

    Student liz = new Student("liz");
    liz.addPrivateCourse(onlineCourse);

    onlineCourse.addStudent(student);
    onlineCourse.changeState(OnlineCourse.State.PRIVATE);

    onlineCourse.addStudent(liz);

    onlineCourse.addReview("hello", student);

    System.out.println(onlineCourse.getState());
    System.out.println(onlineCourse.getStudent());
    System.out.println(onlineCourse.getReviews());
  }
}
