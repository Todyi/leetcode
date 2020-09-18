package easy._1000_1099._1078_occurrences_after_bigram;

//Given words first and second, consider occurrences in some text of the form "first second third",
// where second comes immediately after first, and third comes immediately after second.
//
// For each such occurrence, add "third" to the answer, and return the answer.
//
//
//
// Example 1:
//
//
//Input: text = "alice is a good girl she is a good student", first = "a", second = "good"
//Output: ["girl","student"]
//
//
//
// Example 2:
//
//
//Input: text = "we will we will rock you", first = "we", second = "will"
//Output: ["we","rock"]
//
//
//
//
// Note:
//
//
// 1 <= text.length <= 1000
// text consists of space separated words, where each word consists of lowercase
// English letters.
// 1 <= first.length, second.length <= 10
// first and second consist of lowercase English letters.
//
//
// Related Topics Hash Table
// 👍 154 👎 187


import java.util.Arrays;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:37.4 MB,击败了79.98% 的Java用户
  public String[] findOcurrences(String text, String first, String second) {
    String[] textArr = text.split(" ");
    int idx = 0;
    for (int i = 0; i < textArr.length - 2; i++) {
      if (textArr[i].equals(first) && textArr[i + 1].equals(second)) {
        textArr[idx++] = textArr[i + 2];
      }
    }
    return Arrays.copyOf(textArr, idx);
  }
}
//leetcode submit region end(Prohibit modification and deletion)

