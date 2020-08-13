package easy._800_899._852_peak_index_in_a_mountain_array;

//Let's call an array A a mountain if the following properties hold:
//
//
// A.length >= 3
// There exists some 0 < i < A.length - 1 such that A[0] < A[1] < ... A[i-1] < A
//[i] > A[i+1] > ... > A[A.length - 1]
//
//
// Given an array that is definitely a mountain, return any i such that A[0] < A
//[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1].
//
// Example 1:
//
//
//Input: [0,1,0]
//Output: 1
//
//
//
// Example 2:
//
//
//Input: [0,2,1,0]
//Output: 1
//
//
// Note:
//
//
// 3 <= A.length <= 10000
// 0 <= A[i] <= 10^6
// A is a mountain, as defined above.
//
// Related Topics Binary Search
// 👍 702 👎 1196


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:39.6 MB,击败了87.66% 的Java用户
  public int peakIndexInMountainArray(int[] A) {
    int max = Integer.MIN_VALUE;
    int idx = -1;
    for (int i = 0; i < A.length; i++) {
      if (max < A[i]) {
        max = A[i];
        idx = i;
      }
    }
    return idx;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

