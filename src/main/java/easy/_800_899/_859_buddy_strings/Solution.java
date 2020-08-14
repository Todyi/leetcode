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
  //  执行耗时:2 ms,击败了79.89% 的Java用户
  //  内存消耗:39 MB,击败了94.67% 的Java用户
  public boolean buddyStrings(String A, String B) {
    if (A.length() != B.length()) {
      return false;
    }
    char[] aArr = A.toCharArray();
    char[] bArr = B.toCharArray();
    int count = 0;
    long multiA = 1, multiB = 1;
    boolean duplicate = false;

    for (int i = 0; i < aArr.length; i++) {
      if (aArr[i] != bArr[i]) {
        count++;
      }
      if (!duplicate) {
        if (multiA % aArr[i] == 0) {
          duplicate = true;
        }
      }
      multiA *= aArr[i];
      multiB *= bArr[i];
    }
    return multiA == multiB && (count == 2 || (count == 0 && duplicate));
  }
}
//leetcode submit region end(Prohibit modification and deletion)

