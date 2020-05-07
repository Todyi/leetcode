package easy._400_499._414_third_maximum_number;

//Given a non-empty array of integers, return the third maximum number in this array.
// If it does not exist, return the maximum number. The time complexity must be in O(n).
//
// Example 1:
//
//Input: [3, 2, 1]
//
//Output: 1
//
//Explanation: The third maximum is 1.
//
//
//
// Example 2:
//
//Input: [1, 2]
//
//Output: 2
//
//Explanation: The third maximum does not exist, so the maximum (2) is returned
//instead.
//
//
//
// Example 3:
//
//Input: [2, 2, 3, 1]
//
//Output: 1
//
//Explanation: Note that the third maximum here means the third maximum distinct number.
//Both numbers with value 2 are both considered as second maximum.
//
// Related Topics Array


import java.util.Stack;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:1 ms,击败了89.07% 的Java用户
  //  内存消耗:39.3 MB,击败了86.96% 的Java用户
  public int thirdMax(int[] nums) {
    int max = Integer.MIN_VALUE, second = Integer.MIN_VALUE, third = Integer.MIN_VALUE;
    int intMinCount = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == Integer.MIN_VALUE) {
        intMinCount++;
        continue;
      } else if (max == nums[i] || second == nums[i]) {
        continue;
      } else if (max < nums[i]) {
        if (second < max) {
          if (third < second) {
            third = second;
          }
          second = max;
        }
        max = nums[i];
      } else if (second < nums[i]) {
        if (third < second) {
          third = second;
        }
        second = nums[i];
      } else if (third < nums[i]) {
        third = nums[i];
      }
    }
    if (nums.length < 3) {
      return max;
    }

    if (max == second || max == third || second == third || (intMinCount == 0
        && third == Integer.MIN_VALUE)) {
      return max;
    }
    return third;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

