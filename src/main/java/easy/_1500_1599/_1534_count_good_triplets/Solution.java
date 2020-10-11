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
//  public int countGoodTriplets(int[] arr, int a, int b, int c) {
//    int res = 0;
//    for (int i = 0; i < arr.length - 2; i++) {
//      for (int j = i + 1; j < arr.length - 1; j++) {
//        if (Math.abs(arr[i] - arr[j]) <= a) {
//          for (int k = j + 1; k < arr.length; k++) {
//            if (Math.abs(arr[j] - arr[k]) <= b && Math.abs(arr[i] - arr[k]) <= c) {
//              res++;
//            }
//          }
//        }
//      }
//    }
//    return res;
//  }

  //  解答成功:
  //  执行耗时:4 ms,击败了100.00% 的Java用户
  //  内存消耗:38.7 MB,击败了19.65% 的Java用户
  public int countGoodTriplets(int[] arr, int a, int b, int c) {
    int[] map = new int[1001], pre = new int[1001];
    int len = arr.length, res = 0;

    for (int i = 2; i < arr.length; i++) {
      map[arr[i]]++;
    }
    for (int i = 1; i < 1001; i++) {
      map[i] += map[i - 1];
    }
    pre[arr[0]]++;
    for (int j = 1; j < len - 1; j++) {
      int arrJ = arr[j];
      int lARange = Math.max(0, arrJ - a), rARange = Math.min(1000, arrJ + a);
      int lBRange = Math.max(0, arrJ - b), rBRange = Math.min(1000, arrJ + b);

      for (int i = lARange; i <= rARange; i++) {
        //pre[i] is num of arr[i]
        if (pre[i] == 0) {
          continue;
        }
        //map[rCRange]-map[lCRange-1] is num of arr[k]
        int lCRange = Math.max(lBRange, i - c), rCRange = Math.min(rBRange, i + c);
        if (lCRange <= rCRange) {
          if (lCRange == 0) {
            res += pre[i] * map[rCRange];
          } else {
            res += pre[i] * (map[rCRange] - map[lCRange - 1]);
          }
        }
      }

      pre[arrJ]++;
      for (int d = arr[j + 1]; d < 1001; d++) {
        map[d]--;
      }
    }
    return res;
  }


}
//leetcode submit region end(Prohibit modification and deletion)

