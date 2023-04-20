package kemal.mentor_tasks.week13;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Happy_NumberTest {

    private static final String happyNumberFile= "/src/test/java/kemal/mentor_tasks/week13/happy_numbers.txt";
    private static final List<Integer> happyNumberList = new ArrayList<>();
    private static final List<Integer> UnhappyNumberList = new ArrayList<>();
    private static final Happy_Number obj = new Happy_Number();


    static {
        FileReader reader = null;
        try {
            reader = new FileReader(happyNumberFile);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        StreamTokenizer tokenizer = new StreamTokenizer(reader);

        int token = 0;
        try {
            token = tokenizer.nextToken();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        while (token != StreamTokenizer.TT_EOF) {
            if (token == StreamTokenizer.TT_NUMBER) {
                happyNumberList.add((int) tokenizer.nval);
            }
            try {
                token = tokenizer.nextToken();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        try {
            reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @ParameterizedTest
    @MethodSource("getHappyInput")
    void isHappy(int getHappyInput){
        assertTrue(obj.isHappy(getHappyInput));
    }

    @ParameterizedTest
    @MethodSource("getUnhappyInput")
    void isUnhappy(int getUnhappyInput){
        assertFalse(obj.isHappy(getUnhappyInput));
    }

    public static Stream<Arguments> getHappyInput(){
        return happyNumberList.stream().map(Arguments::arguments);
    }

    public static Stream<Arguments> getUnhappyInput(){
        for(int i = 1 ; i<=200;i++){
            if(happyNumberList.contains(i))
                continue;
            UnhappyNumberList.add(i);
        }
        return UnhappyNumberList.stream().map(Arguments::arguments);
    }
}