package kemal.mentor_tasks.week07;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    @Test
    void twoSumIndexesTest() {
        int[] arr = TwoSum.twoSumIndexes(new int[]{2,7,11,15},9);
        assertArrayEquals(new int[]{0,1},arr);
    }
}