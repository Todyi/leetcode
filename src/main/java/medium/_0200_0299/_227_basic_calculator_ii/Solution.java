package medium._0200_0299._227_basic_calculator_ii;

//Given a string s which represents an expression, evaluate this expression and return its value.
//
// The integer division should truncate toward zero.
//
//
// Example 1:
// Input: s = "3+2*2"
//Output: 7
// Example 2:
// Input: s = " 3/2 "
//Output: 1
// Example 3:
// Input: s = " 3+5 / 2 "
//Output: 5
//
//
// Constraints:
//
//
// 1 <= s.length <= 3 * 105
// s consists of integers and operators ('+', '-', '*', '/') separated by some number of spaces.
// s represents a valid expression.
// All the integers in the expression are non-negative integers in the range [0, 231 - 1].
// The answer is guaranteed to fit in a 32-bit integer.
//
// Related Topics String Stack
// 👍 2175 👎 341


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  Runtime: 4 ms, faster than 99.51% of Java online submissions for Basic Calculator II.
  //  Memory Usage: 39.2 MB, less than 56.02% of Java online submissions for Basic Calculator II.
//  public int calculate(String s) {
//    int len = s.length(), cur = 0, numIdx = -1, operatorIdx = -1;
//    int[] numStack = new int[len / 2];
//    char[] operatorStack = new char[len / 2];
//    for (int i = 0; i < len; i++) {
//      char c = s.charAt(i);
//      if (c == ' ') {
//        continue;
//      } else if (Character.isDigit(c)) {
//        cur = cur * 10 + c - '0';
//      } else {
//        if (c == '+' || c == '-') {
//          while (-1 < operatorIdx) {
//            cur = calculate(numStack[numIdx--], cur, operatorStack[operatorIdx--]);
//          }
//        } else {
//          if (-1 < operatorIdx
//              && ('*' == operatorStack[operatorIdx] || '/' == operatorStack[operatorIdx])) {
//            cur = calculate(numStack[numIdx--], cur, operatorStack[operatorIdx--]);
//          }
//        }
//        operatorStack[++operatorIdx] = c;
//        numStack[++numIdx] = cur;
//        cur = 0;
//      }
//    }
//    while (-1 < operatorIdx) {
//      cur = calculate(numStack[numIdx--], cur, operatorStack[operatorIdx--]);
//    }
//    return cur;
//  }

//  public int calculate(int a, int b, char o) {
//    if (o == '+') {
//      return a + b;
//    }
//    if (o == '-') {
//      return a - b;
//    }
//    if (o == '*') {
//      return a * b;
//    }
//    return a / b;
//  }

  //  解答成功:
  //  执行耗时:1 ms,击败了100.00% 的Java用户
  //  内存消耗:39.1 MB,击败了63.30% 的Java用户
  int len, idx = 0;

  public int calculate(String s) {
    len = s.length();
    return helper(s, 0, (char) 0);
  }

  public int helper(String s, int preNum, char preOperator) {
    int cur = 0;
    while (idx < len) {
      char c = s.charAt(idx);
      if ('0' <= c && c <= '9') {
        cur = cur * 10 + c - '0';
      } else if ('+' == c || '-' == c) {
        if ('*' == preOperator || '/' == preOperator) {
          idx--;
          break;
        } else if ('+' == preOperator || '-' == preOperator) {
          preNum = '+' == preOperator ? preNum + cur : preNum - cur;
        } else {
          preNum = cur;
        }
        preOperator = c;
        cur = 0;
      } else if ('*' == c || '/' == c) {
        if ('*' == preOperator || '/' == preOperator) {
          preNum = '*' == preOperator ? preNum * cur : preNum / cur;
          preOperator = c;
          cur = 0;
        } else {
          idx++;
          cur = helper(s, cur, c);
        }
      }
      idx++;
    }
    if ('*' == preOperator) {
      return preNum * cur;
    }
    if ('/' == preOperator) {
      return preNum / cur;
    }
    if ('+' == preOperator) {
      return preNum + cur;
    }
    if ('-' == preOperator) {
      return preNum - cur;
    }
    return cur;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

