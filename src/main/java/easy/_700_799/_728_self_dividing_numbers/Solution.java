package easy._700_799._728_self_dividing_numbers;

//
//A self-dividing number is a number that is divisible by every digit it contains.
//
//For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.
//
//Also, a self-dividing number is not allowed to contain the digit zero.
//
//Given a lower and upper number bound, output a list of every possible self dividing number,
// including the bounds if possible.
//
// Example 1:
//
//Input:
//left = 1, right = 22
//Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22]
//
//
//
// Note:
// The boundaries of each input argument are 1 <= left <= right <= 10000.
// Related Topics Math
// 👍 650 👎 291


import java.util.ArrayList;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:8 ms,击败了13.20% 的Java用户
  //  内存消耗:39.5 MB,击败了5.34% 的Java用户
  public List<Integer> selfDividingNumbers(int left, int right) {
    List<Integer> res = new ArrayList<>();
    for (Integer i = left; i <= right; i++) {
      if (i.toString().indexOf('0') != -1) {
        continue;
      }
      if (i % lcm(i.toString()) == 0) {
        res.add(i);
      }
    }
    return res;
  }

  public int gcd(int i, int j) {
    return i % j == 0 ? j : gcd(j, i % j);
  }

  public int lcm(int i, int j) {
    int res = i * j / gcd(i, j);
    return res;
  }

  public int lcm(String num) {
    char[] numArr = num.toCharArray();
    int lcm = 1;
    for (int i = 0; i < numArr.length; i++) {
      int n = numArr[i] - '1' + 1;
      lcm = lcm(lcm, n);
    }
    return lcm;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

