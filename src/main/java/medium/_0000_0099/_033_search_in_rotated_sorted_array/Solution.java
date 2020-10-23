package medium._0000_0099._033_search_in_rotated_sorted_array;

//You are given an integer array nums sorted in ascending order, and an integer
//target.
//
// Suppose that nums is rotated at some pivot unknown to you beforehand (i.e., [
//0,1,2,4,5,6,7] might become [4,5,6,7,0,1,2]).
//
// If target is found in the array return its index, otherwise, return -1.
//
//
// Example 1:
// Input: nums = [4,5,6,7,0,1,2], target = 0
//Output: 4
// Example 2:
// Input: nums = [4,5,6,7,0,1,2], target = 3
//Output: -1
// Example 3:
// Input: nums = [1], target = 0
//Output: -1
//
//
// Constraints:
//
//
// 1 <= nums.length <= 5000
// -10^4 <= nums[i] <= 10^4
// All values of nums are unique.
// nums is guranteed to be rotated at some pivot.
// -10^4 <= target <= 10^4
//
// Related Topics Array Binary Search
// 👍 6069 👎 531


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:38.4 MB,击败了17.31% 的Java用户
  public int search(int[] nums, int target) {
    int l = 0, r = nums.length - 1, mid = (l + r) / 2;
    while (l < r) {
      if (target == nums[mid]) {
        return mid;
      } else if ((nums[l] < nums[mid] && nums[l] <= target && target < nums[mid])
          || (nums[mid] < nums[l] && (nums[l] <= target || target < nums[mid]))) {
        r = mid;
      } else {
        l = mid;
      }
      if (mid == (l + r) / 2) {
        break;
      }
      mid = (l + r) / 2;
    }
    if (target == nums[l]) {
      return l;
    }
    if (target == nums[r]) {
      return r;
    }
    return -1;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

