package easy._0900_0999._937_recorder_data_in_log_files;

//You have an array of logs. Each log is a space delimited string of words.
//
// For each log, the first word in each log is an alphanumeric identifier.

// Then, either:
// Each word after the identifier will consist only of lowercase letters, or;
// Each word after the identifier will consist only of digits.
//
//
// We will call these two varieties of logs letter-logs and digit-logs.
// It is guaranteed that each log has at least one word after its identifier.
//
// Reorder the logs so that all of the letter-logs come before any digit-log.
// The letter-logs are ordered lexicographically ignoring identifier,
// with the identifier used in case of ties. The digit-logs should be put in their original order.
//
//
// Return the final order of the logs.
//
//
// Example 1:
// Input: logs = ["dig1 8 1 5 1","let1 art can","dig2 3 6","let2 own kit dig","let3 art zero"]
//Output: ["let1 art can","let3 art zero","let2 own kit dig","dig1 8 1 5 1","dig2 3 6"]
//
//
// Constraints:
//
//
// 0 <= logs.length <= 100
// 3 <= logs[i].length <= 100
// logs[i] is guaranteed to have an identifier, and a word after the identifier.
//
//
// Related Topics String
// 👍 705 👎 2136


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:4 ms,击败了84.44% 的Java用户
  //  内存消耗:39.3 MB,击败了99.14% 的Java用户
//  public String[] reorderLogFiles(String[] logs) {
//    TreeMap<String, String> letterMap = new TreeMap<>();
//    for (int i = 0; i < logs.length; i++) {
//      if (!Character.isDigit(logs[i].charAt(logs[i].length() - 1))) {
//        int split = logs[i].indexOf(" ");
//        letterMap.put(logs[i].substring(split) + logs[i].substring(0, split), logs[i]);
//        logs[i] = null;
//      }
//    }
//    int i = 0;
//    String[] res = new String[logs.length];
//    Set<String> keys = letterMap.keySet();
//    for (String key : keys) {
//      res[i++] = letterMap.get(key);
//    }
//
//    for (String s : logs) {
//      if (s != null) {
//        res[i++] = s;
//      }
//    }
//    return res;
//  }

  //  解答成功:
  //  执行耗时:1 ms,击败了100.00% 的Java用户
  //  内存消耗:39.5 MB,击败了94.07% 的Java用户
  public String[] reorderLogFiles(String[] logs) {
    List<String> letterLogs = new ArrayList<String>();
    for (int i = 0; i < logs.length; ++i) {
      String log = logs[i];
      int dataIndex = log.indexOf(" ") + 1;
      if (log.charAt(dataIndex) >= 'a' && log.charAt(dataIndex) <= 'z') {
        letterLogs.add(log);
        logs[i] = "";
      }
    }
    Collections.sort(letterLogs, new Comparator<String>() {
      @Override
      public int compare(String s1, String s2) {
        int l1 = s1.length();
        int l2 = s2.length();
        int indexOne = s1.indexOf(" ") + 1;
        int indexTwo = s2.indexOf(" ") + 1;
        while (indexOne < l1 && indexTwo < l2) {
          if (s1.charAt(indexOne) < s2.charAt(indexTwo)) {
            return -1;
          }
          if (s2.charAt(indexTwo) < s1.charAt(indexOne)) {
            return 1;
          }
          ++indexOne;
          ++indexTwo;
        }
        if (indexOne == l1) {
          return -1;
        } else {
          return 1;
        }
      }
    });
    String[] ans = new String[logs.length];
    int i = 0;
    for (; i < letterLogs.size(); ++i) {
      ans[i] = letterLogs.get(i);
    }
    for (int j = 0; j < logs.length; ++j) {
      if (!logs[j].equals("")) {
        ans[i++] = logs[j];
      }
    }
    return ans;
  }
}
//leetcode submit region end(Prohibit modification and deletion)