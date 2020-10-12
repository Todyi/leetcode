package easy._0100_0199._191_number_of_1_bits;

//Write a function that takes an unsigned integer and return the number of '1' b
//its it has (also known as the Hamming weight).
//
//
//
// Example 1:
//
//
//Input: 00000000000000000000000000001011
//Output: 3
//Explanation: The input binary string 00000000000000000000000000001011 has a to
//tal of three '1' bits.
//
//
// Example 2:
//
//
//Input: 00000000000000000000000010000000
//Output: 1
//Explanation: The input binary string 00000000000000000000000010000000 has a to
//tal of one '1' bit.
//
//
// Example 3:
//
//
//Input: 11111111111111111111111111111101
//Output: 31
//Explanation: The input binary string 11111111111111111111111111111101 has a to
//tal of thirty one '1' bits.
//
//
//
// Note:
//
//
// Note that in some languages such as Java, there is no unsigned integer type.
//In this case, the input will be given as signed integer type and should not affe
//ct your implementation, as the internal binary representation of the integer is
//the same whether it is signed or unsigned.
// In Java, the compiler represents the signed integers using 2's complement not
//ation. Therefore, in Example 3 above the input represents the signed integer -3.
//
//
//
//
//
// Follow up:
//
// If this function is called many times, how would you optimize it?
// Related Topics Bit Manipulation


//leetcode submit region begin(Prohibit modification and deletion)
public class Solution {

  // you need to treat n as an unsigned value
  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:36.8 MB,击败了5.41% 的Java用户
  public int hammingWeight(int n) {
    int result = 0;
    for (int i = 0; i < 32; i++) {
      int end = n & 1;
      if (end == 1) {
        result++;
      }
      n >>>= 1;
    }
    return result;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

