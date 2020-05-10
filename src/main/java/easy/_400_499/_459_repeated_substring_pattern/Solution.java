package easy._400_499._459_repeated_substring_pattern;

//Given a non-empty string check if it can be constructed by taking a substring of it
// and appending multiple copies of the substring together. You may assume
// the given string consists of lowercase English letters only and its length will not exceed 10000.
//
//
//
// Example 1:
//
//
//Input: "abab"
//Output: True
//Explanation: It's the substring "ab" twice.
//
//
// Example 2:
//
//
//Input: "aba"
//Output: False
//
//
// Example 3:
//
//
//Input: "abcabcabcabc"
//Output: True
//Explanation: It's the substring "abc" four times. (And the substring "abcabc"
//twice.)
//
// Related Topics String


import java.util.Arrays;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:8 ms,击败了80.14% 的Java用户
  //  内存消耗:39.5 MB,击败了14.29% 的Java用户
//  public boolean repeatedSubstringPattern(String s) {
//    char[] sArr = s.toCharArray();
//    int subLen = 1;
//    int half = sArr.length >> 1;
//    while (subLen <= half) {
//      boolean isRepeated = true;
//      if (sArr.length % subLen == 0) {
//        for (int i = subLen; i < sArr.length; i++) {
//          if (sArr[i % subLen] != sArr[i]) {
//            isRepeated = false;
//            subLen++;
//            break;
//          }
//        }
//        if (isRepeated) {
//          return subLen <= half;
//        }
//      } else {
//        subLen++;
//      }
//    }
//    return false;
//  }

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:39.7 MB,击败了9.52% 的Java用户
  public boolean repeatedSubstringPattern(String s) {
    // no matter how many times the shortest sub repeated, if the times can be exact division by a prime number(such as 2),
    // the longest subString is s/prime
    // like s = sub*a*b*c*d... = (sub*a*b*...)*2
    // abababababababab shortest:ab longest:abababab

    int[] primes = {
        2, 3, 5, 7, 11, 13, 17, 23,
        29, 31, 37, 41, 43, 47, 53, 59,
        61, 67, 71, 73, 79, 83, 87, 97};
    int l = s.length();
    for (int i = 0; i < primes.length; i++) {
      int repeatTimes = primes[i];
      if (l < repeatTimes) {
        break;
      }
      if (l % repeatTimes == 0) {
        if (isRepeated(s, repeatTimes)) {
          return true;
        }
      }
    }
    return false;
  }

  public boolean isRepeated(String s, int repeatTimes) {
    int subLen = s.length() / repeatTimes;
    String sub = s.substring(0, subLen);
    for (int i = s.length(); subLen < i; i -= subLen) {
      if (!sub.equals(s.substring(i - subLen, i))) {
        return false;
      }
    }
    return true;
  }

}
//leetcode submit region end(Prohibit modification and deletion)

