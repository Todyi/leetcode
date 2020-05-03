package easy._200_299._290_word_pattern;

//Given a pattern and a string str, find if str follows the same pattern.
//
// Here follow means a full match, such that there is a bijection between a lett
//er in pattern and a non-empty word in str.
//
// Example 1:
//
//
//Input: pattern = "abba", str = "dog cat cat dog"
//Output: true
//
// Example 2:
//
//
//Input:pattern = "abba", str = "dog cat cat fish"
//Output: false
//
// Example 3:
//
//
//Input: pattern = "aaaa", str = "dog cat cat dog"
//Output: false
//
// Example 4:
//
//
//Input: pattern = "abba", str = "dog dog dog dog"
//Output: false
//
// Notes:
//You may assume pattern contains only lowercase letters, and str contains lower
//case letters that may be separated by a single space.
// Related Topics Hash Table


import java.util.HashMap;
import java.util.Map;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:1 ms,击败了36.04% 的Java用户
  //  内存消耗:38.9 MB,击败了5.41% 的Java用户
//  public boolean wordPattern(String pattern, String str) {
//    String[] patternArr = new String[127];
//    Map<String, Character> patternMap = new HashMap<>();
//
//    String[] split = str.split(" ");
//    char[] charArr = pattern.toCharArray();
//    if (split.length != charArr.length) {
//      return false;
//    }
//
//    for (int i = 0; i < split.length; i++) {
//      String pat = patternArr[charArr[i]];
//      Character character = patternMap.get(split[i]);
//      if (pat == null && character == null) {
//        patternArr[charArr[i]] = split[i];
//        patternMap.put(split[i], charArr[i]);
//      } else if (pat == null || !pat.equals(split[i])) {
//        return false;
//      }
//    }
//
//    return true;
//  }

  //  Runtime: 0 ms, faster than 100.00% of Java online submissions for Word Pattern.
  //  Memory Usage: 36.9 MB, less than 5.41% of Java online submissions for Word Pattern.
  public boolean wordPattern(String pattern, String str) {
    Map<Object, Integer> patternMap = new HashMap<>();

    String[] split = str.split(" ");
    char[] charArr = pattern.toCharArray();
    if (split.length != charArr.length) {
      return false;
    }

    for (Integer i = 0; i < split.length; i++) {
      if (patternMap.put(charArr[i], i) != patternMap.put(split[i], i)) {
        return false;
      }
    }
    return true;

  }
}
//leetcode submit region end(Prohibit modification and deletion)

