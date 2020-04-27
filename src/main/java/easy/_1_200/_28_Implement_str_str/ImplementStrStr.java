package easy._1_200._28_Implement_str_str;

/**
 * @program: leetcode
 * @description: 28.implement-str-str
 * @author: hdy
 * @create: 2019-04-24
 **/

public class ImplementStrStr {

  /**
   * √ Accepted
   * √ 74/74 cases passed (535 ms)
   * √ Your runtime beats 5.03 % of java submissions
   * √ Your memory usage beats 79.72 % of java submissions (37.5 MB)
   */
  public static int strStr(String haystack, String needle) {
    if (needle.length() == 0) {
      return 0;
    }
    boolean flag;
    int i;
    for (i = 0; i < haystack.length(); i++) {
      if (haystack.charAt(i) == needle.charAt(0)) {
        flag = true;
        for (int j = 1; j < needle.length(); j++) {
          if (i + j >= haystack.length()) {
            flag = false;
            break;
          }
          if (haystack.charAt(i + j) == needle.charAt(j)) {
            flag = true;
          } else {
            flag = false;
            break;
          }
        }
        if (flag) {
          return i;
        }
      }
    }
    return -1;
  }

  /**
   * √ Accepted
   * √ 74/74 cases passed (1 ms)
   * √ Your runtime beats 90.43 % of java submissions
   * √ Your memory usage beats 83.55 % of java submissions (37.4 MB)
   */
  public static int anotherSolution(String haystack, String needle) {
    if (needle.length() == 0) {
      return 0;
    }

    int haystackLength = haystack.length();
    int needleLength = needle.length();

    for (int i = 0; i <= haystackLength - needleLength; i++) {
      for (int j = 0; j < needleLength; j++) {
        if (haystack.charAt(i + j) != needle.charAt(j)) {
          break;
        }
        if (j == needleLength - 1) {
          return i;
        }
      }
    }

    return -1;
  }

}
