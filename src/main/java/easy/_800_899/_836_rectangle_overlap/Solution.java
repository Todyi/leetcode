package easy._800_899._836_rectangle_overlap;

//A rectangle is represented as a list [x1, y1, x2, y2],
// where (x1, y1) are the coordinates of its bottom-left corner,
// and (x2, y2) are the coordinates of its top-right corner.
//
// Two rectangles overlap if the area of their intersection is positive.
// To be clear, two rectangles that only touch at the corner or edges do not overlap.
//
// Given two (axis-aligned) rectangles, return whether they overlap.
//
// Example 1:
//
//
//Input: rec1 = [0,0,2,2], rec2 = [1,1,3,3]
//Output: true
//
//
// Example 2:
//
//
//Input: rec1 = [0,0,1,1], rec2 = [1,0,2,1]
//Output: false
//
//
// Notes:
//
//
// Both rectangles rec1 and rec2 are lists of 4 integers.
// All coordinates in rectangles will be between -10^9 and 10^9.
//
// Related Topics Math
// 👍 731 👎 131


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:36.5 MB,击败了89.27% 的Java用户
  public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
    return !(isInIt(rec1[0], rec1[2], rec2[0], rec2[2])
        || isInIt(rec1[1], rec1[3], rec2[1], rec2[3]));
  }

  public boolean isInIt(int range0, int range1, int position0, int position1) {
    return (position0 <= range0 && position1 <= range0)
        || (range1 <= position0 && range1 <= position1);
  }
}
//leetcode submit region end(Prohibit modification and deletion)

