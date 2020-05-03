package easy._201_400._242_valid_anagram;

//Given two strings s and t , write a function to determine if t is an anagram of s.
//
// Example 1:
//
//
//Input: s = "anagram", t = "nagaram"
//Output: true
//
//
// Example 2:
//
//
//Input: s = "rat", t = "car"
//Output: false
//
//
// Note:
//You may assume the string contains only lowercase alphabets.
//
// Follow up:
//What if the inputs contain unicode characters? How would you adapt your solution to such case?
// Related Topics Hash Table Sort


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:9 ms,击败了29.97% 的Java用户
  //  内存消耗:40.4 MB,击败了5.16% 的Java用户
//  public boolean isAnagram(String s, String t) {
//    if (s == null && t == null) {
//      return true;
//    }
//    if (s == null || t == null) {
//      return false;
//    }
//    if (s.length() != t.length()) {
//      return false;
//    }
//
//    int[] sMapArray = new int[127];
//    for (int i = 0; i < s.length(); i++) {
//      int sChar = s.charAt(i);
//      int tChar = t.charAt(i);
//      if (sChar == tChar) {
//        continue;
//      }
//      sMapArray[sChar]++;
//      sMapArray[tChar]--;
//    }
//    for (int i = 0; i < sMapArray.length; i++) {
//      if (sMapArray[i] != 0) {
//        return false;
//      }
//    }
//
//    return true;
//  }

  //  解答成功:
  //  执行耗时:1 ms,击败了100.00% 的Java用户
  //  内存消耗:39.5 MB,击败了13.55% 的Java用户
  public boolean isAnagram(String s, String t) {

    int[] sMapArray = new int[26];
    for (char c : s.toCharArray()) {
      sMapArray[c - 'a']++;
    }
    for (char c : t.toCharArray()) {
      sMapArray[c - 'a']--;
    }

    for (int i = 0; i < sMapArray.length; i++) {
      if (0 != sMapArray[i]) {
        return false;
      }
    }

    return true;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

