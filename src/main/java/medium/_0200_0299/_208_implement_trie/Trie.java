package medium._0200_0299._208_implement_trie;

//Implement a trie with insert, search, and startsWith methods.
//
// Example:
//
//
//Trie trie = new Trie();
//
//trie.insert("apple");
//trie.search("apple");   // returns true
//trie.search("app");     // returns false
//trie.startsWith("app"); // returns true
//trie.insert("app");
//trie.search("app");     // returns true
//
//
// Note:
//
//
// You may assume that all inputs are consist of lowercase letters a-z.
// All inputs are guaranteed to be non-empty strings.
//
// Related Topics Design Trie
// 👍 4221 👎 65


import java.util.HashSet;

//leetcode submit region begin(Prohibit modification and deletion)


class Trie {

  //  解答成功:
  //  执行耗时:28 ms,击败了99.58% 的Java用户
  //  内存消耗:48.3 MB,击败了77.11% 的Java用户
  class Node {

    boolean isEnd;
    Node[] next;

    public Node() {
      this.next = new Node[26];
    }
  }

  Node map;

  /**
   * Initialize your data structure here.
   */
  public Trie() {
    map = new Node();
  }

  /**
   * Inserts a word into the trie.
   */
  public void insert(String word) {
    Node cur = map;
    for (int i = 0; i < word.length(); i++) {
      int c = word.charAt(i) - 'a';
      if (cur.next[c] == null) {
        cur.next[c] = new Node();
      }
      cur = cur.next[c];
    }
    cur.isEnd = true;
  }

  /**
   * Returns if the word is in the trie.
   */
  public boolean search(String word) {
    Node cur = map;
    for (int i = 0; i < word.length(); i++) {
      int c = word.charAt(i) - 'a';
      if (cur.next[c] == null) {
        return false;
      }
      cur = cur.next[c];
    }
    return cur.isEnd;
  }

  /**
   * Returns if there is any word in the trie that starts with the given prefix.
   */
  public boolean startsWith(String prefix) {
    Node cur = map;
    for (int i = 0; i < prefix.length(); i++) {
      int c = prefix.charAt(i) - 'a';
      if (cur.next[c] == null) {
        return false;
      }
      cur = cur.next[c];
    }
    return true;
  }

}

/**
 * Your Trie object will be instantiated and called as such: Trie obj = new Trie();
 * obj.insert(word); boolean param_2 = obj.search(word); boolean param_3 = obj.startsWith(prefix);
 */
//leetcode submit region end(Prohibit modification and deletion)

