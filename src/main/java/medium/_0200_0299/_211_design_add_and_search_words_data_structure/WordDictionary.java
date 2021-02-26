package medium._0200_0299._211_design_add_and_search_words_data_structure;

//Design a data structure that supports adding new words and finding if a string
// matches any previously added string.
//
// Implement the WordDictionary class:
//
//
// WordDictionary() Initializes the object.
// void addWord(word) Adds word to the data structure, it can be matched later.
//
// bool search(word) Returns true if there is any string in the data structure that matches word
// or false otherwise. word may contain dots '.' where dots can be matched with any letter.
//
//
//
// Example:
//
//
//Input
//["WordDictionary","addWord","addWord","addWord","search","search","search","search"]
//[[],["bad"],["dad"],["mad"],["pad"],["bad"],[".ad"],["b.."]]
//Output
//[null,null,null,null,false,true,true,true]
//
//Explanation
//WordDictionary wordDictionary = new WordDictionary();
//wordDictionary.addWord("bad");
//wordDictionary.addWord("dad");
//wordDictionary.addWord("mad");
//wordDictionary.search("pad"); // return False
//wordDictionary.search("bad"); // return True
//wordDictionary.search(".ad"); // return True
//wordDictionary.search("b.."); // return True
//
//
//
// Constraints:
//
//
// 1 <= word.length <= 500
// word in addWord consists lower-case English letters.
// word in search consist of '.' or lower-case English letters.
// At most 50000 calls will be made to addWord and search.
//
// Related Topics Backtracking Depth-first Search Design Trie
// 👍 2766 👎 120


import java.util.ArrayList;

//leetcode submit region begin(Prohibit modification and deletion)
class WordDictionary {

  //  Runtime: 35 ms, faster than 98.67% of Java online submissions for Design Add and Search Words Data Structure.
  //  Memory Usage: 49.9 MB, less than 60.66% of Java online submissions for Design Add and Search Words Data Structure.
  class Node {

    int len;
    boolean isWordEnd;
    Node[] next = new Node[26];

    public Node() {
    }
  }

  Node map = new Node();

  /**
   * Initialize your data structure here.
   */
  public WordDictionary() {

  }

  public void addWord(String word) {
    int len = word.length();
    Node cur = map;
    for (int i = 0; i < len; i++) {
      int c = word.charAt(i) - 'a';
      if (cur.next[c] == null) {
        cur.next[c] = new Node();
        cur.next[c].len = len - i;
      }
      cur = cur.next[c];
      cur.len = Math.max(cur.len, len - i);
    }
    cur.isWordEnd = true;
  }

  public boolean search(String word) {
    Node cur = searchDot(word, map, 0);
    return cur != null && cur.isWordEnd;
  }

  private Node searchDot(String word, Node cur, int idx) {
    if (idx == word.length() || cur == null) {
      return cur;
    }
    char c = word.charAt(idx);
    if (c == '.') {
      Node temp = null;
      for (Node node : cur.next) {
        if (node != null && word.length() - idx - 1 <= node.len) {
          temp = searchDot(word, node, idx + 1);
          if (temp != null && temp.isWordEnd) {
            break;
          }
        }
      }
      return temp;
    } else {
      int n = c - 'a';
      if (cur.next[n] == null) {
        return null;
      }
      return searchDot(word, cur.next[n], idx + 1);
    }
  }

}

/**
 * Your WordDictionary object will be instantiated and called as such: WordDictionary obj = new
 * WordDictionary(); obj.addWord(word); boolean param_2 = obj.search(word);
 */
//leetcode submit region end(Prohibit modification and deletion)

