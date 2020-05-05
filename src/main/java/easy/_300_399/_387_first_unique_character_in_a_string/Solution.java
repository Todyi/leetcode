package easy._300_399._387_first_unique_character_in_a_string;

//
//Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.
//
// Examples:
//
//s = "leetcode"
//return 0.
//
//s = "loveleetcode",
//return 2.
//
//
//
//
//Note: You may assume the string contain only lowercase letters.
// Related Topics Hash Table String


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:22 ms,击败了53.79% 的Java用户
  //  内存消耗:40 MB,击败了6.43% 的Java用户
  public int firstUniqChar(String s) {
    if (s.length() == 1) {
      return 0;
    }
    char[] arr = s.toCharArray();
    boolean[] map = new boolean[arr.length];
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] == arr[j]) {
          map[i] = true;
          map[j] = true;
          break;
        }
      }
    }
    for (int i = 0; i < map.length; i++) {
      if (!map[i]) {
        return i;
      }
    }

    return -1;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

