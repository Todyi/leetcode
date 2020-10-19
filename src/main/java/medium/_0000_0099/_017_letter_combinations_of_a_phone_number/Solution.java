package medium._0000_0099._017_letter_combinations_of_a_phone_number;

//Given a string containing digits from 2-9 inclusive,
// return all possible letter combinations that the number could represent.
// Return the answer in any order.
//
//
// A mapping of digit to letters (just like on the telephone buttons) is given below.
// Note that 1 does not map to any letters.
//
//
//
//
// Example 1:
//
//
//Input: digits = "23"
//Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
//
//
// Example 2:
//
//
//Input: digits = ""
//Output: []
//
//
// Example 3:
//
//
//Input: digits = "2"
//Output: ["a","b","c"]
//
//
//
// Constraints:
//
//
// 0 <= digits.length <= 4
// digits[i] is a digit in the range ['2', '9'].
//
// Related Topics String Backtracking
// 👍 4601 👎 453


import java.util.ArrayList;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:37.3 MB,击败了39.98% 的Java用户
  public List<String> letterCombinations(String digits) {
    List<String> res = new ArrayList<>();
    if (digits.length() == 0) {
      return res;
    }
    char[][] map = {
        {}, {},
        {'a', 'b', 'c'},
        {'d', 'e', 'f'},
        {'g', 'h', 'i'},
        {'j', 'k', 'l'},
        {'m', 'n', 'o'},
        {'p', 'q', 'r', 's'},
        {'t', 'u', 'v'},
        {'w', 'x', 'y', 'z'}
    };
    char[] arr = digits.toCharArray();
    char[] d0 = map[arr[0] - '0'], d1 = null, c2 = null, c3 = null;
    if (1 < arr.length) {
      d1 = map[arr[1] - '0'];
      if (2 < arr.length) {
        c2 = map[arr[2] - '0'];
        if (3 < arr.length) {
          c3 = map[arr[3] - '0'];
        }
      }
    }
    add(res, arr.length, d0, d1, c2, c3);
    return res;
  }

  public void add(List<String> res, int len, char[] d0, char[] d1, char[] d2, char[] d3) {
    for (char c0 : d0) {
      StringBuilder sb = new StringBuilder();
      sb.append(c0);
      if (1 == len) {
        res.add(sb.toString());
      } else {
        for (char c1 : d1) {
          sb.append(c1);
          if (2 == len) {
            res.add(sb.toString());
          } else {
            for (char c2 : d2) {
              sb.append(c2);
              if (3 == len) {
                res.add(sb.toString());
              } else {
                for (char c3 : d3) {
                  sb.append(c3);
                  res.add(sb.toString());
                  sb.setLength(3);
                }
              }
              sb.setLength(2);
            }
          }
          sb.setLength(1);
        }
      }
    }
  }
}
//leetcode submit region end(Prohibit modification and deletion)

