package medium._0200_0299._213_house_robber_ii;

//You are a professional robber planning to rob houses along a street.
// Each house has a certain amount of money stashed.
// All houses at this place are arranged in a circle.
// That means the first house is the neighbor of the last one.
// Meanwhile, adjacent houses have a security system connected,
// and it will automatically contact the police
// if two adjacent houses were broken into on the same night.
//
// Given a list of non-negative integers nums representing the amount of money of each house,
// return the maximum amount of money you can rob tonight without alerting the police.
//
//
// Example 1:
//
//
//Input: nums = [2,3,2]
//Output: 3
//Explanation: You cannot rob house 1 (money = 2) and then rob house 3 (money =
//2), because they are adjacent houses.
//
//
// Example 2:
//
//
//Input: nums = [1,2,3,1]
//Output: 4
//Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
//Total amount you can rob = 1 + 3 = 4.
//
//
// Example 3:
//
//
//Input: nums = [0]
//Output: 0
//
//
//
// Constraints:
//
//
// 1 <= nums.length <= 100
// 0 <= nums[i] <= 1000
//
// Related Topics Dynamic Programming
// 👍 2644 👎 62


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
  
  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:36.3 MB,击败了66.36% 的Java用户

  //map[n][0]withNumZero
  //map[n][1]withoutNumZero
  Integer[][] map;

  public int rob(int[] nums) {
    int len = nums.length;
    if (len == 1) {
      return nums[0];
    }
    map = new Integer[len][2];
    map[0][0] = nums[0];
    map[0][1] = 0;
    map[1][0] = nums[1];
    map[1][1] = nums[1];
    if (2 < len) {
      map[2][0] = nums[0] + nums[2];
      map[2][1] = nums[2];
    }
    for (int i = 3; i < len; i++) {
      map[i][0] = nums[i] + Math.max(map[i - 2][0], map[i - 3][0]);
      map[i][1] = nums[i] + Math.max(map[i - 2][1], map[i - 3][1]);
    }
    map[len - 1][0] -= Math.min(nums[0], nums[len - 1]);

    return Math.max(Math.max(map[len - 1][0], map[len - 1][1]),
        Math.max(map[len - 2][0], map[len - 2][1]));
  }

}
//leetcode submit region end(Prohibit modification and deletion)

