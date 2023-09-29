package by.shtrudell.astontask.algorithm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BracketsCheckerTest {
    @Test
    void isValid() {
        Assertions.assertTrue(BracketsChecker.IsValid("[()]"));
        Assertions.assertFalse(BracketsChecker.IsValid("[(]"));
    }
}