package easy._1400_1499._1431_kids_with_the_greatest_number_of_candies;

//Given the array candies and the integer extraCandies,
// where candies[i] represents the number of candies that the ith kid has.
//
// For each kid check if there is a way to distribute extraCandies among the kids
// such that he or she can have the greatest number of candies among them.
// Notice that multiple kids can have the greatest number of candies.
//
//
// Example 1:
//
//
//Input: candies = [2,3,5,1,3], extraCandies = 3
//Output: [true,true,true,false,true]
//Explanation:
//Kid 1 has 2 candies and if he or she receives all extra candies (3) will have
//5 candies --- the greatest number of candies among the kids.
//Kid 2 has 3 candies and if he or she receives at least 2 extra candies will ha
//ve the greatest number of candies among the kids.
//Kid 3 has 5 candies and this is already the greatest number of candies among t
//he kids.
//Kid 4 has 1 candy and even if he or she receives all extra candies will only h
//ave 4 candies.
//Kid 5 has 3 candies and if he or she receives at least 2 extra candies will ha
//ve the greatest number of candies among the kids.
//
//
// Example 2:
//
//
//Input: candies = [4,2,1,1,2], extraCandies = 1
//Output: [true,false,false,false,false]
//Explanation: There is only 1 extra candy,
// therefore only kid 1 will have the greatest number of candies among the kids
// regardless of who takes the extra candy.
//
//
// Example 3:
//
//
//Input: candies = [12,1,12], extraCandies = 10
//Output: [true,false,true]
//
//
//
// Constraints:
//
//
// 2 <= candies.length <= 100
// 1 <= candies[i] <= 100
// 1 <= extraCandies <= 50
// Related Topics Array
// 👍 423 👎 112


import java.util.ArrayList;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:38.9 MB,击败了97.70% 的Java用户
  public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
    int max = Integer.MIN_VALUE;
    List<Boolean> res = new ArrayList<>();
    for (int candy : candies) {
      if (max < candy) {
        max = candy;
      }
    }
    for (int candy : candies) {
      if (max <= candy + extraCandies) {
        res.add(true);
      } else {
        res.add(false);
      }
    }
    return res;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

