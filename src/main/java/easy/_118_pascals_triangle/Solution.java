package easy._118_pascals_triangle;

//Given a non-negative integer numRows, generate the first numRows of Pascal's t
//riangle.
//
//
//In Pascal's triangle, each number is the sum of the two numbers directly above
// it.
//
// Example:
//
//
//Input: 5
//Output:
//[
//     [1],
//    [1,1],
//   [1,2,1],
//  [1,3,3,1],
// [1,4,6,4,1]
//]
//
// Related Topics Array


import java.util.ArrayList;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:37 MB,击败了6.02% 的Java用户
  public List<List<Integer>> generate(int numRows) {
    List<List<Integer>> result = new ArrayList<>();
    if (0 < numRows) {
      List<Integer> zero = new ArrayList<>();
      zero.add(1);
      result.add(zero);
      for (int i = 2; i <= numRows; i++) {
        List<Integer> last = result.get(i - 2);
        List<Integer> thisLay = new ArrayList<>();
        for (int j = 0; j < i; j++) {
          if (j == 0 || j == i - 1) {
            thisLay.add(1);
          } else {
            thisLay.add(last.get(j - 1) + last.get(j));
          }
        }
        result.add(thisLay);
      }
    }
    return result;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

