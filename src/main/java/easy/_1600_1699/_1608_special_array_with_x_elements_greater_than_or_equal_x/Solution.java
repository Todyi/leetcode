package easy._1600_1699._1608_special_array_with_x_elements_greater_than_or_equal_x;

//You are given an array nums of non-negative integers.
// nums is considered special if there exists a number x
// such that there are exactly x numbers in nums that are greater than or equal to x.
//
// Notice that x does not have to be an element in nums.
//
// Return x if the array is special, otherwise, return -1. It can be proven that
// if nums is special, the value for x is unique.
//
//
// Example 1:
//
//
//Input: nums = [3,5]
//Output: 2
//Explanation: There are 2 values (3 and 5) that are greater than or equal to 2.
//
//
//
// Example 2:
//
//
//Input: nums = [0,0]
//Output: -1
//Explanation: No numbers fit the criteria for x.
//If x = 0, there should be 0 numbers >= x, but there are 2.
//If x = 1, there should be 1 number >= x, but there are 0.
//If x = 2, there should be 2 numbers >= x, but there are 0.
//x cannot be greater since there are only 2 numbers in nums.
//
//
// Example 3:
//
//
//Input: nums = [0,4,3,0,4]
//Output: 3
//Explanation: There are 3 values that are greater than or equal to 3.
//
//
// Example 4:
//
//
//Input: nums = [3,6,7,7,0]
//Output: -1
//
//
//
// Constraints:
//
//
// 1 <= nums.length <= 100
// 0 <= nums[i] <= 1000
//
// Related Topics Array
// 👍 117 👎 15


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:1 ms,击败了84.82% 的Java用户
  //  内存消耗:37.1 MB,击败了36.05% 的Java用户
//  public int specialArray(int[] nums) {
//    int[] map = new int[1001];
//    int max = 0;
//    for (int n : nums) {
//      map[n]++;
//    }
//    for (int i = 999; i >= 0; i--) {
//      if (i == (map[i] += map[i + 1])) {
//        return i;
//      }
//    }
//    return -1;
//  }

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:36.9 MB,击败了36.05% 的Java用户
  public int specialArray(int[] nums) {
    int[] map = new int[1001];
    int len = nums.length, sum = 0;
    for (int n : nums) {
      if (len < n) {
        map[len]++;
      } else {
        map[n]++;
      }
    }
    for (int i = len; i >= 0; i--) {
      if (i == (sum += map[i])) {
        return i;
      }
    }
    return -1;
  }
}
//leetcode submit region end(Prohibit modification and deletion)
