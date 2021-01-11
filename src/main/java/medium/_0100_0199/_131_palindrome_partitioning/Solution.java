package medium._0100_0199._131_palindrome_partitioning;

//Given a string s, partition s such that every substring of the partition is a palindrome.
// Return all possible palindrome partitioning of s.
//
// A palindrome string is a string that reads the same backward as forward.
//
//
// Example 1:
// Input: s = "aab"
//Output: [["a","a","b"],["aa","b"]]
// Example 2:
// Input: s = "a"
//Output: [["a"]]
//
//
// Constraints:
//
//
// 1 <= s.length <= 16
// s contains only lowercase English letters.
//
// Related Topics Dynamic Programming Backtracking Depth-first Search
// 👍 2806 👎 90


import java.util.ArrayList;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:6 ms,击败了84.66% 的Java用户
  //  内存消耗:51.9 MB,击败了79.83% 的Java用户
  List<List<String>> result = new ArrayList<>();

  public List<List<String>> partition(String s) {
    partition(new ArrayList<>(), s.toCharArray(), 0, 0, 0);
    return result;
  }

  public void partition(List<String> curList, char[] arr, int curStart,
      int idx, int len) {
    if (idx == arr.length) {
      if (len == arr.length) {
        result.add(new ArrayList<>(curList));
      }
      return;
    }
    partition(curList, arr, curStart, idx + 1, len);

    if (isPalindrome(arr, curStart, idx)) {
      idx++;
      curList.add(new String(arr, curStart, idx - curStart));
      partition(curList, arr, idx, idx, len + idx - curStart);
      curList.remove(curList.size() - 1);
    }
  }

  public boolean isPalindrome(char[] arr, int start, int end) {
    while (start <= end) {
      if (arr[start] != arr[end]) {
        return false;
      }
      start++;
      end--;
    }
    return true;
  }

}
//leetcode submit region end(Prohibit modification and deletion)

