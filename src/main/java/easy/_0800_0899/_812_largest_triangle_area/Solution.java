package easy._0800_0899._812_largest_triangle_area;

//You have a list of points in the plane.
// Return the area of the largest triangle that can be formed by any 3 of the points.
//
//
//Example:
//Input: points = [[0,0],[0,1],[1,0],[0,2],[2,0]]
//Output: 2
//Explanation:
//The five points are show in the figure below. The red triangle is the largest.
//
//
//
//
//
// Notes:
//
//
// 3 <= points.length <= 50.
// No points will be duplicated.
// -50 <= points[i][j] <= 50.
// Answers within 10^-6 of the true value will be accepted as correct.
//
//
//
// Related Topics Math
// 👍 190 👎 983


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:3 ms,击败了99.34% 的Java用户
  //  内存消耗:37.2 MB,击败了53.33% 的Java用户
  public double largestTriangleArea(int[][] points) {
    double max = Double.MIN_VALUE;
    for (int i = 0; i < points.length; i++) {
      for (int j = i + 1; j < points.length; j++) {
        for (int k = j + 1; k < points.length; k++) {
          max = Math.max(max, area(points[i], points[j], points[k]));
        }
      }
    }
    return max;
  }

  public double area(int[] i, int[] j, int[] k) {
    //X × Y = Z Y × X = -Z
    //→AB × →AC 
    //= (x1X+y1Y)×(x2X+y2Y)
    //=x1X×x2X+x1X×y2Y+y1Y×x2X+y1Y×y2Y
    //=x1x2(X×X)+x1y2(X×Y)+x2y1((Y×X))+y1y2(Y×Y)
    //=0+x1y2Z-x2y1Z+0
    //=(x1y2-x2y1)Z

    //A(x1,y1) B(x2,y2) C(x3,y3)
    //→AB(x2-x1,y2-y1) →AC(x3-x1,y3-y1)
    
    //area(A,B,C) = |→AC × →AB|/2
    return Math.abs(((j[0] - i[0]) * (k[1] - i[1]) - (j[1] - i[1]) * (k[0] - i[0])) / 2D);
  }
}
//leetcode submit region end(Prohibit modification and deletion)

