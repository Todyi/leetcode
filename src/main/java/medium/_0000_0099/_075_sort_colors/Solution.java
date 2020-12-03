package medium._0000_0099._075_sort_colors;

//Given an array nums with n objects colored red, white, or blue, sort them in-place
// so that objects of the same color are adjacent,
// with the colors in the order red, white, and blue.
//
// Here, we will use the integers 0, 1, and 2 to represent the color red, white,
// and blue respectively.
//
// Follow up:
//
//
// Could you solve this problem without using the library's sort function?
// Could you come up with a one-pass algorithm using only O(1) constant space?
//
//
//
// Example 1:
// Input: nums = [2,0,2,1,1,0]
//Output: [0,0,1,1,2,2]
// Example 2:
// Input: nums = [2,0,1]
//Output: [0,1,2]
// Example 3:
// Input: nums = [0]
//Output: [0]
// Example 4:
// Input: nums = [1]
//Output: [1]
//
//
// Constraints:
//
//
// n == nums.length
// 1 <= n <= 300
// nums[i] is 0, 1, or 2.
//
// Related Topics Array Two Pointers Sort
// 👍 4419 👎 255


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:37.4 MB,击败了83.16% 的Java用户
  public void sortColors(int[] nums) {
    quickSort(nums, 0, nums.length - 1);
  }

  public void quickSort(int[] nums, int l, int r) {
    if (l < r) {
      int pivot = r, idx = l;
      for (int i = l; i < r; i++) {
        if (nums[i] < nums[pivot]) {
          swap(nums, i, idx++);
        }
      }
      if (nums[pivot] < nums[idx]) {
        swap(nums, pivot, idx);
      }
      quickSort(nums, l, idx - 1);
      quickSort(nums, idx + 1, r);
    }
  }

  public void swap(int[] nums, int i, int j) {
    int tmp = nums[i];
    nums[i] = nums[j];
    nums[j] = tmp;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

