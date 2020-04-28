package easy._201_400._204_count_primes;

//Count the number of prime numbers less than a non-negative number, n.
//
// Example:
//
//
//Input: 10
//Output: 4
//Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.
//
// Related Topics Hash Table Math


import java.util.ArrayList;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:339 ms,击败了15.26% 的Java用户
  //  内存消耗:44.4 MB,击败了5.66% 的Java用户
  List<Integer> primeList = new ArrayList<>();

  public int countPrimes(int n) {
    if (n < 3) {
      return 0;
    }
    int count = 1;
    for (int i = 3; i < n; i += 2) {
      if (isPrime(i)) {
        count++;
      }
    }
    return count;
  }

  public boolean isPrime(int n) {
    for (Integer i : primeList) {
      if (n < i * i) {
        break;
      }
      if (n / i * i == n) {
        return false;
      }
    }
    primeList.add(n);
    return true;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

