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

  //  Runtime: 81 ms, faster than 5.13% of Java online submissions for Letter Case Permutation.
  //  Memory Usage: 40.9 MB, less than 6.13% of Java online submissions for Letter Case Permutation.
//  public List<String> letterCasePermutation(String S) {
//    List<String> res = new ArrayList<>();
//    Map<String, Object> map = new HashMap<>();
//    map.put(S, null);
//    addStr(S, 0, map);
//    map.forEach((k, v) -> {
//      res.add(k);
//    });
//    return res;
//  }
//
//  public void addStr(String s, int x, Map<String, Object> map) {
//    for (int i = x; i < s.length(); i++) {
//      char c = s.charAt(i);
//      if (Character.isLetter(c)) {
//        if (!map.containsKey(s)) {
//          map.put(s, null);
//        }
//        addStr(s, i + 1, map);
//        char[] arr = s.toCharArray();
//        arr[i] = Character.isUpperCase(c) ? Character.toLowerCase(c) : Character.toUpperCase(c);
//        s = String.valueOf(arr);
//        if (!map.containsKey(s)) {
//          map.put(s, null);
//        }
//        addStr(s, i + 1, map);
//      }
//    }
//  }

  //  解答成功:
  //  执行耗时:3 ms,击败了70.50% 的Java用户
  //  内存消耗:40.2 MB,击败了53.54% 的Java用户
//  public List<String> letterCasePermutation(String S) {
//    List<String> res = new ArrayList<>();
//    res.add(S);
//    char c;
//    int count;
//    for (int i = 0; i < S.length(); i++) {
//      c = S.charAt(i);
//      if (Character.isLetter(c)) {
//        count = res.size();
//        for (int j = 0; j < count; j++) {
//          char[] arr = res.get(j).toCharArray();
//          arr[i] = Character.isUpperCase(c) ? Character.toLowerCase(c) : Character.toUpperCase(c);
//          res.add(String.valueOf(arr));
//        }
//      }
//    }
//    return res;
//  }

  //  解答成功:
  //  执行耗时:1 ms,击败了100.00% 的Java用户
  //  内存消耗:40.5 MB,击败了17.32% 的Java用户
  public List<String> letterCasePermutation(String S) {
    List<String> res = new ArrayList<>();
    addStr(S.toCharArray(), 0, res);
    return res;
  }

  public void addStr(char[] arr, int x, List<String> res) {
    if (x == arr.length) {
      res.add(new String(arr));
      return;
    }
    if (Character.isDigit(arr[x])) {
      addStr(arr, x + 1, res);
    } else {
      arr[x] = Character.toUpperCase(arr[x]);
      addStr(arr, x + 1, res);
      arr[x] = Character.toLowerCase(arr[x]);
      addStr(arr, x + 1, res);
    }
  }
}
//leetcode submit region end(Prohibit modification and deletion)

