package easy._0500_0599._509_fibonacci_number;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int n = 2;
    Integer result = 1;
    int solution = new easy._0500_0599._509_fibonacci_number.Solution()
        .fib(n);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    int n = 3;
    Integer result = 2;
    int solution = new easy._0500_0599._509_fibonacci_number.Solution()
        .fib(n);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    int n = 4;
    Integer result = 3;
    int solution = new easy._0500_0599._509_fibonacci_number.Solution()
        .fib(n);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test3() {
    int n = 0;
    Integer result = 0;
    int solution = new easy._0500_0599._509_fibonacci_number.Solution()
        .fib(n);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test4() {
    int n = 1;
    Integer result = 1;
    int solution = new easy._0500_0599._509_fibonacci_number.Solution()
        .fib(n);
    Assert.assertTrue(result.equals(solution));
  }

}
