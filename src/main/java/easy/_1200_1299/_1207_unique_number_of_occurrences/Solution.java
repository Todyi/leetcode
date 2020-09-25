package easy._1200_1299._1207_unique_number_of_occurrences;

//Given an array of integers arr, write a function that returns true 
// if and only if the number of occurrences of each value in the array is unique. 
//
// 
// Example 1: 
//
// 
//Input: arr = [1,2,2,1,1,3]
//Output: true
//Explanation:The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values
// have the same number of occurrences. 
//
// Example 2: 
//
// 
//Input: arr = [1,2]
//Output: false
// 
//
// Example 3: 
//
// 
//Input: arr = [-3,0,1,-3,1,1,1,-3,10,0]
//Output: true
// 
//
// 
// Constraints: 
//
// 
// 1 <= arr.length <= 1000 
// -1000 <= arr[i] <= 1000 
// 
// Related Topics Hash Table 
// 👍 477 👎 21


import java.util.Arrays;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:1 ms,击败了99.83% 的Java用户
  //  内存消耗:38.8 MB,击败了31.05% 的Java用户
//  public boolean uniqueOccurrences(int[] arr) {
//    int[] map = new int[2001];
//    for (int i : arr) {
//      map[i + 1000]++;
//    }
//
//    boolean[] uniqueMap = new boolean[arr.length];
//    for (int i : map) {
//      if (0 < i) {
//        if (!uniqueMap[i]) {
//          uniqueMap[i] = true;
//        } else {
//          return false;
//        }
//      }
//    }
//    return true;
//  }

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:37.3 MB,击败了89.50% 的Java用户
  public boolean uniqueOccurrences(int[] arr) {
    Arrays.sort(arr);
    int count = 0, cur = arr[0];
    boolean[] uniqueMap = new boolean[arr.length];
    for (int i : arr) {
      if (i != cur) {
        if (!uniqueMap[count]) {
          uniqueMap[count] = true;
        } else {
          return false;
        }
        cur = i;
        count = 1;
      } else {
        count++;
      }
    }
    return !uniqueMap[count];
  }
}
//leetcode submit region end(Prohibit modification and deletion)

