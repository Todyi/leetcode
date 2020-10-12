package easy._0300_0399._342_power_of_four;

//Given an integer (signed 32 bits), write a function to check whether it is a p
//ower of 4.
//
// Example 1:
//
//
//Input: 16
//Output: true
//
//
//
// Example 2:
//
//
//Input: 5
//Output: false
//
//
// Follow up: Could you solve it without loops/recursion? Related Topics Bit Man
//ipulation


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:1 ms,击败了99.95% 的Java用户
  //  内存消耗:36.6 MB,击败了6.67% 的Java用户
  public boolean isPowerOfFour(int num) {
    // If n is po2, it is only one 1 in binary(1=1,2=10,4=100,8=1000,...,pow(2,n)=1 n0)
    // 2&(2-1)=10&01=0,4&(4-1)=100%011=0,...,pow(2,n)&pow(2,n)-1=1 n0 & 0 n1=0
    // so n & (n-1) == 0 means n is po2

    // If num is power of 4(po4), then num is po2(4=2*2)
    // where num is po4 1=1,4=100,16=10000,64=1000000,256=100000000,...,pow(4,n)=1 2n0
    // num has even numbers of 0
    // so n & 0101...01 = n(po2 will make n & 0101..01 != n)
    // 01010101 01010101 01010101 01010101
    //    5   5    5   5    5   5    5   5
    if (num < 1) {
      return false;
    }
    if ((num & (num - 1)) != 0) {
      return false;
    }
    return (num & 0x55555555) == num;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

