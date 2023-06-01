package kemal.mentor_tasks.week20;

import org.junit.jupiter.api.Test;

import java.io.*;

import static org.junit.jupiter.api.Assertions.*;

class Calculate_DistanceTest {

    private final String mainPath = "src/test/java/kemal/mentor_tasks/week20/";

    private final Calculate_Distance obj = new Calculate_Distance(mainPath,"input.txt","output.txt");


    @Test
    void calculateDistance() throws IOException {

        obj.calculateDistance();

        try{
            assertEquals(
                    bufferedReader(mainPath+"output.txt").toString(),
                    bufferedReader(mainPath+"expected_output.txt").toString());
        }catch (IOException e){
            e.printStackTrace();
        }

    }

    public StringBuilder bufferedReader(String readFilePath) throws IOException {
        File file = new File(readFilePath);
        StringBuilder stringBuilder = new StringBuilder();
        try (FileReader fileReader = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String ls = System.getProperty("line.separator");
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                stringBuilder.append(line);
                stringBuilder.append(ls);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringBuilder;
    }
}