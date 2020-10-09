package easy._1500_1599._1523_count_odd_numbers_in_an_interval_range;

//Given two non-negative integers low and high. Return the count of odd numbers
//between low and high (inclusive).
//
//
// Example 1:
//
//
//Input: low = 3, high = 7
//Output: 3
//Explanation: The odd numbers between 3 and 7 are [3,5,7].
//
// Example 2:
//
//
//Input: low = 8, high = 10
//Output: 1
//Explanation: The odd numbers between 8 and 10 are [9].
//
//
// Constraints:
//
//
// 0 <= low <= high <= 10^9
// Related Topics Math
// 👍 126 👎 13


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:35.7 MB,击败了14.67% 的Java用户
  public int countOdds(int low, int high) {
    int res = 0;
    if ((low & 1) == 1) {
      res++;
      low++;
    }
    if ((high & 1) == 1) {
      res++;
      high--;
    }
    return res + (high - low) / 2;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

