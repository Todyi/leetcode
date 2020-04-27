package easy._1_200._121_best_time_to_buy_and_sell_stock;

//Say you have an array for which the ith element is the price of a given stock
//on day i.
//
// If you were only permitted to complete at most one transaction (i.e., buy one
// and sell one share of the stock), design an algorithm to find the maximum profi
//t.
//
// Note that you cannot sell a stock before you buy one.
//
// Example 1:
//
//
//Input: [7,1,5,3,6,4]
//Output: 5
//Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit =
//6-1 = 5.
//             Not 7-1 = 6, as selling price needs to be larger than buying pric
//e.
//
//
// Example 2:
//
//
//Input: [7,6,4,3,1]
//Output: 0
//Explanation: In this case, no transaction is done, i.e. max profit = 0.
//
// Related Topics Array Dynamic Programming


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:1 ms,击败了99.18% 的Java用户
  //  内存消耗:39.6 MB,击败了17.70% 的Java用户
  public int maxProfit(int[] prices) {
    if (prices == null || prices.length == 1) {
      return 0;
    }
    int maxProfit = 0;
    for (int i = 0; i < prices.length; i++) {
      int buy = prices[i];
      for (int j = i + 1; j < prices.length; j++) {
        if (prices[j] <= buy) {
          break;
        }
        maxProfit = Math.max(maxProfit, prices[j] - buy);
      }
    }
    return maxProfit;


  }
}
//leetcode submit region end(Prohibit modification and deletion)

