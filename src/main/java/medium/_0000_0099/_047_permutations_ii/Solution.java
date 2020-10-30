package medium._0000_0099._047_permutations_ii;

//Given a collection of numbers, nums, that might contain duplicates, return all
// possible unique permutations in any order.
//
//
// Example 1:
//
//
//Input: nums = [1,1,2]
//Output:
//[[1,1,2],
// [1,2,1],
// [2,1,1]]
//
//
// Example 2:
//
//
//Input: nums = [1,2,3]
//Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
//
//
//
// Constraints:
//
//
// 1 <= nums.length <= 8
// -10 <= nums[i] <= 10
//
// Related Topics Backtracking
// 👍 2297 👎 66


import java.util.ArrayList;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:39.7 MB,击败了5.13% 的Java用户
  public List<List<Integer>> permuteUnique(int[] nums) {
    List<List<Integer>> res = new ArrayList<>();
    permute(res, nums, 0, nums.length - 1);
    return res;
  }

  public void permute(List<List<Integer>> res, int[] nums, int start, int end) {
    if (start == end) {
      List<Integer> cur = new ArrayList<>();
      for (int i = 0; i < nums.length; i++) {
        cur.add(nums[i]);
      }
      res.add(cur);
    } else {
      for (int i = start; i <= end; i++) {
        if (!check(nums, start, i)) {
          continue;
        }
        swap(nums, i, start);
        permute(res, nums, start + 1, end);
        swap(nums, start, i);
      }
    }
  }

  public boolean check(int[] nums, int start, int end) {
    for (int i = start; i < end; i++) {
      if (nums[i] == nums[end]) {
        return false;
      }
    }
    return true;
  }

  public void swap(int[] nums, int i, int j) {
    int tmp = nums[i];
    nums[i] = nums[j];
    nums[j] = tmp;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

