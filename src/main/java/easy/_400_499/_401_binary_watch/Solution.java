package easy._400_499._401_binary_watch;

//A binary watch has 4 LEDs on the top which represent the hours (0-11), and the
// 6 LEDs on the bottom represent the minutes (0-59).
// Each LED represents a zero or one, with the least significant bit on the right.
//
// For example, the above binary watch reads "3:25".
//
// Given a non-negative integer n which represents the number of LEDs that are c
//urrently on, return all possible times the watch could represent.
//
// Example:
// Input: n = 1 Return: ["1:00", "2:00", "4:00", "8:00", "0:01", "0:02", "0:04",
// "0:08", "0:16", "0:32"]
//
//
// Note:
//
// The order of output does not matter.
// The hour must not contain a leading zero, for example "01:00" is not valid, i
//t should be "1:00".
// The minute must be consist of two digits and may contain a leading zero, for
//example "10:2" is not valid, it should be "10:02".
//
// Related Topics Backtracking Bit Manipulation


import java.util.ArrayList;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:8 ms,击败了70.79% 的Java用户
  //  内存消耗:38.3 MB,击败了16.67% 的Java用户
  public List<String> readBinaryWatch(int num) {
    List<String> result = new ArrayList<>();
    for (int hour = 0; hour < 12; hour++) {
      int i = Integer.bitCount(hour);
      if (num < i){
        continue;
      }
      for (int minutes = 0; minutes < 60; minutes++) {
        if (i + Integer.bitCount(minutes) == num) {
          result.add(hour+":"+(minutes<10?"0"+minutes:minutes));
        }
      }
    }
    return result;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

