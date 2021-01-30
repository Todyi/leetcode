package medium._0100_0199._150_evaluate_reverse_polish_notation;

//Evaluate the value of an arithmetic expression in Reverse Polish Notation.
//
// Valid operators are +, -, *, /. Each operand may be an integer or another expression.
//
// Note:
//
//
// Division between two integers should truncate toward zero.
// The given RPN expression is always valid.
// That means the expression would always evaluate to a result
// and there won't be any divide by zero operation.
//
//
// Example 1:
//
//
//Input: ["2", "1", "+", "3", "*"]
//Output: 9
//Explanation: ((2 + 1) * 3) = 9
//
//
// Example 2:
//
//
//Input: ["4", "13", "5", "/", "+"]
//Output: 6
//Explanation: (4 + (13 / 5)) = 6
//
//
// Example 3:
//
//
//Input: ["10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"]
//Output: 22
//Explanation:
//  ((10 * (6 / ((9 + 3) * -11))) + 17) + 5
//= ((10 * (6 / (12 * -11))) + 17) + 5
//= ((10 * (6 / -132)) + 17) + 5
//= ((10 * 0) + 17) + 5
//= (0 + 17) + 5
//= 17 + 5
//= 22
//
// Related Topics Stack
// 👍 1398 👎 505


import java.util.Deque;
import java.util.LinkedList;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:3 ms,击败了98.87% 的Java用户
  //  内存消耗:38.9 MB,击败了49.97% 的Java用户
//  public int evalRPN(String[] tokens) {
//    Deque<Integer> stack = new LinkedList<>();
//    for (String s : tokens) {
//      if (s.length() == 1) {
//        char operator = s.charAt(0);
//        if (!Character.isDigit(operator)) {
//          int compute, b = stack.pop(), a = stack.pop();
//          if (operator == '+') {
//            compute = a + b;
//          } else if (operator == '-') {
//            compute = a - b;
//          } else if (operator == '*') {
//            compute = a * b;
//          } else {
//            compute = a / b;
//          }
//          stack.push(compute);
//          continue;
//        }
//        stack.push(operator - '0');
//      } else {
//        stack.push(Integer.valueOf(s));
//      }
//    }
//    return stack.peek();
//  }

  //  解答成功:
  //  执行耗时:1 ms,击败了100.00% 的Java用户
  //  内存消耗:39.2 MB,击败了25.36% 的Java用户
  int i;

  public int evalRPN(String[] tokens) {
    i = tokens.length - 1;
    return helper(tokens);
  }

  public int helper(String[] tokens) {
    if (tokens[i].equals("+") || tokens[i].equals("-")
        || tokens[i].equals("*") || tokens[i].equals("/")) {
      String operator = tokens[i];
      i--;
      int b = helper(tokens);
      i--;
      int a = helper(tokens);
      if (operator.equals("+")) {
        return a + b;
      } else if (operator.equals("-")) {
        return a - b;
      } else if (operator.equals("*")) {
        return a * b;
      }
      return a / b;
    } else {
      return Integer.valueOf(tokens[i]);
    }
  }
}
//leetcode submit region end(Prohibit modification and deletion)

