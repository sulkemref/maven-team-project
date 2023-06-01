package kemal.mentor_tasks.week20;

import java.io.*;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.List;

public class Calculate_Distance{

    private final String mainPath;
    private final String outputFileName;
    private final String inputFileName;
    private final static List<List<Integer>> coordinates = new ArrayList<>();
    private final static StringBuilder stringBuilder = new StringBuilder();

//    private  FileReader reader;

    public Calculate_Distance(String mainPath, String inputFileName, String outputFileName){
        this.mainPath = mainPath;
        this.outputFileName = outputFileName;
        this.inputFileName = inputFileName;
    }

    public static void main(String[] args) throws IOException {

        Calculate_Distance obj = new Calculate_Distance("src/main/java/kemal/mentor_tasks/week20/","input.txt","output.txt");

        obj.calculateDistance();

    }

    public void calculateDistance() throws IOException {

        readWithStreamTokenizer();

        bufferedReader();

        Double[] results = new Double[coordinates.size()];
        int k = 0;
        for (List<Integer> coordinate : coordinates) {
            results[k++] = Math.sqrt(Math.pow(coordinate.get(0) - coordinate.get(2), 2) + Math.pow(coordinate.get(1) - coordinate.get(3), 2));
        }

        stringBuilder.setLength(stringBuilder.length() - 1);
        String[] textArray = stringBuilder.toString().split("\n");

        if (results.length!=textArray.length){
            throw new InvalidParameterException();
        }

        stringBuilder.setLength(0);

        for (int i = 0 ; i < textArray.length ; i++){
            stringBuilder.append(textArray[i]).append("\nOutput result is: ").append(results[i]).append("\n");
        }

        bufferedWriter();

    }

    private void readWithStreamTokenizer() {
        try (FileReader reader = new FileReader(mainPath+inputFileName)){
            StreamTokenizer tokenizer = new StreamTokenizer(reader);
            tokenizer.eolIsSignificant(true); // to work TT_EOL
            List<Integer> numbers = new ArrayList<>();
            int token = tokenizer.nextToken();
            do  {
                if (token == StreamTokenizer.TT_NUMBER) {
                    numbers.add((int)tokenizer.nval);
                }
                token = tokenizer.nextToken();
                if (token == StreamTokenizer.TT_EOL||token == StreamTokenizer.TT_EOF){
                    if (numbers.size()!=4){
                        throw new InvalidParameterException();
                    }
                    coordinates.add(new ArrayList<>(numbers));
                    numbers.clear();
                }
            }while (token != StreamTokenizer.TT_EOF);
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void bufferedReader() throws IOException {
        FileReader reader = new FileReader(mainPath+inputFileName);
        BufferedReader bufferedReader = new BufferedReader(reader);
            String ls = System.getProperty("line.separator");
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                stringBuilder.append(line);
                stringBuilder.append(ls);
            }
    }

    private void bufferedWriter() {
        File file = new File(mainPath+outputFileName);
        try (FileWriter fileWriter = new FileWriter(file);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            bufferedWriter.write(stringBuilder.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

//Question-2 Calculate Distance
//        You have (x, y) coordinates for 2 points and need to find the distance between them.
//        Input:
//        Your program should read lines from the file. Each line contains two coordinate pairs which are space-delimited.
//        All x and y values are integers between -100 and 100.
//        Output:
//        Return the list of distance between the points. You do not need to round the results you receive.
//        Test 1
//        (25, 4) (1, -6)
//        Expected Output 26.0
//        Test 2
//        (47, 43) (-25, -11)
//        Expected Output 90.0
//        Constraints: Input file will have at least one line with valid coordinates.
//        Please, try to test your solution via JUnit