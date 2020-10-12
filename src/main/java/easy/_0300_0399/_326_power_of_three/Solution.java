package easy._0300_0399._326_power_of_three;

//Given an integer, write a function to determine if it is a   three.
//
// Example 1:
//
//
//Input: 27
//Output: true
//
//
// Example 2:
//
//
//Input: 0
//Output: false
//
// Example 3:
//
//
//Input: 9
//Output: true
//
// Example 4:
//
//
//Input: 45
//Output: false
//
// Follow up:
//Could you do it without using any loop / recursion? Related Topics Math


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  Runtime: 10 ms, faster than 100.00% of Java online submissions for Power of Three.
  //  Memory Usage: 39.3 MB, less than 6.25% of Java online submissions for Power of Three.
  public boolean isPowerOfThree(int n) {
    //if n is power of 3,exist k=m/3, k is also power of 3.
    //So find the biggest num x which is power of 3 in Integer field. If x % n == 0, then n is power of 3 too(x=3*3*...*3)
    //if 3^k = x ,k = log3 x = ln x/ln 3

    if (n < 1) {
      return false;
    }
    //Double maxPowerOf3 = Math.log(Integer.MAX_VALUE)/Math.log(3);
    //Double maxNumPowerOf3 = Math.pow(3,maxPowerOf3.intValue());
    //System.out.println(maxPowerOf3.intValue());                   //19
    //System.out.println(maxNumPowerOf3.intValue());                //1162261467
    return 1162261467 % n == 0;
  }

  public static void main(String[] args) {

  }
}
//leetcode submit region end(Prohibit modification and deletion)

