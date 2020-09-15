package easy._1000_1099._1051_height_checker;

//Students are asked to stand in non-decreasing order of heights for an annual photo.
//
// Return the minimum number of students that must move in order
// for all students to be standing in non-decreasing order of height.
//
// Notice that when a group of students is selected
// they can reorder in any possible way between themselves
// and the non selected students remain on their seats.
//
//
//
// Example 1:
//
//
//Input: heights = [1,1,4,2,1,3]
//Output: 3
//Explanation:
//Current array : [1,1,4,2,1,3]
//Target array  : [1,1,1,2,3,4]
//On index 2 (0-based) we have 4 vs 1 so we have to move this student.
//On index 4 (0-based) we have 1 vs 3 so we have to move this student.
//On index 5 (0-based) we have 3 vs 4 so we have to move this student.
//
//
// Example 2:
//
//
//Input: heights = [5,1,2,3,4]
//Output: 5
//
//
// Example 3:
//
//
//Input: heights = [1,2,3,4,5]
//Output: 0
//
//
//
// Constraints:
//
//
// 1 <= heights.length <= 100
// 1 <= heights[i] <= 100
//
// Related Topics Array
// 👍 285 👎 1492


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:39.5 MB,击败了6.73% 的Java用户
  public int heightChecker(int[] heights) {
    int[] heightMap = new int[101];
    int wrongPlaceCount = 0, heightIdx = 0;
    for (int height : heights) {
      heightMap[height]++;
      if (heightIdx < height) {
        heightIdx = height;
      }
    }
    for (int i = heights.length - 1; i >= 0; i--) {
      if (heights[i] != heightIdx) {
        wrongPlaceCount++;
      }
      if (--heightMap[heightIdx] == 0) {
        heightIdx = find(heightMap, heightIdx - 1);
      }
    }
    return wrongPlaceCount;
  }

  public int find(int[] heightMap, int height) {
    while (0 < height && heightMap[height] == 0) {
      height--;
    }
    return height;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

