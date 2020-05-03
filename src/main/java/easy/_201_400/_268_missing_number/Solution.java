package easy._201_400._268_missing_number;

//Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find
//the one that is missing from the array.
//
// Example 1:
//
//
//Input: [3,0,1]
//Output: 2
//
//
// Example 2:
//
//
//Input: [9,6,4,2,3,5,7,0,1]
//Output: 8
//
//
// Note:
//Your algorithm should run in linear runtime complexity. Could you implement it
// using only constant extra space complexity? Related Topics Array Math Bit Manip
//ulation


import java.util.Arrays;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:5 ms,击败了23.60% 的Java用户
  //  内存消耗:40 MB,击败了100.00% 的Java用户
//  public int missingNumber(int[] nums) {
//    Arrays.sort(nums);
//    for (int i = 0; i < nums.length; i++) {
//      if (nums[i] != i) {
//        return i;
//      }
//    }
//    return nums.length;
//  }

  //  Runtime: 0 ms, faster than 100.00% of Java online submissions for Missing Number.
  //  Memory Usage: 40.3 MB, less than 98.95% of Java online submissions for Missing Number.
  public int missingNumber(int[] nums) {
    //1+2+3+...+n = (n+1)n/2
    int sum = nums[0];
    for (int i = 1; i < nums.length; i++) {
      sum += nums[i];
    }
    return (((nums.length + 1) * nums.length) >> 1) - sum;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

