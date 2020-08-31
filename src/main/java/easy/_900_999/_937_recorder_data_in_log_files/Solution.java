package easy._900_999._937_recorder_data_in_log_files;

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
import java.util.Set;
import java.util.TreeMap;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:5 ms,击败了78.83% 的Java用户
  //  内存消耗:39.3 MB,击败了98.31% 的Java用户
  public String[] reorderLogFiles(String[] logs) {
    ArrayList<String> digitList = new ArrayList<>();
    TreeMap<String, String> letterMap = new TreeMap<>();
    for (String log : logs) {
      if (Character.isDigit(log.charAt(log.length() - 1))) {
        digitList.add(log);
      } else {
        letterMap.put(log.substring(log.indexOf(" ")) + log, log);
      }
    }
    int i = 0;
    Set<String> keys = letterMap.keySet();
    for (String key : keys) {
      logs[i++] = letterMap.get(key);
    }

    for (String s : digitList) {
      logs[i++] = s;
    }

    return logs;
  }
}
//leetcode submit region end(Prohibit modification and deletion)