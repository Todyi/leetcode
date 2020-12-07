package medium._0000_0099._078_subsets;

//Given an integer array nums, return all possible subsets (the power set).
//
// The solution set must not contain duplicate subsets.
//
//
// Example 1:
//
//
//Input: nums = [1,2,3]
//Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
//
//
// Example 2:
//
//
//Input: nums = [0]
//Output: [[],[0]]
//
//
//
// Constraints:
//
//
// 1 <= nums.length <= 10
// -10 <= nums[i] <= 10
//
// Related Topics Array Backtracking Bit Manipulation
// 👍 4820 👎 98


import java.util.ArrayList;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:1 ms,击败了55.19% 的Java用户
  //  内存消耗:39.7 MB,击败了5.87% 的Java用户
  public List<List<Integer>> subsets(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();
    subsets(result, nums, new ArrayList<>(), 0);
    return result;
  }

  public void subsets(List<List<Integer>> result, int[] nums, List<Integer> cur, int idx) {
    result.add(new ArrayList<>(cur));
    for (int i = idx; i < nums.length; i++) {
      cur.add(nums[i]);
      subsets(result, nums, cur, i + 1);
      cur.remove(cur.size() - 1);
    }
  }
}
//leetcode submit region end(Prohibit modification and deletion)

