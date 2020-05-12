package easy._500_599._506_relative_ranks;

//
//Given scores of N athletes,
// find their relative ranks and the people with the top three highest scores,
// who will be awarded medals: "Gold Medal", "Silver Medal" and "Bronze Medal".
//
// Example 1:
//
//Input: [5, 4, 3, 2, 1]
//Output: ["Gold Medal", "Silver Medal", "Bronze Medal", "4", "5"]
//Explanation: The first three athletes got the top three highest scores,
// so they got "Gold Medal", "Silver Medal" and "Bronze Medal".
// For the left two athletes,
// you just need to output their relative ranks according to their scores.
//
//
//
// Note:
//
// N is a positive integer and won't exceed 10,000.
// All the scores of athletes are guaranteed to be unique.
//
//
//


import java.util.Arrays;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:3 ms,击败了95.49% 的Java用户
  //  内存消耗:40.6 MB,击败了100.00% 的Java用户
  public String[] findRelativeRanks(int[] nums) {
    int[] tmp = Arrays.copyOf(nums, nums.length);
    Arrays.sort(tmp);
    int[] map = new int[tmp[tmp.length - 1] + 1];
    for (int i = 0; i < tmp.length; i++) {
      map[tmp[i]] = tmp.length - i;
    }

    String[] res = new String[nums.length];
    for (int i = 0; i < nums.length; i++) {
      if (3 < map[nums[i]]) {
        res[i] = Integer.toString(map[nums[i]]);
      } else if (1 == map[nums[i]]) {
        res[i] = "Gold Medal";
      } else if (2 == map[nums[i]]) {
        res[i] = "Silver Medal";
      } else {
        res[i] = "Bronze Medal";
      }
    }

    return res;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

