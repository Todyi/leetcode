package medium._0000_0099._050_pow_x_n;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    double x = 2.0;
    int n = 10;
    Double result = 1024.0;
    double solution = new medium._0000_0099._050_pow_x_n.Solution()
        .myPow(x, n);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    double x = 2.1;
    int n = 3;
    Double result = 9.26100;
    double solution = new medium._0000_0099._050_pow_x_n.Solution()
        .myPow(x, n);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    double x = 2.00000;
    int n = -2;
    Double result = 0.25;
    double solution = new medium._0000_0099._050_pow_x_n.Solution()
        .myPow(x, n);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test3() {
    double x = 1;
    int n = 2147483647;
    Double result = 1.0;
    double solution = new medium._0000_0099._050_pow_x_n.Solution()
        .myPow(x, n);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test4() {
    double x = 2;
    int n = -2147483648;
    Double result = 1.0;
    double solution = new medium._0000_0099._050_pow_x_n.Solution()
        .myPow(x, n);
    Assert.assertTrue(result.equals(solution));
  }
}
