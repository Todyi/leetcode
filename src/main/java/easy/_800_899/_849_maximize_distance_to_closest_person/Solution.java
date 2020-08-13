package easy._800_899._849_maximize_distance_to_closest_person;

//In a row of seats, 1 represents a person sitting in that seat,
// and 0 represents that the seat is empty.
//
// There is at least one empty seat, and at least one person sitting.
//
// Alex wants to sit in the seat such that
// the distance between him and the closest person to him is maximized.
//
// Return that maximum distance to closest person.
//
//
// Example 1:
//
//
//Input: [1,0,0,0,1,0,1]
//Output: 2
//Explanation:
//If Alex sits in the second open seat (seats[2]), then the closest person has distance 2.
//If Alex sits in any other open seat, the closest person has distance 1.
//Thus, the maximum distance to the closest person is 2.
//
//
// Example 2:
//
//
//Input: [1,0,0,0]
//Output: 3
//Explanation:
//If Alex sits in the last seat, the closest person is 3 seats away.
//This is the maximum distance possible, so the answer is 3.
//
//
//
//
//
// Constraints:
//
//
// 2 <= seats.length <= 20000
// seats contains only 0s or 1s, at least one 0, and at least one 1.
//
// Related Topics Array
// 👍 820 👎 110


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:2 ms,击败了86.42% 的Java用户
  //  内存消耗:41.4 MB,击败了77.81% 的Java用户
  public int maxDistToClosest(int[] seats) {
    int lastSeated = nextSeated(seats, 0);
    int maxDistance = lastSeated;
    while (true) {
      int nextSeated = nextSeated(seats, lastSeated + 1);
      if (lastSeated < nextSeated) {
        maxDistance = Math.max(maxDistance, (nextSeated - lastSeated) / 2);
        lastSeated = nextSeated;
        nextSeated = nextSeated(seats, lastSeated + 1);
      } else {
        maxDistance = Math.max(maxDistance, seats.length - 1 - lastSeated);
        break;
      }
    }
    return maxDistance;
  }

  public int nextSeated(int[] seats, int startIdx) {
    for (int i = startIdx; i < seats.length; i++) {
      if (seats[i] == 1) {
        return i;
      }
    }
    return Integer.MIN_VALUE;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

