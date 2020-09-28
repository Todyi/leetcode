package easy._1300_1399._1331_rank_transform_of_an_array;

//Given an array of integers arr, replace each element with its rank.
//
// The rank represents how large the element is. The rank has the following rules:
//
//
// Rank is an integer starting from 1.
// The larger the element, the larger the rank. If two elements are equal,
//  their rank must be the same.
// Rank should be as small as possible.
//
//
//
// Example 1:
//
//
//Input: arr = [40,10,20,30]
//Output: [4,1,2,3]
//Explanation: 40 is the largest element. 10 is the smallest. 20 is the second s
//mallest. 30 is the third smallest.
//
// Example 2:
//
//
//Input: arr = [100,100,100]
//Output: [1,1,1]
//Explanation: Same elements share the same rank.
//
//
// Example 3:
//
//
//Input: arr = [37,12,28,9,100,56,80,5,12]
//Output: [5,3,4,2,8,6,7,1,3]
//
//
//
// Constraints:
//
//
// 0 <= arr.length <= 10e5
// -10e9 <= arr[i] <= 10e9
// Related Topics Array
// 👍 296 👎 21


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:3 ms,击败了100.00% 的Java用户
  //  内存消耗:48.2 MB,击败了99.88% 的Java用户
  public int[] arrayRankTransform(int[] arr) {
    int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
    for (int i : arr) {
      if (i < min) {
        min = i;
      }
      if (max < i) {
        max = i;
      }
    }
    int[] map = new int[max - min + 1];
    for (int i : arr) {
      map[i - min]++;
    }
    int rank = 1;
    for (int i = 0; i < map.length; i++) {
      if (0 < map[i]) {
        map[i] = rank++;
      }
    }
    for (int i = 0; i < arr.length; i++) {
      arr[i] = map[arr[i] - min];
    }
    return arr;
  }

}
//leetcode submit region end(Prohibit modification and deletion)

