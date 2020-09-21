package easy._1100_1199._1154_day_of_the_year;

//Given a string date representing a Gregorian calendar date formatted as YYYY-MM-DD,
// return the day number of the year.
//
//
// Example 1:
//
//
//Input: date = "2019-01-09"
//Output: 9
//Explanation: Given date is the 9th day of the year in 2019.
//
//
// Example 2:
//
//
//Input: date = "2019-02-10"
//Output: 41
//
//
// Example 3:
//
//
//Input: date = "2003-03-01"
//Output: 60
//
//
// Example 4:
//
//
//Input: date = "2004-03-01"
//Output: 61
//
//
//
// Constraints:
//
//
// date.length == 10
// date[4] == date[7] == '-', and all other date[i]'s are digits
// date represents a calendar date between Jan 1st, 1900 and Dec 31, 2019.
// Related Topics Math
// 👍 113 👎 167


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:37.8 MB,击败了58.54% 的Java用户
  public int dayOfYear(String date) {
    char[] arr = date.toCharArray();
    int year = toInt(arr, 0, 4),
        month = toInt(arr, 5, 7),
        day = toInt(arr, 8, 10),
        res = 0;
    int[] map = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    boolean solarYear = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;

    for (int i = 0; i < month; i++) {
      res += map[i];
    }
    res += day;

    if (2 < month && solarYear) {
      res++;
    }

    return res;
  }

  public int toInt(char[] arr, int start, int end) {
    int res = 0;
    for (int i = start; i < end; i++) {
      res = res * 10 + (arr[i] - '0');
    }
    return res;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

