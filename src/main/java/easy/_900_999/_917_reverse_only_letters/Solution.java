package easy._900_999._917_reverse_only_letters;

//Given a string S, return the "reversed" string
// where all characters that are not a letter stay in the same place,
// and all letters reverse their positions.
//
//
//
//
//
//
//
//
//
//
//
//
//
// Example 1:
//
//
//Input: "ab-cd"
//Output: "dc-ba"
//
//
//
// Example 2:
//
//
//Input: "a-bC-dEf-ghIj"
//Output: "j-Ih-gfE-dCba"
//
//
//
// Example 3:
//
//
//Input: "Test1ng-Leet=code-Q!"
//Output: "Qedo1ct-eeLg=ntse-T!"
//
//
//
//
//
// Note:
//
//
// S.length <= 100
// 33 <= S[i].ASCIIcode <= 122
// S doesn't contain \ or "
//
//
//
//
// Related Topics String
// 👍 604 👎 34


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:37.1 MB,击败了98.46% 的Java用户
  public String reverseOnlyLetters(String S) {
    char[] arr = S.toCharArray();
    int l = 0, r = arr.length - 1;
    while (l < r) {
      if (Character.isLetter(arr[l])) {
        if (Character.isLetter(arr[r])) {
          char tmp = arr[l];
          arr[l++] = arr[r];
          arr[r--] = tmp;
        } else {
          r--;
        }
      } else {
        l++;
      }
    }
    return String.valueOf(arr);
  }
}
//leetcode submit region end(Prohibit modification and deletion)

