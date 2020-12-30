package medium._0000_0099._091_decode_ways;

//A message containing letters from A-Z is being encoded to numbers using the following mapping:
//
//
//'A' -> 1
//'B' -> 2
//...
//'Z' -> 26
//
//
// Given a non-empty string containing only digits, determine the total number of ways to decode it.
//
// The answer is guaranteed to fit in a 32-bit integer.
//
//
// Example 1:
//
//
//Input: s = "12"
//Output: 2
//Explanation: It could be decoded as "AB" (1 2) or "L" (12).
//
//
// Example 2:
//
//
//Input: s = "226"
//Output: 3
//Explanation: It could be decoded as "BZ" (2 26), "VF" (22 6), or "BBF" (2 2 6).
//
//
// Example 3:
//
//
//Input: s = "0"
//Output: 0
//Explanation: There is no character that is mapped to a number starting with '0'.
// We cannot ignore a zero when we face it while decoding.
// So, each '0' should be part of "10" --> 'J' or "20" --> 'T'.
//
//
// Example 4:
//
//
//Input: s = "1"
//Output: 1
//
//
//
// Constraints:
//
//
// 1 <= s.length <= 100
// s contains only digits and may contain leading zero(s).
//
// Related Topics String Dynamic Programming
// 👍 3710 👎 3321


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:37.2 MB,击败了79.57% 的Java用户
  public int numDecodings(String s) {
    return count(s.toCharArray(), s.length() - 1, 1, 0, null);
  }

  //ie. 11101...
  //total,sHead,pre->cur
  //12,10,1->0->1 ==>12,0,null->1 ==>12,12,1->1 ==>24,12,1
  public int count(char[] arr, int idx, int totalCount, int singleHeadCount, Integer pre) {
    if (idx < 0) {
      return totalCount;
    }
    int cur;
    if ((cur = arr[idx] - '0') == 0) {
      if (--idx < 0) {//0 cannot be any letter
        return 0;
      }
      cur = arr[idx] - '0';
      if (cur < 1 || 2 < cur) {//00 30 cannot be any letter
        return 0;
      }
      return count(arr, idx - 1, totalCount, 0, null);
    } else {
      int tmp = totalCount;
      if (pre != null && cur * 10 + pre < 27) {
        totalCount += singleHeadCount;
      }
      singleHeadCount = tmp;
    }
    return count(arr, idx - 1, totalCount, singleHeadCount, cur);
  }

}
//leetcode submit region end(Prohibit modification and deletion)

