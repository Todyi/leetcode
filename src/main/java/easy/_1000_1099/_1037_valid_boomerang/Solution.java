package easy._1000_1099._1037_valid_boomerang;

//A boomerang is a set of 3 points that are all distinct and not in a straight line.
//
// Given a list of three points in the plane, return whether these points are a boomerang.
//
//
//
// Example 1:
//
//
//Input: [[1,1],[2,3],[3,2]]
//Output: true
//
//
//
// Example 2:
//
//
//Input: [[1,1],[2,2],[3,3]]
//Output: false
//
//
//
//
// Note:
//
//
// points.length == 3
// points[i].length == 2
// 0 <= points[i][j] <= 100
//
//
//
//
// Related Topics Math
// 👍 114 👎 234


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:37.2 MB,击败了60.61% 的Java用户
  public boolean isBoomerang(int[][] points) {
    if (isSamePoint(points[0], points[1]) || isSamePoint(points[0], points[2]) || isSamePoint(
        points[1], points[2])) {
      return false;
    }

    float slopeAB = Float.valueOf(points[1][1] - points[0][1]) / (points[1][0] - points[0][0]);
    float slopeBC = Float.valueOf(points[2][1] - points[1][1]) / (points[2][0] - points[1][0]);
    float slopeAC = Float.valueOf(points[2][1] - points[0][1]) / (points[2][0] - points[0][0]);
    return slopeAB != slopeBC && slopeAB != slopeAC;
  }

  public boolean isSamePoint(int[] pointA, int[] pointB) {
    if (pointA[0] == pointB[0] && pointA[1] == pointB[1]) {
      return true;
    }
    return false;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

