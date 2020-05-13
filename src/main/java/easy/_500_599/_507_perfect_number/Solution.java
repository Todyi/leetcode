package easy._500_599._507_perfect_number;

//We define the Perfect Number is a positive integer
// that is equal to the sum of all its positive divisors except itself.
//
//Now, given an integer n, write a function
// that returns true when it is a perfect number and false when it is not.
//
//
// Example:
//
//Input: 28
//Output: True
//Explanation: 28 = 1 + 2 + 4 + 7 + 14
//
//
//
// Note:
//The input number n will not exceed 100,000,000. (1e8)
// Related Topics Math


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:1 ms,击败了95.26% 的Java用户
  //  内存消耗:36.4 MB,击败了5.88% 的Java用户
  public boolean checkPerfectNumber(int num) {
    if (num < 6) {
      return false;
    }
    int sum = 1;
    int l = 2;
    int r = num / l;
    while (l <= r) {
      if (l * r == num) {
        sum += l + r;
      }
      l++;
      r = num / l;
    }

    return sum == num;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

