package easy._0300_0399._344_reverse_string;

//Write a function that reverses a string. The input string is given as an array
// of characters char[].
//
// Do not allocate extra space for another array, you must do this by modifying
//the input array in-place with O(1) extra memory.
//
// You may assume all the characters consist of printable ascii characters.
//
//
//
//
// Example 1:
//
//
//Input: ["h","e","l","l","o"]
//Output: ["o","l","l","e","h"]
//
//
//
// Example 2:
//
//
//Input: ["H","a","n","n","a","h"]
//Output: ["h","a","n","n","a","H"]
//
//
//
// Related Topics Two Pointers String


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:1 ms,击败了72.48% 的Java用户
  //  内存消耗:46.6 MB,击败了94.67% 的Java用户
//  public void reverseString(char[] s) {
//    if (s != null && 1 < s.length) {
//      int l = s.length - 1;
//      for (int i = 0; i < s.length / 2; i++) {
//        s[i] = (char) (s[i] ^ s[l - i]);
//        s[l - i] = (char) (s[i] ^ s[l - i]);
//        s[i] = (char) (s[i] ^ s[l - i]);
//      }
//    }
//  }

  //  Runtime: 0 ms, faster than 100.00% of Java online submissions for Reverse String.
  //  Memory Usage: 45.9 MB, less than 97.04% of Java online submissions for Reverse String.
  public void reverseString(char[] s) {
    int low = 0;
    int high = s.length - 1;
    while (low < high) {
      char temp = s[low];
      s[low] = s[high];
      s[high] = temp;
      low++;
      high--;
    }
  }

}
//leetcode submit region end(Prohibit modification and deletion)

