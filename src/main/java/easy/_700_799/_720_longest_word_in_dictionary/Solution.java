package easy._700_799._720_longest_word_in_dictionary;

//Given a list of strings words representing an English Dictionary,
// find the longest word in words that can be built one character at a time by other words in words.
// If there is more than one possible answer,
// return the longest word with the smallest lexicographical order.
// If there is no answer, return the empty string.
//
// Example 1:
//
//Input:
//words = ["w","wo","wor","worl", "world"]
//Output: "world"
//Explanation:
//The word "world" can be built one character at a time by "w", "wo", "wor", and "worl".
//
//
//
// Example 2:
//
//Input:
//words = ["a", "banana", "app", "appl", "ap", "apply", "apple"]
//Output: "apple"
//Explanation:
//Both "apply" and "apple" can be built from other words in the dictionary.
// However, "apple" is lexicographically smaller than "apply".
//
//
//
// Note:
// All the strings in the input will only contain lowercase letters.
// The length of words will be in the range [1, 1000].
// The length of words[i] will be in the range [1, 30].
// Related Topics Hash Table Trie


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:15 ms,击败了59.17% 的Java用户
  //  内存消耗:39.7 MB,击败了74.01% 的Java用户
//  public String longestWord(String[] words) {
//    Arrays.sort(words);
//    String res = words[0].substring(0, 1);
//    Map<String, String> map = new HashMap<>();
//    map.put("", null);
//    for (String word : words) {
//      if (map.containsKey(word.substring(0, word.length() - 1))) {
//        map.put(word, null);
//        if (res.length() < word.length()
//            || (res.length() == word.length() && 0 < res.compareTo(word))) {
//          res = word;
//        }
//      }
//    }
//    return res;
//  }

  //  解答成功:
  //  执行耗时:4 ms,击败了100.00% 的Java用户
  //  内存消耗:39.7 MB,击败了57.20% 的Java用户
  public String longestWord(String[] words) {
    Node root = new Node();
    root.word = "";
    for (String word : words) {
      root.addWord(word);
    }
    return root.getLongestWord();
  }

  class Node {

    public String word;
    public Node[] children;

    public Node() {
    }

    public void addWord(String word) {
      Node node = this;
      for (int i = 0; i < word.length(); i++) {
        int j = word.charAt(i) - 'a';
        if (node.children == null) {
          node.children = new Node[26];
        }
        if (node.children[j] == null) {
          node.children[j] = new Node();
        }
        node = node.children[j];
      }
      node.word = word;
    }

    public String getLongestWord() {
      if (this.word == null) {
        return null;
      }
      String res = this.word;
      if (this.children != null) {
        for (int i = 0; i < this.children.length; i++) {
          if (this.children[i] == null) {
            continue;
          }
          String childLongestWord = this.children[i].getLongestWord();
          if (childLongestWord != null && res.length() < childLongestWord.length()) {
            res = childLongestWord;
          }
        }
      }
      return res;
    }
  }


}
//leetcode submit region end(Prohibit modification and deletion)

