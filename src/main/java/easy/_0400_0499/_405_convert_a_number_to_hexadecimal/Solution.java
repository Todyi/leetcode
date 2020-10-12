package easy._0400_0499._405_convert_a_number_to_hexadecimal;

//
//Given an integer, write an algorithm to convert it to hexadecimal. For negative integer, two’s complement method is used.
//
//
// Note:
//
// All letters in hexadecimal (a-f) must be in lowercase.
// The hexadecimal string must not contain extra leading 0s. If the number is zero,
// it is represented by a single zero character '0'; otherwise, the first character in the hexadecimal string will not be the zero character.
// The given number is guaranteed to fit within the range of a 32-bit signed integer.
// You must not use any method provided by the library which converts/formats the number to hex directly.
//
//
//
// Example 1:
//
//Input:
//26
//
//Output:
//"1a"
//
//
//
// Example 2:
//
//Input:
//-1
//
//Output:
//"ffffffff"
//
// Related Topics Bit Manipulation


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:36.8 MB,击败了8.33% 的Java用户
  public String toHex(int num) {
    StringBuilder sb = new StringBuilder();
    int bit = 0x0000000f;
    for (int i = 0; i < 8; i++) {
      int eightBit = num & bit;
      sb.append((char) (9 < eightBit ? eightBit - 10 + 'a' : eightBit + '0'));
      num = num >>> 4;
    }
    while (1 < sb.length()) {
      if (sb.charAt(sb.length() - 1) == '0') {
        sb.setLength(sb.length() - 1);
      } else {
        break;
      }
    }
    return sb.reverse().toString();
  }
}
//leetcode submit region end(Prohibit modification and deletion)

