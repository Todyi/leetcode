package medium._0200_0299._209_minimum_size_subarray_sum;

//Given an array of positive integers nums and a positive integer target,
// return the minimal length of a contiguous subarray [numsl, numsl+1, ..., numsr-1, numsr]
// of which the sum is greater than or equal to target.
// If there is no such subarray, return 0 instead.
//
//
// Example 1:
//
//
//Input: target = 7, nums = [2,3,1,2,4,3]
//Output: 2
//Explanation: The subarray [4,3] has the minimal length under the problem constraint.
//
//
// Example 2:
//
//
//Input: target = 4, nums = [1,4,4]
//Output: 1
//
//
// Example 3:
//
//
//Input: target = 11, nums = [1,1,1,1,1,1,1,1]
//Output: 0
//
//
//
// Constraints:
//
//
// 1 <= target <= 109
// 1 <= nums.length <= 105
// 1 <= nums[i] <= 105
//
//
//
//Follow up: If you have figured out the O(n) solution,
// try coding another solution of which the time complexity is O(n log(n)).
// Related Topics Array Two Pointers Binary Search
// 👍 3418 👎 136


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:1 ms,击败了99.98% 的Java用户
  //  内存消耗:38.7 MB,击败了87.01% 的Java用户
  public int minSubArrayLen(int target, int[] nums) {
    int l = 0, cur = 0, result = Integer.MAX_VALUE;
    for (int i = 0; i < nums.length; i++) {
      if (target == nums[i]) {
        return 1;
      }
      cur += nums[i];
      if (cur < target) {
        continue;
      } else if (target < cur) {
        while (target < cur && l <= i) {
          result = Math.min(i - l + 1, result);
          cur -= nums[l++];
        }
      }
      if (cur == target) {
        result = Math.min(i - l + 1, result);
      }
    }
    return result == Integer.MAX_VALUE ? 0 : result;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

