package easy._0500_0599._551_student_attendance_record_i;

//You are given a string representing an attendance record for a student.
// The record only contains the following three characters:
//
//
//
// 'A' : Absent.
// 'L' : Late.
// 'P' : Present.
//
//
//
//
//A student could be rewarded
// if his attendance record doesn't contain more than one 'A' (absent)
// or more than two continuous 'L' (late).
//
// You need to return whether the student could be rewarded according to his attendance record.
//
// Example 1:
//
//Input: "PPALLP"
//Output: True
//
//
//
// Example 2:
//
//Input: "PPALLL"
//Output: False
//
//
//
//
// Related Topics String


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:37.6 MB,击败了5.26% 的Java用户
  public boolean checkRecord(String s) {
    int aCount = 0;
    char[] arr = s.toCharArray();
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == 'A') {
        aCount++;
        if (aCount > 1) {
          return false;
        }
      } else if (arr[i] == 'L' && i < arr.length - 2 && arr[i + 1] == 'L' && arr[i + 2] == 'L') {
        return false;
      }
    }
    return true;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

