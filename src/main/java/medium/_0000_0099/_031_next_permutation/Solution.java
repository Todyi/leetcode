package medium._0000_0099._031_next_permutation;

//Implement next permutation,
// which rearranges numbers into the lexicographically next greater permutation of numbers.
//
// If such an arrangement is not possible,
// it must rearrange it as the lowest possible order (i.e., sorted in ascending order).
//
// The replacement must be in place and use only constant extra memory.
//
//
// Example 1:
// Input: nums = [1,2,3]
//Output: [1,3,2]
// Example 2:
// Input: nums = [3,2,1]
//Output: [1,2,3]
// Example 3:
// Input: nums = [1,1,5]
//Output: [1,5,1]
// Example 4:
// Input: nums = [1]
//Output: [1]
//
//
// Constraints:
//
//
// 1 <= nums.length <= 100
// 0 <= nums[i] <= 100
//
// Related Topics Array
// 👍 4089 👎 1456


import java.util.Arrays;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:39.2 MB,击败了14.64% 的Java用户
  public void nextPermutation(int[] nums) {
    int len = nums.length, idx = len - 1;
    while (0 < idx) {
      if (nums[idx - 1] < nums[idx]) {
        break;
      }
      idx--;
    }
    if (0 < idx) {
      int idxSwap = len - 1;
      while (0 < idxSwap) {
        if (nums[idx - 1] < nums[idxSwap]) {
          swap(nums, idx - 1, idxSwap);
          break;
        }
        idxSwap--;
      }
    }
    int r = len - 1;
    while (idx < r) {
      swap(nums, idx, r);
      r--;
      idx++;
    }
  }

  public void swap(int[] nums, int i, int j) {
    int tmp = nums[i];
    nums[i] = nums[j];
    nums[j] = tmp;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

