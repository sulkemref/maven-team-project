package week_by_week.week12.java17Examples.readWriteExamplesJava11;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ReadFrom_WriteToFile {
    // to find the path of the file, write click on the file and select "Copy path/reference" -> "Path from repository root"
    private static final String mainPath = "src/main/java/week_by_week/week12/readWriteExamplesJava11/";
    private static final String readPath = mainPath + "input.txt";
    private static final String writePath = mainPath + "output.txt";
    private static final String writeContent = "Bobur is our team lead\nhello Hasan 1000\nhow are you Kemail 2000";

    public static void main(String[] args) throws IOException {
//        withFilesReadStringJava11();
//        withFilesReadAllLines();
//        withFilesWrite();

        readWithStreamTokenizer();

//        withBufferedReader();
//        withBufferedWriter();
//        withFileInputStream();
//        withScanner();
    }

    static void withFilesReadStringJava11() throws IOException {
        var path = Path.of(readPath);
        var str = Files.readString(path);
        System.out.println("This is the content of the file : \n" + str);
    }

    // before Java 11:
    static void withFilesReadAllLines() {
        try {
            List<String> lines = Files.readAllLines(Paths.get(readPath));
            System.out.println(lines);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void withFilesWrite() throws IOException {
        // before Java 11:
//        Files.write(path2, content.getBytes(), StandardOpenOption.CREATE);

        // with Java 11 : no need to convert string to bytes
        Files.writeString(Path.of(writePath), writeContent, StandardOpenOption.CREATE);
    }


    // The tokenizer works by first figuring out what the next token is, String or number.
    // We do that by looking at the tokenizer.ttype field.
    static void readWithStreamTokenizer() throws IOException {
        FileReader reader = new FileReader(readPath);
        StreamTokenizer tokenizer = new StreamTokenizer(reader);
        List<String> words = new ArrayList<>();
        List<Integer> numbers = new ArrayList<>();

        int token = tokenizer.nextToken();
        while (token != StreamTokenizer.TT_EOF) {
            if (token == StreamTokenizer.TT_WORD) {
                words.add(String.valueOf(tokenizer.sval));
            } else if (token == StreamTokenizer.TT_NUMBER) {
                numbers.add((int) tokenizer.nval);
            }
            token = tokenizer.nextToken();
        }
        reader.close();
        System.out.println(words);
        System.out.println(numbers);
    }

    // others:
    static void withBufferedReader() throws IOException {
        File file = new File(readPath);
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
    }

    static void withBufferedWriter() {
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

    static void withFileInputStream() throws IOException {
        FileInputStream fis = new FileInputStream(readPath);
        byte[] buffer = new byte[10];
        StringBuilder sb = new StringBuilder();
        while (fis.read(buffer) != -1) {
            sb.append(new String(buffer));
            buffer = new byte[10];
        }
        fis.close();

        String content = sb.toString();
        System.out.println(content);

        // write to file using FileOutputStream
        try (FileOutputStream fos = new FileOutputStream(writePath)) {
            fos.write(writeContent.getBytes());
            System.out.println("File saved successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void withScanner() throws IOException {
        Scanner scanner = new Scanner(Paths.get(readPath), StandardCharsets.UTF_8);
        // The regular expression \\A matches the beginning of the input, so setting the delimiter to \\A will cause
        // the Scanner to read everything from the beginning of the input stream until the end of the input stream as a single token.
        String content = scanner.useDelimiter("\\A").next();
        scanner.close();
        System.out.println(content);
    }
}
