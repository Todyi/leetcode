package easy._1100_1199._1184_distance_between_bus_stops;

//A bus has n stops numbered from 0 to n - 1 that form a circle.
// We know the distance between all pairs of neighboring stops
// where distance[i] is the distance between the stops number i and (i + 1) % n.
//
// The bus goes along both directions i.e. clockwise and counterclockwise.
//
// Return the shortest distance between the given start and destination stops.
//
//
// Example 1:
//
//
//
//
//Input: distance = [1,2,3,4], start = 0, destination = 1
//Output: 1
//Explanation: Distance between 0 and 1 is 1 or 9, minimum is 1.
//
//
//
// Example 2:
//
//
//
//
//Input: distance = [1,2,3,4], start = 0, destination = 2
//Output: 3
//Explanation: Distance between 0 and 2 is 3 or 7, minimum is 3.
//
//
//
//
// Example 3:
//
//
//
//
//Input: distance = [1,2,3,4], start = 0, destination = 3
//Output: 4
//Explanation: Distance between 0 and 3 is 6 or 4, minimum is 4.
//
//
//
// Constraints:
//
//
// 1 <= n <= 10^4
// distance.length == n
// 0 <= start, destination < n
// 0 <= distance[i] <= 10^4
// Related Topics Array
// 👍 257 👎 26


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:39 MB,击败了92.11% 的Java用户
  public int distanceBetweenBusStops(int[] distance, int start, int destination) {
    if (destination < start) {
      return distanceBetweenBusStops(distance, destination, start);
    }
    int counterClockwiseSum = 0, clockwiseSum = 0;
    for (int i = start; i < destination; i++) {
      clockwiseSum += distance[i];
    }
    for (int i = 0; i < start; i++) {
      counterClockwiseSum += distance[i];
    }
    for (int i = destination; i < distance.length; i++) {
      counterClockwiseSum += distance[i];
    }

    return clockwiseSum < counterClockwiseSum ? clockwiseSum : counterClockwiseSum;
  }
}
//leetcode submit region end(Prohibit modification and deletion)
