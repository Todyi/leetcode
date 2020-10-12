package easy._1500_1599._1592_rearrange_spaces_between_words;

//You are given a string text of words that are placed among some number of spaces. 
// Each word consists of one or more lowercase English letters 
// and are separated by at least one space. It's guaranteed that text contains at least one word. 
//
// Rearrange the spaces so that there is an equal number of spaces between every
// pair of adjacent words and that number is maximized. If you cannot redistribute
// all the spaces equally, place the extra spaces at the end, meaning the returned
// string should be the same length as text. 
//
// Return the string after rearranging the spaces. 
//
// 
// Example 1: 
//
// 
//Input: text = "  this   is  a sentence "
//Output: "this   is   a   sentence"
//Explanation: There are a total of 9 spaces and 4 words.
// We can evenly divide the 9 spaces between the words: 9 / (4-1) = 3 spaces.
// 
//
// Example 2: 
//
// 
//Input: text = " practice   makes   perfect"
//Output: "practice   makes   perfect "
//Explanation:There are a total of 7 spaces and 3 words. 7 / (3-1) = 3 spaces plus 1 extra space.
// We place this extra space at the end of the string.
// 
//
// Example 3: 
//
// 
//Input: text = "hello   world"
//Output: "hello   world"
// 
//
// Example 4: 
//
// 
//Input: text = "  walks  udp package   into  bar a"
//Output: "walks  udp  package  into  bar  a "
// 
//
// Example 5: 
//
// 
//Input: text = "a"
//Output: "a"
// 
//
// 
// Constraints: 
//
// 
// 1 <= text.length <= 100 
// text consists of lowercase English letters and ' '. 
// text contains at least one word. 
// 
// Related Topics String 
// 👍 63 👎 81


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:37.2 MB,击败了32.79% 的Java用户
  public String reorderSpaces(String text) {
    char[] arr = text.toCharArray();
    int spaceCount = 0, wordCount = 0, len = arr.length, divideCount, remainSpaces;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == ' ') {
        spaceCount++;
        if (0 < i && arr[i - 1] != ' ') {
          wordCount++;
        }
      }
    }
    if (arr[len - 1] != ' ') {
      wordCount++;
    }
    if (1 < wordCount) {
      divideCount = spaceCount / (wordCount - 1);
      remainSpaces = spaceCount - divideCount * (wordCount - 1);
    }else {
      divideCount = 0;
      remainSpaces = spaceCount;
    }
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] != ' ') {
        sb.append(arr[i]);
        if (i < len - 1 && arr[i + 1] == ' ' && 1 < wordCount) {
          wordCount--;
          addSpaces(sb, divideCount);
        }
      }
    }
    addSpaces(sb, remainSpaces);
    return sb.toString();
  }

  public void addSpaces(StringBuilder sb, int spaceNum) {
    for (int i = 0; i < spaceNum; i++) {
      sb.append(' ');
    }
  }
}
//leetcode submit region end(Prohibit modification and deletion)

