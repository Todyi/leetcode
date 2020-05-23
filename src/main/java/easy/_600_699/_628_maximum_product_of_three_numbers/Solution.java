package easy._600_699._628_maximum_product_of_three_numbers;

//Given an integer array,
// find three numbers whose product is maximum and output the maximum product.
//
// Example 1:
//
//
//Input: [1,2,3]
//Output: 6
//
//
//
//
// Example 2:
//
//
//Input: [1,2,3,4]
//Output: 24
//
//
//
//
// Note:
//
//
// The length of the given array will be in range [3,104]
// and all elements are in the range [-1000, 1000].
// Multiplication of any three numbers in the input won't exceed the range of 32-bit signed integer.
//
//
//
// Related Topics Array Math


import java.util.Arrays;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:9 ms,击败了63.42% 的Java用户
  //  内存消耗:41.4 MB,击败了7.14% 的Java用户
  public int maximumProduct(int[] nums) {
    Arrays.sort(nums);
    int len = nums.length, twoNegOnePos = nums[0] * nums[1] * nums[len - 1];
    int threePos = nums[len - 1] * nums[len - 2] * nums[len - 3];
    return twoNegOnePos < threePos ? threePos : twoNegOnePos;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

