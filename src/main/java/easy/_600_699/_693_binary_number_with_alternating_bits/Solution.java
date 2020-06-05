package easy._600_699._693_binary_number_with_alternating_bits;

//Given a positive integer, check whether it has alternating bits:
// namely, if two adjacent bits will always have different values.
//
// Example 1:
//
//Input: 5
//Output: True
//Explanation:
//The binary representation of 5 is: 101
//
//
//
// Example 2:
//
//Input: 7
//Output: False
//Explanation:
//The binary representation of 7 is: 111.
//
//
//
// Example 3:
//
//Input: 11
//Output: False
//Explanation:
//The binary representation of 11 is: 1011.
//
//
//
// Example 4:
//
//Input: 10
//Output: True
//Explanation:
//The binary representation of 10 is: 1010.
//
// Related Topics Bit Manipulation


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:36.3 MB,击败了41.66% 的Java用户
  public boolean hasAlternatingBits(int n) {
    int tmp;
    if (n % 2 == 0) {
      tmp = 0x2AAAAAAA ^ n;
    } else {
      tmp = 0x55555555 ^ n;
    }
    while (0 < n) {
      if ((tmp & 0x00000001) == 1) {
        return false;
      }
      n >>= 1;
      tmp >>= 1;
    }
    return true;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

