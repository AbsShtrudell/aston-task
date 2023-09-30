package by.shtrudell.astontask.algorithm;

import javafx.util.Pair;

import java.util.*;

public class BracketsChecker {
    public static final HashSet<Character> bracketsSymbols = new HashSet<>(Set.of('(', ')', '[', ']'));
    public static boolean isValid(String brackets) {
        Stack<Character> openedBrackets = new Stack<>();

        for (char bracket : brackets.toCharArray()) {
            if (!bracketsSymbols.contains(bracket)) return false;
        }
        return true;
    }

    public static boolean isCorrect(String brackets) {
        Stack<Character> openedBrackets = new Stack<>();

        for(char bracket : brackets.toCharArray()) {
            if(bracket == '(' || bracket == '[')
                openedBrackets.push(bracket);
            else if(bracket == ')' || bracket == ']')
            {
                if(openedBrackets.empty())
                    return false;
                char ch = openedBrackets.pop();
                if(!((ch == '(' && bracket == ')') || (ch == '[' && bracket == ']')))
                    return false;
            }
        }
        return true;
    }

    public static List<Pair<Integer, Character>> findMistakes(String brackets) {
        Deque<Character> openedBrackets = new ArrayDeque<>();
        List<Pair<Integer, Character>> mistakes = new ArrayList<>();

        for(int i = 0; i < brackets.length(); i++) {
            char bracket = brackets.toCharArray()[i];
            if(bracket == '(' || bracket == '[')
                openedBrackets.push(bracket);
            else if(bracket == ')' || bracket == ']')
            {
                if(openedBrackets.isEmpty()) {
                    mistakes.add(new Pair<>(i + mistakes.size(), bracket == ')' ? '(' : '['));
                    continue;
                }

                char ch = openedBrackets.peek();
                if(!((ch == '(' && bracket == ')') || (ch == '[' && bracket == ']')))
                    mistakes.add(new Pair<>(i + mistakes.size(), bracket == ')'? '(':'['));
                else
                    openedBrackets.pop();
            }
        }

        if(!openedBrackets.isEmpty()) {
            int j = brackets.length() + mistakes.size() - 1;
            while (!openedBrackets.isEmpty()) {
                mistakes.add(new Pair<>(++j, openedBrackets.pollFirst() == '(' ? ')' : ']'));
            }
        }

        return mistakes;
    }
}
