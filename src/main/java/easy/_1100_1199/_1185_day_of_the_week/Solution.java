package easy._1100_1199._1185_day_of_the_week;

//Given a date, return the corresponding day of the week for that date.
//
// The input is given as three integers representing the day, month and year respectively.
//
// Return the answer as one of the following values {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"}.
//
//
// Example 1:
//
//
//Input: day = 31, month = 8, year = 2019
//Output: "Saturday"
//
//
// Example 2:
//
//
//Input: day = 18, month = 7, year = 1999
//Output: "Sunday"
//
//
// Example 3:
//
//
//Input: day = 15, month = 8, year = 1993
//Output: "Sunday"
//
//
//
// Constraints:
//
//
// The given dates are valid dates between the years 1971 and 2100.
// Related Topics Array
// 👍 127 👎 1129


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:36.7 MB,击败了62.56% 的Java用户
  public String dayOfTheWeek(int day, int month, int year) {
    //https://en.wikipedia.org/wiki/Determination_of_the_day_of_the_week
    //w=(d+floor(2.6m-0.2)+y+floor(y/4)+floor(c/4)-2c)%7
    //Y is the year minus 1 for January or February, and the year for any other month
    //y is the last 2 digits of Y
    //c is the first 2 digits of Y
    //d is the day of the month (1 to 31)
    //m is the shifted month (March=1,...,February=12)
    //w is the day of week (0=Sunday,...,6=Saturday). If w is negative you have to add 7 to it.

    String[] week = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    int Y = month < 3 ? year - 1 : year,
        y = Y % 100, c = Y / 100, d = day, m = month < 3 ? month + 10 : month - 2,
        w = (d + (int) (2.6 * m - 0.2) + y + (y / 4) + (c / 4) - 2 * c) % 7;
    return week[w < 0 ? w + 7 : w];
  }

}
//leetcode submit region end(Prohibit modification and deletion)

