package easy._600_699._643_maximum_average_subarray_i;

//Given an array consisting of n integers,
// find the contiguous subarray of given length k
// that has the maximum average value.
// And you need to output the maximum average value.
//
// Example 1:
//
//
//Input: [1,12,-5,-6,50,3], k = 4
//Output: 12.75
//Explanation: Maximum average is (12-5-6+50)/4 = 51/4 = 12.75
//
//
//
//
// Note:
//
//
// 1 <= k <= n <= 30,000.
// Elements of the given array will be in the range [-10,000, 10,000].
//
//
//
// Related Topics Array


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:1 ms,击败了100.00% 的Java用户
  //  内存消耗:43.6 MB,击败了23.08% 的Java用户
  public double findMaxAverage(int[] nums, int k) {
    int max = 0;
    for (int i = 0; i < k; i++) {
      max += nums[i];
    }
    int sum = max;
    for (int i = k; i < nums.length; i++) {
      sum += nums[i] - nums[i - k];
      if (max < sum) {
        max = sum;
      }
    }
    return 1.0 * max / k;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

