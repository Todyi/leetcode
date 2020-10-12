package easy._1600_1699._1614_maximum_nesting_depth_of_the_parentheses;

//A string is a valid parentheses string (denoted VPS) if it meets one of the following:
//
//
// It is an empty string "", or a single character not equal to "(" or ")",
// It can be written as AB (A concatenated with B), where A and B are VPS's,
// or
// It can be written as (A), where A is a VPS.
//
//
// We can similarly define the nesting depth depth(S) of any VPS S as follows:
//
//
// depth("") = 0
// depth(A + B) = max(depth(A), depth(B)), where A and B are VPS's
// depth("(" + A + ")") = 1 + depth(A), where A is a VPS.
//
//
// For example, "", "()()", and "()(()())" are VPS's (with nesting depths 0, 1,
//and 2), and ")(" and "(()" are not VPS's.
//
// Given a VPS represented as string s, return the nesting depth of s.
//
//
// Example 1:
//
//
//Input: s = "(1+(2*3)+((8)/4))+1"
//Output: 3
//Explanation: Digit 8 is inside of 3 nested parentheses in the string.
//
//
// Example 2:
//
//
//Input: s = "(1)+((2))+(((3)))"
//Output: 3
//
//
// Example 3:
//
//
//Input: s = "1+(2*3)/(2-1)"
//Output: 1
//
//
// Example 4:
//
//
//Input: s = "1"
//Output: 0
//
//
//
// Constraints:
//
//
// 1 <= s.length <= 100
// s consists of digits 0-9 and characters '+', '-', '*', '/', '(', and ')'.
// It is guaranteed that parentheses expression s is a VPS.
//
// Related Topics String
// 👍 47 👎 11


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:37.5 MB,击败了50.00% 的Java用户
  public int maxDepth(String s) {
    int maxDepth = 0, lBracket = 0;
    char[] arr = s.toCharArray();
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == '(') {
        lBracket++;
        if (maxDepth < lBracket) {
          maxDepth = lBracket;
        }
      } else if (arr[i] == ')') {
        lBracket--;
      }
    }
    return maxDepth;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

