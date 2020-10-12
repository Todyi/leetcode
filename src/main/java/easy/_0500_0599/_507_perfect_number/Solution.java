package easy._0500_0599._507_perfect_number;

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
//  public boolean checkPerfectNumber(int num) {
//    if (num < 6) {
//      return false;
//    }
//    int sum = 1;
//    int l = 2;
//    int r = num / l;
//    while (l <= r) {
//      if (l * r == num) {
//        sum += l + r;
//      }
//      l++;
//      r = num / l;
//    }
//
//    return sum == num;
//  }

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:36.1 MB,击败了5.88% 的Java用户
  public boolean checkPerfectNumber(int num) {
    //https://en.wikipedia.org/wiki/Perfect_number
    //perfect Number = 2^(p-1)(2^p-1), p is prime and 2^p-1 is prime too

    int[] p = {2, 3, 5, 7,
        13};//17, 19, 31, 61, 89, 107, 127, 521, 607, 1279, 2203, 2281, 3217, 4253, 4423, 9689, 9941, 11213, 19937, 21701, 23209, 44497, 86243, 110503, 132049, 216091, 756839, 859433, 1257787, 1398269, 2976221, 3021377, 6972593, 13466917, 20996011, 24036583, 25964951, 30402457, 32582657, 37156667, 42643801 and 43112609
    //2^16(2^17-1) = 8,589,869,056‬ is greater than 100,000,000

    for (int i : p) {
      if (Math.pow(2, i - 1) * (Math.pow(2, i) - 1) == num) {
        return true;
      }
    }
    return false;
  }


}
//leetcode submit region end(Prohibit modification and deletion)

