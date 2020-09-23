package easy._1100_1199._1175_prime_arrangements;

//Return the number of permutations of 1 to n
// so that prime numbers are at prime indices (1-indexed.)
//
// (Recall that an integer is prime if and only if it is greater than 1,
// and cannot be written as a product of two positive integers both smaller than it.)
//
// Since the answer may be large, return the answer modulo 10^9 + 7.
//
//
// Example 1:
//
//
//Input: n = 5
//Output: 12
//Explanation: For example [1,2,5,4,3] is a valid permutation,
// but [5,2,3,4,1] is not because the prime number 5 is at index 1.
//
//
// Example 2:
//
//
//Input: n = 100
//Output: 682289015
//
//
//
// Constraints:
//
//
// 1 <= n <= 100
//
// Related Topics Math
// 👍 125 👎 224


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:36.7 MB,击败了29.37% 的Java用户
  int primeIdx = 0, mod = (int) (1e9 + 7);

  public int numPrimeArrangements(int n) {
    if (n < 3) {
      return 1;
    }
    int primeNum = 0;
    for (int i = 1; i <= n; i++) {
      if (isPrime(i)) {
        primeNum++;
      }
    }
    //(a*b)%c = (a%c*b%c)%c
    long res = factorialMod1e9Plus7(factorialMod1e9Plus7(1, primeNum), n - primeNum) % mod;
    return (int) res;
  }

  public boolean isPrime(int n) {
    int[] prime = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73,
        79, 83, 89, 97};
    while (primeIdx < 25 && prime[primeIdx] < n) {
      primeIdx++;
    }
    if (primeIdx == 25) {
      return false;
    }
    return n == prime[primeIdx];
  }

  public long factorialMod1e9Plus7(long res, int n) {
    while (0 < n) {
      res = (res * n--) % mod;
    }
    return res;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

