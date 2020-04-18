package easy._53_maximum_ubarray;
/*
 * @lc app=leetcode id=53 lang=java
 *
 * [53] Maximum Subarray
 */

// @lc code=start
class Solution {

  //Accepted
  //202/202 cases passed (0 ms)
  //Your runtime beats 100 % of java submissions
  //Your memory usage beats 7.51 % of java submissions (39.6 MB)
  public static int maxSubArray(int[] nums) {
    int maxSum = nums[0];
    int subArrSum = nums[0];
    for (int i = 1; i < nums.length; i++) {
      subArrSum += nums[i];
      if (subArrSum < nums[i]) {
        subArrSum = nums[i];
      }
      if (maxSum < subArrSum) {
        maxSum = subArrSum;
      }
    }
    return maxSum;
  }

}
// @lc code=end

