package easy._100_199._198_house_robber;

//You are a professional robber planning to rob houses along a street. Each hous
//e has a certain amount of money stashed, the only constraint stopping you from r
//obbing each of them is that adjacent houses have security system connected and i
//t will automatically contact the police if two adjacent houses were broken into
//on the same night.
//
// Given a list of non-negative integers representing the amount of money of eac
//h house, determine the maximum amount of money you can rob tonight without alert
//ing the police.
//
// Example 1:
//
//
//Input: [1,2,3,1]
//Output: 4
//Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
//             Total amount you can rob = 1 + 3 = 4.
//
// Example 2:
//
//
//Input: [2,7,9,3,1]
//Output: 12
//Explanation: Rob house 1 (money = 2), rob house 3 (money = 9) and rob house 5
//(money = 1).
//             Total amount you can rob = 2 + 9 + 1 = 12.
//
// Related Topics Dynamic Programming


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  Integer[] cache = null;

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:36.6 MB,击败了5.26% 的Java用户
  public int rob(int[] nums) {
    if (nums == null || nums.length == 0) {
      return 0;
    }
    cache = new Integer[nums.length + 3];
    int startMax = nums[0] + rob(nums, 2);
    int start1Max = 1 < nums.length ? nums[1] : 0;
    start1Max += rob(nums, 3);
    return Math.max(startMax, start1Max);
  }

  public int rob(int[] nums, int start) {

    if (nums.length <= start) {
      return 0;
    }

    Integer startMaxCache = cache[start + 2];
    if (startMaxCache == null) {
      startMaxCache = rob(nums, start + 2);
      cache[start + 2] = startMaxCache;
    }
    int startMax = nums[start] + startMaxCache;

    int start1Max = start + 1 < nums.length ? nums[start + 1] : 0;
    Integer start1MaxCache = cache[start + 3];
    if (start1MaxCache == null) {
      start1MaxCache = rob(nums, start + 3);
      cache[start + 3] = start1MaxCache;
    }
    start1Max += start1MaxCache;
    return Math.max(startMax, start1Max);
  }
}
//leetcode submit region end(Prohibit modification and deletion)

