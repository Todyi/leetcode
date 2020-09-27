package easy._1200_1299._1266_minimum_time_visiting_all_points;

//On a plane there are n points with integer coordinates points[i] = [xi, yi].
// Your task is to find the minimum time in seconds to visit all points.
//
// You can move according to the next rules:
//
//
// In one second always you can either move vertically, horizontally by one unit or diagonally
// (it means to move one unit vertically and one unit horizontally in one second).
// You have to visit the points in the same order as they appear in the array.
//
//
//
// Example 1:
//
//
//Input: points = [[1,1],[3,4],[-1,0]]
//Output: 7
//Explanation: One optimal path is
// [1,1] -> [2,2] -> [3,3] -> [3,4] -> [2,3] -> [1,2] -> [0,1] -> [-1,0]
//Time from [1,1] to [3,4] = 3 seconds
//Time from [3,4] to [-1,0] = 4 seconds
//Total time = 7 seconds
//
// Example 2:
//
//
//Input: points = [[3,2],[-2,2]]
//Output: 5
//
//
//
// Constraints:
//
//
// points.length == n
// 1 <= n <= 100
// points[i].length == 2
// -1000 <= points[i][0], points[i][1] <= 1000
//
// Related Topics Array Geometry
// 👍 502 👎 88


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:1 ms,击败了50.53% 的Java用户
  //  内存消耗:40.5 MB,击败了27.32% 的Java用户
  public int minTimeToVisitAllPoints(int[][] points) {
    int count = 0, distanceX, distanceY;
    int[] prePoint = points[0];
    for (int[] point : points) {
      distanceX = Math.abs(point[0] - prePoint[0]);
      distanceY = Math.abs(point[1] - prePoint[1]);
      count += Math.max(distanceX, distanceY);
      prePoint = point;
    }
    return count;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

