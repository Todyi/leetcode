package _20_valid_parentheses;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/*
 * @lc app=leetcode id=20 lang=java
 *
 * [20] Valid Parentheses
 */
class ValidParenthesesSolution {

  private Map<Character, Character> mappings;

  public ValidParenthesesSolution() {
    mappings = new HashMap<>();
    mappings.put(')', '(');
    mappings.put(']', '[');
    mappings.put('}', '{');
  }

  /**
   * √ Accepted
   * √ 76/76 cases passed (2 ms)
   * √ Your runtime beats 87.28 % of java submissions
   * √ Your memory usage beats 36.92 % of java submissions (35.6 MB)
   */
  public boolean isValid(String s) {
    Stack<Character> stack = new Stack<>();
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (this.mappings.containsKey(c)) {
        char lastChar = stack.isEmpty() ? '#' : stack.pop();
        if (lastChar != mappings.get(c)) {
          return false;
        }
      } else {
        stack.push(c);
      }
    }
    return stack.isEmpty();
  }

}


