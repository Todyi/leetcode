package easy._0400_0499._475_heaters;

//Winter is coming! Your first job during the contest is to design a standard heater with fixed warm radius to warm all the houses.
//
// Now, you are given positions of houses and heaters on a horizontal line, find
// out minimum radius of heaters so that all houses could be covered by those heaters.
//
// So, your input will be the positions of houses and heaters seperately,
// and your expected output will be the minimum radius standard of heaters.
//
// Note:
//
//
// Numbers of houses and heaters you are given are non-negative and will not exceed 25000.
// Positions of houses and heaters you are given are non-negative and will not exceed 10^9.
// As long as a house is in the heaters' warm radius range, it can be warmed.
// All the heaters follow your radius standard and the warm radius will the same.
//
//
//
//
// Example 1:
//
//
//Input: [1,2,3],[2]
//Output: 1
//Explanation: The only heater was placed in the position 2, and if we use the radius 1 standard,
// then all the houses can be warmed.
//
//
//
//
// Example 2:
//
//
//Input: [1,2,3,4],[1,4]
//Output: 1
//Explanation: The two heater was placed in the position 1 and 4. We need to use radius 1 standard,
// then all the houses can be warmed.
//
//
//
// Related Topics Binary Search


import java.util.Arrays;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:6 ms,击败了99.88% 的Java用户
  //  内存消耗:42.7 MB,击败了30.77% 的Java用户
  public int findRadius(int[] houses, int[] heaters) {
    Arrays.sort(houses);
    Arrays.sort(heaters);
    int maxRadius = Integer.MIN_VALUE;
    int j = 0;
    for (int i : houses) {
      // heater[j] - heater[j+1] <= i + i -> i - heater[j] <= heater[j+1] - i
      // which means heater[j+1] is closer than heater[j] to i(house[n])
      while (j < heaters.length - 1 && heaters[j] + heaters[j + 1] <= (i << 1)) {
        j++;
      }
      maxRadius = Math.max(maxRadius, Math.abs(heaters[j] - i));
    }
    return maxRadius;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

