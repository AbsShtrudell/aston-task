package by.shtrudell.astontask.algorithm;

public class NumChecker {
    public static final int greaterThanNum = 7;
    public static final int multipleOfNum = 3;

    public static boolean isGreater(int num, int checkVal) {
        return num > checkVal;
    }

    public static boolean multipleOf(int num, int checkVal) {
        return checkVal >= num && checkVal % num == 0;
    }
}
