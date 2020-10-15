package medium._0000_0099._006_zigzag_conversion;

//The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this:
// (you may want to display this pattern in a fixed font for better legibility)
//
//
//P   A   H   N
//A P L S I I G
//Y   I   R
//
//
// And then read line by line: "PAHNAPLSIIGYIR"
//
// Write the code that will take a string and make this conversion given a number of rows:
//
//
//string convert(string s, int numRows);
//
//
//
// Example 1:
//
//
//Input: s = "PAYPALISHIRING", numRows = 3
//Output: "PAHNAPLSIIGYIR"
//
//
// Example 2:
//
//
//Input: s = "PAYPALISHIRING", numRows = 4
//Output: "PINALSIGYAHRPI"
//Explanation:
//P     I    N
//A   L S  I G
//Y A   H R
//P     I
//
//
// Example 3:
//
//
//Input: s = "A", numRows = 1
//Output: "A"
//
//
//
// Constraints:
//
//
// 1 <= s.length <= 1000
// s consists of English letters (lower-case and upper-case), ',' and '.'.
// 1 <= numRows <= 1000
//
// Related Topics String
// 👍 1913 👎 5032


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  Runtime: 2 ms, faster than 99.87% of Java online submissions for ZigZag Conversion.
  //  Memory Usage: 38.9 MB, less than 5.47% of Java online submissions for ZigZag Conversion.
  public String convert(String s, int numRows) {
    int len = s.length();
    if (len < numRows || numRows < 2) {
      return s;
    }
    int interval = 2 * numRows - 2, idx = 0;
    char[] arr = s.toCharArray(), res = new char[len];
    for (int i = 0; i < numRows; i++) {
      int step = interval - 2 * i;
      for (int j = i; j < len; j += interval) {
        res[idx++] = arr[j];
        if (0 < step && step < interval && j + step < len) {
          res[idx++] = arr[j + step];
        }
      }
    }
    return String.valueOf(res);
  }
}
//leetcode submit region end(Prohibit modification and deletion)

