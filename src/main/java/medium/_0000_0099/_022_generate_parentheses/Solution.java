package medium._0000_0099._022_generate_parentheses;

//Given n pairs of parentheses, write a function to generate all combinations of
// well-formed parentheses.
//
//
// Example 1:
// Input: n = 3
//Output: ["((()))","(()())","(())()","()(())","()()()"]
// Example 2:
// Input: n = 1
//Output: ["()"]
//
//
// Constraints:
//
//
// 1 <= n <= 8
//
// Related Topics String Backtracking
// 👍 6204 👎 293


import java.util.ArrayList;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:39.5 MB,击败了17.24% 的Java用户
  public List<String> generateParenthesis(int n) {
    List<String> res = new ArrayList<>();
    helper(res, new StringBuilder(), 0, 0, n);
    return res;
  }

  public void helper(List<String> res, StringBuilder sb, int l, int r, int n) {
    if (l < r) {
      return;
    }
    if (l == n && r == n) {
      res.add(sb.toString());
      return;
    }
    if (l < n) {
      sb.append('(');
      helper(res, sb, l + 1, r, n);
      sb.deleteCharAt(sb.length() - 1);
    }
    if (r < n) {
      sb.append(')');
      helper(res, sb, l, r + 1, n);
      sb.deleteCharAt(sb.length() - 1);
    }
  }
}
//leetcode submit region end(Prohibit modification and deletion)

