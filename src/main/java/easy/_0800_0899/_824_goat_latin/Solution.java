package easy._0800_0899._824_goat_latin;

//A sentence S is given, composed of words separated by spaces.
// Each word consists of lowercase and uppercase letters only.
//
// We would like to convert the sentence to "Goat Latin" (a made-up language similar to Pig Latin.)
//
// The rules of Goat Latin are as follows:
//
//
// If a word begins with a vowel (a, e, i, o, or u), append "ma" to the end of the word.
// For example, the word 'apple' becomes 'applema'.
//
// If a word begins with a consonant (i.e. not a vowel),
// remove the first letter and append it to the end, then add "ma".
// For example, the word "goat" becomes "oatgma".
//
// Add one letter 'a' to the end of each word per its word index in the sentence, starting with 1.
// For example, the first word gets "a" added to the end,
// the second word gets "aa" added to the end and so on.
//
//
// Return the final sentence representing the conversion from S to Goat Latin.
//
//
//
// Example 1:
//
//
//Input: "I speak Goat Latin"
//Output: "Imaa peaksmaaa oatGmaaaa atinLmaaaaa"
//
//
// Example 2:
//
//
//Input: "The quick brown fox jumped over the lazy dog"
//Output: "heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetm
//aaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa"
//
//
//
//
// Notes:
//
//
// S contains only uppercase, lowercase and spaces. Exactly one space between ea
//ch word.
// 1 <= S.length <= 150.
//
// Related Topics String
// 👍 319 👎 648


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:1 ms,击败了100.00% 的Java用户
  //  内存消耗:37.7 MB,击败了91.69% 的Java用户
  public boolean isVowel(char c) {
    return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E'
        || c == 'I' || c == 'O' || c == 'U';
  }

  public String toGoatLatin(String S) {
    String[] arr = S.split(" ");
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < arr.length; i++) {
      char firstC = arr[i].charAt(0);
      if (!isVowel(firstC)) {
        sb.append(arr[i].substring(1)).append(firstC);
      } else {
        sb.append(arr[i]);
      }
      sb.append("ma");
      for (int j = 0; j < i + 1; j++) {
        sb.append('a');
      }
      sb.append(' ');
    }
    sb.deleteCharAt(sb.length() - 1);
    return sb.toString();
  }
}
//leetcode submit region end(Prohibit modification and deletion)

