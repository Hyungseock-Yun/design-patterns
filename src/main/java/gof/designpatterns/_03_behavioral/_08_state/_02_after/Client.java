package gof.designpatterns._03_behavioral._08_state._02_after;

public class Client {

  public static void main(String[] args) {
    OnlineCourse onlineCourse = new OnlineCourse();
    Student student = new Student("jinu");
    Student liz = new Student("liz");
    liz.addPrivate(onlineCourse);

    onlineCourse.addStudent(student);

    onlineCourse.changeState(new Private(onlineCourse));

    onlineCourse.addReview("hello", student);

    onlineCourse.addStudent(liz);

    System.out.println(onlineCourse.getState());
    System.out.println(onlineCourse.getReviews());
    System.out.println(onlineCourse.getStudents());
  }
}
