package kemal.interview_tasks;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Question: Given a string path representing a sequence of movements on a 2D plane and a list representing the coordinates of obstacles,
 * implement a function isPathCrossing(path, obstacles) -> str that determines whether the path crosses itself or encounters any obstacles.
 *
 * The path is represented by a string where each movement is separated by a hyphen ('-').
 * Each movement can be one of the following directions:
 * 'N' (north), 'S' (south), 'E' (east), 'W' (west), 'NE' (north-east), 'SE' (south-east), 'NW' (north-west), or 'SW' (south-west).
 * Each movement corresponds to moving one unit in the specified direction starting at the origin(0,0).
 * The obstacles list contains tuples representing the coordinates of obstacles on the plane.
 * An obstacle blocks the path if the path encounters that coordinate.
 * Implement the isPathCrossing function to check if the path crosses itself or encounters any obstacles.
 * It should return a string based on the following conditions:
 * If the path crosses itself, return "Path crossed at point: (x, y)" where (x, y) is the coordinate where the path crossed.
 * If the path encounters an obstacle, return "Path blocked at point: (x, y)" where (x, y) is the coordinate of the obstacle.
 * If the path completes without crossing or encountering any obstacles, return "Path completed".
 * Example:2
 * Input: path = "NESWW" obstacles = []
 *
 * Explanation: Notice that the path visits the origin twice.
 * Test Case 1
 * path1 = "N-N-NE-W"
 * obstacles1 = [(1, 3), (2, 2), (1, 2)]
 * Output: Path blocked at point: (1, 3)
 *
 * Test Case 2
 * path3 = "N-E-S-S-S-W"
 * obstacles3 = []
 * Output: "Path completed"
 *
 * Test Case 3
 * path6 = "NE-SW-NE-SW"
 * obstacles6 = [(1, 1), (-1, -1)]
 * Output: Path blocked at point: (1, 1)
 *
 * Test Case 4
 * path8 = "N-N-E-E-W-W-S-S"
 * obstacles8 = []
 * Output: Path crossed at point: (1, 2)
 */
public class PathCrossing {
    public static void main(String[] args) {
        System.out.println(isPathCrossing("N-N-NE-W",List.of("(1, 3)", "(2, 2)", "(1, 2)"))); //Path blocked at point: (1, 3)
        System.out.println(isPathCrossing("N-E-S-S-S-W",List.of(""))); // Path completed
        System.out.println(isPathCrossing("NE-SW-NE-SW",List.of("(1, 1)", "(-1, -1)"))); // Path blocked at point: (1, 1)
        System.out.println(isPathCrossing("N-N-E-E-W-W-S-S",List.of(""))); // Path crossed at point: (1, 2)
    }

    private static String isPathCrossing(String path, List<String> obstacles){
        int x = 0 , y = 0;
        Set<String> currentPath = new HashSet<>(), obstaclesSet = new HashSet<>(obstacles);
        for (String s : path.split("-")) {
            String step = "(" + x + ", " + y + ")";
            if (obstaclesSet.contains(step)) {
                return "Path blocked at point: " + step;
            } else if (!currentPath.add(step)) {
                return "Path crossed at point: " + step;
            }
            switch (s) {
                case "N" -> y++;
                case "S" -> y--;
                case "E" -> x++;
                case "W" -> x--;
                case "NE" -> {
                    y++;
                    x++;
                }
                case "NW" -> {
                    y++;
                    x--;
                }
                case "SE" -> {
                    y--;
                    x++;
                }
                case "SW" -> {
                    y--;
                    x--;
                }
            }
        }
        return "Path completed";
    }
}
