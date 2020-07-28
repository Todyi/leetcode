package easy._700_799._747_largest_number_at_least_twice_of_others;

//In a given integer array nums, there is always exactly one largest element.
//
// Find whether the largest element in the array
// is at least twice as much as every other number in the array.
//
// If it is, return the index of the largest element, otherwise return -1.
//
// Example 1:
//
//
//Input: nums = [3, 6, 1, 0]
//Output: 1
//Explanation: 6 is the largest integer, and for every other number in the array x,
//6 is more than twice as big as x.  The index of value 6 is 1, so we return 1.
//
//
//
//
// Example 2:
//
//
//Input: nums = [1, 2, 3, 4]
//Output: -1
//Explanation: 4 isn't at least as big as twice the value of 3, so we return -1.
//
//
//
//
//
// Note:
//
//
// nums will have a length in the range [1, 50].
// Every nums[i] will be an integer in the range [0, 99].
//
//
//
// Related Topics Array
// 👍 316 👎 574


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  Runtime: 0 ms, faster than 100.00% of Java online submissions for Largest Number At Least Twice of Others.
  //  Memory Usage: 37.9 MB, less than 14.39% of Java online submissions for Largest Number At Least Twice of Others.
  public int dominantIndex(int[] nums) {
    if (nums.length < 2) {
      return 0;
    }
    long max = Long.MIN_VALUE, secMax = Long.MIN_VALUE;
    int maxI = -1;
    for (int i = 0; i < nums.length; i++) {
      if (secMax < nums[i]) {
        if (max < nums[i]) {
          secMax = max;
          max = nums[i];
          maxI = i;
        } else {
          secMax = nums[i];
        }
      }
    }
    if (secMax == 0) {
      return maxI;
    }
    return 2 <= max / secMax ? maxI : -1;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

