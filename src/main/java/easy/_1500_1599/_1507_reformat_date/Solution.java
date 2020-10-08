package easy._1500_1599._1507_reformat_date;

//Given a date string in the form Day Month Year, where:
//
//
// Day is in the set {"1st", "2nd", "3rd", "4th", ..., "30th", "31st"}.
// Month is in the set {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug",
//"Sep", "Oct", "Nov", "Dec"}.
// Year is in the range [1900, 2100].
//
//
// Convert the date string to the format YYYY-MM-DD, where:
//
//
// YYYY denotes the 4 digit year.
// MM denotes the 2 digit month.
// DD denotes the 2 digit day.
//
//
//
// Example 1:
//
//
//Input: date = "20th Oct 2052"
//Output: "2052-10-20"
//
//
// Example 2:
//
//
//Input: date = "6th Jun 1933"
//Output: "1933-06-06"
//
//
// Example 3:
//
//
//Input: date = "26th May 1960"
//Output: "1960-05-26"
//
//
//
// Constraints:
//
//
// The given dates are guaranteed to be valid, so no error handling is necessary
//.
//
// Related Topics String
// 👍 59 👎 149


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:37.2 MB,击败了97.43% 的Java用户
  public String reformatDate(String date) {
    String[] monthMap = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct",
        "Nov", "Dec"};
    int i = 0, day = 0, month = 0, len = date.length();
    String monthStr = date.substring(len - 8, len - 5), year = date.substring(len - 4, len);
    //month
    for (int j = 0; j < monthMap.length; j++) {
      if (monthMap[j].equals(monthStr)) {
        month = j + 1;
        break;
      }
    }
    char[] res = new char[10];
    res[4] = '-';
    res[7] = '-';
    for (int j = 0; j < 4; j++) {
      res[j] = year.charAt(j);
    }
    if (month < 10) {
      res[5] = '0';
      res[6] = (char) (month + '0');
    } else {
      res[5] = (char) (month / 10 + '0');
      res[6] = (char) (month % 10 + '0');
    }
    //day
    int idx = 9;
    for (int k = 1; -1 < k; k--) {
      char c = date.charAt(k);
      if (Character.isDigit(c)) {
        res[idx--] = c;
      }
    }
    if (idx == 8){
      res[8] = '0';
    }

    return String.valueOf(res);
  }

}
//leetcode submit region end(Prohibit modification and deletion)

