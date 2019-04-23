package longest_common_prefix_14;

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
       √ 118/118 cases passed (0 ms)
       √ Your runtime beats 100 % of java submissions
       √ Your memory usage beats 24.91 % of java submissions (38.5 MB)
   */
  public static String anotherLongestCommonPrefix(String[] strs) {
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

}
