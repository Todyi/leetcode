package medium._0000_0099._057_insert_interval;

//Given a set of non-overlapping intervals,
// insert a new interval into the intervals (merge if necessary).
//
// You may assume that the intervals were initially sorted according to their start times.
//
//
// Example 1:
//
//
//Input: intervals = [[1,3],[6,9]], newInterval = [2,5]
//Output: [[1,5],[6,9]]
//
//
// Example 2:
//
//
//Input: intervals = [[1,2],[3,5],[6,7],[8,10],[12,16]], newInterval = [4,8]
//Output: [[1,2],[3,10],[12,16]]
//Explanation: Because the new interval [4,8] overlaps with [3,5],[6,7],[8,10].
//
//
// Example 3:
//
//
//Input: intervals = [], newInterval = [5,7]
//Output: [[5,7]]
//
//
// Example 4:
//
//
//Input: intervals = [[1,5]], newInterval = [2,3]
//Output: [[1,5]]
//
//
// Example 5:
//
//
//Input: intervals = [[1,5]], newInterval = [2,7]
//Output: [[1,7]]
//
//
//
// Constraints:
//
//
// 0 <= intervals.length <= 104
// intervals[i].length == 2
// 0 <= intervals[i][0] <= intervals[i][1] <= 105
// intervals is sorted by intervals[i][0] in ascending order.
// newInterval.length == 2
// 0 <= newInterval[0] <= newInterval[1] <= 105
//
// Related Topics Array Sort
// 👍 2257 👎 219


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:1 ms,击败了96.73% 的Java用户
  //  内存消耗:41.3 MB,击败了23.15% 的Java用户
//  public int[][] insert(int[][] intervals, int[] newInterval) {
//    int len = intervals.length, idx = 0, cur = 0;
//    boolean inserted = false;
//    if (len == 0) {
//      intervals = new int[1][];
//      intervals[0] = newInterval;
//      return intervals;
//    }
//    while (cur < len) {
//      int[] s1 = intervals[cur++];
//      if (!inserted) {
//        inserted = merge(s1, newInterval);
//        if (!inserted) {
//          if (newInterval[0] < s1[0]) {
//            swap(s1, newInterval);
//          }
//        } else {
//          cur--;
//          idx = cur;
//        }
//      } else {
//        if (!merge(intervals[idx], s1)) {
//          intervals[++idx] = s1;
//        }
//      }
//    }
//    if (!inserted) {
//      idx = len;
//    }
//    int[][] res = new int[++idx][];
//    int tmp = Math.min(idx, len);
//    for (int i = 0; i < tmp; i++) {
//      res[i] = intervals[i];
//    }
//    if (!inserted) {
//      res[len] = newInterval;
//    }
//    return res;
//
//  }

//  public boolean merge(int[] s1, int[] s2) {
//    if (s1 == s2) {
//      return true;
//    }
//    if (s1[0] <= s2[1] && s2[0] <= s1[1]) {
//      s1[0] = Math.min(s1[0], s2[0]);
//      s1[1] = Math.max(s1[1], s2[1]);
//      s2[0] = 1;
//      s2[1] = 0;
//      return true;
//    }
//    return false;
//  }
//
//  public void swap(int[] s1, int[] s2) {
//    int zero = s1[0], one = s1[1];
//    s1[0] = s2[0];
//    s1[1] = s2[1];
//    s2[0] = zero;
//    s2[1] = one;
//  }

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:41.6 MB,击败了22.93% 的Java用户
  public int[][] insert(int[][] intervals, int[] newInterval) {
    int len = intervals.length;
    int l = find(intervals, newInterval[0], 1);
    int r = find(intervals, newInterval[1], 0) - 1;
    if (0 <= l && l < len) {
      newInterval[0] = Math.min(newInterval[0], intervals[l][0]);
    }
    if (0 <= r && r < len) {
      newInterval[1] = Math.max(newInterval[1], intervals[r][1]);
    }
    int[][] res = new int[l + len - r][];
    int idx = 0, i = 0;
    while (i < l) {
      res[idx++] = intervals[i++];
    }
    res[idx++] = newInterval;
    i = r + 1;
    while (i < len) {
      res[idx++] = intervals[i++];
    }
    return res;
  }

  public int find(int[][] intervals, int target, int bit) {
    int l = 0, r = intervals.length - 1, mid;
    while (l <= r) {
      mid = (l + r) / 2;
      if (intervals[mid][bit] < target || (bit == 0 && intervals[mid][bit] == target)) {
        l = mid + 1;
      } else {
        r = mid - 1;
      }
    }
    return l;
  }

}
//leetcode submit region end(Prohibit modification and deletion)

