package easy._500_599._561_array_partition_i;

//
//Given an array of 2n integers,
// your task is to group these integers into n pairs of integer,
// say (a1, b1), (a2, b2), ..., (an, bn)
// which makes sum of min(ai, bi) for all i from 1 to n as large as possible.
//
//
// Example 1:
//
//Input: [1,4,3,2]
//
//Output: 4
//Explanation: n is 2, and the maximum sum of pairs is 4 = min(1, 2) + min(3, 4)
//.
//
//
//
// Note:
//
// n is a positive integer, which is in the range of [1, 10000].
// All the integers in the array will be in the range of [-10000, 10000].
//
// Related Topics Array


import java.util.Arrays;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:10 ms,击败了95.70% 的Java用户
  //  内存消耗:41.9 MB,击败了92.86% 的Java用户
  public int arrayPairSum(int[] nums) {
    Arrays.sort(nums);
    int sum = 0, i = 0;
    while (i < nums.length) {
      sum += nums[i];
      i += 2;
    }
    return sum;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

