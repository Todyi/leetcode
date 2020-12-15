package medium._0000_0099._081_search_in_rotated_sorted_array_ii;

//Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.
//
// (i.e., [0,0,1,2,2,5,6] might become [2,5,6,0,0,1,2]).
//
// You are given a target value to search. If found in the array return true,
// otherwise return false.
//
// Example 1:
//
//
//Input: nums = [2,5,6,0,0,1,2], target = 0
//Output: true
//
//
// Example 2:
//
//
//Input: nums = [2,5,6,0,0,1,2], target = 3
//Output: false
//
// Follow up:
//
//
// This is a follow up problem to Search in Rotated Sorted Array, where nums may
// contain duplicates.
// Would this affect the run-time complexity? How and why?
//
// Related Topics Array Binary Search
// 👍 1786 👎 523


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:39.1 MB,击败了17.57% 的Java用户
  public boolean search(int[] nums, int target) {
    int pivot = 0, len = nums.length;
    while (pivot < len - 1) {
      if (nums[pivot + 1] < nums[pivot]) {
        break;
      }
      pivot++;
    }
    pivot++;
    boolean result = search(nums, 0, pivot, target);
    if (pivot < len) {
      result = result || search(nums, pivot, len, target);
    }
    return result;
  }

  public boolean search(int[] nums, int l, int r, int target) {
    if (r < l || nums.length <= l || target < nums[l] || nums[r - 1] < target) {
      return false;
    }
    while (l < r) {
      int mid = (l + r) / 2;
      if (nums[mid] == target) {
        return true;
      } else if (nums[mid] < target) {
        if (l == mid) {
          break;
        }
        l = mid;
      } else {
        if (r == mid) {
          break;
        }
        r = mid;
      }
    }
    return false;
  }
}
//leetcode submit region end(Prohibit modification and deletion)
