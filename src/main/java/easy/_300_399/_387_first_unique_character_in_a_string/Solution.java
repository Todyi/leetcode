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
  //  执行耗时:4 ms,击败了98.36% 的Java用户
  //  内存消耗:39.4 MB,击败了51.43% 的Java用户
//  public int firstUniqChar(String s) {
//    if (s.length() == 1) {
//      return 0;
//    }
//    char[] arr = s.toCharArray();
//
//    int[] map = new int[128];
//    for (int i = 0; i < arr.length; i++) {
//      map[arr[i]]++;
//    }
//    int p = Integer.MAX_VALUE;
//    for (int i = 0; i < map.length; i++) {
//      if (1 == map[i]) {
//        p = Math.min(p, s.indexOf((char) i));
//      }
//
//    }
//
//    return p == Integer.MAX_VALUE ? -1 : p;
//  }

  //  解答成功:
  //  执行耗时:1 ms,击败了100.00% 的Java用户
  //  内存消耗:40.3 MB,击败了5.71% 的Java用户
  public int firstUniqChar(String s) {
    int p = Integer.MAX_VALUE;
    for (int i = 'a'; i <= 'z'; i++) {
      int firstP = s.indexOf(i);
      if (-1 < firstP && firstP == s.lastIndexOf(i)) {
        p = Math.min(p, firstP);
      }
    }
    return p == Integer.MAX_VALUE ? -1 : p;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

