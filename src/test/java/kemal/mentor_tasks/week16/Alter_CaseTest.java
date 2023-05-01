package kemal.mentor_tasks.week16;

import org.junit.jupiter.api.Test;


import java.io.IOException;


import static org.junit.jupiter.api.Assertions.*;


class Alter_CaseTest {

    private static final String mainPath = "src/test/java/kemal/mentor_tasks/week16/";
    private static final Alter_Case ac = new Alter_Case();

    @Test
    void alterCase() {

        ac.alterCase(mainPath,"output_1.txt","input_1.txt");

        try{
            assertEquals(
                    ac.withBufferedReader(mainPath+"expected_output_1.txt").toString(),
                    ac.withBufferedReader(mainPath+"output_1.txt").toString());
        }catch (IOException e){
            e.printStackTrace();
        }

    }

}