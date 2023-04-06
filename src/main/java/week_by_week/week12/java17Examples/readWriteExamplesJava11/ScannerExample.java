package week_by_week.week12.java17Examples.readWriteExamplesJava11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScannerExample {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/main/java/week_by_week/week12/readWriteExamplesJava11/data.txt");
        Scanner scanner = new Scanner(file);
        scanner.useDelimiter("\\s+");

        List<Person> people = new ArrayList<>();

        while (scanner.hasNext()){
            String name = scanner.next();
            int age = scanner.nextInt();
            double gpa = scanner.nextDouble();
            people.add(new Person(name,age,gpa));
        }

        System.out.println(people);

        scanner.close();
    }
}
