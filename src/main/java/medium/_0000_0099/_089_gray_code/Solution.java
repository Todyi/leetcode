package medium._0000_0099._089_gray_code;

//The gray code is a binary numeral system where two successive values differ in only one bit.
//
// Given a non-negative integer n representing the total number of bits in the code,
// print the sequence of gray code. A gray code sequence must begin with 0.
//
// Example 1: 
//
// 
//Input:2
//Output:[0,1,3,2]
//Explanation:
//00 - 0
//01 - 1
//11 - 3
//10 - 2
//
//For a given n, a gray code sequence may not be uniquely defined.
//For example, [0,2,3,1] is also a valid gray code sequence.
//
//00 - 0
//10 - 2
//11 - 3
//01 - 1
// 
//
// Example 2: 
//
// 
//Input:0
//Output:[0]
//Explanation: We define the gray code sequence to begin with 0.
//            A gray code sequence of n has size = 2^n, which for n = 0 the size is 2^0 = 1.
//            Therefore, for n = 0 the gray code sequence is [0].
// 
// Related Topics Backtracking 
// 👍 731 👎 1675


import java.util.ArrayList;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:37.2 MB,击败了51.77% 的Java用户
  public List<Integer> grayCode(int n) {
    //0 0
    //1 0,1
    //2 00,01,11,10
    //3 000,001,011,010,
    //  100,101,111,110,<<<
    if (n == 0) {
      List<Integer> result = new ArrayList<>();
      result.add(0);
      return result;
    }
    List<Integer> result = new ArrayList<>();
    List<Integer> last = grayCode(n - 1);
    result.addAll(last);
    int l = 1 << (n-1);
    for (int i = last.size() - 1; i > -1; i--) {
      result.add(l | last.get(i));
    }
    return result;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

