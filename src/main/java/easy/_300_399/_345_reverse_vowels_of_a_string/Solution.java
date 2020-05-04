package easy._300_399._345_reverse_vowels_of_a_string;

//Write a function that takes a string as input and reverse only the vowels of a
// string.
//
// Example 1:
//
//
//Input: "hello"
//Output: "holle"
//
//
//
// Example 2:
//
//
//Input: "leetcode"
//Output: "leotcede"
//
//
// Note:
//The vowels does not include the letter "y".
//
//
// Related Topics Two Pointers String


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:2 ms,击败了98.98% 的Java用户
  //  内存消耗:39.3 MB,击败了93.10% 的Java用户
  public String reverseVowels(String s) {
    char[] sequence = s.toCharArray();

    int start = 0;
    int end = s.length() - 1;
    while (start < end) {
      if (!isVowel(sequence[start])) {
        start++;
      } else if (isVowel(sequence[end])) {
        char tmp = sequence[start];
        sequence[start] = sequence[end];
        sequence[end] = tmp;
        start++;
        end--;
      } else {
        end--;
      }
    }

    return new String(sequence);
  }

  public boolean isVowel(char c) {
    return c - 'a' == 0
        || c - 'e' == 0
        || c - 'i' == 0
        || c - 'o' == 0
        || c - 'u' == 0
        || c - 'A' == 0
        || c - 'E' == 0
        || c - 'I' == 0
        || c - 'O' == 0
        || c - 'U' == 0;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

