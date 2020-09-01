package easy._900_999._953_verifying_an_alien_dictionary;

//In an alien language, surprisingly they also use english lowercase letters,
// but possibly in a different order.
// The order of the alphabet is some permutation of lowercase letters.
//
// Given a sequence of words written in the alien language, and the order of the alphabet,
// return true if and only if the given words are sorted lexicographically in this alien language.
//
// Example 1:
//
//
//Input: words = ["hello","leetcode"], order = "hlabcdefgijkmnopqrstuvwxyz"
//Output: true
//Explanation: As 'h' comes before 'l' in this language, then the sequence is sorted.
//
//
// Example 2:
//
//
//Input: words = ["word","world","row"], order = "worldabcefghijkmnpqstuvxyz"
//Output: false
//Explanation: As 'd' comes after 'l' in this language, then words[0] > words[1],
// hence the sequence is unsorted.
//
//
// Example 3:
//
//
//Input: words = ["apple","app"], order = "abcdefghijklmnopqrstuvwxyz"
//Output: false
//Explanation: The first three characters "app" match, and the second string is shorter (in size.)
// According to lexicographical rules "apple" > "app", because 'l' > '∅',
// where '∅' is defined as the blank character which is less than any other character (More info).
//
//
//
// Constraints:
//
//
// 1 <= words.length <= 100
// 1 <= words[i].length <= 20
// order.length == 26
// All characters in words[i] and order are English lowercase letters.
//
// Related Topics Hash Table
// 👍 957 👎 391


import java.util.HashMap;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:39.2 MB,击败了63.43% 的Java用户
  public boolean isAlienSorted(String[] words, String order) {
    char[] arr = order.toCharArray();
    int[] map = new int[128];
    for (int i = 0; i < arr.length; i++) {
      map[arr[i]] = i;
    }
    int preLen = words[0].length();
    char[] preArr = words[0].toCharArray();
    for (int i = 1; i < words.length; i++) {
      int preIdx = 0, curIdx = 0, curLen = words[i].length();
      char[] curArr = words[i].toCharArray();
      while (preIdx < preLen & curIdx < curLen) {
        if (map[curArr[curIdx]] == map[preArr[preIdx]]) {
          preIdx++;
          curIdx++;
        } else if (map[curArr[curIdx]] < map[preArr[preIdx]]) {
          return false;
        } else {
          preIdx = preLen;
          break;
        }
      }
      if (preIdx < preLen) {
        return false;
      }
      preArr = curArr;
      preLen = curLen;
    }
    return true;
  }

}
//leetcode submit region end(Prohibit modification and deletion)

