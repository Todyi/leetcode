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
//  public boolean detectCapitalUse(String word) {
//    String pattern = "[A-Z]+";
//    String pattern1 = "[a-z]+";
//    String pattern2 = "[A-Z][a-z]+";
//    return word.matches(pattern) || word.matches(pattern1) || word.matches(pattern2);
//  }

  //  解答成功:
  //  执行耗时:1 ms,击败了99.14% 的Java用户
  //  内存消耗:37.8 MB,击败了6.06% 的Java用户
  public boolean detectCapitalUse(String word) {
    if (word.length() == 1) {
      return true;
    }
    char[] arr = word.toCharArray();
    //0USA 1leetcode 2Google
    int pattern = 'a' <= arr[0] && arr[0] <= 'z' ? 1 : 'A' <= arr[1] && arr[1] <= 'Z' ? 0 : 2;
    for (int i = 1; i < arr.length; i++) {
      if (pattern == 0 && (arr[i] < 'A' || 'Z' < arr[i])) {
        return false;
      } else if (pattern == 1 && (arr[i] < 'a' || 'z' < arr[i])) {
        return false;
      } else if (pattern == 2 && (arr[i] < 'a' || 'z' < arr[i])) {
        return false;
      }
    }

    return true;
  }

}
//leetcode submit region end(Prohibit modification and deletion)

