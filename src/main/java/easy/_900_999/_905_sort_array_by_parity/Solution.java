package easy._900_999._905_sort_array_by_parity;

//Given an array A of non-negative integers,
// return an array consisting of all the even elements of A,
// followed by all the odd elements of A.
//
// You may return any answer array that satisfies this condition.
//
//
//
//
// Example 1:
//
//
//Input: [3,1,2,4]
//Output: [2,4,3,1]
//The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
//
//
//
//
// Note:
//
//
// 1 <= A.length <= 5000
// 0 <= A[i] <= 5000
//
//
// Related Topics Array
// 👍 1209 👎 77


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:1 ms,击败了99.63% 的Java用户
  //  内存消耗:45.7 MB,击败了24.76% 的Java用户
  public int[] sortArrayByParity(int[] A) {
    int j = 1;
    for (int i = 0; i < A.length; i++) {
      if (A[i] % 2 == 1) {
        for (j = j < i + 1 ? i + 1 : j; j < A.length; j++) {
          if (A[j] % 2 == 0) {
            int tmp = A[j];
            A[j] = A[i];
            A[i] = tmp;
            break;
          }
          if (j == A.length - 1) {
            return A;
          }
        }
      }
    }
    return A;
  }
}
//leetcode submit region end(Prohibit modification and deletion)
