package kemal.mentor_tasks.week13;

import org.junit.jupiter.api.Test;

import java.io.FileReader;
import java.io.IOException;
import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Happy_NumberTest {

    private static final String happyNumberFile= "/Users/kemal/SynologyDrive/Cydeo/IdeaProjects/maven-team-project/src/test/java/kemal/mentor_tasks/week13/happy_numbers.txt";
    private static List<Integer> happyNumberList;
    @Test
    void isHappy() {

        System.out.println(happyNumberList);
    }

    private static  void readWithStreamTokenizer() throws IOException {
        FileReader reader = new FileReader(happyNumberFile);
        StreamTokenizer tokenizer = new StreamTokenizer(reader);
        happyNumberList = new ArrayList<>();

        int token = tokenizer.nextToken();
        while (token != StreamTokenizer.TT_EOF) {
            if (token == StreamTokenizer.TT_NUMBER) {
                happyNumberList.add((int) tokenizer.nval);
            }
            token = tokenizer.nextToken();
        }
        reader.close();
    }
}