package easy._1200_1299._1281_subtract_the_product_and_sum_of_digits_of_an_integer;

//Given an integer number n,
// return the difference between the product of its digits and the sum of its digits.
//
// Example 1:
//
//
//Input: n = 234
//Output: 15
//Explanation:
//Product of digits = 2 * 3 * 4 = 24
//Sum of digits = 2 + 3 + 4 = 9
//Result = 24 - 9 = 15
//
//
// Example 2:
//
//
//Input: n = 4421
//Output: 21
//Explanation:
//Product of digits = 4 * 4 * 2 * 1 = 32
//Sum of digits = 4 + 4 + 2 + 1 = 11
//Result = 32 - 11 = 21
//
//
//
// Constraints:
//
//
// 1 <= n <= 10^5
//
// Related Topics Math
// 👍 358 👎 106


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:35.9 MB,击败了93.64% 的Java用户
  public int subtractProductAndSum(int n) {
    int sum = 0, product = 1;
    while (0 < n) {
      int tmp = n % 10;
      sum += tmp;
      product *= tmp;
      n /= 10;
    }
    return product - sum;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

