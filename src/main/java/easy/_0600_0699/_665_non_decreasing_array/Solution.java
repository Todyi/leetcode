package easy._0600_0699._665_non_decreasing_array;

//Given an array nums with n integers,
// your task is to check if it could become non-decreasing by modifying at most 1 element.
//
// We define an array is non-decreasing
// if nums[i] <= nums[i + 1] holds for every i (0-based) such that (0 <= i <= n - 2).
//
//
// Example 1:
//
//
//Input: nums = [4,2,3]
//Output: true
//Explanation: You could modify the first 4 to 1 to get a non-decreasing array.
//
//
// Example 2:
//
//
//Input: nums = [4,2,1]
//Output: false
//Explanation: You can't get a non-decreasing array by modify at most one element.
//
//
//
// Constraints:
//
//
// 1 <= n <= 10 ^ 4
// - 10 ^ 5 <= nums[i] <= 10 ^ 5
//
// Related Topics Array


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  Runtime: 0 ms, faster than 100.00% of Java online submissions for Non-decreasing Array.
  //  Memory Usage: 40.1 MB, less than 100.00% of Java online submissions for Non-decreasing Array.
  public boolean checkPossibility(int[] nums) {
    int count = 0;
    for (int i = 1; i < nums.length && count < 2; i++) {
      if (nums[i] < nums[i - 1]) {
        count++;
        if (i < 2 || 1 < i && nums[i - 2] <= nums[i]) {
          nums[i - 1] = nums[i];
        } else {
          nums[i] = nums[i - 1];
        }
      }

    }
    return count < 2;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

