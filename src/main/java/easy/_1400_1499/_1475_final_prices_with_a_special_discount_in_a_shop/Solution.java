package easy._1400_1499._1475_final_prices_with_a_special_discount_in_a_shop;

//Given the array prices where prices[i] is the price of the ith item in a shop.
// There is a special discount for items in the shop, if you buy the ith item, 
// then you will receive a discount equivalent to prices[j] 
// where j is the minimum index such that j > i and prices[j] <= prices[i], 
// otherwise, you will not receive any discount at all. 
//
// Return an array where the ith element is the final price you will pay for the
// ith item of the shop considering the special discount. 
//
// 
// Example 1: 
//
// 
//Input: prices = [8,4,6,2,3]
//Output: [4,2,4,2,3]
//Explanation:
//For item 0 with price[0]=8 you will receive a discount equivalent to prices[1]=4,
// therefore, the final price you will pay is 8 - 4 = 4.
//For item 1 with price[1]=4 you will receive a discount equivalent to prices[3]=2,
// therefore, the final price you will pay is 4 - 2 = 2.
//For item 2 with price[2]=6 you will receive a discount equivalent to prices[3]=2,
// therefore, the final price you will pay is 6 - 2 = 4.
//For items 3 and 4 you will not receive any discount at all.
// 
//
// Example 2: 
//
// 
//Input: prices = [1,2,3,4,5]
//Output: [1,2,3,4,5]
//Explanation: In this case, for all items, you will not receive any discount at
// all.
// 
//
// Example 3: 
//
// 
//Input: prices = [10,1,1,6]
//Output: [9,0,1,6]
// 
//
// 
// Constraints: 
//
// 
// 1 <= prices.length <= 500 
// 1 <= prices[i] <= 10^3 
// 
// Related Topics Array 
// 👍 266 👎 20


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:39.2 MB,击败了93.67% 的Java用户
  public int[] finalPrices(int[] prices) {
    for (int i = 0; i < prices.length; i++) {
      prices[i] = discount(i, prices);
    }
    return prices;
  }

  public int discount(int idx, int[] prices) {
    for (int i = idx + 1; i < prices.length; i++) {
      if (prices[i] <= prices[idx]) {
        return prices[idx] - prices[i];
      }
    }
    return prices[idx];
  }
}
//leetcode submit region end(Prohibit modification and deletion)

