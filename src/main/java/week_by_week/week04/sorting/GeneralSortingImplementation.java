package week_by_week.week04.sorting;

import java.util.*;

public class GeneralSortingImplementation {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(3, 6, 1, 2, 7, 4, 9, 8, 5));

        //Natural order
        Collections.sort(list);
        System.out.println(list);

        //Ascending order
        list.sort((o1, o2) -> o1.compareTo(o2));
        System.out.println(list);

        //Descending order
        list.sort(((o1, o2) -> o2.compareTo(o1)));
        System.out.println(list);

        Employee employee1 = new Employee("Michael", "Jordan", 55);
        Employee employee2 = new Employee("Larry", "Bird", 48);
        Employee employee3 = new Employee("Lora", "Wooden", 29);

        List<Employee> employees = new ArrayList<>(Arrays.asList(employee1,employee2,employee3));

        employees.sort(Comparator.comparing(Employee::getAge));
        System.out.println(employees);

        employees.sort(Comparator.comparing(Employee::getAge).reversed());
        System.out.println(employees);

    }
}

