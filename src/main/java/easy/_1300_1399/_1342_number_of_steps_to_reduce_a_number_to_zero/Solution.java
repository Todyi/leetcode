package easy._1300_1399._1342_number_of_steps_to_reduce_a_number_to_zero;

//Given a non-negative integer num, return the number of steps to reduce it to zero. 
// If the current number is even, you have to divide it by 2, otherwise, 
// you have to subtract 1 from it. 
//
// 
// Example 1: 
//
// 
//Input: num = 14
//Output: 6
//Explanation:
//Step 1) 14 is even; divide by 2 and obtain 7.
//Step 2) 7 is odd; subtract 1 and obtain 6.
//Step 3) 6 is even; divide by 2 and obtain 3.
//Step 4) 3 is odd; subtract 1 and obtain 2.
//Step 5) 2 is even; divide by 2 and obtain 1.
//Step 6) 1 is odd; subtract 1 and obtain 0.
// 
//
// Example 2: 
//
// 
//Input: num = 8
//Output: 4
//Explanation:
//Step 1) 8 is even; divide by 2 and obtain 4.
//Step 2) 4 is even; divide by 2 and obtain 2.
//Step 3) 2 is even; divide by 2 and obtain 1.
//Step 4) 1 is odd; subtract 1 and obtain 0.
// 
//
// Example 3: 
//
// 
//Input: num = 123
//Output: 12
// 
//
// 
// Constraints: 
//
// 
// 0 <= num <= 10^6 
// 
// Related Topics Bit Manipulation 
// 👍 519 👎 57


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:35.8 MB,击败了97.30% 的Java用户
  public int numberOfSteps(int num) {
    return numberOfSteps(num, 0);
  }

  public int numberOfSteps(int num, int step) {
    if (num == 0) {
      return step;
    }
    if ((num & 1) == 0) {
      return numberOfSteps(num >> 1, step + 1);
    } else {
      return numberOfSteps(num - 1, step + 1);
    }
  }
}
//leetcode submit region end(Prohibit modification and deletion)

