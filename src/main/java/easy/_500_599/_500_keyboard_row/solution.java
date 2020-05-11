package easy._500_599._500_keyboard_row;

//Given a List of words, return the words
// that can be typed using letters of alphabet on only one row's of American keyboard
// like the image below.
//
//
//
//
//
//
// Example:
//
//
//Input: ["Hello", "Alaska", "Dad", "Peace"]
//Output: ["Alaska", "Dad"]
//
//
//
//
// Note:
//
//
// You may use one character in the keyboard more than once.
// You may assume the input string will only contain letters of alphabet.
//
// Related Topics Hash Table


import java.util.Arrays;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:37 MB,击败了7.69% 的Java用户
  public String[] findWords(String[] words) {
    String row0 = "QWERTYUIOPqwertyuiop";
    String row1 = "ASDFGHJKLasdfghjkl";
    String row2 = "ZXCVBNMzxcvbnm";
    String[] res = new String[words.length];
    int count = 0;
    for (String word : words) {
      char[] wordArr = word.toCharArray();
      String tmp;
      boolean match = true;
      if (-1 < row0.indexOf(wordArr[0])) {
        tmp = row0;
      } else if (-1 < row1.indexOf(wordArr[0])) {
        tmp = row1;
      } else {
        tmp = row2;
      }
      for (int i = 1; i < wordArr.length; i++) {
        if (-1 == tmp.indexOf(wordArr[i])) {
          match = false;
          break;
        }
      }
      if (match) {
        res[count++] = word;
      }
    }
    return Arrays.copyOf(res, count);
  }
}
//leetcode submit region end(Prohibit modification and deletion)

