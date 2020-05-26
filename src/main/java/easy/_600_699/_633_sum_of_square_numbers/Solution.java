package easy._600_699._633_sum_of_square_numbers;

//Given a non-negative integer c,
// your task is to decide whether there're two integers a and b such that a2 + b2 = c.
//
// Example 1:
//
//
//Input: 5
//Output: True
//Explanation: 1 * 1 + 2 * 2 = 5
//
//
//
//
// Example 2:
//
//
//Input: 3
//Output: False
//
//
//
// Related Topics Math


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:4 ms,击败了45.82% 的Java用户
  //  内存消耗:36 MB,击败了7.14% 的Java用户
//  public boolean judgeSquareSum(int c) {
//    int flag = (int) Math.sqrt(c);
//    if (flag * flag == c) {
//      return true;
//    }
//    for (int a = 1; a <= flag; a++) {
//      int b = (int) Math.sqrt(c - (a * a));
//      if (a * a + b * b == c) {
//        return true;
//      }
//    }
//    return false;
//  }


  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:36.5 MB,击败了7.14% 的Java用户
  public boolean judgeSquareSum(int c) {
    // Fermat's Theorem:
    // Sum of two squares states that an odd prime p can be expressed as:
    // p = x^2+y^2,with x and y integers,
    // if and only if p ≡1(mod 4)

    // base on Fermat's Theorem:
    // Any positive number n is expressible as a sum of two squares
    // if and only if the prime factorization of n, 
    // every prime of the form (4k+3) occurs an even number of times.
    // proof:http://math.uga.edu/~pete/4400twosquares.pdf
    for (int i = 2; i * i <= c; i++) {
      int count = 0;
      if (c % i == 0) {
        while (c % i == 0) {
          count++;
          c /= i;
        }
        if (i % 4 == 3 && count % 2 != 0) {
          return false;
        }
      }
    }
    return c % 4 != 3;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

