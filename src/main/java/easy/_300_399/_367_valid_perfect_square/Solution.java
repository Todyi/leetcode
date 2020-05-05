package easy._300_399._367_valid_perfect_square;

//Given a positive integer num, write a function which returns True if num is a
//perfect square else False.
//
// Note: Do not use any built-in library function such as sqrt.
//
// Example 1:
//
//
//
//Input: 16
//Output: true
//
//
//
// Example 2:
//
//
//Input: 14
//Output: false
//
//
// Related Topics Math Binary Search


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:36 MB,击败了6.12% 的Java用户
  public boolean isPerfectSquare(int num) {
    if (num == 0 || num == 1) {
      return true;
    }
    int left = 1;
    int right = num >> 1;
    int mid = (left + right) >> 1;
    while (left < right - 1) {
      int remain = num / mid;
      if (remain < mid) {
        right = mid;
      } else if (mid < remain) {
        left = mid;
      } else {
        break;
      }
      mid = (left + right) >> 1;
    }
    mid = left == right - 1 ? right : (left + right) >> 1;
    return num / mid == mid && num % mid == 0;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

