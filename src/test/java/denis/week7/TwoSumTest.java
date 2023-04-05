package denis.week7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    @Test
    void twoSum2() {

        String s = TwoSum.twoSum2(new Integer[]{2, 7, 11, 15}, 9);
        assertEquals("2 + 7 = 9",s);
    }
}