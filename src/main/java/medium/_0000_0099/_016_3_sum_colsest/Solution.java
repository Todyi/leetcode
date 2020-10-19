package medium._0000_0099._016_3_sum_colsest;

//Given an array nums of n integers and an integer target,
// find three integers in nums such that the sum is closest to target.
// Return the sum of the three integers.
// You may assume that each input would have exactly one solution.
//
//
// Example 1:
//
//
//Input: nums = [-1,2,1,-4], target = 1
//Output: 2
//Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
//
//
//
// Constraints:
//
//
// 3 <= nums.length <= 10^3
// -10^3 <= nums[i] <= 10^3
// -10^4 <= target <= 10^4
//
// Related Topics Array Two Pointers
// 👍 2516 👎 156


import java.util.Arrays;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:1 ms,击败了100.00% 的Java用户
  //  内存消耗:38.8 MB,击败了6.69% 的Java用户
  public int threeSumClosest(int[] nums, int target) {
    int sum = nums[0] + nums[1] + nums[2];
    Arrays.sort(nums);
    for (int i = 0; i < nums.length - 2; i++) {
      if (0 < i && nums[i] == nums[i - 1]) {
        continue;
      }
      if ((sum = getClosest(i, nums, target, sum)) == target) {
        return sum;
      }
    }
    return sum;
  }

  public int getClosest(int idx, int[] nums, int target, int sum) {
    int l = idx + 1, r = nums.length - 1;
    while (l < r) {
      int tmpSum = nums[idx] + nums[l] + nums[r];
      if (tmpSum == target) {
        return target;
      } else if (Math.abs(tmpSum - target) < Math.abs(sum - target)) {
        sum = tmpSum;
      }
      if (tmpSum < target) {
        l++;
      } else {
        r--;
      }
    }
    return sum;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

