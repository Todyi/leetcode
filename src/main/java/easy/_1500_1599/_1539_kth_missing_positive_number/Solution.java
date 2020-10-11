package easy._1500_1599._1539_kth_missing_positive_number;

//Given an array arr of positive integers sorted in a strictly increasing order,
// and an integer k. 
//
// Find the kth positive integer that is missing from this array. 
//
// 
// Example 1: 
//
// 
//Input: arr = [2,3,4,7,11], k = 5
//Output: 9
//Explanation: The missing positive integers are [1,5,6,8,9,10,12,13,...].
// The 5th missing positive integer is 9.
// 
//
// Example 2: 
//
// 
//Input: arr = [1,2,3,4], k = 2
//Output: 6
//Explanation: The missing positive integers are [5,6,7,...]. The 2nd missing positive integer is 6.
// 
//
// 
// Constraints: 
//
// 
// 1 <= arr.length <= 1000 
// 1 <= arr[i] <= 1000 
// 1 <= k <= 1000 
// arr[i] < arr[j] for 1 <= i < j <= arr.length 
// Related Topics Array Hash Table 
// 👍 306 👎 7


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:38.8 MB,击败了15.80% 的Java用户
  public int findKthPositive(int[] arr, int k) {
    int idx = 0, i = 1;
    while (idx < arr.length) {
      if (i < arr[idx]) {
        k--;
        if (k == 0) {
          return i;
        }
      } else {
        idx++;
      }
      i++;
    }
    return k + i - 1;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

