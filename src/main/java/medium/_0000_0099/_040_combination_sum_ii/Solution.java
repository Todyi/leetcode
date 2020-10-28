package medium._0000_0099._040_combination_sum_ii;

//Given a collection of candidate numbers (candidates) and a target number (target),
// find all unique combinations in candidates where the candidate numbers sum to target.
//
// Each number in candidates may only be used once in the combination.
//
// Note: The solution set must not contain duplicate combinations.
//
//
// Example 1:
//
//
//Input: candidates = [10,1,2,7,6,1,5], target = 8
//Output:
//[
//[1,1,6],
//[1,2,5],
//[1,7],
//[2,6]
//]
//
//
// Example 2:
//
//
//Input: candidates = [2,5,2,1,2], target = 5
//Output:
//[
//[1,2,2],
//[5]
//]
//
//
//
// Constraints:
//
//
// 1 <= candidates.length <= 100
// 1 <= candidates[i] <= 50
// 1 <= target <= 30
//
// Related Topics Array Backtracking
// 👍 2177 👎 75


import java.util.ArrayList;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:1 ms,击败了100.00% 的Java用户
  //  内存消耗:38.9 MB,击败了13.20% 的Java用户
  int max = 0, min = 51;
  int[] map = new int[51];
  int[] numMap = new int[51];

  public List<List<Integer>> combinationSum2(int[] candidates, int target) {
    for (int n : candidates) {
      map[n]++;
      if (max < n) {
        max = n;
      }
      if (n < min) {
        min = n;
      }
    }

    List<List<Integer>> res = new ArrayList<>();
    helper(res, new ArrayList<>(), target, min);
    return res;
  }

  public void helper(List<List<Integer>> res, List<Integer> cur, int target,
      int idx) {
    if (target == 0) {
      res.add(new ArrayList<>(cur));
    } else if (0 < target) {
      for (int i = idx; i <= max && i <= target; i++) {
        if (numMap[i] == map[i]) {
          continue;
        }
        cur.add(i);
        numMap[i]++;
        helper(res, cur, target - i, i);
        cur.remove(cur.size() - 1);
        numMap[i]--;
      }

    }
  }
}
//leetcode submit region end(Prohibit modification and deletion)

