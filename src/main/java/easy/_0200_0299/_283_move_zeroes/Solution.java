package easy._0200_0299._283_move_zeroes;

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
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:39.4 MB,击败了41.96% 的Java用户
  public void moveZeroes(int[] nums) {
    int j = Integer.MAX_VALUE;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == 0 && i < j) {
        j = i;
      }
      if (nums[i] != 0 && j < i) {
        nums[j] = nums[i];
        nums[i] = 0;
        while (j < nums.length) {
          if (nums[j] == 0) {
            break;
          }
          j++;
        }
      }
    }
  }
}
//leetcode submit region end(Prohibit modification and deletion)

