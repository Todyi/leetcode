package easy._1000_1099._1021_remove_outermost_parentheses;

//A valid parentheses string is either empty (""), "(" + A + ")", or A + B,
// where A and B are valid parentheses strings, and + represents string concatenation.
//For example, "", "()", "(())()", and "(()(()))" are all valid parentheses strings.
//
// A valid parentheses string S is primitive if it is nonempty, and there does not exist a way
// to split it into S = A+B, with A and B nonempty valid parentheses strings.
//
// Given a valid parentheses string S, consider its primitive decomposition:
// S = P_1 + P_2 + ... + P_k, where P_i are primitive valid parentheses strings.
//
// Return S after removing the outermost parentheses of every primitive string
// in the primitive decomposition of S.
//
//
//
// Example 1:
//
//
//Input: "(()())(())"
//Output: "()()()"
//Explanation:
//The input string is "(()())(())", with primitive decomposition "(()())" + "(()
//)".
//After removing outer parentheses of each part, this is "()()" + "()" = "()()()
//".
//
//
//
// Example 2:
//
//
//Input: "(()())(())(()(()))"
//Output: "()()()()(())"
//Explanation:
//The input string is "(()())(())(()(()))", with primitive decomposition "(()())
//" + "(())" + "(()(()))".
//After removing outer parentheses of each part, this is "()()" + "()" + "()(())
//" = "()()()()(())".
//
//
//
// Example 3:
//
//
//Input: "()()"
//Output: ""
//Explanation:
//The input string is "()()", with primitive decomposition "()" + "()".
//After removing outer parentheses of each part, this is "" + "" = "".
//
//
//
//
//
//
// Note:
//
//
// S.length <= 10000
// S[i] is "(" or ")"
// S is a valid parentheses string
//
//
//
//
//
//
// Related Topics Stack
// 👍 551 👎 659


import java.util.Stack;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  Runtime: 2 ms, faster than 98.94% of Java online submissions for Remove Outermost Parentheses.
  //  Memory Usage: 39.2 MB, less than 90.81% of Java online submissions for Remove Outermost Parentheses.
  public String removeOuterParentheses(String S) {
    char[] arr = S.toCharArray();
    int lParenthesis = 0;
    StringBuilder sb = new StringBuilder();
    for (char c : arr) {
      if (c == '(') {
        if (1 < ++lParenthesis) {
          sb.append(c);
        }
      } else {
        if (0 < --lParenthesis) {
          sb.append(c);
        }
      }
    }
    return sb.toString();
  }

}
//leetcode submit region end(Prohibit modification and deletion)

