package easy._700_799._796_rotate_string;

//We are given two strings, A and B.
//
// A shift on A consists of taking string A and moving the leftmost character to the rightmost position.
// For example, if A = 'abcde', then it will be 'bcdea' after one shift on A.
// Return True if and only if A can become B after some number of shifts on A.
//
//
//Example 1:
//Input: A = 'abcde', B = 'cdeab'
//Output: true
//
//Example 2:
//Input: A = 'abcde', B = 'abced'
//Output: false
//
//
// Note:
//
//
// A and B will have length at most 100.
//
// 👍 740 👎 52


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  Runtime: 0 ms, faster than 100.00% of Java online submissions for Rotate String.
  //  Memory Usage: 37.3 MB, less than 51.04% of Java online submissions for Rotate String.
  public boolean rotateString(String A, String B) {
//    String doubleA = A + A;
//    int x = doubleA.indexOf(B);
//    if (A.length() != B.length() || x == -1) {
//      return false;
//    }
//    doubleA = doubleA.substring(0, x) + doubleA.substring(x + B.length());
//    return doubleA.equals(A);
    return A.length() == B.length() && (A + A).contains(B);
  }
}
//leetcode submit region end(Prohibit modification and deletion)

