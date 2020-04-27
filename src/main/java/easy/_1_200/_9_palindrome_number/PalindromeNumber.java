package easy._1_200._9_palindrome_number;

/**
 * @program: leetcode
 * @description: 9.palindrome-number
 * @author: hdy
 * @create: 2019-04-23
 **/

public class PalindromeNumber {

  public static boolean isPalindrome(int x) {
    if (x < 0 || (x % 10 == 0 && x != 0)) {
      return false;
    }
    StringBuffer buffer = new StringBuffer(String.valueOf(x));
    return buffer.reverse().toString().equals(String.valueOf(x));
  }

  public static boolean anotherIsPalindrome(int x) {
    if (x < 0 || (x % 10 == 0 && x != 0)) {
      return false;
    }
    int tmp = x;
    int rever = 0;
    while (tmp > 0) {
      rever = rever * 10 + tmp % 10;
      tmp /= 10;
    }

    return rever == x;
  }
}
