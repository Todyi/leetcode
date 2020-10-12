package easy._0900_0999._933_number_of_recent_calls;

//Write a class RecentCounter to count recent requests.
//
// It has only one method: ping(int t), where t represents some time in milliseconds.
//
// Return the number of pings that have been made from 3000 milliseconds ago until now.
//
// Any ping with time in [t - 3000, t] will count, including the current ping.
//
// It is guaranteed that every call to ping uses a strictly larger value of t than before.
//
//
//
// Example 1:
//
//
//Input: inputs = ["RecentCounter","ping","ping","ping","ping"], inputs = [[],[1
//],[100],[3001],[3002]]
//Output: [null,1,2,3,3]
//
//
//
// Note:
//
//
// Each test case will have at most 10000 calls to ping.
// Each test case will call ping with strictly increasing values of t.
// Each call to ping will have 1 <= t <= 10^9.
//
//
//
//
// Related Topics Queue
// 👍 311 👎 1760


//leetcode submit region begin(Prohibit modification and deletion)
class RecentCounter {

  //  解答成功:
  //  执行耗时:18 ms,击败了98.33% 的Java用户
  //  内存消耗:48.2 MB,击败了71.39% 的Java用户
//  LinkedList<Integer> reqList = new LinkedList<>();
//
//  public RecentCounter() {
//
//  }
//
//  public int ping(int t) {
//    reqList.add(t);
//    while (reqList.peek() + 3000 < t) {
//      reqList.remove();
//    }
//    return reqList.size();
//  }

  //  解答成功:
  //  执行耗时:17 ms,击败了99.38% 的Java用户
  //  内存消耗:48.4 MB,击败了55.02% 的Java用户
  int[] map = new int[10000];
  int current = 0;
  int last = 0;

  public RecentCounter() {

  }

  public int ping(int t) {
    map[current++] = t;
    while (map[last] + 3000 < t) {
      last++;
    }
    return current - last;
  }


}

/**
 * Your RecentCounter object will be instantiated and called as such: RecentCounter obj = new
 * RecentCounter(); int param_1 = obj.ping(t);
 */
//leetcode submit region end(Prohibit modification and deletion)

