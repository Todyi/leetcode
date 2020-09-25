package easy._1200_1299._1217_minimum_cost_to_move_chips_to_the_same_position;

//We have n chips, where the position of the ith chip is position[i].
//
// We need to move all the chips to the same position.
// In one step, we can change the position of the ith chip from position[i] to:
//
//
// position[i] + 2 or position[i] - 2 with cost = 0.
// position[i] + 1 or position[i] - 1 with cost = 1.
//
//
// Return the minimum cost needed to move all the chips to the same position.
//
//
// Example 1:
//
//
//Input: position = [1,2,3]
//Output: 1
//Explanation: First step: Move the chip at position 3 to position 1 with cost =
// 0.
//Second step: Move the chip at position 2 to position 1 with cost = 1.
//Total cost is 1.
//
//
// Example 2:
//
//
//Input: position = [2,2,2,3,3]
//Output: 2
//Explanation: We can move the two chips at position 3 to position 2.
// Each move has cost = 1. The total cost = 2.
//
//
// Example 3:
//
//
//Input: position = [1,1000000000]
//Output: 1
//
//
//
// Constraints:
//
//
// 1 <= position.length <= 100
// 1 <= position[i] <= 10^9
//
// Related Topics Array Math Greedy
// 👍 230 👎 933


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:36.9 MB,击败了76.66% 的Java用户
  public int minCostToMoveChips(int[] position) {
    // position[i] + 2 or position[i] - 2 with cost = 0.
    // position[i] + 1 or position[i] - 1 with cost = 1.
    // we can move every odd num to 1 and even num to 0 with 0 cost
    // and just move the less num(1to0 or 0to1)

    int evenNum = 0;
    for (int i : position) {
      if ((i & 1) == 0) {
        evenNum++;
      }
    }
    return Math.min(position.length - evenNum, evenNum);
  }
}
//leetcode submit region end(Prohibit modification and deletion)

