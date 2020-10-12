package easy._0800_0899._804_unique_morse_code_words;

//International Morse Code defines a standard encoding
// where each letter is mapped to a series of dots and dashes,
// as follows: "a" maps to ".-", "b" maps to "-...", "c" maps to "-.-.", and so on.
//
// For convenience, the full table for the 26 letters of the English alphabet is given below:
//
//[".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",
// ".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]
//
// Now, given a list of words, each word can be written as a concatenation of th
//e Morse code of each letter. For example, "cab" can be written as "-.-..--...",
//(which is the concatenation "-.-." + ".-" + "-..."). We'll call such a concatenation,
// the transformation of a word.
//
// Return the number of different transformations among all words we have.
//
//
//Example:
//Input: words = ["gin", "zen", "gig", "msg"]
//Output: 2
//Explanation:
//The transformation of each word is:
//"gin" -> "--...-."
//"zen" -> "--...-."
//"gig" -> "--...--."
//"msg" -> "--...--."
//
//There are 2 different transformations, "--...-." and "--...--.".
//
//
// Note:
//
//
// The length of words will be at most 100.
// Each words[i] will have length in range [1, 12].
// words[i] will only consist of lowercase letters.
//
// Related Topics String
// 👍 640 👎 656


import java.util.HashMap;
import java.util.Map;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:1 ms,击败了100.00% 的Java用户
  //  内存消耗:37.6 MB,击败了45.94% 的Java用户
  public int uniqueMorseRepresentations(String[] words) {
    String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-",
        ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-",
        "-.--", "--.."};
    Map<String, Object> map = new HashMap<>();
    StringBuilder sb = new StringBuilder();
    for (String word : words) {
      char[] arr = word.toCharArray();
      for (char c : arr) {
        sb.append(morse[c - 'a']);
      }
      map.put(sb.toString(), null);
      sb.setLength(0);
    }
    return map.size();
  }
}
//leetcode submit region end(Prohibit modification and deletion)

