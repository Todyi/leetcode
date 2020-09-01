package easy._900_999._989_add_to_array_form_of_integer;

//For a non-negative integer X, the array-form of X is an array of its digits in left to right order.
// For example, if X = 1231, then the array form is [1,2,3,1].
//
// Given the array-form A of a non-negative integer X, return the array-form of the integer X+K.
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
//Input: A = [1,2,0,0], K = 34
//Output: [1,2,3,4]
//Explanation: 1200 + 34 = 1234
//
//
//
// Example 2:
//
//
//Input: A = [2,7,4], K = 181
//Output: [4,5,5]
//Explanation: 274 + 181 = 455
//
//
//
// Example 3:
//
//
//Input: A = [2,1,5], K = 806
//Output: [1,0,2,1]
//Explanation: 215 + 806 = 1021
//
//
//
// Example 4:
//
//
//Input: A = [9,9,9,9,9,9,9,9,9,9], K = 1
//Output: [1,0,0,0,0,0,0,0,0,0,0]
//Explanation: 9999999999 + 1 = 10000000000
//
//
//
//
// Note：
//
//
// 1 <= A.length <= 10000
// 0 <= A[i] <= 9
// 0 <= K <= 10000
// If A.length > 1, then A[0] != 0
//
//
//
//
// Related Topics Array
// 👍 374 👎 66


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:2 ms,击败了100.00% 的Java用户
  //  内存消耗:41 MB,击败了64.91% 的Java用户
  public List<Integer> addToArrayForm(int[] A, int K) {
    int carry = 0, i = A.length - 1, tmp;
    List<Integer> res = new ArrayList<>();
    Stack<Integer> stack = new Stack<>();
    while (0 < carry || 0 < K) {
      tmp = K % 10 + carry;
      if (i < 0) {
        carry = tmp / 10;
        stack.push(tmp % 10);
      } else {
        tmp += A[i];
        carry = tmp / 10;
        A[i--] = tmp % 10;
      }
      K /= 10;
    }
    while (!stack.isEmpty()) {
      res.add(stack.pop());
    }

    for (int num : A) {
      res.add(num);
    }
    return res;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

