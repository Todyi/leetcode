package easy._1_200._14_longest_common_prefix;

/**
 * @program: leetcode
 * @description: 14.longest-common-prefix
 * @author: hdy
 * @create: 2019-04-23
 **/

public class LongestCommonPrefix {

  /**
   * √ Accepted
   * √ 118/118 cases passed (3 ms)
   * √ Your runtime beats 72.26 % of java submissions
   * √ Your memory usage beats 75.24 % of java submissions (37.7 MB)
   */
  public static String longestCommonPrefix(String[] strs) {
    StringBuffer result = new StringBuffer();
    if (strs.length == 1) {
      result.append(strs[0]);
    } else if (strs.length > 1) {
      String str = strs[0];
      char[] array = str.toCharArray();
      for (int i = 0; i < array.length; i++) {
        String pre = result.toString() + array[i];
        if (strs[1].indexOf(pre) < 0) {
          break;
        }
        for (int j = 0; j < strs.length; j++) {
          if (strs[j].indexOf(pre) != 0 || (pre.length() == 1 && strs[j].indexOf(pre) != i)) {
            break;
          }
          if (j == strs.length - 1) {
            result.append(array[i]);
          }
        }
      }
    }
    return result.toString();
  }

  /**
   * √ Accepted
   * √ 118/118 cases passed (0 ms)
   * √ Your runtime beats 100 % of java submissions
   * √ Your memory usage beats 24.91 % of java submissions (38.5 MB)
   */
  public static String horizontalScanning(String[] strs) {
    if (strs.length == 0) {
      return "";
    }
    String pre = strs[0];
    for (int i = 1; i < strs.length; i++) {
      while (strs[i].indexOf(pre) != 0) {
        if (pre.equals("")) {
          return "";
        }
        pre = pre.substring(0, pre.length() - 1);
      }
    }
    return pre;
  }

  /**
   * √ Accepted
     √ 118/118 cases passed (1 ms)
     √ Your runtime beats 91.59 % of java submissions
     √ Your memory usage beats 76.62 % of java submissions (37.5 MB)
   */
  public static String verticalScanning(String[] strs) {
    if (strs == null || strs.length == 0) return "";
    for (int i = 0; i < strs[0].length() ; i++){
      char c = strs[0].charAt(i);
      for (int j = 1; j < strs.length; j ++) {
        if (i == strs[j].length() || strs[j].charAt(i) != c)
          return strs[0].substring(0, i);
      }
    }
    return strs[0];
  }

}
