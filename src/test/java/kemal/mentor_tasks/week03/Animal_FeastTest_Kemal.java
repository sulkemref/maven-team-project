package kemal.mentor_tasks.week03;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Animal_FeastTest_Kemal {

    @Test
    void animalFeastTestTrue() {
       boolean test = Animal_Feast.animalFeast("chickadee","chocolate cake");
       assertTrue(test);
    }

    @Test
    void animalFeastTestFalse() {
        boolean test = Animal_Feast.animalFeast("chickadee","chocolate cake!");
        assertFalse(test);
    }
}