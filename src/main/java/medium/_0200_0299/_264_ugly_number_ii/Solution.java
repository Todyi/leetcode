package medium._0200_0299._264_ugly_number_ii;

//An ugly number is a positive integer whose prime factors are limited to 2, 3, and 5.
//
// Given an integer n, return the nth ugly number.
//
//
// Example 1:
//
//
//Input: n = 10
//Output: 12
//Explanation: [1, 2, 3, 4, 5, 6, 8, 9, 10, 12] is the sequence of the first 10 ugly numbers.
//
//
// Example 2:
//
//
//Input: n = 1
//Output: 1
//Explanation: 1 has no prime factors,
// therefore all of its prime factors are limited to 2, 3, and 5.
//
//
//
// Constraints:
//
//
// 1 <= n <= 1690
//
// Related Topics Hash Table Math Dynamic Programming Heap (Priority Queue)
// 👍 2809 👎 168


import java.util.ArrayList;
import java.util.Arrays;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:1 ms,击败了100.00% 的Java用户
  //  内存消耗:36 MB,击败了99.66% 的Java用户
  static private ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1));
  static int idx2 = 0, idx3 = 0, idx5 = 0;

  public int nthUglyNumber(int n) {
    if (n < list.size()) {
      return list.get(n - 1);
    }
    int len = 1;
    int multi2, multi3, multi5, min;
    while (len < n) {
      multi2 = list.get(idx2) * 2;
      multi3 = list.get(idx3) * 3;
      multi5 = list.get(idx5) * 5;
      min = Math.min(Math.min(multi2, multi3), multi5);
      if (min == multi2) {
        idx2++;
      }
      if (min == multi3) {
        idx3++;
      }
      if (min == multi5) {
        idx5++;
      }
      list.add(min);
      len++;
    }
    return list.get(n - 1);
  }
}
//leetcode submit region end(Prohibit modification and deletion)

