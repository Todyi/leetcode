package easy._800_899._859_buddy_strings;

//Given two strings A and B of lowercase letters,
// return true if and only if we can swap two letters in A so that the result equals B.
//
//
//
// Example 1:
//
//
//
//Input: A = "ab", B = "ba"
//Output: true
//
//
//
// Example 2:
//
//
//Input: A = "ab", B = "ab"
//Output: false
//
//
//
// Example 3:
//
//
//Input: A = "aa", B = "aa"
//Output: true
//
//
//
// Example 4:
//
//
//Input: A = "aaaaaaabc", B = "aaaaaaacb"
//Output: true
//
//
//
// Example 5:
//
//
//Input: A = "", B = "aa"
//Output: false
//
//
//
//
//
//
//
//
// Constraints:
//
//
// 0 <= A.length <= 20000
// 0 <= B.length <= 20000
// A and B consist only of lowercase letters.
//
// Related Topics String
// 👍 573 👎 394


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:39.6 MB,击败了53.30% 的Java用户
  public boolean buddyStrings(String A, String B) {
    if (A.length() != B.length()) {
      return false;
    }
    char[] aArr = A.toCharArray();

    int multiA = 1;
    if (A.equals(B)) {
      for (int i = 0; i < aArr.length; i++) {
        if (multiA % aArr[i] == 0) {
          return true;
        }
        multiA *= aArr[i];
      }
      return false;
    }

    char[] bArr = B.toCharArray();
    int count = 0, diffA = 0, diffB = 0;
    for (int i = 0; i < aArr.length && count < 3; i++) {
      if (aArr[i] != bArr[i]) {
        diffA += aArr[i];
        diffB += bArr[i];
        count++;
      }
    }
    return count == 2 && diffA == diffB;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

