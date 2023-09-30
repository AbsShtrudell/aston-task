package by.shtrudell.astontask.algorithm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BracketsCheckerTest {
    @Test
    void isCorrect() {
        Assertions.assertTrue(BracketsChecker.isCorrect("[()]"));
        Assertions.assertFalse(BracketsChecker.isCorrect("[(]"));
    }

    @Test
    void isValid() {
        Assertions.assertTrue(BracketsChecker.isValid("[())]"));
        Assertions.assertFalse(BracketsChecker.isValid("[(a]"));
    }

    @Test
    void findMistakes() {
        Assertions.assertEquals(BracketsChecker.findMistakes(")[())](").size(), 3);
        Assertions.assertEquals(BracketsChecker.findMistakes("[()]").size(), 0);
    }
}