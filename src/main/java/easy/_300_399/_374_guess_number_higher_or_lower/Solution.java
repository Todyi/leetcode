package easy._300_399._374_guess_number_higher_or_lower;

//We are playing the Guess Game. The game is as follows:
//
// I pick a number from 1 to n. You have to guess which number I picked.
//
// Every time you guess wrong, I'll tell you whether the number is higher or lower.
//
// You call a pre-defined API guess(int num) which returns 3 possible results (-
//1, 1, or 0):
//
//
//-1 : My number is lower
// 1 : My number is higher
// 0 : Congrats! You got it!
//
//
// Example :
//
//
//
//Input: n = 10, pick = 6
//Output: 6
//
//
// Related Topics Binary Search

//leetcode submit region begin(Prohibit modification and deletion)

/**
 * Forward declaration of guess API.
 *
 * @param num your guess
 * @return -1 if num is lower than the guess number 1 if num is higher than the guess number
 * otherwise return 0 int guess(int num);
 */

public class Solution extends GuessGame {

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:36.1 MB,击败了6.45% 的Java用户
  public int guessNumber(int n) {
    int left = Integer.MIN_VALUE;
    int right = Integer.MAX_VALUE;
    int mid = n;
    int result = guess(mid);
    while (result != 0) {
      if (result == -1) {
        right = mid;
      } else {
        left = mid;
      }
      if (right - left == 2) {
        mid = left + 1;
      } else {
        mid = (left >> 1) + (right >> 1);
      }
      result = guess(mid);
    }
    return mid;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

