package almi.JavaCodingTasks.week15;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ClimbingStairsTest {

    @Test
    void climbingStairsTest() {

        int n = 3;

        ClimbingStairs.solution(n);

        int expectedResult = 3;
        assertEquals(expectedResult, ClimbingStairs.solution(n));
    }
}
