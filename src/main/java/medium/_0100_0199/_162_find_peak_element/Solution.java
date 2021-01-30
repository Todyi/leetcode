package medium._0100_0199._162_find_peak_element;

//A peak element is an element that is strictly greater than its neighbors.
//
// Given an integer array nums, find a peak element, and return its index.
// If the array contains multiple peaks, return the index to any of the peaks.
//
// You may imagine that nums[-1] = nums[n] = -∞.
//
//
// Example 1:
//
//
//Input: nums = [1,2,3,1]
//Output: 2
//Explanation: 3 is a peak element and your function should return the index number 2.
//
// Example 2:
//
//
//Input: nums = [1,2,1,3,5,6,4]
//Output: 5
//Explanation: Your function can return either index number 1 where the peak element is 2,
// or index number 5 where the peak element is 6.
//
//
// Constraints:
//
//
// 1 <= nums.length <= 1000
// -231 <= nums[i] <= 231 - 1
// nums[i] != nums[i + 1] for all valid i.
//
//
//
//Follow up: Could you implement a solution with logarithmic complexity? Related
// Topics Array Binary Search
// 👍 2448 👎 2476


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:38.4 MB,击败了84.26% 的Java用户
  boolean found = false;
  int idx = -1;

  public int findPeakElement(int[] nums) {
    if (nums.length == 1) {
      return 0;
    }
    findPeak(nums, 0, nums.length);
    return idx;
  }

  public void findPeak(int[] nums, int l, int r) {
    if (found) {
      return;
    }
    if (r <= l) {
      isPeak(nums, r);
      return;
    }
    int mid = (l + r) / 2;
    isPeak(nums, mid);
    if (0 < mid && nums[mid] < nums[mid - 1]) {
      findPeak(nums, l, mid);
    }
    if (mid < nums.length - 1 && nums[mid] < nums[mid + 1]) {
      findPeak(nums, mid, r);
    }
  }

  public void isPeak(int[] nums, int i) {
    if (i == 0) {
      if (nums[i + 1] < nums[i]) {
        found = true;
        idx = i;
      }
    } else if (i == nums.length - 1) {
      if (nums[i - 1] < nums[i]) {
        found = true;
        idx = i;
      }
    } else if (nums[i - 1] < nums[i] && nums[i + 1] < nums[i]) {
      found = true;
      idx = i;
    }
  }
}
//leetcode submit region end(Prohibit modification and deletion)

