package easy._0500_0599._575_distribute_candies;

//Given an integer array with even length,
// where different numbers in this array represent different kinds of candies.
// Each number means one candy of the corresponding kind.
// You need to distribute these candies equally in number to brother and sister.
// Return the maximum number of kinds of candies the sister could gain.
//
//
// Example 1:
//
//Input: candies = [1,1,2,2,3,3]
//Output: 3
//Explanation:
//There are three different kinds of candies (1, 2 and 3), and two candies for each kind.
//Optimal distribution: The sister has candies [1,2,3] and the brother has candies [1,2,3], too.
//The sister has three different kinds of candies.
//
//
//
// Example 2:
//
//Input: candies = [1,1,2,3]
//Output: 2
//Explanation: For example, the sister has candies [2,3] and the brother has candies [1,1].
//The sister has two different kinds of candies, the brother has only one kind of candies.
//
//
//
// Note:
//
// The length of the given array is in range [2, 10,000], and will be even.
// The number in given array is in range [-100,000, 100,000].
//
// Related Topics Hash Table


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:4 ms,击败了99.54% 的Java用户
  //  内存消耗:41 MB,击败了100.00% 的Java用户
  public int distributeCandies(int[] candies) {
    boolean[] map = new boolean[200001];
    int totalKinds = 0, half = candies.length >> 1;
    for (int i : candies) {
      if (!map[i + 100000]) {
        map[i + 100000] = true;
        totalKinds++;
      }
      if (totalKinds == half) {
        return half;
      }
    }
    return totalKinds;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

