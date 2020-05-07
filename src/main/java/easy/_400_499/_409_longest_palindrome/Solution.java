package easy._400_499._409_longest_palindrome;

//Given a string which consists of lowercase or uppercase letters, find the length
// of the longest palindromes that can be built with those letters.
//
// This is case sensitive, for example "Aa" is not considered a palindrome here.
//
//
// Note:
//Assume the length of given string will not exceed 1,010.
//
//
// Example:
//
//Input:
//"abccccdd"
//
//Output:
//7
//
//Explanation:
//One longest palindrome that can be built is "dccaccd", whose length is 7.
//
// Related Topics Hash Table


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:1 ms,击败了100.00% 的Java用户
  //  内存消耗:37.6 MB,击败了6.67% 的Java用户
  public int longestPalindrome(String s) {
    int longest = 1;
    int[] map = new int[128];
    for (char c : s.toCharArray()) {
      map[c]++;
    }
    for (int i = 0; i < map.length; i++) {
      if (1 < map[i]) {
        longest += map[i] % 2 == 0 ? map[i] : map[i] - 1;
      }
    }
    return longest <= s.length() ? longest : s.length();
  }
}
//leetcode submit region end(Prohibit modification and deletion)

