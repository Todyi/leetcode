package medium._0100_0199._198_house_robber;

//You are a professional robber planning to rob houses along a street. 
// Each house has a certain amount of money stashed, the only constraint stopping you 
// from robbing each of them is that adjacent houses have security system connected 
// and it will automatically contact the police if two adjacent houses were broken into 
//on the same night. 
//
// Given a list of non-negative integers representing the amount of money of each house,
// determine the maximum amount of money you can rob tonight without alerting the police.
//
// 
// Example 1: 
//
// 
//Input: nums = [1,2,3,1]
//Output: 4
//Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
//            Total amount you can rob = 1 + 3 = 4.
// 
//
// Example 2: 
//
// 
//Input: nums = [2,7,9,3,1]
//Output: 12
//Explanation: Rob house 1 (money = 2), rob house 3 (money = 9) and rob house 5 
//(money = 1).
//            Total amount you can rob = 2 + 9 + 1 = 12.
// 
//
// 
// Constraints: 
//
// 
// 0 <= nums.length <= 100 
// 0 <= nums[i] <= 400 
// 
// Related Topics Dynamic Programming 
// 👍 6460 👎 185


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  Runtime: 0 ms, faster than 100.00% of Java online submissions for House Robber.
  //  Memory Usage: 36.5 MB, less than 48.47% of Java online submissions for House Robber.
  public int rob(int[] nums) {
    int len = nums.length;
    Integer[] map = new Integer[len];
    return Math.max(rob(map, nums, len - 1), rob(map, nums, len - 2));
  }

  public int rob(Integer[] map, int[] nums, int idx) {
    if (idx < 0) {
      return 0;
    }
    if (map[idx] != null) {
      return map[idx];
    }
    map[idx] = nums[idx] + Math.max(rob(map, nums, idx - 2), rob(map, nums, idx - 3));
    return map[idx];
  }
}
//leetcode submit region end(Prohibit modification and deletion)
