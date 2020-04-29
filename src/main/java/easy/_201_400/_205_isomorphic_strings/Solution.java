package easy._201_400._205_isomorphic_strings;

//Given two strings s and t, determine if they are isomorphic.
//
// Two strings are isomorphic if the characters in s can be replaced to get t.
//
// All occurrences of a character must be replaced with another character while
//preserving the order of characters. No two characters may map to the same charac
//ter but a character may map to itself.
//
// Example 1:
//
//
//Input: s = "egg", t = "add"
//Output: true
//
//
// Example 2:
//
//
//Input: s = "foo", t = "bar"
//Output: false
//
// Example 3:
//
//
//Input: s = "paper", t = "title"
//Output: true
//
// Note:
//You may assume both s and t have the same length.
// Related Topics Hash Table


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:3 ms,击败了95.27% 的Java用户
  //  内存消耗:39.5 MB,击败了6.14% 的Java用户
//  public boolean isIsomorphic(String s, String t) {
//
//    Integer[] charArray = new Integer[127];
//    int[] countArray = new int[127];
//
//    for (int i = 0; i < s.length(); i++) {
//
//      int spo = s.charAt(i);
//
//      int tpo = t.charAt(i);
//
//      Integer scChar = charArray[spo];
//      if (scChar == null) {
//        charArray[spo] = tpo;
//        countArray[tpo]++;
//        if (1 < countArray[tpo]) {
//          //if diverse chars map to same char,return false
//          return false;
//        }
//      } else {
//        if (scChar.intValue() != tpo) {
//          return false;
//        }
//      }
//
//    }
//
//    return true;
//  }
  
//  解答成功:
//  执行耗时:2 ms,击败了98.82% 的Java用户
//  内存消耗:39.5 MB,击败了6.14% 的Java用户
  public boolean isIsomorphic(String s, String t) {

    int[] sMapArray = new int[127];
    int[] tMapArray = new int[127];

    for (int i = 0; i < s.length(); i++) {

      int spo = s.charAt(i);
      int tpo = t.charAt(i);

      if (sMapArray[spo] == 0 && tMapArray[tpo] == 0) {
        sMapArray[spo] = tpo;
        tMapArray[tpo] = spo;
      } else {
        if (sMapArray[spo] != tpo) {
          return false;
        }
      }

    }

    return true;
  }

}
//leetcode submit region end(Prohibit modification and deletion)

