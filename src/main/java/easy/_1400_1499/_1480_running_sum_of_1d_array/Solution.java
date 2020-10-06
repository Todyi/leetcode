package easy._1400_1499._1480_running_sum_of_1d_array;

//Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
//
// Return the running sum of nums.
//
//
// Example 1:
//
//
//Input: nums = [1,2,3,4]
//Output: [1,3,6,10]
//Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
//
// Example 2:
//
//
//Input: nums = [1,1,1,1,1]
//Output: [1,2,3,4,5]
//Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+
//1+1+1].
//
// Example 3:
//
//
//Input: nums = [3,1,2,10,1]
//Output: [3,4,6,16,17]
//
//
//
// Constraints:
//
//
// 1 <= nums.length <= 1000
// -10^6 <= nums[i] <= 10^6
// Related Topics Array
// 👍 590 👎 60


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:39.1 MB,击败了95.31% 的Java用户
  public int[] runningSum(int[] nums) {
    for (int i = 1; i < nums.length; i++) {
      nums[i] += nums[i - 1];
    }
    return nums;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

