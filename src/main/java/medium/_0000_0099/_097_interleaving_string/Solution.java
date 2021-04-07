package medium._0000_0099._097_interleaving_string;

//Given strings s1, s2, and s3, find whether s3 is formed by an interleaving of
//s1 and s2.
//
// An interleaving of two strings s and t is a configuration
// where they are divided into non-empty substrings such that:
//
//
// s = s1 + s2 + ... + sn
// t = t1 + t2 + ... + tm
// |n - m| <= 1
// The interleaving is s1 + t1 + s2 + t2 + s3 + t3 + ... or t1 + s1 + t2 + s2 +
//t3 + s3 + ...
//
//
// Note: a + b is the concatenation of strings a and b.
//
//
// Example 1:
//
//
//Input: s1 = "aabcc", s2 = "dbbca", s3 = "aadbbcbcac"
//Output: true
//
//
// Example 2:
//
//
//Input: s1 = "aabcc", s2 = "dbbca", s3 = "aadbbbaccc"
//Output: false
//
//
// Example 3:
//
//
//Input: s1 = "", s2 = "", s3 = ""
//Output: true
//
//
//
// Constraints:
//
//
// 0 <= s1.length, s2.length <= 100
// 0 <= s3.length <= 200
// s1, s2, and s3 consist of lowercase English letters.
//
//
//
// Follow up: Could you solve it using only O(s2.length) additional memory space
//?
// Related Topics String Dynamic Programming
// 👍 1936 👎 105


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:3 ms,击败了57.72% 的Java用户
  //  内存消耗:37 MB,击败了83.24% 的Java用户
  public boolean isInterleave(String s1, String s2, String s3) {
    int m = s1.length(), n = s2.length(), l = s3.length();
    if (m + n != l) {
      return false;
    }
    //f[i+1][j+1] == true means s3[0,i+j] is formed by an interleaving of by s1[0,i] and s2[0,j]
    //f[m][n] == (f[m-1][n] && s1[m-1] == s3[m+n-1]) || (f[m][n-1] && s2[n-1] == s3[m+n-1])
    boolean[][] f = new boolean[m + 1][n + 1];
    f[0][0] = true;
    for (int i = 0; i <= m; i++) {
      for (int j = 0; j <= n; j++) {
        int k = i + j - 1;
        if (0 < i) {
          f[i][j] = f[i - 1][j] && s1.charAt(i - 1) == s3.charAt(k);
        }
        if (0 < j) {
          f[i][j] = f[i][j] || (f[i][j - 1] && s2.charAt(j - 1) == s3.charAt(k));
        }
      }
    }
    return f[m][n];
  }

}
//leetcode submit region end(Prohibit modification and deletion)

