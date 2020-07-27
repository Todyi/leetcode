package easy._700_799._746_min_cost_climbing_stairs;

//
//On a staircase, the i-th step has some non-negative cost cost[i] assigned (0 indexed).
//
//Once you pay the cost, you can either climb one or two steps. You need to find
// minimum cost to reach the top of the floor, and you can either start from the step with index 0,
// or the step with index 1.
//
//
// Example 1:
//
//Input: cost = [10, 15, 20]
//Output: 15
//Explanation: Cheapest is start on cost[1], pay that cost and go to the top.
//
//
//
// Example 2:
//
//Input: cost = [1, 100, 1, 1, 1, 100, 1, 1, 100, 1]
//Output: 6
//Explanation: Cheapest is start on cost[0], and only step on 1s, skipping cost[3].
//
//
//
// Note:
//
// cost will have a length in the range [2, 1000].
// Every cost[i] will be an integer in the range [0, 999].
//
// Related Topics Array Dynamic Programming
// 👍 2062 👎 464


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:1 ms,击败了88.00% 的Java用户
  //  内存消耗:39.2 MB,击败了39.20% 的Java用户
//  public int minCostClimbingStairs(int[] cost) {
//    Integer[] minCost = new Integer[cost.length];
//    return Math
//        .min(minCost(cost, minCost, cost.length - 1), minCost(cost, minCost, cost.length - 2));
//  }
//
//  public int minCost(int[] cost, Integer[] minCost, int x) {
//    if (x < 0) {
//      return 0;
//    }
//    if (minCost[x] == null) {
//      minCost[x] = cost[x] + Math.min(minCost(cost, minCost, x - 1), minCost(cost, minCost, x - 2));
//    }
//    return minCost[x];
//  }

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:39.3 MB,击败了33.40% 的Java用户
  public int minCostClimbingStairs(int[] cost) {
    int c1 = 0, c2 = 0;
    for (int v : cost) {
      int sum = v + Math.min(c1, c2);
      c1 = c2;
      c2 = sum;
    }
    return Math.min(c1, c2);
  }
}
//leetcode submit region end(Prohibit modification and deletion)

