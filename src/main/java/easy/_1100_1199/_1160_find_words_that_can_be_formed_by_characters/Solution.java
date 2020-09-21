package easy._1100_1199._1160_find_words_that_can_be_formed_by_characters;

//You are given an array of strings words and a string chars.
//
// A string is good if it can be formed by characters from chars
// (each character can only be used once).
//
// Return the sum of lengths of all good strings in words.
//
//
//
// Example 1:
//
//
//Input: words = ["cat","bt","hat","tree"], chars = "atach"
//Output: 6
//Explanation:
//The strings that can be formed are "cat" and "hat" so the answer is 3 + 3 = 6.
//
//
//
// Example 2:
//
//
//Input: words = ["hello","world","leetcode"], chars = "welldonehoneyr"
//Output: 10
//Explanation:
//The strings that can be formed are "hello" and "world" so the answer is 5 + 5 = 10.
//
//
//
//
// Note:
//
//
// 1 <= words.length <= 1000
// 1 <= words[i].length, chars.length <= 100
// All strings contain lowercase English letters only.
// Related Topics Array Hash Table
// 👍 423 👎 75


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:4 ms,击败了97.55% 的Java用户
  //  内存消耗:39.8 MB,击败了87.28% 的Java用户
  public int countCharacters(String[] words, String chars) {
    int[] map = new int[26];
    for (int i = 0; i < chars.length(); i++) {
      map[chars.charAt(i) - 'a']++;
    }
    int res = 0;
    for (String word : words) {
      res += addWordLen(word, map.clone());
    }
    return res;
  }

  public int addWordLen(String word, int[] map) {
    for (int i = 0; i < word.length(); i++) {
      if (--map[word.charAt(i) - 'a'] < 0) {
        return 0;
      }
    }
    return word.length();
  }
}
//leetcode submit region end(Prohibit modification and deletion)

