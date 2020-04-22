package easy._119_pascals_triangle_ii;

//Given a non-negative index k where k ≤ 33, return the kth index row of the Pas
//cal's triangle.
//
// Note that the row index starts from 0.
//
//
//In Pascal's triangle, each number is the sum of the two numbers directly above
// it.
//
// Example:
//
//
//Input: 3
//Output: [1,3,3,1]
//
//
// Follow up:
//
// Could you optimize your algorithm to use only O(k) extra space?
// Related Topics Array


import java.util.ArrayList;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:37.1 MB,击败了6.17% 的Java用户
  public List<Integer> getRow(int rowIndex) {

    List<Integer> row = new ArrayList<>();
    if (rowIndex == 0) {
      row.add(1);
      return row;
    }
    List<Integer> lastLay = getRow(rowIndex - 1);
    for (int i = 0; i < rowIndex + 1; i++) {
      if (i == 0 || i == rowIndex) {
        row.add(1);
      } else {
        row.add(lastLay.get(i - 1) + lastLay.get(i));
      }
    }

    return row;
  }

  public static void main(String[] args) {
    System.out.println(8 >> 1);
  }
}
//leetcode submit region end(Prohibit modification and deletion)

