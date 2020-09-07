package easy._1000_1099._1018_binary_prefix_divisible_by_5;

//Given an array A of 0s and 1s, consider N_i:
// the i-th subarray from A[0] to A[i] interpreted as a binary number
// (from most-significant-bit to least-significant-bit.)
//
// Return a list of booleans answer, where answer[i] is true if and only if N_i is divisible by 5.
//
// Example 1:
//
//
//Input: [0,1,1]
//Output: [true,false,false]
//Explanation:
//The input numbers in binary are 0, 01, 011; which are 0, 1, and 3 in base-10.
// Only the first number is divisible by 5, so answer[0] is true.
//
//
// Example 2:
//
//
//Input: [1,1,1]
//Output: [false,false,false]
//
//
// Example 3:
//
//
//Input: [0,1,1,1,1,1]
//Output: [true,false,false,false,true,false]
//
//
// Example 4:
//
//
//Input: [1,1,1,0,1]
//Output: [false,false,false,false,false]
//
//
//
//
// Note:
//
//
// 1 <= A.length <= 30000
// A[i] is 0 or 1
//
// Related Topics Array
// 👍 259 👎 97


import java.util.ArrayList;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:2 ms,击败了100.00% 的Java用户
  //  内存消耗:39.7 MB,击败了97.30% 的Java用户
  public List<Boolean> prefixesDivBy5(int[] A) {
    // a * 2 = a << 1
    // i = (0|1),i % 5 = i
    // (a * b + c) % d = (a % d * b % d  + c % d) % d
    // newNum = oldNum << 1 + i = oldNum * 2 + i;
    // newNum % 5 = (oldNum * 2 + i) % 5 = （oldNum % 5 * 2 + i) % 5

    List<Boolean> res = new ArrayList<>();
    int tmp = 0;
    for (int a : A) {
      tmp = ((tmp << 1) + a) % 5;
      res.add(tmp == 0);
    }
    return res;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

