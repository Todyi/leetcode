package easy._700_799._733_flood_fill;

//
//An image is represented by a 2-D array of integers,
// each integer representing the pixel value of the image (from 0 to 65535).
//
//Given a coordinate (sr, sc) representing the starting pixel (row and column) of the flood fill,
// and a pixel value newColor, "flood fill" the image.
//
//To perform a "flood fill", consider the starting pixel,
// plus any pixels connected 4-directionally
// to the starting pixel of the same color as the starting pixel,
// plus any pixels connected 4-directionally to those pixels
// (also with the same color as the starting pixel), and so on.
// Replace the color of all of the aforementioned pixels with the newColor.
//
//At the end, return the modified image.
//
// Example 1:
//
//Input:
//image = [[1,1,1],[1,1,0],[1,0,1]]
//sr = 1, sc = 1, newColor = 2
//Output: [[2,2,2],[2,2,0],[2,0,1]]
//Explanation:
//From the center of the image (with position (sr, sc) = (1, 1)), all pixels connected
//by a path of the same color as the starting pixel are colored with the new color.
//Note the bottom corner is not colored 2, because it is not 4-directionally connected
// to the starting pixel.
//
//
//
// Note:
// The length of image and image[0] will be in the range [1, 50].
// The given starting pixel will satisfy 0 <= sr < image.length and 0 <= sc < image[0].length.
// The value of each color in image[i][j] and newColor will be an integer in [0, 65535].
// Related Topics Depth-first Search
// 👍 1250 👎 194


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:40.2 MB,击败了62.33% 的Java用户
  public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
    if (image[sr][sc] == newColor) {
      return image;
    }
    fill(image, sr, sc, newColor, image[sr][sc]);
    return image;
  }

  public void fill(int[][] image, int x, int y, int newColor, int oldColor) {
    image[x][y] = newColor;
    if (0 < y && image[x][y - 1] == oldColor) {
      fill(image, x, y - 1, newColor, oldColor);
    }
    if (y < image[0].length - 1 && image[x][y + 1] == oldColor) {
      fill(image, x, y + 1, newColor, oldColor);
    }
    if (0 < x && image[x - 1][y] == oldColor) {
      fill(image, x - 1, y, newColor, oldColor);
    }
    if (x < image.length - 1 && image[x + 1][y] == oldColor) {
      fill(image, x + 1, y, newColor, oldColor);
    }
  }

}
//leetcode submit region end(Prohibit modification and deletion)

