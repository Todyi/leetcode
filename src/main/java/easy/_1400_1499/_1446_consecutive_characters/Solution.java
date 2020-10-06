package easy._1400_1499._1446_consecutive_characters;

//Given a string s, the power of the string is the maximum length of a non-empty
// substring that contains only one unique character.
//
// Return the power of the string.
//
//
// Example 1:
//
//
//Input: s = "leetcode"
//Output: 2
//Explanation: The substring "ee" is of length 2 with the character 'e' only.
//
//
// Example 2:
//
//
//Input: s = "abbcccddddeeeeedcba"
//Output: 5
//Explanation: The substring "eeeee" is of length 5 with the character 'e' only.
//
//
//
// Example 3:
//
//
//Input: s = "triplepillooooow"
//Output: 5
//
//
// Example 4:
//
//
//Input: s = "hooraaaaaaaaaaay"
//Output: 11
//
//
// Example 5:
//
//
//Input: s = "tourist"
//Output: 1
//
//
//
// Constraints:
//
//
// 1 <= s.length <= 500
// s contains only lowercase English letters.
// Related Topics String
// 👍 227 👎 7


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:1 ms,击败了100.00% 的Java用户
  //  内存消耗:38.9 MB,击败了35.74% 的Java用户
  public int maxPower(String s) {
    char[] arr = s.toCharArray();
    char pre = arr[0];
    int res = 1, cur = 1;
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] == pre) {
        cur++;
      } else {
        pre = arr[i];
        cur = 1;
      }
      if (res < cur) {
        res = cur;
      }
    }
    return res;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

