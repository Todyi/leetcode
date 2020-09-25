package easy._1200_1299._1232_check_if_it_is_a_straight_line;

//You are given an array coordinates, coordinates[i] = [x, y],
// where [x, y] represents the coordinate of a point.
// Check if these points make a straight line in the XY plane.
//
//
//
//
// Example 1:
//
//
//
//
//Input: coordinates = [[1,2],[2,3],[3,4],[4,5],[5,6],[6,7]]
//Output: true
//
//
// Example 2:
//
//
//
//
//Input: coordinates = [[1,1],[2,2],[3,4],[4,5],[5,6],[7,7]]
//Output: false
//
//
//
// Constraints:
//
//
// 2 <= coordinates.length <= 1000
// coordinates[i].length == 2
// -10^4 <= coordinates[i][0], coordinates[i][1] <= 10^4
// coordinates contains no duplicate point.
//
// Related Topics Array Math Geometry
// 👍 406 👎 67


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:39 MB,击败了78.58% 的Java用户
  public boolean checkStraightLine(int[][] coordinates) {
    int x = coordinates[0][0], y = coordinates[0][1];
    float slope = (float) (coordinates[1][1] - y) / (float) (coordinates[1][0] - x);
    boolean notVertical = coordinates[1][0] - x != 0;
    for (int i = 2; i < coordinates.length; i++) {
      if (notVertical) {
        if ((float) (coordinates[i][1] - y) / (float) (coordinates[i][0] - x) != slope) {
          return false;
        }
      } else if (coordinates[i][0] - x != 0) {
        return false;
      }
    }
    return true;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

