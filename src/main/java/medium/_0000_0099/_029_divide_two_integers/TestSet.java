package medium._0000_0099._029_divide_two_integers;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int dividend = 10;
    int divisor = 3;
    Integer result = 3;
    int solution = new medium._0000_0099._029_divide_two_integers.Solution()
        .divide(dividend, divisor);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    int dividend = 7;
    int divisor = -3;
    Integer result = -2;
    int solution = new medium._0000_0099._029_divide_two_integers.Solution()
        .divide(dividend, divisor);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    int dividend = 0;
    int divisor = 1;
    Integer result = 0;
    int solution = new medium._0000_0099._029_divide_two_integers.Solution()
        .divide(dividend, divisor);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test3() {
    int dividend = 1;
    int divisor = 1;
    Integer result = 1;
    int solution = new medium._0000_0099._029_divide_two_integers.Solution()
        .divide(dividend, divisor);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test4() {
    int dividend = -2147483648;
    int divisor = -1;
    Integer result = 2147483647;
    int solution = new medium._0000_0099._029_divide_two_integers.Solution()
        .divide(dividend, divisor);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test5() {
    int dividend = -2147483648;
    int divisor = 1;
    Integer result = -2147483648;
    int solution = new medium._0000_0099._029_divide_two_integers.Solution()
        .divide(dividend, divisor);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test6() {
    int dividend = 2147483647;
    int divisor = 1;
    Integer result = 2147483647;
    int solution = new medium._0000_0099._029_divide_two_integers.Solution()
        .divide(dividend, divisor);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test7() {
    int dividend = 2147483647;
    int divisor = 3;
    Integer result = 715827882;
    int solution = new medium._0000_0099._029_divide_two_integers.Solution()
        .divide(dividend, divisor);
    Assert.assertTrue(result.equals(solution));
  }
}
