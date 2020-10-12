package easy._0400_0499._412_fizz_buzz;

//Write a program that outputs the string representation of numbers from 1 to n.
//
//
// But for multiples of three it should output “Fizz” instead of the number and
//for the multiples of five output “Buzz”. For numbers which are multiples of both
// three and five output “FizzBuzz”.
//
// Example:
//
//n = 15,
//
//Return:
//[
//    "1",
//    "2",
//    "Fizz",
//    "4",
//    "Buzz",
//    "Fizz",
//    "7",
//    "8",
//    "Fizz",
//    "Buzz",
//    "11",
//    "Fizz",
//    "13",
//    "14",
//    "FizzBuzz"
//]
//
//


import java.util.Arrays;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:40.2 MB,击败了5.40% 的Java用户
  public List<String> fizzBuzz(int n) {
    String[] list = new String[n];
    final String[] map = new String[]{"Fizz", "Buzz", "FizzBuzz"};
    for (int i = 1; i <= n; i++) {
      if (i % 3 == 0) {
        if (i % 5 == 0) {
          list[i - 1] = map[2];
        } else {
          list[i - 1] = map[0];
        }
      } else if (i % 5 == 0) {
        list[i - 1] = map[1];
      } else {
        list[i - 1] = Integer.toString(i);
      }
    }
    return Arrays.asList(list);
  }
}
//leetcode submit region end(Prohibit modification and deletion)

