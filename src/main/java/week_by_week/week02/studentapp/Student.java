package week_by_week.week02.studentapp;

public class Student {

    String firstName;
    String lastName;
    static String schoolName = "Oxford";


    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}

class StudentAppClass {

    public static void main(String[] args) {
        final Student student = new Student("Michael", "Jordan");
        Student studentForFinal = new Student("John", "Wooden");

        System.out.println(student.firstName);
        System.out.println(student.lastName);
        System.out.println(Student.schoolName);

        student.firstName = "Larry";
        System.out.println(student.firstName);

        //student = studentForFinal;

        final int [] numbers = {1,2,3};
        numbers[0]=5;
        System.out.println(numbers);
        int [] numbers2 = {};

        //numbers= numbers2;




    }
}