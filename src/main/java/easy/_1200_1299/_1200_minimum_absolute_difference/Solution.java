package easy._1200_1299._1200_minimum_absolute_difference;
//Given an array of distinct integers arr,
// find all pairs of elements with the minimum absolute difference of any two elements.
//
// Return a list of pairs in ascending order(with respect to pairs), each pair [a, b] follows
//
//
// a, b are from arr
// a < b
// b - a equals to the minimum absolute difference of any two elements in arr
//
//
//
// Example 1:
//
//
//Input: arr = [4,2,1,3]
//Output: [[1,2],[2,3],[3,4]]
//Explanation: The minimum absolute difference is 1. List all pairs with difference equal to 1 in ascending order.
//
// Example 2:
//
//
//Input: arr = [1,3,6,10,15]
//Output: [[1,3]]
//
//
// Example 3:
//
//
//Input: arr = [3,8,-10,23,19,-4,-14,27]
//Output: [[-14,-10],[19,23],[23,27]]
//
//
//
// Constraints:
//
//
// 2 <= arr.length <= 10^5
// -10^6 <= arr[i] <= 10^6
//
// Related Topics Array
// 👍 375 👎 24


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  Runtime: 14 ms, faster than 99.11% of Java online submissions for Minimum Absolute Difference.
  //  Memory Usage: 50.5 MB, less than 61.19% of Java online submissions for Minimum Absolute Difference.
  public List<List<Integer>> minimumAbsDifference(int[] arr) {
    Arrays.sort(arr);
    List<List<Integer>> res = new ArrayList<>();
    int min = Integer.MAX_VALUE, tmp;
    for (int i = 0; i < arr.length - 1; i++) {
      if ((tmp = arr[i + 1] - arr[i]) < min) {
        res.clear();
        min = tmp;
        List<Integer> dis = new ArrayList<>();
        dis.add(arr[i]);
        dis.add(arr[i + 1]);
        res.add(dis);
      } else if (tmp == min) {
        List<Integer> dis = new ArrayList<>();
        dis.add(arr[i]);
        dis.add(arr[i + 1]);
        res.add(dis);
      }
    }
    return res;
  }
}
//leetcode submit region end(Prohibit modification and deletion)
