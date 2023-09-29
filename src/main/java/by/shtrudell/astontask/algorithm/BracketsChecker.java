package by.shtrudell.astontask.algorithm;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BracketsChecker {
    public static boolean IsValid(String brackets) {
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

    public static List<Pair<Integer, Character>> FindMistakes(String brackets) {
        Stack<Character> openedBrackets = new Stack<>();
        List<Pair<Integer, Character>> mistakes = new ArrayList<>();

        for(int i = 0; i < brackets.length(); i++) {
            char bracket = brackets.toCharArray()[i];
            if(bracket == '(' || bracket == '[')
                openedBrackets.push(bracket);
            else if(bracket == ')' || bracket == ']')
            {
                if(openedBrackets.empty())
                    mistakes.add(new Pair<>(i, bracket == ')'? '(':'['));

                char ch = openedBrackets.pop();
                if(!((ch == '(' && bracket == ')') || (ch == '[' && bracket == ']')))
                    mistakes.add(new Pair<>(i, bracket == ')'? '(':'['));
            }
        }
        return mistakes;
    }
}
