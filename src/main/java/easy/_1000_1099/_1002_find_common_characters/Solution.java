package easy._1000_1099._1002_find_common_characters;

//Given an array A of strings made only from lowercase letters, return a list of all characters
// that show up in all strings within the list (including duplicates).
// For example, if a character occurs 3 times in all strings but not 4 times,
// you need to include that character three times in the final answer.
//
// You may return the answer in any order.
//
//
//
//
// Example 1:
//
//
//Input: ["bella","label","roller"]
//Output: ["e","l","l"]
//
//
//
// Example 2:
//
//
//Input: ["cool","lock","cook"]
//Output: ["c","o"]
//
//
//
//
// Note:
//
//
// 1 <= A.length <= 100
// 1 <= A[i].length <= 100
// A[i][j] is a lowercase letter
//
//
// Related Topics Array Hash Table
// 👍 971 👎 110


import java.util.ArrayList;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  Runtime: 2 ms, faster than 98.80% of Java online submissions for Find Common Characters.
  //  Memory Usage: 39.4 MB, less than 94.84% of Java online submissions for Find Common Characters.
  public List<String> commonChars(String[] A) {
    String[] str = {
        "a", "b", "c", "d", "e", "f", "g",
        "h", "i", "j", "k", "l", "m", "n",
        "o", "p", "q", "r", "s", "t",
        "u", "v", "w", "x", "y", "z",
    };
    List<String> res = new ArrayList<>();
    int[] map = mark(A[0]);
    for (int i = 1; i < A.length; i++) {
      int[] tmp = mark(A[i]);
      for (int j = 0; j < 26; j++) {
        map[j] = Math.min(map[j], tmp[j]);
      }
    }
    for (int i = 0; i < 26; i++) {
      if (0 < map[i]) {
        for (int j = 0; j < map[i]; j++) {
          res.add(str[i]);
        }
      }
    }
    return res;
  }

  public int[] mark(String s) {
    int[] res = new int[26];
    char[] arr = s.toCharArray();
    for (char c : arr) {
      res[c - 'a']++;
    }
    return res;
  }

}
//leetcode submit region end(Prohibit modification and deletion)

