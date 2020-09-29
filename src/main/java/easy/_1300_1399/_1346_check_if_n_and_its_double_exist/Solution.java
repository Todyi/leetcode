package easy._1300_1399._1346_check_if_n_and_its_double_exist;

//Given an array arr of integers, check if there exists two integers N and M
// such that N is the double of M ( i.e. N = 2 * M).
//
// More formally check if there exists two indices i and j such that :
//
//
// i != j
// 0 <= i, j < arr.length
// arr[i] == 2 * arr[j]
//
//
//
// Example 1:
//
//
//Input: arr = [10,2,5,3]
//Output: true
//Explanation: N = 10 is the double of M = 5,that is, 10 = 2 * 5.
//
//
// Example 2:
//
//
//Input: arr = [7,1,14,11]
//Output: true
//Explanation: N = 14 is the double of M = 7,that is, 14 = 2 * 7.
//
//
// Example 3:
//
//
//Input: arr = [3,1,7,11]
//Output: false
//Explanation: In this case does not exist N and M, such that N = 2 * M.
//
//
//
// Constraints:
//
//
// 2 <= arr.length <= 500
// -10^3 <= arr[i] <= 10^3
//
// Related Topics Array
// 👍 214 👎 35


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
  
  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:38.9 MB,击败了88.24% 的Java用户
  public boolean checkIfExist(int[] arr) {
    boolean[] map = new boolean[2001];
    for (int i = 0; i < arr.length; i++) {
      int n = arr[i];
      if (-1001 < n * 2 && n * 2 < 1001 && map[n * 2 + 1000]) {
        return true;
      }
      if ((n & 1) == 0 && map[n / 2 + 1000]) {
        return true;
      }
      map[n + 1000] = true;
    }

    return false;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

