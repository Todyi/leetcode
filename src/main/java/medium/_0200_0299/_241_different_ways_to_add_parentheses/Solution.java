package medium._0200_0299._241_different_ways_to_add_parentheses;

//Given a string of numbers and operators,
// return all possible results from computing
// all the different possible ways to group numbers and operators.
// The valid operators are +, - and *.
//
// Example 1:
//
//
//Input: "2-1-1"
//Output: [0, 2]
//Explanation:
//((2-1)-1) = 0
//(2-(1-1)) = 2
//
// Example 2:
//
//
//Input: "2*3-4*5"
//Output: [-34, -14, -10, -10, 10]
//Explanation:
//(2*(3-(4*5))) = -34
//((2*3)-(4*5)) = -14
//((2*(3-4))*5) = -10
//(2*((3-4)*5)) = -10
//(((2*3)-4)*5) = 10
// Related Topics Divide and Conquer
// 👍 2086 👎 111


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:1 ms,击败了99.19% 的Java用户
  //  内存消耗:38.9 MB,击败了68.70% 的Java用户
//  public List<Integer> diffWaysToCompute(String input) {
//    return diffWaysToCompute(input, 0, input.length());
//  }
//
//  public List<Integer> diffWaysToCompute(String input, int l, int r) {
//    List<Integer> result = new ArrayList<>();
//    int cur = 0;
//    for (int i = l; i < r; i++) {
//      char c = input.charAt(i);
//      if (c == '+' || c == '-' || c == '*') {
//        List<Integer> left = diffWaysToCompute(input, l, i);
//        List<Integer> right = diffWaysToCompute(input, i + 1, r);
//        result.addAll(merge(left, right, c));
//        cur = 0;
//      } else {
//        cur = cur * 10 + c - '0';
//      }
//    }
//    if (result.size() == 0) {
//      result.add(cur);
//    }
//    return result;
//  }
//
//  public List<Integer> merge(List<Integer> left, List<Integer> right, char op) {
//    if (left == null || left.size() == 0) {
//      return right;
//    }
//    if (right == null || right.size() == 0) {
//      return left;
//    }
//    List<Integer> result = new ArrayList<>();
//    for (Integer l : left) {
//      for (Integer r : right) {
//        if (op == '+') {
//          result.add(l + r);
//        } else if (op == '-') {
//          result.add(l - r);
//        } else {
//          result.add(l * r);
//        }
//      }
//    }
//    return result;
//  }

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:37.1 MB,击败了98.48% 的Java用户
  List<Integer>[][] map;

  public List<Integer> diffWaysToCompute(String input) {
    int l = input.length();
    map = new ArrayList[l+1][l+1];
    return diffWaysToCompute(input, 0, input.length());
  }

  public List<Integer> diffWaysToCompute(String input, int l, int r) {
    if (map[l][r] != null) {
      return map[l][r];
    }
    List<Integer> result = new ArrayList<>();
    map[l][r] = result;
    int cur = 0;
    for (int i = l; i < r; i++) {
      char c = input.charAt(i);
      if (c == '+' || c == '-' || c == '*') {
        List<Integer> left = diffWaysToCompute(input, l, i);
        List<Integer> right = diffWaysToCompute(input, i + 1, r);
        for (Integer lNum : left) {
          for (Integer rNum : right) {
            result.add(cal(lNum, rNum, c));
          }
        }
        cur = 0;
      } else {
        cur = cur * 10 + c - '0';
      }
    }
    if (result.size() == 0) {
      result.add(cur);
    }
    return map[l][r];
  }

  public int cal(int l, int r, char op) {
    if (op == '+') {
      return l + r;
    } else if (op == '-') {
      return l - r;
    }
    return l * r;
  }

}
//leetcode submit region end(Prohibit modification and deletion)

