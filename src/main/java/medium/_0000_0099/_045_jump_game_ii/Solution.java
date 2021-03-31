package medium._0000_0099._045_jump_game_ii;

//Given an array of non-negative integers nums,
// you are initially positioned at the first index of the array.
//
// Each element in the array represents your maximum jump length at that position.
//
// Your goal is to reach the last index in the minimum number of jumps.
//
// You can assume that you can always reach the last index.
//
//
// Example 1:
//
//
//Input: nums = [2,3,1,1,4]
//Output: 2
//Explanation: The minimum number of jumps to reach the last index is 2. Jump 1
//step from index 0 to 1, then 3 steps to the last index.
//
//
// Example 2:
//
//
//Input: nums = [2,3,0,1,4]
//Output: 2
//
//
//
// Constraints:
//
//
// 1 <= nums.length <= 1000
// 0 <= nums[i] <= 105
//
// Related Topics Array Greedy
// 👍 3867 👎 174


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:36 MB,击败了99.57% 的Java用户
  public int jump(int[] nums) {
    Integer[] minimumMap = new Integer[nums.length];
    minimumMap[0] = 0;
    for (int i = 0; i < nums.length; i++) {
      int step = nums[i];
      for (int j = 1; j <= step; j++) {
        if (nums.length <= i + j) {
          break;
        }
        if (minimumMap[i + j] == null) {
          minimumMap[i + j] = minimumMap[i] + 1;
        } else {
          minimumMap[i + j] = Math.min(minimumMap[i + j], minimumMap[i] + 1);
        }
      }
    }
    return minimumMap[nums.length - 1];
  }

}
//leetcode submit region end(Prohibit modification and deletion)
