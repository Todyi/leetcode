package easy._900_999._961_n_repeated_element_in_size_2n_array;

//In a array A of size 2N, there are N+1 unique elements,
// and exactly one of these elements is repeated N times.
//
// Return the element repeated N times.
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
//Input: [1,2,3,3]
//Output: 3
//
//
//
// Example 2:
//
//
//Input: [2,1,2,5,3,2]
//Output: 2
//
//
//
// Example 3:
//
//
//Input: [5,1,5,2,5,3,5,4]
//Output: 5
//
//
//
//
// Note:
//
//
// 4 <= A.length <= 10000
// 0 <= A[i] < 10000
// A.length is even
//
//
//
//
// Related Topics Hash Table
// 👍 486 👎 235


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:40.3 MB,击败了76.81% 的Java用户
  public int repeatedNTimes(int[] A) {
    boolean[] map = new boolean[10001];
    for (int i = 0; i < A.length; i++) {
      if (map[A[i]]) {
        return A[i];
      }
      map[A[i]] = true;
    }
    return -1;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

