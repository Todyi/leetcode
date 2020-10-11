package easy._1500_1599._1588_sum_of_all_odd_length_subarrays;

//Given an array of positive integers arr, calculate the sum of all possible odd-length subarrays.
//
// A subarray is a contiguous subsequence of the array.
//
// Return the sum of all odd-length subarrays of arr.
//
//
// Example 1:
//
//
//Input: arr = [1,4,2,5,3]
//Output: 58
//Explanation: The odd-length subarrays of arr and their sums are:
//[1] = 1
//[4] = 4
//[2] = 2
//[5] = 5
//[3] = 3
//[1,4,2] = 7
//[4,2,5] = 11
//[2,5,3] = 10
//[1,4,2,5,3] = 15
//If we add all these together we get 1 + 4 + 2 + 5 + 3 + 7 + 11 + 10 + 15 = 58
//
//
// Example 2:
//
//
//Input: arr = [1,2]
//Output: 3
//Explanation: There are only 2 subarrays of odd length, [1] and [2]. Their sum
//is 3.
//
// Example 3:
//
//
//Input: arr = [10,11,12]
//Output: 66
//
//
//
// Constraints:
//
//
// 1 <= arr.length <= 100
// 1 <= arr[i] <= 1000
//
// Related Topics Array
// 👍 194 👎 24


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:1 ms,击败了81.56% 的Java用户
  //  内存消耗:36.8 MB,击败了11.77% 的Java用户
//  public int sumOddLengthSubarrays(int[] arr) {
//    for (int i = 1; i < arr.length; i++) {
//      arr[i] += arr[i - 1];
//    }
//    int len = (arr.length & 1) == 0 ? arr.length - 1 : arr.length, sum = arr[arr.length - 1];
//    for (int subLen = 3; subLen <= len; subLen += 2) {
//      sum += arr[subLen - 1];
//      for (int i = subLen; i < arr.length; i++) {
//        sum += arr[i] - arr[i - subLen];
//      }
//    }
//    return sum;
//  }

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:36.5 MB,击败了11.77% 的Java用户
  public int sumOddLengthSubarrays(int[] arr) {
    int sum = 0, n = arr.length;
    for (int i = 0; i < n; i++) {
      //https://web.stanford.edu/class/cs9/sample_probs/SubarraySums.pdf
      //every single n's add times = (n – i)i + (n – i) = (n – i)(i + 1)
      //when odd subArrays ,it's ⌈time/2⌉ = (times+1)/2
      int sumTimes = ((n - i) * (i + 1) + 1) / 2;
      sum += arr[i] * sumTimes;
    }
    return sum;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

