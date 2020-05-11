package easy._400_499._482_license_key_formatting;

//You are given a license key represented as a string S
// which consists only alphanumeric character and dashes.
// The string is separated into N+1 groups by N dashes.
//
// Given a number K, we would want to reformat the strings such that
// each group contains exactly K characters, except for the first group
// which could be shorter than K,
// but still must contain at least one character. Furthermore,
// there must be a dash inserted between two groups
// and all lowercase letters should be converted to uppercase.
//
// Given a non-empty string S and a number K, format the string according to the
// rules described above.
//
// Example 1:
//
//Input: S = "5F3Z-2e-9-w", K = 4
//
//Output: "5F3Z-2E9W"
//
//Explanation: The string S has been split into two parts, each part has 4 characters.
//Note that the two extra dashes are not needed and can be removed.
//
//
//
//
// Example 2:
//
//Input: S = "2-5g-3-J", K = 2
//
//Output: "2-5G-3J"
//
//Explanation: The string S has been split into three parts, each part has 2 characters
// except the first part as it could be shorter as mentioned above.
//
//
//
// Note:
//
// The length of string S will not exceed 12,000, and K is a positive integer.
// String S consists only of alphanumerical characters (a-z and/or A-Z and/or 0-9) and dashes(-).
// String S is non-empty.
//
//


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:11 ms,击败了60.39% 的Java用户
  //  内存消耗:40 MB,击败了8.16% 的Java用户
  public String licenseKeyFormatting(String S, int K) {
    S = S.replaceAll("-", "");
    char[] sArr = S.toCharArray();
    int flag = 0;
    StringBuilder sb = new StringBuilder();
    for (int i = sArr.length - 1; -1 < i; i--) {
      if (96 < sArr[i] && sArr[i] < 123) {//'a'97 'z'122 'a'<= -> 96<, <='z' -> <123
        sb.append((char) (sArr[i] - 32));//'a'97 'A'65 -'a'+'A' = -32
      } else {
        sb.append(sArr[i]);
      }
      if (flag == K - 1 && i > 0) {
        sb.append('-');
      }
      flag = (flag + 1) % K;//k4 f3
    }
    return sb.reverse().toString();
  }


}
//leetcode submit region end(Prohibit modification and deletion)
