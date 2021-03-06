package easy._0900_0999._944_delete_columns_to_make_sorted;

//We are given an array A of N lowercase letter strings, all of the same length.
//
//
// Now, we may choose any set of deletion indices,
// and for each string,  we delete all the characters in those indices.
//
// For example, if we have an array A = ["abcdef","uvwxyz"] and deletion indices {0, 2, 3},
// then the final array after deletions is ["bef", "vyz"],
// and the remaining columns of A are ["b","v"], ["e","y"], and ["f","z"].
// (Formally, the c-th column is [A[0][c], A[1][c], ..., A[A.length-1][c]]).
//
// Suppose we chose a set of deletion indices D such that after deletions,
// each remaining column in A is in non-decreasing sorted order.
//
// Return the minimum possible value of D.length.
//
//
// Example 1:
//
//
//Input: A = ["cba","daf","ghi"]
//Output: 1
//Explanation:
//After choosing D = {1}, each column ["c","d","g"] and ["a","f","i"] are in non
//-decreasing sorted order.
//If we chose D = {}, then a column ["b","a","h"] would not be in non-decreasing
// sorted order.
//
//
// Example 2:
//
//
//Input: A = ["a","b"]
//Output: 0
//Explanation: D = {}
//
//
// Example 3:
//
//
//Input: A = ["zyx","wvu","tsr"]
//Output: 3
//Explanation: D = {0, 1, 2}
//
//
//
// Constraints:
//
//
// 1 <= A.length <= 100
// 1 <= A[i].length <= 1000
//
// Related Topics Greedy
// 👍 167 👎 1616


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:5 ms,击败了96.75% 的Java用户
  //  内存消耗:39.6 MB,击败了83.01% 的Java用户
//  public int minDeletionSize(String[] A) {
//    int count = 0, strLen = A[0].length(), num = A.length;
//    char[][] arr = new char[num][strLen];
//
//    for (int i = 0; i < A.length; i++) {
//      arr[i] = A[i].toCharArray();
//    }
//
//    for (int idx = 0; idx < strLen; idx++) {
//      for (int i = 1; i < num; i++) {
//        if (arr[i][idx] < arr[i - 1][idx]) {
//          count++;
//          break;
//        }
//      }
//    }
//    return count;
//  }

  //  解答成功:
  //  执行耗时:3 ms,击败了100.00% 的Java用户
  //  内存消耗:39.6 MB,击败了83.01% 的Java用户
  public int minDeletionSize(String[] A) {
    int count = 0, strLen = A[0].length();

    for (int idx = 0; idx < strLen; idx++) {
      count += isDeleteColumn(A, idx);
    }
    return count;
  }

  public int isDeleteColumn(String[] A, int column) {
    int max = A[0].charAt(column), value;
    for (int i = 1; i < A.length; i++) {
      value = A[i].charAt(column);
      if (value < max) {
        return 1;
      }
      max = value;
    }
    return 0;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

