package easy._400_499._476_number_complement;

//Given a positive integer num, output its complement number.
// The complement strategy is to flip the bits of its binary representation.
//
//
// Example 1:
//
//
//Input: num = 5
//Output: 2
//Explanation: The binary representation of 5 is 101 (no leading zero bits),
// and its complement is 010. So you need to output 2.
//
//
// Example 2:
//
//
//Input: num = 1
//Output: 0
//Explanation: The binary representation of 1 is 1 (no leading zero bits), and i
//ts complement is 0. So you need to output 0.
//
//
//
// Constraints:
//
//
// The given integer num is guaranteed to fit within the range of a 32-bit signed integer.
// num >= 1
// You could assume no leading zero bit in the integer’s binary representation.
//
// This question is the same as 1009: https://leetcode.com/problems/complement-of-base-10-integer/
//
// Related Topics Bit Manipulation


import java.util.Stack;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:1 ms,击败了27.21% 的Java用户
  //  内存消耗:36.1 MB,击败了8.70% 的Java用户
//  public int findComplement(int num) {
//    String binary = Integer.toString(num, 2);
//    StringBuilder sb = new StringBuilder();
//    for (int i = 0; i < binary.length(); i++) {
//      char c = binary.charAt(i) == '0' ? '1' : '0';
//      if (c == '1' || (c == '0' && 0 < sb.length())) {
//        sb.append(c);
//      }
//    }
//    return 0 < sb.length() ? Integer.parseInt(sb.toString(), 2) : 0;
//  }

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:36.4 MB,击败了8.70% 的Java用户
  public int findComplement(int num) {
    //5:101 -> bitCount = 3 ->complementBit = 1<<3 -1 = 111(2)
    //~5:11111111 11111111 11111111 11111010
    //~5 & 111 = 10(2) = 2

    int tmp = num;
    int bitCount = 0;
    while (0 < tmp) {
      bitCount++;
      tmp >>= 1;
    }
    int complementBit = (1 << bitCount) - 1;
    return (~num) & complementBit;

  }


}
//leetcode submit region end(Prohibit modification and deletion)

