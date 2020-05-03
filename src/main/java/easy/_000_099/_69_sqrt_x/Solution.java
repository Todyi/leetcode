package easy._000_099._69_sqrt_x;/*
 * @lc app=leetcode id=69 lang=java
 *
 * [69] Sqrt(x)
 */

// @lc code=start
class Solution {

  //1017/1017 cases passed (1 ms)
  //Your runtime beats 100 % of java submissions
  //Your memory usage beats 5 % of java submissions (36.2 MB)

  public int mySqrt(int x) {
    if (x == 0) {
      return 0;
    }
    if (x < 4) {
      return 1;
    }

    int left = 2;
    int right = x >> 1;

    while (left <= right) {
      int mid = (left + right) >> 1;
      int remain = x / mid;
      if (mid < remain) {
        left = mid + 1;
      } else if (remain < mid) {
        right = mid - 1;
      } else {
        return mid;
      }
    }
    return right;
  }
}
// @lc code=end

