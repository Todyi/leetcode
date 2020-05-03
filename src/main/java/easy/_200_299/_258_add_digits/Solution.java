package easy._200_299._258_add_digits;

//Given a non-negative integer num, repeatedly add all its digits until the resu
//lt has only one digit.
//
// Example:
//
//
//Input: 38
//Output: 2
//Explanation: The process is like: 3 + 8 = 11, 1 + 1 = 2.
//             Since 2 has only one digit, return it.
//
//
// Follow up:
//Could you do it without any loop/recursion in O(1) runtime? Related Topics Mat
//h


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:1 ms,击败了100.00% 的Java用户
  //  内存消耗:36.7 MB,击败了6.67% 的Java用户
  public int addDigits(int num) {
    while (9 < num) {
      num = num / 10 + num % 10;
    }
    return num;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

