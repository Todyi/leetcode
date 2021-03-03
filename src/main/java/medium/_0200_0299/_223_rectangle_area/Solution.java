package medium._0200_0299._223_rectangle_area;

//Find the total area covered by two rectilinear rectangles in a 2D plane.
//
// Each rectangle is defined by its bottom left corner and top right corner as shown in the figure.
//
//
//
// Example:
//
//
//Input: A = -3, B = 0, C = 3, D = 4, E = 0, F = -1, G = 9, H = 2
//Output: 45
//
// Note:
//
// Assume that the total area is never beyond the maximum possible value of int.
//
// Related Topics Math
// 👍 514 👎 852


import java.util.function.IntFunction;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:2 ms,击败了100.00% 的Java用户
  //  内存消耗:38.1 MB,击败了86.32% 的Java用户
  public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
    int abcd = (C - A) * (D - B), efgh = (G - E) * (H - F);
    if (C < E || G < A || H < B || D < F) {
      return abcd + efgh;
    }
    int a = Math.max(A, E),
        b = Math.max(B, F),
        c = Math.min(C, G),
        d = Math.min(D, H);
    return abcd + efgh - (c - a) * (d - b);
  }
}
//leetcode submit region end(Prohibit modification and deletion)

