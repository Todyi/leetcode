package medium._0100_0199._139_word_break;

//Given a non-empty string s and a dictionary wordDict containing a list of non-
//empty words, determine if s can be segmented into a space-separated sequence of
//one or more dictionary words.
//
// Note:
//
//
// The same word in the dictionary may be reused multiple times in the segmentation.
// You may assume the dictionary does not contain duplicate words.
//
//
// Example 1:
//
//
//Input: s = "leetcode", wordDict = ["leet", "code"]
//Output: true
//Explanation: Return true because "leetcode" can be segmented as "leet code".
//
//
// Example 2:
//
//
//Input: s = "applepenapple", wordDict = ["apple", "pen"]
//Output: true
//Explanation: Return true because "applepenapple" can be segmented as "apple pen apple".
//Note that you are allowed to reuse a dictionary word.
//
//
// Example 3:
//
//
//Input: s = "catsandog", wordDict = ["cats", "dog", "sand", "and", "cat"]
//Output: false
//
// Related Topics Dynamic Programming
// 👍 5854 👎 279


import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:3 ms,击败了85.88% 的Java用户
  //  内存消耗:38.9 MB,击败了86.23% 的Java用户
//  HashSet<String> dict = new HashSet<>();
//  boolean[] map;
//
//  public boolean wordBreak(String s, List<String> wordDict) {
//    if (s == null || 0 == s.length()) {
//      return false;
//    }
//    map = new boolean[s.length() + 1];
//    map[0] = true;
//    for (String s1 : wordDict) {
//      dict.add(s1);
//    }
//    return isInDict(s);
//  }
//
//  public boolean isInDict(String s) {
//    int len = s.length();
//    for (int i = 1; i <= len; i++) {
//      for (int j = i - 1; j > -1; j--) {
//        if (map[i]) {
//          break;
//        }
//        if (!map[j]) {
//          continue;
//        }
//        if (dict.contains(s.substring(j, i))) {
//          map[i] = true;
//          break;
//        }
//      }
//    }
//    return map[len];
//  }


  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:37 MB,击败了98.48% 的Java用户
  public boolean wordBreak(String s, List<String> wordDict) {
    if (s == null || 0 == s.length()) {
      return false;
    }
    return dfs(s, wordDict, new boolean[s.length()], 0);
  }

  public boolean dfs(String s, List<String> dict, boolean[] visited, int idx) {
    if (idx == s.length()) {
      return true;
    }
    if (visited[idx]) {
      return false;
    }
    visited[idx] = true;
    for (String word : dict) {
      if (s.length() < idx + word.length()) {
        continue;
      }
      if (s.startsWith(word, idx)
          && dfs(s, dict, visited, idx + word.length())) {
        return true;
      }
    }
    return false;
  }

}
//leetcode submit region end(Prohibit modification and deletion)

