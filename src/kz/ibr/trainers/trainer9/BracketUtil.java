package kz.ibr.trainers.trainer9;

import java.util.ArrayDeque;
import java.util.Deque;

public class BracketUtil {
    public static boolean isCorrectBrackets(String input,
                                            char bracketOpenSymbol,
                                            char bracketCloseSymbol) {
        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < input.length(); i++)
        {
            char charInput = input.charAt(i);
            if (charInput == bracketOpenSymbol)
            {
                stack.push(charInput);
                continue;
            }

            if (stack.isEmpty()) return false;

            if (charInput == bracketCloseSymbol){
                stack.pop();
            }
        }
        return (stack.isEmpty());
    }

    private BracketUtil() {
    }

    public static void main(String[] args) {
        System.out.println("Ввод равного поличества открывающих и закрывающих скобок - "
                + BracketUtil.isCorrectBrackets("{{}}", '{', '}'));
        System.out.println("Ввод неравного поличества открывающих и закрывающих скобок - "
                + BracketUtil.isCorrectBrackets("{{}}}", '{', '}'));
    }
}