package easy._800_899._868_binary_gap;

//Given a positive integer N, find and return the longest distance
// between two consecutive 1's in the binary representation of N.
//
// If there aren't two consecutive 1's, return 0.
//
//
//
//
//
//
//
//
//
//
//
//
//
// Example 1:
//
//
//Input: 22
//Output: 2
//Explanation:
//22 in binary is 0b10110.
//In the binary representation of 22, there are three ones, and two consecutive
//pairs of 1's.
//The first consecutive pair of 1's have distance 2.
//The second consecutive pair of 1's have distance 1.
//The answer is the largest of these two distances, which is 2.
//
//
//
// Example 2:
//
//
//Input: 5
//Output: 2
//Explanation:
//5 in binary is 0b101.
//
//
//
// Example 3:
//
//
//Input: 6
//Output: 1
//Explanation:
//6 in binary is 0b110.
//
//
//
// Example 4:
//
//
//Input: 8
//Output: 0
//Explanation:
//8 in binary is 0b1000.
//There aren't any consecutive pairs of 1's in the binary representation of 8, s
//o we return 0.
//
//
//
//
//
//
//
// Note:
//
//
// 1 <= N <= 10^9
//
//
//
//
//
//
//
//
// Related Topics Math
// 👍 232 👎 508


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:36.2 MB,击败了79.75% 的Java用户
  public int binaryGap(int N) {
    if (Integer.bitCount(N) < 2) {
      return 0;
    }
    int max = 1, last = -1, i = 0;

    while (0 < N) {
      if ((N & 1) == 1) {
        if (max < i - last && last != -1) {
          max = i - last;
        }
        last = i;
      }
      i++;
      N >>= 1;
    }
    return max;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

