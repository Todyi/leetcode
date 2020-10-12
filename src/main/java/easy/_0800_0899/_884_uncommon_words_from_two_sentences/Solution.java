package easy._0800_0899._884_uncommon_words_from_two_sentences;

//We are given two sentences A and B. (A sentence is a string of space separated words.
// Each word consists only of lowercase letters.)
//
// A word is uncommon if it appears exactly once in one of the sentences,
// and does not appear in the other sentence.
//
// Return a list of all uncommon words.
//
// You may return the list in any order.
//
//
//
//
//
//
//
// Example 1:
//
//
//Input: A = "this apple is sweet", B = "this apple is sour"
//Output: ["sweet","sour"]
//
//
//
// Example 2:
//
//
//Input: A = "apple apple", B = "banana"
//Output: ["banana"]
//
//
//
//
// Note:
//
//
// 0 <= A.length <= 200
// 0 <= B.length <= 200
// A and B both contain only spaces and lowercase letters.
//
//
//
// Related Topics Hash Table
// 👍 454 👎 88


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:1 ms,击败了100.00% 的Java用户
  //  内存消耗:38.2 MB,击败了77.20% 的Java用户
  public String[] uncommonFromSentences(String A, String B) {
    Map<String, Integer> tmp = new HashMap<>();
    String[] aArr = A.split(" ");
    String[] bArr = B.split(" ");
    for (String s : aArr) {
      int num = tmp.getOrDefault(s, 0);
      tmp.put(s, num + 1);
    }
    for (String s : bArr) {
      int num = tmp.getOrDefault(s, 0);
      tmp.put(s, num + 1);
    }
    List<String> strList = new ArrayList<>();
    for (String s : tmp.keySet()) {
      if (tmp.get(s) == 1) {
        strList.add(s);
      }
    }

    String[] res = new String[strList.size()];
    strList.toArray(res);
    return res;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

