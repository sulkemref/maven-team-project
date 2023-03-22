package week_by_week.week03.algo03;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static week_by_week.week03.algo03.AnimalFeast.isEligible;

class AnimalFeastTest {

    @Test
    void isEligiblePositiveTest() {
        boolean eligible = isEligible("great blue heron", "garlic naan");

        Assertions.assertTrue(eligible);

    }

    @Test
    void isEligibleNegativeTest() {
        boolean eligible = isEligible("great blue hero", "garlic naan");

        Assertions.assertFalse(eligible);

    }
}