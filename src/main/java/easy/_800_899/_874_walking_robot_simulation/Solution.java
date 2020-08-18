package easy._800_899._874_walking_robot_simulation;

//A robot on an infinite grid starts at point (0, 0) and faces north.
// The robot can receive one of three possible types of commands:
//
//
// -2: turn left 90 degrees
// -1: turn right 90 degrees
// 1 <= x <= 9: move forward x units
//
//
// Some of the grid squares are obstacles.
//
// The i-th obstacle is at grid point (obstacles[i][0], obstacles[i][1])
//
// If the robot would try to move onto them, the robot stays on the previous grid square instead
// (but still continues following the rest of the route.)
//
// Return the square of the maximum Euclidean distance that the robot will be from the origin.
//
//
//
// Example 1:
//
//
//Input: commands = [4,-1,3], obstacles = []
//Output: 25
//Explanation: robot will go to (3, 4)
//
//
//
// Example 2:
//
//
//Input: commands = [4,-1,4,-2,4], obstacles = [[2,4]]
//Output: 65
//Explanation: robot will be stuck at (1, 4) before turning left and going to (1, 8)
//
//
//
//
//
// Note:
//
//
// 0 <= commands.length <= 10000
// 0 <= obstacles.length <= 10000
// -30000 <= obstacle[i][0] <= 30000
// -30000 <= obstacle[i][1] <= 30000
// The answer is guaranteed to be less than 2 ^ 31.
//
// Related Topics Greedy
// 👍 177 👎 803


import java.util.HashSet;
import java.util.Set;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:28 ms,击败了67.88% 的Java用户
  //  内存消耗:45.5 MB,击败了62.40% 的Java用户
  public int robotSim(int[] commands, int[][] obstacles) {
    int x = 0, y = 0, direction = 0;//0north,1west,2south,3east
    int[][] step = {{0, 1}, {-1, 0}, {0, -1}, {1, 0}};

    Set obsMap = new HashSet();
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < obstacles.length; i++) {
      obsMap.add(sb.append(obstacles[i][0])
          .append('-')
          .append(obstacles[i][1])
          .toString());
      sb.setLength(0);
    }
    int result = 0;
    for (int cmd : commands) {
      if (cmd == -2) {
        direction = (direction + 1) % 4;
      } else if (cmd == -1) {
        direction = (direction + 3) % 4;
      } else {
        for (int i = 0; i < cmd; i++) {
          sb.setLength(0);
          if (obsMap.contains(
              sb.append(x + step[direction][0]).append('-').append(y + step[direction][1])
                  .toString())) {
            break;
          }
          x += step[direction][0];
          y += step[direction][1];
          if (result < x * x + y * y) {
            result = x * x + y * y;
          }
        }
      }
    }
    return Math.max(result, x * x + y * y);
  }
//  public int robotSim(int[] commands, int[][] obstacles) {
//    int x = 0, y = 0, direction = 0;//0north,1west,2south,3east
//    int[][] step = {{0, 1}, {-1, 0}, {0, -1}, {1, 0}};
//    Set obsMap = new HashSet();
//    for (int i = 0; i < obstacles.length; i++) {
//      obsMap.add(obstacles[i][0] + ',' + obstacles[i][1]);
//    }
//    int result = 0;
//    for (int cmd : commands) {
//      if (cmd == -2) {
//        direction = (direction + 1) % 4;
//      } else if (cmd == -1) {
//        direction = (direction + 3) % 4;
//      } else {
//        for (int i = 0; i < cmd; i++) {
//          int obsX = x + step[direction][0];
//          int obsY = y + step[direction][1];
//          if (obsMap.contains(obsX + ',' + obsY)) {
//            break;
//          }
//          x = obsX;
//          y = obsY;
//          result = Math.max(result, x * x + y * y);
//        }
//      }
//    }
//    return Math.max(result, x * x + y * y);
//  }
}
//leetcode submit region end(Prohibit modification and deletion)

