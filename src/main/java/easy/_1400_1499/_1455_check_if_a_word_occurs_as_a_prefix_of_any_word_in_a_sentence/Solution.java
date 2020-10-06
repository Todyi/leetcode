package easy._1400_1499._1455_check_if_a_word_occurs_as_a_prefix_of_any_word_in_a_sentence;

//Given a sentence that consists of some words separated by a single space, and a searchWord.
//
// You have to check if searchWord is a prefix of any word in sentence.
//
// Return the index of the word in sentence where searchWord is a prefix of this word (1-indexed).
//
// If searchWord is a prefix of more than one word,
// return the index of the first word (minimum index). If there is no such word return -1.
//
// A prefix of a string S is any leading contiguous substring of S.
//
//
// Example 1:
//
//
//Input: sentence = "i love eating burger", searchWord = "burg"
//Output: 4
//Explanation: "burg" is prefix of "burger" which is the 4th word in the sentence.
//
//
// Example 2:
//
//
//Input: sentence = "this problem is an easy problem", searchWord = "pro"
//Output: 2
//Explanation: "pro" is prefix of "problem" which is the 2nd and the 6th word in the sentence,
// but we return 2 as it's the minimal index.
//
//
// Example 3:
//
//
//Input: sentence = "i am tired", searchWord = "you"
//Output: -1
//Explanation: "you" is not a prefix of any word in the sentence.
//
//
// Example 4:
//
//
//Input: sentence = "i use triple pillow", searchWord = "pill"
//Output: 4
//
//
// Example 5:
//
//
//Input: sentence = "hello from the other side", searchWord = "they"
//Output: -1
//
//
//
// Constraints:
//
//
// 1 <= sentence.length <= 100
// 1 <= searchWord.length <= 10
// sentence consists of lowercase English letters and spaces.
// searchWord consists of lowercase English letters.
//
// Related Topics String
// 👍 192 👎 5


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  Runtime: 0 ms, faster than 100.00% of Java online submissions for Check If a Word Occurs As a Prefix of Any Word in a Sentence.
  //  Memory Usage: 37 MB, less than 82.07% of Java online submissions for Check If a Word Occurs As a Prefix of Any Word in a Sentence.
  public int isPrefixOfWord(String sentence, String searchWord) {
    char[] arr = sentence.toCharArray();
    char[] wordArr = searchWord.toCharArray();
    int res = 1, len = arr.length, wordLen = wordArr.length, wordIdx = 0;
    boolean newWord = true;
    for (int i = 0; i < len; i++) {
      if (wordIdx == wordLen) {
        return res;
      }
      if (arr[i] == ' ') {
        res++;
        wordIdx = 0;
        newWord = true;
      } else if (arr[i] != wordArr[wordIdx]) {
        wordIdx = 0;
        newWord = false;
      } else if (newWord) {
        wordIdx++;
      }
    }
    if (wordIdx == wordLen) {
      return res;
    }
    return -1;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

