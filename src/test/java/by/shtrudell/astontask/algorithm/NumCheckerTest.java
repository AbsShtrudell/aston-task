package by.shtrudell.astontask.algorithm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class NumCheckerTest {

    @Test
    void isGreater() {
        Assertions.assertTrue(NumChecker.IsGreater(7, 1));
        Assertions.assertFalse(NumChecker.IsGreater(1, 7));
    }

    @Test
    void multipleOf() {
        Assertions.assertTrue(NumChecker.MultipleOf(3, 3));
        Assertions.assertTrue(NumChecker.MultipleOf(3, 12));
        Assertions.assertFalse(NumChecker.MultipleOf(3, 1));
        Assertions.assertFalse(NumChecker.MultipleOf(3, 0));
        Assertions.assertFalse(NumChecker.MultipleOf(3, -1));
        Assertions.assertFalse(NumChecker.MultipleOf(3, -3));
    }
}