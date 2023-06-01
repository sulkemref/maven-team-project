package week_by_week.week20;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DistanceCalculator {
/*
    Calculate Distance
    You have (x, y) coordinates for 2 points and need to find the distance between them.

    Input:
    Your program should read lines from the file. Each line contains two coordinate pairs which are space-delimited.
    All x and y values are integers between -100 and 100.

    Output:
    Return the list of distance between the points. You do not need to round the results you receive.

    Test 1
            (25, 4) (1, -6)
    Expected Output 26.0

    Test 2
            (47, 43) (-25, -11)
    Expected Output 90.0

    Constraints: Input file will have at least one line with valid coordinates.

*/

    public static void main(String[] args) {

        File resourcesDirectory = new File("src/main/java/week_by_week/week20");
        String path = resourcesDirectory.getAbsolutePath() + "/input.txt";
        System.out.println(path);
        System.out.println(withScanner(path));
        System.out.println(withFilesReadAllLines(path));
        System.out.println(withStream(path));
    }

    static List<Double> withScanner(String path) {
        List<Double> result = new ArrayList<>();
        try {
            File file = new File(path);
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] coordinates = line.split(" ");
                int x1 = Integer.parseInt(coordinates[0].substring(1, coordinates[0].length() - 1));
                int y1 = Integer.parseInt(coordinates[1].substring(0, coordinates[1].length() - 1));
                int x2 = Integer.parseInt(coordinates[2].substring(1, coordinates[2].length() - 1));
                int y2 = Integer.parseInt(coordinates[3].substring(0, coordinates[3].length() - 1));

                double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
                result.add(distance);
            }
            scanner.close();
            return result;
        } catch (FileNotFoundException e) {
            System.err.println("File not found.");
        }
        return result;
    }

    public static List<Double> withFilesReadAllLines(String path) {
        List<Double> result = new ArrayList<>();
        try {
            List<String> lines = Files.readAllLines(Paths.get(path));

            for (String line : lines) {
                String[] coordinates = line.split(" ");
                int x1 = Integer.parseInt(coordinates[0].substring(1, coordinates[0].length() - 1));
                int y1 = Integer.parseInt(coordinates[1].substring(0, coordinates[1].length() - 1));
                int x2 = Integer.parseInt(coordinates[2].substring(1, coordinates[2].length() - 1));
                int y2 = Integer.parseInt(coordinates[3].substring(0, coordinates[3].length() - 1));

                double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
                result.add(distance);
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return result;
    }

    public static List<Double> withStream(String path) {
        List<Double> result = new ArrayList<>();
        try (var lines = Files.lines(Paths.get(path))) {
            result = lines.map(line -> {
                        String[] coordinates = line.split("\\s+");
                        int x1 = Integer.parseInt(coordinates[0].substring(1, coordinates[0].length() - 1));
                        int y1 = Integer.parseInt(coordinates[1].substring(0, coordinates[1].length() - 1));
                        int x2 = Integer.parseInt(coordinates[2].substring(1, coordinates[2].length() - 1));
                        int y2 = Integer.parseInt(coordinates[3].substring(0, coordinates[3].length() - 1));
                        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
                    })
                    .collect(Collectors.toList());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return result;
    }

}