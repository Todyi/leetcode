package medium._0000_0099._056_merge_intervals;

//Given a collection of intervals, merge all overlapping intervals.
//
// Example 1:
//
//
//Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
//Output: [[1,6],[8,10],[15,18]]
//Explanation: Since intervals [1,3] and [2,6] overlaps, merge them into [1,6].
//
//
// Example 2:
//
//
//Input: intervals = [[1,4],[4,5]]
//Output: [[1,5]]
//Explanation: Intervals [1,4] and [4,5] are considered overlapping.
//
// NOTE: input types have been changed on April 15, 2019.
// Please reset to default code definition to get new method signature.
//
//
// Constraints:
//
//
// intervals[i][0] <= intervals[i][1]
//
// Related Topics Array Sort
// 👍 5463 👎 329


import java.util.Arrays;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  Runtime: 2 ms, faster than 99.60% of Java online submissions for Merge Intervals.
  //  Memory Usage: 41.5 MB, less than 10.80% of Java online submissions for Merge Intervals.
//  public int[][] merge(int[][] intervals) {
//    int idx = 0, cur = 0, len = intervals.length;
//    if (len < 2) {
//      return intervals;
//    }
//    quickSort(intervals, 0, len - 1);
//    while (cur < len) {
//      if (intervals[idx][1] < intervals[cur][0]) {
//        idx++;
//        intervals[idx][0] = intervals[cur][0];
//        intervals[idx][1] = intervals[cur][1];
//      } else {
//        if (intervals[idx][0] <= intervals[cur][0] && intervals[cur][0] <= intervals[idx][1]) {
//          intervals[idx][1] = Math.max(intervals[idx][1], intervals[cur][1]);
//        }
//      }
//      cur++;
//    }
//    int[][] res = new int[++idx][2];
//
//    for (int i = 0; i < idx; i++) {
//      res[i] = intervals[i];
//    }
//    return res;
//  }
//
//  public void quickSort(int[][] intervals, int start, int end) {
//    if (end <= start) {
//      return;
//    }
//    int pivot = intervals[end][0], cur = start - 1, idx = start;
//    while (++cur < end) {
//      if (intervals[cur][0] < pivot) {
//        swap(intervals, cur, idx++);
//      }
//    }
//    swap(intervals, end, idx);
//    quickSort(intervals, start, idx - 1);
//    quickSort(intervals, idx + 1, end);
//  }
//
//  public void swap(int[][] intervals, int i, int j) {
//    int[] tmp = intervals[i];
//    intervals[i] = intervals[j];
//    intervals[j] = tmp;
//  }

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:41.6 MB,击败了10.80% 的Java用户
  public int[][] merge(int[][] intervals) {
    int len = intervals.length, count = len, idx = 0;
    for (int i = 0; i < len - 1; i++) {
      int[] s1 = intervals[i];
      for (int j = i + 1; j < len; j++) {
        int[] s2 = intervals[j];
        if (s1[0] <= s2[1] && s2[0] <= s1[1]) {
          s2[0] = Math.min(s1[0], s2[0]);
          s2[1] = Math.max(s1[1], s2[1]);
          s1[0] = 1;
          s1[1] = 0;
          count--;
          break;
        }
      }
    }
    int[][] res = new int[count][];
    for (int i = 0; i < len; i++) {
      if (intervals[i][1] < intervals[i][0]) {
        continue;
      }
      res[idx++] = intervals[i];
    }
    return res;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

