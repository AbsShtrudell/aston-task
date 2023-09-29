package by.shtrudell.astontask.algorithm;

public class NumChecker {
    public static boolean IsGreater(int num, int checkVal) {
        return num > checkVal;
    }

    public static boolean MultipleOf(int num, int checkVal) {
        return checkVal >= num && checkVal % num == 0;
    }
}
