package easy._400_499._447_number_of_boomeranges;

//Given n points in the plane that are all pairwise distinct, a "boomerang" is
// a tuple of points (i, j, k) such that the distance between i and j equals the
// distance between i and k (the order of the tuple matters).
//
// Find the number of boomerangs. You may assume that n will be at most 500 and
//coordinates of points are all in the range [-10000, 10000] (inclusive).
//
// Example:
//
//
//Input:
//[[0,0],[1,0],[2,0]]
//
//Output:
//2
//
//Explanation:
//The two boomerangs are [[1,0],[0,0],[2,0]] and [[1,0],[2,0],[0,0]]
//
//
//
// Related Topics Hash Table


import java.util.HashMap;
import java.util.Map;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:126 ms,击败了45.68% 的Java用户
  //  内存消耗:39.1 MB,击败了71.43% 的Java用户
  public int numberOfBoomerangs(int[][] points) {
    int count = 0;
    for (int i = 0; i < points.length; i++) {
      Map<Double, Integer> map = new HashMap<>();
      for (int j = 0; j < points.length; j++) {
        double distance = distance(points[i], points[j]);
        int num = map.getOrDefault(distance, 0);
        count += num * 2;
        map.put(distance, num + 1);
      }
    }
    return count;
  }

  public double distance(int[] p1, int[] p2) {
    return Math.pow(p1[0] - p2[0], 2) + Math.pow(p1[1] - p2[1], 2);//actually Math.sqrt(Math.pow(p1[0] - p2[0], 2) + Math.pow(p1[1] - p2[1], 2))
  }


}
//leetcode submit region end(Prohibit modification and deletion)

