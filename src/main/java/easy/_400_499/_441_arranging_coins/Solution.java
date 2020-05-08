package easy._400_499._441_arranging_coins;

//You have a total of n coins that you want to form in a staircase shape, where
//every k-th row must have exactly k coins.
//
// Given n, find the total number of full staircase rows that can be formed.
//
// n is a non-negative integer and fits within the range of a 32-bit signed integer.
//
// Example 1:
//
//n = 5
//
//The coins can form the following rows:
//¤
//¤ ¤
//¤ ¤
//
//Because the 3rd row is incomplete, we return 2.
//
//
//
// Example 2:
//
//n = 8
//
//The coins can form the following rows:
//¤
//¤ ¤
//¤ ¤ ¤
//¤ ¤
//
//Because the 4th row is incomplete, we return 3.
//
// Related Topics Math Binary Search


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:1 ms,击败了100.00% 的Java用户
  //  内存消耗:37 MB,击败了5.26% 的Java用户
  public int arrangeCoins(int n) {
    //1+2+3+...+k = k(k+1)/2 = n
    //=>k = Math.sqrt(2n+1/4)-1/2
    long num = Long.valueOf(n);
    Double k = Math.sqrt(2 * num + 0.25) - 0.5;
    return k.intValue();
  }
}
//leetcode submit region end(Prohibit modification and deletion)

