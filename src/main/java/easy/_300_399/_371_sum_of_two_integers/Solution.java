package easy._300_399._371_sum_of_two_integers;

//Calculate the sum of two integers a and b, but you are not allowed to use the operator + and -.
//
//
// Example 1:
//
//
//Input: a = 1, b = 2
//Output: 3
//
//
//
// Example 2:
//
//
//Input: a = -2, b = 3
//Output: 1
//
//
//
// Related Topics Bit Manipulation


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:36.3 MB,击败了6.67% 的Java用户
  public int getSum(int a, int b) {
    // a^b is sum without carry, a & b << 1 is carry, just 'add' when carry is not 0

    //1 0001
    //2 0010
    //1+2=3 0011
    // sum 1^2 = 0011, carry (1&2)<<1 = 0000

    //1 0001
    //3 0011
    //1+3=4 0100
    // sum=1^3 = 0010, carry=(1&3)<<1 = 0010
    // sum=sum ^ carry = 0000, carry=(sum & carry) << 1 = 0100
    // sum=sum ^ carry = 0100, carry=(sum & carry) << 1 = 0000

    int sum = a ^ b;
    int carry = (a & b) << 1;
    while (0 != carry) {
      a = sum;
      b = carry;
      sum = a ^ b;
      carry = (a & b) << 1;
    }

    return sum;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

