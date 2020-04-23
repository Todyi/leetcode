package easy._122_best_time_to_buy_and_sell_stock_ii;
//Say you have an array prices for which the ith element is the price of a given
// stock on day i.
//
// Design an algorithm to find the maximum profit. You may complete as many tran
//sactions as you like (i.e., buy one and sell one share of the stock multiple tim
//es).
//
// Note: You may not engage in multiple transactions at the same time (i.e., you
// must sell the stock before you buy again).
//
// Example 1:
//
//
//Input: [7,1,5,3,6,4]
//Output: 7
//Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit =
//5-1 = 4.
//             Then buy on day 4 (price = 3) and sell on day 5 (price = 6), prof
//it = 6-3 = 3.
//
//
// Example 2:
//
//
//Input: [1,2,3,4,5]
//Output: 4
//Explanation: Buy on day 1 (price = 1) and sell on day 5 (price = 5), profit =
//5-1 = 4.
//             Note that you cannot buy on day 1, buy on day 2 and sell them lat
//er, as you are
//             engaging multiple transactions at the same time. You must sell be
//fore buying again.
//
//
// Example 3:
//
//
//Input: [7,6,4,3,1]
//Output: 0
//Explanation: In this case, no transaction is done, i.e. max profit = 0.
//
//
// Constraints:
//
//
// 1 <= prices.length <= 3 * 10 ^ 4
// 0 <= prices[i] <= 10 ^ 4
//
// Related Topics Array Greedy


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:1 ms,击败了93.45% 的Java用户
  //  内存消耗:39.4 MB,击败了17.14% 的Java用户
  public int maxProfit(int[] prices) {
    if (prices == null || prices.length == 1) {
      return 0;
    }
    int maxProfit = 0;
    int minPrice = Integer.MAX_VALUE;
    for (int i = 0; i < prices.length; i++) {
      if (prices[i] < minPrice) {
        minPrice = prices[i];
      } else if (0 < prices[i] - minPrice) {
        maxProfit += prices[i] - minPrice;
        minPrice = prices[i];
      }
    }
    return maxProfit;
  }

}
//leetcode submit region end(Prohibit modification and deletion)
