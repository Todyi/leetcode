package easy._000_099._58_length_of_last_word;/*
 * @lc app=leetcode id=58 lang=java
 *
 * [58] Length of Last Word
 */

// @lc code=start
class Solution {

//Accepted
//59/59 cases passed (0 ms)
//Your runtime beats 100 % of java submissions
//Your memory usage beats 92.42 % of java submissions (37.2 MB)

  public int lengthOfLastWord(String s) {

    char empty = " ".toCharArray()[0];
    char[] arr = s.toCharArray();

    int posi = arr.length - 1;
    int wordLength = 0;

    while (posi > 0 && arr[posi] == empty){
      posi--;
    }

    for (int i = posi; i >= 0; i--) {
      if (arr[i] != empty) {
        wordLength++;
      } else {
        break;
      }

    }
    return wordLength;
  }
}
// @lc code=end

