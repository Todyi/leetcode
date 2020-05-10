package easy._400_499._461_hamming_distance;

//The Hamming distance between two integers is the number of positions
// at which the corresponding bits are different.
//
// Given two integers x and y, calculate the Hamming distance.
//
// Note:
//0 ≤ x, y < 231.
//
//
// Example:
//
//Input: x = 1, y = 4
//
//Output: 2
//
//Explanation:
//1   (0 0 0 1)
//4   (0 1 0 0)
//       ↑   ↑
//
//The above arrows point to positions where the corresponding bits are different
//.
//
// Related Topics Bit Manipulation


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:38.3 MB,击败了5.09% 的Java用户
  public int hammingDistance(int x, int y) {
    return Integer.bitCount(x ^ y);
  }
}
//leetcode submit region end(Prohibit modification and deletion)

