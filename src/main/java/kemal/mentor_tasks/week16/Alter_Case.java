package kemal.mentor_tasks.week16;

import java.io.*;
import java.util.Arrays;

public class Alter_Case {

    public void alterCase(String filePath){

    }

    private StringBuilder withBufferedReader(String readFilePath) throws IOException {
        File file = new File(readFilePath);
        StringBuilder stringBuilder = new StringBuilder();
        try (FileReader fileReader = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) { //try with resources statement
            // returns the system-dependent line separator string. On Windows systems, this is typically "\r\n",
            // while on Unix/Linux systems, it is typically "\n".
            String ls = System.getProperty("line.separator");
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                stringBuilder.append(line);
                stringBuilder.append(ls);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        String content = stringBuilder.toString();
        System.out.println(content);

        return stringBuilder;
    }

    static void withBufferedWriter(String writePath) {
        File file = new File(writePath);
        Arrays.stream(writeContent.split("\n")).forEach(
                line -> {
                    try (FileWriter fileWriter = new FileWriter(file);
                         BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
                        bufferedWriter.write(line);
                        bufferedWriter.newLine();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                });
    }


}
