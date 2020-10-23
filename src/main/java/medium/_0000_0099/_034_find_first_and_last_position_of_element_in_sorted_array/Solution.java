package medium._0000_0099._034_find_first_and_last_position_of_element_in_sorted_array;

//Given an array of integers nums sorted in ascending order,
// find the starting and ending position of a given target value.
//
// If target is not found in the array, return [-1, -1].
//
// Follow up: Could you write an algorithm with O(log n) runtime complexity?
//
//
// Example 1:
// Input: nums = [5,7,7,8,8,10], target = 8
//Output: [3,4]
// Example 2:
// Input: nums = [5,7,7,8,8,10], target = 6
//Output: [-1,-1]
// Example 3:
// Input: nums = [], target = 0
//Output: [-1,-1]
//
//
// Constraints:
//
//
// 0 <= nums.length <= 10^5
// -10^9 <= nums[i] <= 10^9
// nums is a non-decreasing array.
// -10^9 <= target <= 10^9
//
// Related Topics Array Binary Search
// 👍 4260 👎 168


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:42.3 MB,击败了7.09% 的Java用户
  public int[] searchRange(int[] nums, int target) {
    int len = nums.length;
    if (len == 0) {
      return getResult(nums, -1);
    }
    int l = 0, r = len - 1, mid = -1;
    if (nums[r] == target) {
      return getResult(nums, r);
    }
    while (l <= r) {
      if (mid == (l + r) / 2) {
        mid = -1;
        break;
      }
      mid = (l + r) / 2;
      if (target == nums[mid]) {
        break;
      } else if (target < nums[mid]) {
        r = mid;
      } else {
        l = mid;
      }
    }
    return getResult(nums, mid);
  }

  public int[] getResult(int[] nums, int mid) {
    if (mid == -1) {
      return new int[]{-1, -1};
    }
    return new int[]{findLeftIdx(nums, mid), findRightIdx(nums, mid)};
  }

  public int findLeftIdx(int[] nums, int mid) {
    for (int i = mid; i > 0; i--) {
      if (nums[i - 1] != nums[i]) {
        return i;
      }
    }
    return 0;
  }

  public int findRightIdx(int[] nums, int mid) {
    for (int i = mid; i < nums.length - 1; i++) {
      if (nums[i + 1] != nums[i]) {
        return i;
      }

    }
    return nums.length - 1;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

