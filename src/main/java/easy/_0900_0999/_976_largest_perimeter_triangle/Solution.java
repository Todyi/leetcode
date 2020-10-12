package easy._0900_0999._976_largest_perimeter_triangle;

//Given an array A of positive lengths,
// return the largest perimeter of a triangle with non-zero area,
// formed from 3 of these lengths.
//
// If it is impossible to form any triangle of non-zero area, return 0.
//
//
//
//
//
//
//
// Example 1:
//
//
//Input: [2,1,2]
//Output: 5
//
//
//
// Example 2:
//
//
//Input: [1,2,1]
//Output: 0
//
//
//
// Example 3:
//
//
//Input: [3,2,3,4]
//Output: 10
//
//
//
// Example 4:
//
//
//Input: [3,6,2,3]
//Output: 8
//
//
//
//
// Note:
//
//
// 3 <= A.length <= 10000
// 1 <= A[i] <= 10^6
//
//
//
//
// Related Topics Math Sort
// 👍 386 👎 46


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:7 ms,击败了80.30% 的Java用户
  //  内存消耗:40.4 MB,击败了70.39% 的Java用户
//  public int largestPerimeter(int[] A) {
//    Arrays.sort(A);
//    for (int i = A.length - 1; i > 1; i--) {
//      if (A[i] < A[i - 1] + A[i - 2]) {
//        return A[i] + A[i - 1] + A[i - 2];
//      }
//    }
//    return 0;
//  }

  //  解答成功:
  //  执行耗时:1 ms,击败了100.00% 的Java用户
  //  内存消耗:39.7 MB,击败了98.98% 的Java用户
  public int largestPerimeter(int[] A) {
    moveMax(A, A.length - 1);
    moveMax(A, A.length - 2);
    moveMax(A, A.length - 3);
    for (int i = A.length - 1; i > 1; i--) {
      if (A[i] < A[i - 1] + A[i - 2]) {
        return A[i] + A[i - 1] + A[i - 2];
      }
      moveMax(A, i - 3);
    }
    return 0;
  }

  public void moveMax(int[] A, int i) {
    for (int k = i - 1; k >= 0; k--) {
      if (A[i] < A[k]) {
        int tmp = A[i];
        A[i] = A[k];
        A[k] = tmp;
      }
    }
  }


}
//leetcode submit region end(Prohibit modification and deletion)

