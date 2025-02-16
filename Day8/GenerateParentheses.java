import java.util.*;
public class GenerateParentheses {
        public static List<String> generateParenthesis(int n) {
            List<String> result = new ArrayList<>();
            backtrack(result, "", 0, 0, n);
            return result;
        }
    
        private static void backtrack(List<String> result, String current, int open, int close, int max) {
            // Base case: If the current string length is 2*n, add it to result
            if (current.length() == max * 2) {
                result.add(current);
                return;
            }
    
            // Add an open parenthesis if we still have open parentheses left
            if (open < max) {
                backtrack(result, current + "(", open + 1, close, max);
            }
    
            // Add a closing parenthesis if open parentheses are more than closed ones
            if (close < open) {
                backtrack(result, current + ")", open, close + 1, max);
            }
        }
    
        public static void main(String[] args) {
            int n = 3;
            List<String> output = generateParenthesis(n);
            System.out.println(output);
        }
    }
    
}
