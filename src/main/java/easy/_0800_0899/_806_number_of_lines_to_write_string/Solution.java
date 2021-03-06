package easy._0800_0899._806_number_of_lines_to_write_string;

//We are to write the letters of a given string S, from left to right into lines.
// Each line has maximum width 100 units, and if writing a letter would cause the
// width of the line to exceed 100 units, it is written on the next line.
// We are given an array widths, an array where widths[0] is the width of 'a',
// widths[1] is the width of 'b', ..., and widths[25] is the width of 'z'.
//
// Now answer two questions: how many lines have at least one character from S,
//and what is the width used by the last such line?
// Return your answer as an integer list of length 2.
//
//
//
//
//Example :
//Input:
//widths = [10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10]
//S = "abcdefghijklmnopqrstuvwxyz"
//Output: [3, 60]
//Explanation:
//All letters have the same length of 10. To write all 26 letters,
//we need two full lines and one line with 60 units.
//
//
//
//Example :
//Input:
//widths = [4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10]
//S = "bbbcccdddaaa"
//Output: [2, 4]
//Explanation:
//All letters except 'a' have the same length of 10,
// and "bbbcccdddaa" will cover 9 * 10 + 2 * 4 = 98 units.
//For the last 'a', it is written on the second line
// because there is only 2 units left in the first line.
//So the answer is 2 lines, plus 4 units in the second line.
//
//
//
//
// Note:
//
//
// The length of S will be in the range [1, 1000].
// S will only contain lowercase letters.
// widths is an array of length 26.
// widths[i] will be in the range of [2, 10].
//
// 👍 241 👎 876


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:37.9 MB,击败了5.72% 的Java用户
  public int[] numberOfLines(int[] widths, String S) {
    if (S.length() == 0) {
      return new int[]{0, 0};
    }
    char[] arr = S.toCharArray();
    int lines = 1, lastLineWidth = 0;

    for (char c : arr) {
      if (widths[c - 'a'] + lastLineWidth > 100) {
        lines++;
        lastLineWidth = widths[c - 'a'];
      } else {
        lastLineWidth += widths[c - 'a'];
      }
    }
    return new int[]{lines, lastLineWidth};
  }
}
//leetcode submit region end(Prohibit modification and deletion)

