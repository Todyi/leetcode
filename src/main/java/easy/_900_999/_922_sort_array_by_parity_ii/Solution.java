package easy._900_999._922_sort_array_by_parity_ii;

//Given an array A of non-negative integers, half of the integers in A are odd,
//and half of the integers are even.
//
// Sort the array so that whenever A[i] is odd, i is odd; and whenever A[i] is even, i is even.
//
// You may return any answer array that satisfies this condition.
//
//
//
// Example 1:
//
//
//Input: [4,2,5,7]
//Output: [4,5,2,7]
//Explanation: [4,7,2,5], [2,5,4,7], [2,7,4,5] would also have been accepted.
//
//
//
//
// Note:
//
//
// 2 <= A.length <= 20000
// A.length % 2 == 0
// 0 <= A[i] <= 1000
//
//
//
//
// Related Topics Array Sort
// 👍 720 👎 50


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:3 ms,击败了64.43% 的Java用户
  //  内存消耗:43.8 MB,击败了41.52% 的Java用户
  public int[] sortArrayByParityII(int[] A) {
    Integer[] oddMap = new Integer[A.length];
    Integer[] evenMap = new Integer[A.length];
    boolean iEven, iValueEven;
    for (int i = 0; i < A.length; i++) {
      iEven = i % 2 == 0;
      iValueEven = A[i] % 2 == 0;
      if (iEven != iValueEven) {
        if (iEven) {
          oddMap[i] = A[i];
        } else {
          evenMap[i] = A[i];
        }
      }
    }
    int l = 0, r = A.length - 1;
    while (l < A.length && -1 < r) {
      if (oddMap[l] != null) {
        if (evenMap[r] != null) {
          A[l] = evenMap[r];
          A[r--] = oddMap[l++];
        } else {
          r--;
        }
      } else {
        l++;
      }
    }
    return A;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

