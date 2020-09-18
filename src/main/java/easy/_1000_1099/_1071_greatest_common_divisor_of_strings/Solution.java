package easy._1000_1099._1071_greatest_common_divisor_of_strings;

//For two strings s and t, we say "t divides s" if and only if s = t + ... + t (
//t concatenated with itself 1 or more times)
//
// Given two strings str1 and str2,
// return the largest string x such that x divides both str1 and str2.
//
//
// Example 1:
// Input: str1 = "ABCABC", str2 = "ABC"
//Output: "ABC"
// Example 2:
// Input: str1 = "ABABAB", str2 = "ABAB"
//Output: "AB"
// Example 3:
// Input: str1 = "LEET", str2 = "CODE"
//Output: ""
// Example 4:
// Input: str1 = "ABCDEF", str2 = "ABC"
//Output: ""
//
//
// Constraints:
//
//
// 1 <= str1.length <= 1000
// 1 <= str2.length <= 1000
// str1 and str2 consist of English uppercase letters.
//
// Related Topics String
// 👍 544 👎 136


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:39 MB,击败了87.52% 的Java用户
  public String gcdOfStrings(String str1, String str2) {
    char[] arr1 = str1.toCharArray();
    char[] arr2 = str2.toCharArray();
    if (str2.length() < str1.length()) {
      return gcdOfStrings(arr2, arr2.length, arr1, arr1.length);
    }
    return gcdOfStrings(arr1, arr1.length, arr2, arr2.length);
  }

  public String gcdOfStrings(char[] arr1, int arr1Len, char[] arr2, int arr2Len) {
    int arr1Idx = 0, arr2Idx = 0;
    while (arr2Idx < arr2Len) {
      if (arr1[arr1Idx++] != arr2[arr2Idx++]) {
        return "";
      } else if (arr1Idx == arr1Len) {
        arr1Idx = 0;
      }
    }
    if (arr1Idx != 0) {
      return gcdOfStrings(arr2, arr1Idx, arr1, arr1Len);
    }
    return String.valueOf(arr1, 0, arr1Len);
  }

}
//leetcode submit region end(Prohibit modification and deletion)

