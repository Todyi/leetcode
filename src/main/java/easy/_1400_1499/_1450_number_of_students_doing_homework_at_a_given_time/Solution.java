package easy._1400_1499._1450_number_of_students_doing_homework_at_a_given_time;

//Given two integer arrays startTime and endTime and given an integer queryTime.
//
//
// The ith student started doing their homework at the time startTime[i]
// and finished it at time endTime[i].
//
// Return the number of students doing their homework at time queryTime.
// More formally, return the number of students
// where queryTime lays in the interval [startTime[i], endTime[i]] inclusive.
//
// Example 1:
//
//
//Input: startTime = [1,2,3], endTime = [3,2,7], queryTime = 4
//Output: 1
//Explanation: We have 3 students where:
//The first student started doing homework at time 1 and finished at time 3 and
//wasn't doing anything at time 4.
//The second student started doing homework at time 2 and finished at time 2 and
// also wasn't doing anything at time 4.
//The third student started doing homework at time 3 and finished at time 7 and
//was the only student doing homework at time 4.
//
//
// Example 2:
//
//
//Input: startTime = [4], endTime = [4], queryTime = 4
//Output: 1
//Explanation: The only student was doing their homework at the queryTime.
//
//
// Example 3:
//
//
//Input: startTime = [4], endTime = [4], queryTime = 5
//Output: 0
//
//
// Example 4:
//
//
//Input: startTime = [1,1,1,1], endTime = [1,3,2,4], queryTime = 7
//Output: 0
//
//
// Example 5:
//
//
//Input: startTime = [9,8,7,6,5,4,3,2,1], endTime = [10,10,10,10,10,10,10,10,10]
//, queryTime = 5
//Output: 5
//
//
//
// Constraints:
//
//
// startTime.length == endTime.length
// 1 <= startTime.length <= 100
// 1 <= startTime[i] <= endTime[i] <= 1000
// 1 <= queryTime <= 1000
//
// Related Topics Array
// 👍 238 👎 64


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:36.8 MB,击败了97.24% 的Java用户
  public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
    int count = 0, len = startTime.length;
    for (int i = 0; i < len; i++) {
      if (startTime[i] <= queryTime && queryTime <= endTime[i]) {
        count++;
      }
    }
    return count;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

