package easy._400_499._412_fizz_buzz;

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


import java.util.ArrayList;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:1 ms,击败了99.59% 的Java用户
  //  内存消耗:40.1 MB,击败了5.40% 的Java用户
  public List<String> fizzBuzz(int n) {
    List<String> list = new ArrayList<>();
    String[] map = new String[]{"Fizz", "Buzz", "FizzBuzz"};
    for (int i = 1; i <= n; i++) {
      if (i % 3 == 0) {
        if (i % 5 == 0) {
          list.add(map[2]);
        } else {
          list.add(map[0]);
        }
      } else if (i % 5 == 0) {
        list.add(map[1]);
      } else {
        list.add(Integer.toString(i));
      }
    }
    return list;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

