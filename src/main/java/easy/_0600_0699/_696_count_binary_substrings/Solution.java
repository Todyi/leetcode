package easy._0600_0699._696_count_binary_substrings;

//Give a string s, count the number of non-empty (contiguous) substrings
// that have the same number of 0's and 1's,
// and all the 0's and all the 1's in these substrings are grouped consecutively.
//
// Substrings that occur multiple times are counted the number of times they occur.
//
// Example 1:
//
//Input: "00110011"
//Output: 6
//Explanation: There are 6 substrings that have equal number of consecutive 1's and 0's:
// "0011", "01", "1100", "10", "0011", and "01".
// Notice that some of these substrings repeat and are counted the number of times they occur.
// Also, "00110011" is not a valid substring because all the 0's (and 1's) are not grouped together.
//
//
//
// Example 2:
//
//Input: "10101"
//Output: 4
//Explanation: There are 4 substrings: "10", "01", "10", "01"
// that have equal number of consecutive 1's and 0's.
//
//
//
// Note:
// s.length will be between 1 and 50,000.
// s will only consist of "0" or "1" characters.
// Related Topics String


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:5 ms,击败了100.00% 的Java用户
  //  内存消耗:39.4 MB,击败了98.87% 的Java用户
  public int countBinarySubstrings(String s) {
    char[] arr = s.toCharArray();
    int pre = 0, cur = 0, sum = 0;
    for (int i = 0; i < arr.length - 1; i++) {
      cur++;
      if (arr[i] != arr[i + 1]) {
        sum += Math.min(pre, cur);
        pre = cur;
        cur = 0;
      }

    }
    return sum + Math.min(pre, cur + 1);
  }
}
//leetcode submit region end(Prohibit modification and deletion)

