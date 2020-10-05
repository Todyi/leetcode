package easy._1400_1499._1408_string_matching_in_an_array;

//Given an array of string words. Return all strings in words which is substring of
// another word in any order.
//
// String words[i] is substring of words[j], if can be obtained removing
// some characters to left and/or right side of words[j].
//
//
// Example 1:
//
//
//Input: words = ["mass","as","hero","superhero"]
//Output: ["as","hero"]
//Explanation: "as" is substring of "mass" and "hero" is substring of "superhero".
//["hero","as"] is also a valid answer.
//
//
// Example 2:
//
//
//Input: words = ["leetcode","et","code"]
//Output: ["et","code"]
//Explanation: "et", "code" are substring of "leetcode".
//
//
// Example 3:
//
//
//Input: words = ["blue","green","bu"]
//Output: []
//
//
//
// Constraints:
//
//
// 1 <= words.length <= 100
// 1 <= words[i].length <= 30
// words[i] contains only lowercase English letters.
// It's guaranteed that words[i] will be unique.
// Related Topics String
// 👍 202 👎 49


import java.util.ArrayList;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  Runtime: 3 ms, faster than 89.77% of Java online submissions for String Matching in an Array.
  //  Memory Usage: 39.8 MB, less than 38.25% of Java online submissions for String Matching in an Array.
//  class Node {
//
//    String word;
//    Node[] sub;
//    boolean picked = false;
//
//    public Node() {
//    }
//  }
//
//  public void addSub(int i, char[] arr, Node[] map, String word) {
//    if (i < arr.length) {
//      int idx = arr[i] - 'a';
//      if (map[idx] == null) {
//        map[idx] = new Node();
//      }
//      Node point = map[idx];
//      if (i == arr.length - 1 && point.word == null) {
//        point.word = word;
//        return;
//      }
//      if (point.sub == null && i < arr.length - 1) {
//        point.sub = new Node[26];
//      }
//      addSub(i + 1, arr, point.sub, word);
//    }
//  }
//
//  public void checkSub(int i, char[] arr, Node[] map, String word) {
//    if (i < arr.length) {
//      if (map == null) {
//        return;
//      }
//      int idx = arr[i] - 'a';
//      Node point = map[idx];
//      if (point == null) {
//        return;
//      }
//      if (point.word != null && !point.picked) {
//        res.add(point.word);
//        point.picked = true;
//      }
//      if (i == arr.length - 1 && !point.picked && word != null) {
//        res.add(word);
//        point.picked = true;
//        return;
//      }
//      checkSub(i + 1, arr, point.sub, word);
//    }
//  }
//
//  Node[] map = new Node[26];
//  List<String> res = new ArrayList<>();
//
//  public List<String> stringMatching(String[] words) {
//    for (String word : words) {
//      int idx = word.charAt(0) - 'a';
//      if (map[idx] == null) {
//        map[idx] = new Node();
//      }
//      char[] arr = word.toCharArray();
//      checkSub(0, arr, map, word);
//      addSub(0, arr, map, word);
//      for (int i = 1; i < arr.length; i++) {
//        checkSub(i, arr, map, null);
//        addSub(i, arr, map, null);
//      }
//    }
//    return res;
//  }

  //  解答成功:
  //  执行耗时:1 ms,击败了100.00% 的Java用户
  //  内存消耗:38.9 MB,击败了99.15% 的Java用户
  public List<String> stringMatching(String[] words) {
    List<String> res = new ArrayList<>();
    StringBuilder sb = new StringBuilder();
    for (String word : words) {
      sb.append(word).append("|");
    }
    for (String word : words) {
      int idx0 = sb.indexOf(word, 0);
      int idx1 = sb.indexOf(word, idx0 + word.length());
      if (idx1 != -1){
        res.add(word);
      }
    }
    return res;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

