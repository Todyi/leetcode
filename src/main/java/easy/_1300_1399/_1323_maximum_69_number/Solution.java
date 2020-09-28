package easy._1300_1399._1323_maximum_69_number;

//Given a positive integer num consisting only of digits 6 and 9. 
//
// Return the maximum number you can get by changing at most one digit 
// (6 becomes 9, and 9 becomes 6). 
//
// 
// Example 1: 
//
// 
//Input: num = 9669
//Output: 9969
//Explanation: 
//Changing the first digit results in 6669.
//Changing the second digit results in 9969.
//Changing the third digit results in 9699.
//Changing the fourth digit results in 9666.
//The maximum number is 9969.
// 
//
// Example 2: 
//
// 
//Input: num = 9996
//Output: 9999
//Explanation: Changing the last digit 6 to 9 results in the maximum number. 
//
// Example 3: 
//
// 
//Input: num = 9999
//Output: 9999
//Explanation: It is better not to apply any change. 
//
// 
// Constraints: 
//
// 
// 1 <= num <= 10^4 
// num's digits are 6 or 9. 
// Related Topics Math 
// 👍 361 👎 57


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:35.8 MB,击败了97.76% 的Java用户
  public int maximum69Number(int num) {
    int res = 0;
    char[] arr = String.valueOf(num).toCharArray();
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == '6') {
        arr[i] = '9';
        break;
      }
    }
    for (char c : arr) {
      res = res * 10 + (c - '0');
    }
    return res;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

