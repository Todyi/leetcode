package medium._0000_0099._039_combination_sum;

//Given an array of distinct integers candidates and a target integer target,
// return a list of all unique combinations of candidates where the chosen numbers sum to target.
// You may return the combinations in any order.
//
// The same number may be chosen from candidates an unlimited number of times.
// Two combinations are unique if the frequency of at least one of the chosen numbers is different.
//
// It is guaranteed that the number of unique combinations that sum up to target
// is less than 150 combinations for the given input.
//
//
// Example 1:
//
//
//Input: candidates = [2,3,6,7], target = 7
//Output: [[2,2,3],[7]]
//Explanation:
//2 and 3 are candidates, and 2 + 2 + 3 = 7. Note that 2 can be used multiple times.
//7 is a candidate, and 7 = 7.
//These are the only two combinations.
//
//
// Example 2:
//
//
//Input: candidates = [2,3,5], target = 8
//Output: [[2,2,2,2],[2,3,3],[3,5]]
//
//
// Example 3:
//
//
//Input: candidates = [2], target = 1
//Output: []
//
//
// Example 4:
//
//
//Input: candidates = [1], target = 1
//Output: [[1]]
//
//
// Example 5:
//
//
//Input: candidates = [1], target = 2
//Output: [[1,1]]
//
//
//
// Constraints:
//
//
// 1 <= candidates.length <= 30
// 1 <= candidates[i] <= 200
// All elements of candidates are distinct.
// 1 <= target <= 500
//
// Related Topics Array Backtracking
// 👍 4771 👎 133


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:2 ms,击败了99.20% 的Java用户
  //  内存消耗:39.2 MB,击败了5.03% 的Java用户
  public List<List<Integer>> combinationSum(int[] candidates, int target) {
    List<List<Integer>> res = new ArrayList<>();
    Arrays.sort(candidates);
    addCombinations(candidates, res, new ArrayList<>(), 0, target);
    return res;
  }

  public void addCombinations(int[] candidates, List<List<Integer>> res, List<Integer> cur, int n,
      int target) {
    if (0 < target) {
      for (int i = n; i < candidates.length && candidates[i] <= target; i++) {
        cur.add(candidates[i]);
        addCombinations(candidates, res, cur, i, target - candidates[i]);
        cur.remove(cur.size() - 1);
      }
    } else if (target == 0) {
      res.add(new ArrayList<>(cur));
    }
  }
}
//leetcode submit region end(Prohibit modification and deletion)

