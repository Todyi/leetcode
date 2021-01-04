package medium._0000_0099._093_restore_ip_addresses;

//Given a string s containing only digits, return all possible valid IP addresses
// that can be obtained from s. You can return them in any order.
//
// A valid IP address consists of exactly four integers, each integer is between 0 and 255,
// separated by single dots and cannot have leading zeros.
// For example,
// "0.1.2.201" and "192.168.1.1" are valid IP addresses
// and "0.011.255.245", "192.168.1.312" and "192.168@1.1" are invalid IP addresses.
//
//
// Example 1:
// Input: s = "25525511135"
//Output: ["255.255.11.135","255.255.111.35"]
// Example 2:
// Input: s = "0000"
//Output: ["0.0.0.0"]
// Example 3:
// Input: s = "1111"
//Output: ["1.1.1.1"]
// Example 4:
// Input: s = "010010"
//Output: ["0.10.0.10","0.100.1.0"]
// Example 5:
// Input: s = "101023"
//Output: ["1.0.10.23","1.0.102.3","10.1.0.23","10.10.2.3","101.0.2.3"]
//
//
// Constraints:
//
//
// 0 <= s.length <= 3000
// s consists of digits only.
//
// Related Topics String Backtracking
// 👍 1570 👎 542


import java.util.ArrayList;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:1 ms,击败了99.06% 的Java用户
  //  内存消耗:37.6 MB,击败了97.51% 的Java用户
//  public List<String> restoreIpAddresses(String s) {
//    List<String> result = new ArrayList<>();
//    if (s == null || s.length() == 0 || 12 < s.length()) {
//      return result;
//    }
//    getIpAddresses(result, new StringBuilder(s), s.charAt(0) - '0', 1, 0);
//    return result;
//  }

//  public void getIpAddresses(List<String> result, StringBuilder cur, int num, int idx, int dotCnt) {
//    if (idx == cur.length()) {
//      if (dotCnt == 3 && num < 256) {
//        result.add(cur.toString());
//      }
//      return;
//    }
//    if (3 < dotCnt) {
//      return;
//    }
//    if (num == 0) {
//      cur.insert(idx, '.');
//      getIpAddresses(result, cur, cur.charAt(idx + 1) - '0', idx + 2, dotCnt + 1);
//      cur.deleteCharAt(idx);
//    } else {
//      if (num < 256 && idx < cur.length()) {
//        cur.insert(idx, '.');
//        getIpAddresses(result, cur, cur.charAt(idx + 1) - '0', idx + 2, dotCnt + 1);
//        cur.deleteCharAt(idx);
//        int tmp = num * 10 + cur.charAt(idx) - '0';
//        if (tmp < 256) {
//          getIpAddresses(result, cur, tmp, idx + 1, dotCnt);
//        }
//      }
//    }
//  }

  //  解答成功:
  //  执行耗时:1 ms,击败了99.06% 的Java用户
  //  内存消耗:37.4 MB,击败了99.57% 的Java用户
  public List<String> restoreIpAddresses(String s) {
    List<String> result = new ArrayList<>();
    if (s == null || s.length() == 0 || 12 < s.length()) {
      return result;
    }
    store(result, s, new int[4], 0, 0);
    return result;
  }

  public void store(List<String> result, String s, int[] segments, int numOfSeg, int idx) {
    if (idx == s.length() || numOfSeg == 4) {
      if (idx == s.length() && numOfSeg == 4) {
        result.add(getIpAddress(segments));
      }
      return;
    }
    for (int i = idx, val = 0; i < Math.min(s.length(), idx + 3); i++) {
      val = val * 10 + s.charAt(i) - '0';
      if (val < 256) {
        segments[numOfSeg] = val;
        store(result, s, segments, numOfSeg + 1, i + 1);
      }
      if (val == 0) {
        break;
      }
    }
  }

  public String getIpAddress(int[] segments) {
    return new StringBuilder()
        .append(segments[0]).append('.')
        .append(segments[1]).append('.')
        .append(segments[2]).append('.')
        .append(segments[3]).toString();
  }
}
//leetcode submit region end(Prohibit modification and deletion)

