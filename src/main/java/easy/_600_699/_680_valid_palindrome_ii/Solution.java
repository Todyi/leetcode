package easy._600_699._680_valid_palindrome_ii;

//
//Given a non-empty string s, you may delete at most one character.
// Judge whether you can make it a palindrome.
//
//
// Example 1:
//
//Input: "aba"
//Output: True
//
//
//
// Example 2:
//
//Input: "abca"
//Output: True
//Explanation: You could delete the character 'c'.
//
//
//
// Note:
//
// The string will only contain lowercase characters a-z.
//The maximum length of the string is 50000.
//
// Related Topics String


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:5 ms,击败了92.67% 的Java用户
  //  内存消耗:39.6 MB,击败了86.11% 的Java用户
  public boolean validPalindrome(String s) {
    char[] arr = s.toCharArray();
    int l = 0, r = arr.length - 1;
    while (l < r) {
      if (arr[l] != arr[r]) {
        return validPalindrome(arr, l + 1, r) || validPalindrome(arr, l, r - 1);
      }
      l++;
      r--;
    }
    return true;
  }

  public boolean validPalindrome(char[] arr, int l, int r) {
    while (l < r) {
      if (arr[l] != arr[r]) {
        return false;
      }
      l++;
      r--;
    }
    return true;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

