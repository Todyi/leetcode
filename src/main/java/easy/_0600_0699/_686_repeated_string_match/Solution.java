package easy._0600_0699._686_repeated_string_match;

//Given two strings A and B,
// find the minimum number of times A has to be repeated such that B is a substring of it.
// If no such solution, return -1.
//
// For example, with A = "abcd" and B = "cdabcdab".
//
// Return 3, because by repeating A three times (“abcdabcdabcd”),
// B is a substring of it;
// and B is not a substring of A repeated two times ("abcdabcd").
//
// Note:
//The length of A and B will be between 1 and 10000.
// Related Topics String


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:1 ms,击败了99.83% 的Java用户
  //  内存消耗:37.1 MB,击败了100.00% 的Java用户
  public int repeatedStringMatch(String A, String B) {
    int aLen = A.length(), index = B.indexOf(A),
        lastIndex = B.length() - (B.length() - index) % aLen, bLen = lastIndex - index;
    if (index == -1) {
      if (A.indexOf(B) == -1) {
        A = A + A;
        return A.indexOf(B) != -1 ? 2 : -1;
      }
      return 1;
    } else {
      for (int i = 1; i <= index; i++) {
        if (A.charAt(aLen - i) != B.charAt(index - i)) {
          return -1;
        }
      }
      for (int i = lastIndex; i < B.length(); i++) {
        if (A.charAt(i - lastIndex) != B.charAt(i)) {
          return -1;
        }
      }
      for (int i = 0; i < bLen; i++) {
        if (A.charAt(i % aLen) != B.charAt(i + index)) {
          return -1;
        }
      }
    }
    return (index == 0 ? 0 : 1) + (lastIndex == B.length() ? 0 : 1) + (bLen % aLen == 0 ? 0 : 1)
        + bLen / aLen;
  }
}
//leetcode submit region end(Prohibit modification and deletion)
