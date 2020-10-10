package easy._1500_1599._1534_count_good_triplets;

//Given an array of integers arr, and three integers a, b and c. 
// You need to find the number of good triplets.
//
// A triplet (arr[i], arr[j], arr[k]) is good if the following conditions are true:
//
//
// 0 <= i < j < k < arr.length
// |arr[i] - arr[j]| <= a
// |arr[j] - arr[k]| <= b
// |arr[i] - arr[k]| <= c
//
//
// Where |x| denotes the absolute value of x.
//
// Return the number of good triplets.
//
//
// Example 1:
//
//
//Input: arr = [3,0,1,1,9,7], a = 7, b = 2, c = 3
//Output: 4
//Explanation:There are 4 good triplets: [(3,0,1), (3,0,1), (3,1,1), (0,1,1)].
//
//
// Example 2:
//
//
//Input: arr = [1,1,2,2,3], a = 0, b = 0, c = 1
//Output: 0
//Explanation: No triplet satisfies all conditions.
//
//
//
// Constraints:
//
//
// 3 <= arr.length <= 100
// 0 <= arr[i] <= 1000
// 0 <= a, b, c <= 1000
// Related Topics Array
// 👍 105 👎 308


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:14 ms,击败了39.29% 的Java用户
  //  内存消耗:38.5 MB,击败了19.51% 的Java用户
  public int countGoodTriplets(int[] arr, int a, int b, int c) {
    int res = 0;
    for (int i = 0; i < arr.length - 2; i++) {
      for (int j = i + 1; j < arr.length - 1; j++) {
        if (Math.abs(arr[i] - arr[j]) <= a) {
          for (int k = j + 1; k < arr.length; k++) {
            if (Math.abs(arr[j] - arr[k]) <= b && Math.abs(arr[i] - arr[k]) <= c) {
              res++;
            }
          }
        }
      }
    }
    return res;
  }


}
//leetcode submit region end(Prohibit modification and deletion)

