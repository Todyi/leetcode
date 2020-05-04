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
//  public String reverseVowels(String s) {
//    char[] sequence = s.toCharArray();
//
//    int start = 0;
//    int end = s.length() - 1;
//    while (start < end) {
//      if (!isVowel(sequence[start])) {
//        start++;
//      } else if (isVowel(sequence[end])) {
//        char tmp = sequence[start];
//        sequence[start] = sequence[end];
//        sequence[end] = tmp;
//        start++;
//        end--;
//      } else {
//        end--;
//      }
//    }
//
//    return new String(sequence);
//  }
//
//  public boolean isVowel(char c) {
//    return c - '' == 0
//        || c - 'e' == 0
//        || c - 'i' == 0
//        || c - 'o' == 0
//        || c - 'u' == 0
//        || c - '' == 0
//        || c - 'E' == 0
//        || c - 'I' == 0
//        || c - 'O' == 0
//        || c - 'U' == 0;
//  }

  //  解答成功:
  //  执行耗时:1 ms,击败了100.00% 的Java用户
  //  内存消耗:39.2 MB,击败了96.55% 的Java用户
  public String reverseVowels(String s) {
    int[] vowels = new int[128];
    vowels['a'] = 1;
    vowels['e'] = 1;
    vowels['i'] = 1;
    vowels['o'] = 1;
    vowels['u'] = 1;
    vowels['A'] = 1;
    vowels['E'] = 1;
    vowels['I'] = 1;
    vowels['O'] = 1;
    vowels['U'] = 1;
    char[] sequence = s.toCharArray();
    int left = 0;
    int right = sequence.length - 1;
    while (left < right) {
      if (vowels[sequence[left]] < 1) {
        left++;
      } else if (vowels[sequence[right]] < 1) {
        right--;
      } else {
        char tmp = sequence[left];
        sequence[left] = sequence[right];
        sequence[right] = tmp;
        left++;
        right--;
      }
    }
    return new String(sequence);
  }
}
//leetcode submit region end(Prohibit modification and deletion)

