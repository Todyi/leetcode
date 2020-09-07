package easy._1000_1099._1010_pairs_of_songs_with_total_durations_divisible_by_60;

//In a list of songs, the i-th song has a duration of time[i] seconds.
//
// Return the number of pairs of songs for which their total duration in seconds
// is divisible by 60. Formally, we want the number of indices i, j such that i < j
// with (time[i] + time[j]) % 60 == 0.
//
//
//
// Example 1:
//
//
//Input: [30,20,150,100,40]
//Output: 3
//Explanation: Three pairs have a total duration divisible by 60:
//(time[0] = 30, time[2] = 150): total duration 180
//(time[1] = 20, time[3] = 100): total duration 120
//(time[1] = 20, time[4] = 40): total duration 60
//
//
//
// Example 2:
//
//
//Input: [60,60,60]
//Output: 3
//Explanation: All three pairs have a total duration of 120, which is divisible by 60.
//
//
//
//
//
// Note:
//
//
// 1 <= time.length <= 60000
// 1 <= time[i] <= 500
//
// Related Topics Array
// 👍 546 👎 44


import java.util.HashMap;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:3 ms,击败了85.95% 的Java用户
  //  内存消耗:44.6 MB,击败了95.59% 的Java用户
//  public int numPairsDivisibleBy60(int[] time) {
//    int count = 0, max = Integer.MIN_VALUE;
//    int[] map = new int[501];
//    for (int i : time) {
//      if (max < i) {
//        max = i;
//      }
//      int tmp = 60 - (i % 60);
//      while (tmp <= max) {
//        count += map[tmp];
//        tmp += 60;
//      }
//      map[i]++;
//
//    }
//    return count;
//  }

  //  解答成功:
  //  执行耗时:1 ms,击败了100.00% 的Java用户
  //  内存消耗:44.8 MB,击败了88.89% 的Java用户
  public int numPairsDivisibleBy60(int[] time) {
    int[] map = new int[60];
    for (int i = 0; i < time.length; i++) {
      time[i] %= 60;
    }
    for (int i : time) {
      map[i]++;
    }
    //better than for (int i : time) map[i % 60]++;

    //C(n,2)=n(n-1)/2
    int count = map[0] * (map[0] - 1) / 2 + map[30] * (map[30] - 1) / 2;
    for (int i = 1; i < 30; i++) {
      count += map[i] * map[60 - i];
    }
    return count;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

