package week_by_week.week03.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainGenerics {

    public static void main(String[] args) {

Book book1 = new Book();

        List<Publication> bookList = new ArrayList<>(Arrays.asList(book1));

        printTitles(bookList);

    }

    public static void printTitles(List<Publication> collection){
        for (Publication publication : collection) {
            System.out.println(publication.title());
        }
    }
}
