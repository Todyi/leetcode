package easy._1300_1399._1399_count_largest_group;

//Given an integer n. Each number from 1 to n is grouped according to the sum of its digits.
//
// Return how many groups have the largest size.
//
//
// Example 1:
//
//
//Input: n = 13
//Output: 4
//Explanation: There are 9 groups in total, they are grouped according sum of its digits
// of numbers from 1 to 13:
//[1,10], [2,11], [3,12], [4,13], [5], [6], [7], [8], [9]. There are 4 groups with largest size.
//
//
// Example 2:
//
//
//Input: n = 2
//Output: 2
//Explanation: There are 2 groups [1], [2] of size 1.
//
//
// Example 3:
//
//
//Input: n = 15
//Output: 6
//
//
// Example 4:
//
//
//Input: n = 24
//Output: 5
//
//
//
// Constraints:
//
//
// 1 <= n <= 10^4
//
// Related Topics Array
// 👍 126 👎 289


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  Runtime: 2 ms, faster than 100.00% of Java online submissions for Count Largest Group.
  //  Memory Usage: 35.7 MB, less than 98.42% of Java online submissions for Count Largest Group.
  public int countLargestGroup(int n) {
    //1   [1]
    //...
    //9   [1,2,3,4,...,9]
    //10  [1-10,2,3,...,9]
    //11  [1-10,2-11,3,...,9]
    //12  [1-10,2-11,3-12,...,9]
    //...
    //15  [1-10,2-11,3-12,4-13,5-14,6-15,7,8,9]
    //19  [1-10,2-11,3-12,4-13,...,9-18,10-19]
    //20  [1-10,2-11-20,3-12,4-13,...,9-18,10-19]
    //24  [1-10,2-11-20,3-12-21,4-13-22,5-14-23,6-15-24,...,9-18,10-19]
    if (n < 10) {
      return n;
    }
    int[] map = new int[37];
    int maxCount = map[1], res = 0, sum = 0;
    for (int i = 1; i <= n; i++) {
      if (i % 10 == 0) {
        sum = digitsSum(i);
      } else {
        sum++;
      }
      if (maxCount < ++map[sum]) {
        maxCount = map[sum];
      }
    }
    for (int i = 1; i < 37; i++) {
      if (maxCount == map[i]) {
        res++;
      }
    }
    return res;
  }

  public int digitsSum(int n) {
    int digitsSum = 0;
    while (0 < n) {
      digitsSum += n % 10;
      n /= 10;
    }
    return digitsSum;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

