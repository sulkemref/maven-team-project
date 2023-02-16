package week_by_week.week03.builder;

public class BuilderMain {

    public static void main(String[] args) {

        Student student = Student.builder()
                .name("Michael")
                .surname("Jordan")
                .email("jordan@gmail.com")
                .build();

        System.out.println(student);
    }
}
