package medium._0000_0099._011_container_with_most_water;

//Given n non-negative integers a1, a2, ..., an , where each represents a point
//at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of
// the line i is at (i, ai) and (i, 0). Find two lines, which,
// together with the x-axis forms a container, such that the container contains the most water.
//
// Notice that you may not slant the container.
//
//
// Example 1:
//
//
//Input: height = [1,8,6,2,5,4,8,3,7]
//Output: 49
//Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7].
// In this case, the max area of water (blue section) the container can contain is 49.
//
//
// Example 2:
//
//
//Input: height = [1,1]
//Output: 1
//
//
// Example 3:
//
//
//Input: height = [4,3,2,1,4]
//Output: 16
//
//
// Example 4:
//
//
//Input: height = [1,2,1]
//Output: 2
//
//
//
// Constraints:
//
//
// 2 <= height.length <= 3 * 10^4
// 0 <= height[i] <= 3 * 10^4
//
// Related Topics Array Two Pointers
// 👍 7306 👎 617


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:1 ms,击败了100.00% 的Java用户
  //  内存消耗:40.5 MB,击败了18.50% 的Java用户
  public int maxArea(int[] height) {
    int max = 0, curArea, len = height.length, l = 0, r = len - 1,lHeight,rHeight;
    while (l < r) {
      lHeight = height[l];
      rHeight = height[r];
      if (max < (curArea = (r - l) * Math.min(lHeight, rHeight))) {
        max = curArea;
      }
      if (lHeight < rHeight) {
        while (l < r && height[l] <= lHeight) {
          l++;
        }
      } else {
        while (l < r && height[r] <= rHeight) {
          r--;
        }
      }
    }
    return max;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

