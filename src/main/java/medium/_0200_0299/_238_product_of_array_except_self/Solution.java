package medium._0200_0299._238_product_of_array_except_self;

//Given an array nums of n integers where n > 1, return an array output such that
// output[i] is equal to the product of all the elements of nums except nums[i].
//
//
// Example:
//
//
//Input:  [1,2,3,4]
//Output: [24,12,8,6]
//
//
// Constraint: It's guaranteed that the product of the elements of any prefix or
// suffix of the array (including the whole array) fits in a 32 bit integer.
//
// Note: Please solve it without division and in O(n).
//
// Follow up:
//Could you solve it with constant space complexity? (The output array does not
//count as extra space for the purpose of space complexity analysis.)
// Related Topics Array
// 👍 6873 👎 534


import java.util.Arrays;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:1 ms,击败了100.00% 的Java用户
  //  内存消耗:47.7 MB,击败了98.94% 的Java用户
  public int[] productExceptSelf(int[] nums) {
    int product = 1, zeroCount = 0;
    for (int n : nums) {
      if (n == 0) {
        zeroCount++;
      } else {
        product *= n;
      }
    }
    if (1 < zeroCount) {
      Arrays.fill(nums, 0);
      return nums;
    }
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != 0) {
        nums[i] = 0 == zeroCount ? product / nums[i] : 0;
      } else {
        nums[i] = product;
      }
    }
    return nums;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

