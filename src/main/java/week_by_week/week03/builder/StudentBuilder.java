package week_by_week.week03.builder;

import java.util.ArrayList;
import java.util.List;

public class StudentBuilder {

    private String name = "";
    private String surname = "";
    private String email = "";
    List<String> courses = new ArrayList<>();
    private int year = 0;

    public StudentBuilder name(String name){
        this.name = name;
        return this;
    }

    public StudentBuilder surname(String surname){
        this.surname = surname;
        return this;
    }

    public StudentBuilder email(String email){
        this.email= email;
        return this;
    }

    public StudentBuilder courses(List<String> courses){
        this.courses = courses;
        return this;
    }

    public StudentBuilder year(int year){
        this.year = year;
        return this;
    }

    public Student build(){
        return new Student(name, surname, email, courses, year);
    }
}
