package easy._1300_1399._1360_number_of_days_between_two_dates;

//Write a program to count the number of days between two dates.
//
// The two dates are given as strings, their format is YYYY-MM-DD as shown in the examples.
//
//
// Example 1:
// Input: date1 = "2019-06-29", date2 = "2019-06-30"
//Output: 1
// Example 2:
// Input: date1 = "2020-01-15", date2 = "2019-12-31"
//Output: 15
//
//
// Constraints:
//
//
// The given dates are valid dates between the years 1971 and 2100.
//
// 👍 72 👎 412


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
  
  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:37.1 MB,击败了98.77% 的Java用户
  int[] daysOfMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

  public int daysBetweenDates(String date1, String date2) {
    if (date1.compareTo(date2) < 0) {
      return daysBetweenDates(date2, date1);
    }
    char[] arr = date1.toCharArray();
    char[] arr2 = date2.toCharArray();
    int year1 = toInt(arr, 0, 4),
        month1 = toInt(arr, 5, 7),
        day1 = toInt(arr, 8, 10),
        year2 = toInt(arr2, 0, 4),
        month2 = toInt(arr2, 5, 7),
        day2 = toInt(arr2, 8, 10),
        daysOfDate1 = daysOfDate(year1, month1, day1),
        daysOfDate2 = daysOfDate(year2, month2, day2),
        res = 0;

    boolean solarYear2 = isSolarYear(year2);

    res += daysOfDate1 + (solarYear2 ? 366 : 365) - daysOfDate2;
    if (year1 == year2) {
      res -= solarYear2 ? 366 : 365;
    }
    for (int i = year2 + 1; i < year1; i++) {
      res += isSolarYear(i) ? 366 : 365;
    }
    return res;
  }

  public int daysOfDate(int year, int month, int day) {
    int res = day;
    for (int i = 1; i < month; i++) {
      res += this.daysOfMonth[i];
    }
    if (isSolarYear(year) && 2 < month) {
      res++;
    }
    return res;
  }

  public boolean isSolarYear(int year) {
    return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
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

