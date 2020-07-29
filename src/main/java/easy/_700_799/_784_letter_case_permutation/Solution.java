package easy._700_799._784_letter_case_permutation;

//Given a string S, we can transform every letter individually to be lowercase o
//r uppercase to create another string. Return a list of all possible strings we c
//ould create.
//
//
//Examples:
//Input: S = "a1b2"
//Output: ["a1b2", "a1B2", "A1b2", "A1B2"]
//
//Input: S = "3z4"
//Output: ["3z4", "3Z4"]
//
//Input: S = "12345"
//Output: ["12345"]
//
//
// Note:
//
//
// S will be a string with length between 1 and 12.
// S will consist only of letters or digits.
//
// Related Topics Backtracking Bit Manipulation
// 👍 1312 👎 107


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  Runtime: 86 ms, faster than 5.09% of Java online submissions for Letter Case Permutation.
  //  Memory Usage: 41.2 MB, less than 5.52% of Java online submissions for Letter Case Permutation.
  public List<String> letterCasePermutation(String S) {
    List<String> res = new ArrayList<>();
    Map<String, Object> map = new HashMap<>();
    map.put(S, null);
    addStr(S, 0, map);
    map.forEach((k, v) -> {
      res.add(k);
    });
    return res;
  }

  public void addStr(String s, int x, Map<String, Object> map) {
    for (int i = x; i < s.length(); i++) {
      char c = s.charAt(i);
      if (Character.isLetter(c)) {
        map.put(s, null);
        addStr(s, i + 1, map);
        char[] arr = s.toCharArray();
        arr[i] = Character.isUpperCase(c) ? Character.toLowerCase(c) : Character.toUpperCase(c);
        s = String.valueOf(arr);
        map.put(s, null);
        addStr(s, i + 1, map);
      }
    }
  }
}
//leetcode submit region end(Prohibit modification and deletion)

