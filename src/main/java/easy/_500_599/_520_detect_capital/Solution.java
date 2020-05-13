package easy._500_599._520_detect_capital;

//Given a word, you need to judge whether the usage of capitals in it is right or not.
//
// We define the usage of capitals in a word to be right when one of the following cases holds:
//
//
// All letters in this word are capitals, like "USA".
// All letters in this word are not capitals, like "leetcode".
// Only the first letter in this word is capital, like "Google".
//
//Otherwise, we define that this word doesn't use capitals in a right way.
//
//
//
// Example 1:
//
//
//Input: "USA"
//Output: True
//
//
//
//
// Example 2:
//
//
//Input: "FlaG"
//Output: False
//
//
//
//
// Note: The input will be a non-empty word consisting of uppercase and lowercase latin letters.
// Related Topics String


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:6 ms,击败了8.06% 的Java用户
  //  内存消耗:39.9 MB,击败了6.06% 的Java用户
  public boolean detectCapitalUse(String word) {
    String pattern = "[A-Z]+";
    String pattern1 = "[a-z]+";
    String pattern2 = "[A-Z][a-z]+";
    return word.matches(pattern) || word.matches(pattern1) || word.matches(pattern2);
  }
}
//leetcode submit region end(Prohibit modification and deletion)

