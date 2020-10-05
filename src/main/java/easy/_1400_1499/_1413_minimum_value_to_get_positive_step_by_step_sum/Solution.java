package easy._1400_1499._1413_minimum_value_to_get_positive_step_by_step_sum;

//Given an array of integers nums, you start with an initial positive value startValue. 
//
// In each iteration, you calculate the step by step sum of startValue 
// plus elements in nums (from left to right). 
//
// Return the minimum positive value of startValue 
// such that the step by step sum is never less than 1. 
//
// 
// Example 1: 
//
// 
//Input: nums = [-3,2,-3,4,2]
//Output: 5
//Explanation: If you choose startValue = 4, in the third iteration your step by
// step sum is less than 1.
//                step by step sum
//               startValue = 4 | startValue = 5 | nums
//                 (4 -3 ) = 1  | (5 -3 ) = 2    |  -3
//                 (1 +2 ) = 3  | (2 +2 ) = 4    |   2
//                 (3 -3 ) = 0  | (4 -3 ) = 1    |  -3
//                 (0 +4 ) = 4  | (1 +4 ) = 5    |   4
//                 (4 +2 ) = 6  | (5 +2 ) = 7    |   2
// 
//
// Example 2: 
//
// 
//Input: nums = [1,2]
//Output: 1
//Explanation: Minimum start value should be positive. 
// 
//
// Example 3: 
//
// 
//Input: nums = [1,-2,-3]
//Output: 5
// 
//
// 
// Constraints: 
//
// 
// 1 <= nums.length <= 100 
// -100 <= nums[i] <= 100 
// Related Topics Array 
// 👍 230 👎 60


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:36.1 MB,击败了99.48% 的Java用户
  public int minStartValue(int[] nums) {
    int res = 1, tmp = res;
    for (int num : nums) {
      tmp += num;
      if (tmp <= 0) {
        res += -tmp + 1;
        tmp = 1;
      }
    }
    return res;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

