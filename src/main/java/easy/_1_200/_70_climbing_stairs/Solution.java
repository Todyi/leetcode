package easy._1_200._70_climbing_stairs;/*
 * @lc app=leetcode id=70 lang=java
 *
 * [70] Climbing Stairs
 */

import java.util.HashMap;
import java.util.Map;

// @lc code=start
class Solution {

  //45/45 cases passed (4 ms)
  //Your runtime beats 100 % of java submissions
  //Your memory usage beats 5.26 % of java submissions (36 MB)
  Map<Integer, Integer> map = new HashMap<>();

  public int climbStairs(int n) {
    System.out.println(n);
    if (n == 1) {
      return 1;
    }
    if (n == 2) {
      return 2;
    }

    Integer ways_n_1 = map.get(n - 1);
    if (ways_n_1 == null) {
      ways_n_1 = climbStairs(n - 1);
      map.put(n - 1, ways_n_1);
    }
    Integer ways_n_2 = map.get(n - 2);
    if (ways_n_2 == null) {
      ways_n_2 = climbStairs(n - 2);
      map.put(n - 2, ways_n_1);
    }
    return ways_n_1 + ways_n_2;
  }

//  public int climbStairs(int n) {
//    if (n == 1) {
//      return 1;
//    }
//    if (n == 2) {
//      return 2;
//    }
//
//    int i = 1;
//    int j = 2;
//
//    for (int k = 3; k <= n; k++) {
//      j += i;
//      i = j - i;
//    }
//    return j;
//  }
}
// @lc code=end

