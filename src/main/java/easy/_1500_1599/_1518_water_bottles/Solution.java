package easy._1500_1599._1518_water_bottles;

//Given numBottles full water bottles, 
// you can exchange numExchange empty water bottles for one full water bottle.
//
// The operation of drinking a full water bottle turns it into an empty bottle.
//
//
// Return the maximum number of water bottles you can drink.
//
//
// Example 1:
//
//
//
//
//Input: numBottles = 9, numExchange = 3
//Output: 13
//Explanation: You can exchange 3 empty bottles to get 1 full water bottle.
//Number of water bottles you can drink: 9 + 3 + 1 = 13.
//
//
// Example 2:
//
//
//
//
//Input: numBottles = 15, numExchange = 4
//Output: 19
//Explanation: You can exchange 4 empty bottles to get 1 full water bottle.
//Number of water bottles you can drink: 15 + 3 + 1 = 19.
//
//
// Example 3:
//
//
//Input: numBottles = 5, numExchange = 5
//Output: 6
//
//
// Example 4:
//
//
//Input: numBottles = 2, numExchange = 3
//Output: 2
//
//
//
// Constraints:
//
//
// 1 <= numBottles <= 100
// 2 <= numExchange <= 100
// Related Topics Greedy
// 👍 265 👎 25


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:35.7 MB,击败了16.54% 的Java用户
  public int numWaterBottles(int numBottles, int numExchange) {
    int res = numBottles, emptyBottles = numBottles, tmp;
    while (0 < emptyBottles / numExchange) {
      tmp = emptyBottles / numExchange;
      res += tmp;
      emptyBottles = tmp + emptyBottles % numExchange;
    }
    return res;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

