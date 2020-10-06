package easy._1400_1499._1496_path_crossing;

//Given a string path, where path[i] = 'N', 'S', 'E' or 'W',
// each representing moving one unit north, south, east, or west, respectively.
// You start at the origin (0, 0) on a 2D plane and walk on the path specified by path.
//
// Return True if the path crosses itself at any point, that is,
// if at any time you are on a location you've previously visited. Return False otherwise.
//
//
// Example 1:
//
//
//
//
//Input: path = "NES"
//Output: false
//Explanation: Notice that the path doesn't cross any point more than once.
//
//
// Example 2:
//
//
//
//
//Input: path = "NESWW"
//Output: true
//Explanation: Notice that the path visits the origin twice.
//
//
// Constraints:
//
//
// 1 <= path.length <= 10^4
// path will only consist of characters in {'N', 'S', 'E', 'W}
//
// Related Topics String
// 👍 190 👎 6


import java.util.HashSet;
import java.util.Set;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:37.8 MB,击败了89.69% 的Java用户
  public boolean isPathCrossing(String path) {
    char[] arr = path.toCharArray();
    Set<Integer> map = new HashSet<>();
    int x = 0, y = 0;
    map.add(x + 10001 * y);
    for (char c : arr) {
      if (c == 'N') {
        y++;
      } else if (c == 'S') {
        y--;
      } else if (c == 'E') {
        x++;
      } else {
        x--;
      }
      if (map.contains(x + 10001 * y)) {
        return true;
      }
      map.add(x + 10001 * y);
    }
    return false;
  }

}
//leetcode submit region end(Prohibit modification and deletion)

