package _7_reverse_integer;


/**
 * @program: leetcode
 * @description: 7.reverse-integer
 * @author: hdy
 * @create: 2019-04-23
 **/

public class ReverseInteger {

  public static int reverse(Long x) {
    Long tmp = Math.abs(Long.parseLong(String.valueOf(x)));
    StringBuffer buf = new StringBuffer(String.valueOf(tmp));
    buf.reverse();
    int result = 0;
    try {
      result = Integer.parseInt(buf.toString());
      if (x < 0) {
        return -result;
      }
    } catch (NumberFormatException e) {
    }
    return result;
  }

  public static int anotherReverse(Long x) {
    long rev = 0;
    while (x != 0) {
      if (Math.abs(rev) > Integer.MAX_VALUE / 10) {
        return 0;
      }
      rev = rev * 10 + x % 10;
      x /= 10;
    }

    return (int) rev;
  }

  public static int anAnotherReverse(int x) {
    if (x / 10 == 0) {
      return x;
    }
    int y = 0, z = x;

    while (z != 0) {
      try {
        y = Math.multiplyExact(y, 10);
        y = Math.addExact(y, z % 10);
        z /= 10;
      } catch (ArithmeticException e) {
        return 0;
      }
    }

    return y;
  }

}
