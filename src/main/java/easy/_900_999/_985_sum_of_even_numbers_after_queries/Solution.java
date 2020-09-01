package easy._900_999._985_sum_of_even_numbers_after_queries;

//We have an array A of integers, and an array queries of queries.
//
// For the i-th query val = queries[i][0], index = queries[i][1], we add val to
//A[index]. Then, the answer to the i-th query is the sum of the even values of A.
//
//
// (Here, the given index = queries[i][1] is a 0-based index,
// and each query permanently modifies the array A.)
//
// Return the answer to all queries.
// Your answer array should have answer[i] as the answer to the i-th query.
//
//
//
// Example 1:
//
//
//Input: A = [1,2,3,4], queries = [[1,0],[-3,1],[-4,0],[2,3]]
//Output: [8,6,2,4]
//Explanation:
//At the beginning, the array is [1,2,3,4].
//After adding 1 to A[0], the array is [2,2,3,4], and the sum of even values is
//2 + 2 + 4 = 8.
//After adding -3 to A[1], the array is [2,-1,3,4], and the sum of even values i
//s 2 + 4 = 6.
//After adding -4 to A[0], the array is [-2,-1,3,4], and the sum of even values
//is -2 + 4 = 2.
//After adding 2 to A[3], the array is [-2,-1,3,6], and the sum of even values i
//s -2 + 6 = 4.
//
//
//
//
// Note:
//
//
// 1 <= A.length <= 10000
// -10000 <= A[i] <= 10000
// 1 <= queries.length <= 10000
// -10000 <= queries[i][0] <= 10000
// 0 <= queries[i][1] < A.length
//
// Related Topics Array
// 👍 381 👎 155


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:3 ms,击败了100.00% 的Java用户
  //  内存消耗:47.6 MB,击败了82.88% 的Java用户
  public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
    int evenSum = 0;
    int[] res = new int[queries.length];
    for (int i : A) {
      if ((i & 1) == 0) {
        evenSum += i;
      }
    }
    for (int i = 0; i < queries.length; i++) {
      if (isEven(A[queries[i][1]])) {
        if (isEven(queries[i][0])) {
          evenSum += queries[i][0];
        } else {
          evenSum -= A[queries[i][1]];
        }
      } else {
        if (!isEven(queries[i][0])) {
          evenSum += queries[i][0] + A[queries[i][1]];
        }
      }
      A[queries[i][1]] += queries[i][0];
      res[i] = evenSum;
    }

    return res;
  }

  public boolean isEven(int i) {
    return (i & 1) == 0;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

