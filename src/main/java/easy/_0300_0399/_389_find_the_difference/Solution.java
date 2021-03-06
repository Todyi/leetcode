package easy._0300_0399._389_find_the_difference;

//
//Given two strings s and t which consist of only lowercase letters.
//
// String t is generated by random shuffling string s and then add one more lett
//er at a random position.
//
// Find the letter that was added in t.
//
// Example:
//
//Input:
//s = "abcd"
//t = "abcde"
//
//Output:
//e
//
//Explanation:
//'e' is the letter that was added.
// Related Topics Hash Table Bit Manipulation


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:1 ms,击败了99.18% 的Java用户
  //  内存消耗:37.6 MB,击败了12.50% 的Java用户
//  public char findTheDifference(String s, String t) {
//    int xor = 0;
//    for (char c : s.toCharArray()) {
//      xor ^= c;
//    }
//    for (char c : t.toCharArray()) {
//      xor ^= c;
//    }
//    return (char) xor;
//  }

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:37.5 MB,击败了12.50% 的Java用户
  public char findTheDifference(String s, String t) {
    if (t.length() < s.length()) {
      return findTheDifference(t, s);
    }
    char[] sArr = s.toCharArray();
    char[] tArr = t.toCharArray();
    int length = sArr.length;
    int xor = t.charAt(length);

    for (int i = 0; i < sArr.length; i++) {
      xor ^= sArr[i] ^ tArr[i];
    }
    return (char) xor;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

