package medium._0000_0099._077_combinations;

//Given two integers n and k, return all possible combinations of k numbers out of 1 ... n.
//
// You may return the answer in any order.
//
//
// Example 1:
//
//
//Input: n = 4, k = 2
//Output:
//[
//  [2,4],
//  [3,4],
//  [2,3],
//  [1,2],
//  [1,3],
//  [1,4],
//]
//
//
// Example 2:
//
//
//Input: n = 1, k = 1
//Output: [[1]]
//
//
//
// Constraints:
//
//
// 1 <= n <= 20
// 1 <= k <= n
//
// Related Topics Backtracking
// 👍 1861 👎 76


import java.util.ArrayList;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:1 ms,击败了100.00% 的Java用户
  //  内存消耗:40.8 MB,击败了21.39% 的Java用户
  public List<List<Integer>> combine(int n, int k) {
    List<List<Integer>> result = new ArrayList<>();
    combine(result, new ArrayList<>(), 1, n, k);
    return result;
  }

  public void combine(List<List<Integer>> result, List<Integer> cur, int curN, int n, int k) {
    if (cur.size() == k) {
      result.add(new ArrayList<>(cur));
      return;
    }
    if (n < curN) {
      return;
    }
    for (int i = curN; i <= n && k <= n - i + cur.size() + 1; i++) {
      cur.add(i);
      combine(result, cur, i + 1, n, k);
      cur.remove(cur.size() - 1);
    }

  }

}
//leetcode submit region end(Prohibit modification and deletion)

