package week_by_week.week16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AlterCase {

    /* Alter Case
    Given a path of input file which includes sentence(s), write a program that reads alternates the case of every alphabetic character,
    starting with uppercase. Spaces and non-alphabetical characters should be added to the final output as is,
    i.e. they should not be taken into account when alternating between upper/lowercase.
            Input:
    Your program should read lines from file as a standard input. Each line contains a sentence. Assume all characters are ASCII.
            Output:
    For each sentence from standard input, return a string which contains a sentence in each line such that
    the first character is uppercase, the next character is lowercase and so on.
            Test 1
    Test Input
    We are the world
    Expected Output
    We ArE tHe WoRlD

    Test 2
    Test Input
    this is some code
    Expected Output
    ThIs Is SoMe CoDe
    */

    public static void main(String[] args) throws IOException {
        AlterCase solution = new AlterCase();
        String path = "src/main/java/week_by_week/week16/input.txt";
        try {
            System.out.println("withFilesReadStringAndCounter:\n" + solution.withFilesReadStringAndCounter(path));
            System.out.println("withCharAndFilesReadAllLines:\n" + solution.withCharAndFilesReadAllLines(path));
            System.out.println("withScannerAndRecursive:\n" + solution.withScannerAndRecursive(path));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }



    }

    public String withFilesReadStringAndCounter(String path) throws IOException {
        StringBuilder result = new StringBuilder();
        String input = Files.readString(Path.of(path));
        String[] lines = input.split("\n");
        for (String line : lines) {
            StringBuilder sb = new StringBuilder();
            int numAlphabetic = 0;
            for (char ch : line.trim().toCharArray()) {
                if (Character.isLetter(ch)) {
                    if (numAlphabetic % 2 == 0) {
                        sb.append(Character.toUpperCase(ch));
                    } else {
                        sb.append(Character.toLowerCase(ch));
                    }
                    numAlphabetic++;
                } else {
                    sb.append(ch);
                }
            }
            result.append(sb).append("\n");
        }
        return result.toString();
    }

    public String withCharAndFilesReadAllLines(String path) throws IOException {
        return Files.readAllLines(Path.of(path))
                .stream()
                .map(this::alternateCase)
                .collect(Collectors.joining("\n"));
    }

    private StringBuilder alternateCase(String line) {
        StringBuilder sb = new StringBuilder();
        boolean isUpperCase = true;
        for (char ch : line.toCharArray()) {
            if (Character.isAlphabetic(ch)) {
                sb.append(isUpperCase ? Character.toUpperCase(ch) : Character.toLowerCase(ch));
                isUpperCase = !isUpperCase;
            } else {
                sb.append(ch);
            }
        }
        return sb;
    }

    public String withScannerAndRecursive(String path) throws FileNotFoundException {
        StringBuilder result = new StringBuilder();
        File file = new File(path);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            result.append(alternateCase(line, true)).append("\n");
        }
        scanner.close();

        return result.toString();
    }

    private String alternateCase(String str, boolean isUpperCase) {
        if (str.isEmpty()) {
            return "";
        }
        char ch = str.charAt(0);
        if (Character.isAlphabetic(ch)) {
            if (isUpperCase) {
                ch = Character.toUpperCase(ch);
            } else {
                ch = Character.toLowerCase(ch);
            }
            return ch + alternateCase(str.substring(1), !isUpperCase);
        } else {
            return ch + alternateCase(str.substring(1), isUpperCase);
        }
    }
}
