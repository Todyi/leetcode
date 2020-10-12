package easy._1500_1599._1598_crawler_log_folder;

//The Leetcode file system keeps a log each time some user performs a change folder operation.
//
// The operations are described below:
//
//
// "../" : Move to the parent folder of the current folder. (If you are already
//in the main folder, remain in the same folder).
// "./" : Remain in the same folder.
// "x/" : Move to the child folder named x (This folder is guaranteed to always exist).
//
//
// You are given a list of strings logs where logs[i] is the operation performed
// by the user at the ith step.
//
// The file system starts in the main folder, then the operations in logs are performed.
//
// Return the minimum number of operations needed to go back to the main folder
//after the change folder operations.
//
//
// Example 1:
//
//
//
//
//Input: logs = ["d1/","d2/","../","d21/","./"]
//Output: 2
//Explanation: Use this change folder operation "../" 2 times and go back to the
// main folder.
//
//
// Example 2:
//
//
//
//
//Input: logs = ["d1/","d2/","./","d3/","../","d31/"]
//Output: 3
//
//
// Example 3:
//
//
//Input: logs = ["d1/","../","../","../"]
//Output: 0
//
//
//
// Constraints:
//
//
// 1 <= logs.length <= 103
// 2 <= logs[i].length <= 10
// logs[i] contains lowercase English letters, digits, '.', and '/'.
// logs[i] follows the format described in the statement.
// Folder names consist of lowercase English letters and digits.
//
// Related Topics Stack
// 👍 71 👎 10


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:38.4 MB,击败了34.91% 的Java用户
  public int minOperations(String[] logs) {
    String toParent = "../", toRemain = "./";
    int res = 0;
    for (String log : logs) {
      if (log.equals(toParent)) {
        res--;
      } else if (!log.equals(toRemain)) {
        res++;
      }
      if (res < 0) {
        res = 0;
      }
    }
    return res;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

