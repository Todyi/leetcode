package easy._1400_1499._1403_minimum_subsequence_in_non_increasing_order;

//Given the array nums, obtain a subsequence of the array whose sum of elements
//is strictly greater than the sum of the non included elements in such subsequence.
//
// If there are multiple solutions, return the subsequence with minimum size
// and if there still exist multiple solutions,
// return the subsequence with the maximum total sum of all its elements.
// A subsequence of an array can be obtained by erasing some (possibly zero) elements from the array.
//
// Note that the solution with the given constraints is guaranteed to be unique.
// Also return the answer sorted in non-increasing order.
//
//
// Example 1:
//
//
//Input: nums = [4,3,10,9,8]
//Output: [10,9]
//Explanation: The subsequences [10,9] and [10,8] are minimal such that the sum
//of their elements is strictly greater than the sum of elements not included, how
//ever, the subsequence [10,9] has the maximum total sum of its elements.
//
//
// Example 2:
//
//
//Input: nums = [4,4,7,6,7]
//Output: [7,7,6]
//Explanation: The subsequence [7,7] has the sum of its elements equal to 14
// which is not strictly greater than the sum of elements not included (14 = 4 + 4 + 6).
// Therefore, the subsequence [7,6,7] is the minimal satisfying the conditions.
//Note the subsequence has to returned in non-decreasing order.
//
//
// Example 3:
//
//
//Input: nums = [6]
//Output: [6]
//
//
//
// Constraints:
//
//
// 1 <= nums.length <= 500
// 1 <= nums[i] <= 100
// Related Topics Greedy Sort
// 👍 136 👎 199


import java.util.ArrayList;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:1 ms,击败了100.00% 的Java用户
  //  内存消耗:39.6 MB,击败了36.36% 的Java用户
  public List<Integer> minSubsequence(int[] nums) {
    List<Integer> res = new ArrayList<>();
    int[] map = new int[101];
    int total = 0, curSum = 0, max = 1;
    for (int i = 0; i < nums.length; i++) {
      total += nums[i];
      map[nums[i]]++;
      if (max < nums[i]) {
        max = nums[i];
      }
    }
    for (int i = max; i > 0; i--) {
      for (int j = 0; j < map[i]; j++) {
        curSum += i;
        res.add(i);
        if (total < (curSum << 1)) {
          return res;
        }
      }
    }
    return null;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

