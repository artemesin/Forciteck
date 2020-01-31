package second;


import java.util.Map;
import java.util.Objects;
import java.util.Stack;

public class BracketSequenceChecker {

    private static final Map<Character, Character> BRACKETS = Map.of('}', '{', ']', '[', ')', '(');

    public boolean check(String s) {
        Stack<Character> stack = new Stack<>();

        if (s.length() % 2 != 0) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            final char bracket = s.charAt(i);
            if (isOpeningBracket(bracket)) {
                stack.push(bracket);
            } else if (isClosingBracket(bracket)) {
                final char expectedBracket = getPairBracket(bracket);

                if (stack.empty()) {
                    return false;
                }

                if (Objects.equals(expectedBracket, stack.peek())) {
                    stack.pop();
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
        return stack.empty();
    }

    private boolean isOpeningBracket(char c) {
        return BRACKETS.containsValue(c);
    }

    private boolean isClosingBracket(char c) {
        return BRACKETS.containsKey(c);
    }

    private char getPairBracket(char c) {
        return BRACKETS.get(c);
    }
}
