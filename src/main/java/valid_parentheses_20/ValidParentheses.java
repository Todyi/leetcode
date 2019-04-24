package valid_parentheses_20;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @program: leetcode
 * @description: 20.valid-parentheses
 * @author: hdy
 * @create: 2019-04-23
 **/

public class ValidParentheses {

  /**
   * √ Accepted
   * √ 76/76 cases passed (2 ms)
   * √ Your runtime beats 87.64 % of java submissions
   * √ Your memory usage beats 36.97 % of java submissions (35.6 MB)
   */
  public static boolean isValid(String s) {

    Stack<Character> stack = new Stack<>();
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (c == '(' || c == '[' || c == '{') {
        stack.push(c);
      } else {
        if (!stack.isEmpty()) {
          Character last = stack.pop();
          if (last != null) {
            switch (c) {
              case ')':
                if (!last.equals('(')) {
                  return false;
                }
                break;
              case ']':
                if (!last.equals('[')) {
                  return false;
                }
                break;
              case '}':
                if (!last.equals('{')) {
                  return false;
                }
                break;
            }
          }
        } else {
          stack.push(c);
        }
      }
    }
    return stack.isEmpty();
  }

}
