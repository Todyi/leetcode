package easy._201_400._283_move_zeroes;

//Given an array nums, write a function to move all 0's to the end of it while m
//aintaining the relative order of the non-zero elements.
//
// Example:
//
//
//Input: [0,1,0,3,12]
//Output: [1,3,12,0,0]
//
// Note:
//
//
// You must do this in-place without making a copy of the array.
// Minimize the total number of operations.
// Related Topics Array Two Pointers


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:1 ms,击败了25.72% 的Java用户
  //  内存消耗:42.2 MB,击败了5.59% 的Java用户
  public void moveZeroes(int[] nums) {
    int[] notZero = new int[nums.length];
    int i = 0;
    int j = 0;
    while (i < nums.length) {
      if (nums[i] != 0) {
        notZero[j] = nums[i];
        j++;
      }
      nums[i] = 0;
      i++;
    }
    for (int k = 0; k < notZero.length; k++) {
      nums[k] = notZero[k];
    }
  }
}
//leetcode submit region end(Prohibit modification and deletion)

