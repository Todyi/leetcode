package easy._0700_0799._717_1_bit_and_2_bit_characters;

//We have two special characters. The first character can be represented by one bit 0.
// The second character can be represented by two bits (10 or 11).
//
// Now given a string represented by several bits.
// Return whether the last character must be a one-bit character or not.
// The given string will always end with a zero.
//
// Example 1:
//
//Input:
//bits = [1, 0, 0]
//Output: True
//Explanation:
//The only way to decode it is two-bit character and one-bit character. So the l
//ast character is one-bit character.
//
//
//
// Example 2:
//
//Input:
//bits = [1, 1, 1, 0]
//Output: False
//Explanation:
//The only way to decode it is two-bit character and two-bit character. So the l
//ast character is NOT one-bit character.
//
//
//
// Note:
// 1 <= len(bits) <= 1000.
// bits[i] is always 0 or 1.
// Related Topics Array


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:40.7 MB,击败了5.03% 的Java用户
  public boolean isOneBitCharacter(int[] bits) {
    for (int i = 0; i < bits.length; i++) {
      if (bits[i] == 1) {
        i++;
        if (i == bits.length - 1) {
          return false;
        }
      }
    }
    return true;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

