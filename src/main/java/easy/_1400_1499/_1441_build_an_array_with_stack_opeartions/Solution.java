package easy._1400_1499._1441_build_an_array_with_stack_opeartions;

//Given an array target and an integer n. In each iteration, you will read a number
// from list = {1,2,3..., n}.
//
// Build the target array using the following operations:
//
//
// Push: Read a new element from the beginning list, and push it in the array.
// Pop: delete the last element of the array.
// If the target array is already built, stop reading more elements.
//
//
// You are guaranteed that the target array is strictly increasing,
// only containing numbers between 1 to n inclusive.
//
// Return the operations to build the target array.
//
// You are guaranteed that the answer is unique.
//
//
// Example 1:
//
//
//Input: target = [1,3], n = 3
//Output: ["Push","Push","Pop","Push"]
//Explanation:
//Read number 1 and automatically push in the array -> [1]
//Read number 2 and automatically push in the array then Pop it -> [1]
//Read number 3 and automatically push in the array -> [1,3]
//
//
// Example 2:
//
//
//Input: target = [1,2,3], n = 3
//Output: ["Push","Push","Push"]
//
//
// Example 3:
//
//
//Input: target = [1,2], n = 4
//Output: ["Push","Push"]
//Explanation: You only need to read the first 2 numbers and stop.
//
//
// Example 4:
//
//
//Input: target = [2,3,4], n = 4
//Output: ["Push","Pop","Push","Push","Push"]
//
//
//
// Constraints:
//
//
// 1 <= target.length <= 100
// 1 <= target[i] <= 100
// 1 <= n <= 100
// target is strictly increasing.
//
// Related Topics Stack
// 👍 184 👎 261


import java.util.ArrayList;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:38.7 MB,击败了100.00% 的Java用户
  public List<String> buildArray(int[] target, int n) {
    List<String> res = new ArrayList<>();
    int idx = 1;
    for (int i : target) {
      for (; idx < i; idx++) {
        res.add("Push");
        res.add("Pop");
      }
      res.add("Push");
      idx++;
    }

    return res;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

