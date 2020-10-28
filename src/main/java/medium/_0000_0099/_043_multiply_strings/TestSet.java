package medium._0000_0099._043_multiply_strings;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    String num1 = "2";
    String num2 = "3";
    String result = "6";
    String solution = new medium._0000_0099._043_multiply_strings.Solution()
        .multiply(num1, num2);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    String num1 = "123";
    String num2 = "456";
    String result = "56088";
    String solution = new medium._0000_0099._043_multiply_strings.Solution()
        .multiply(num1, num2);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    String num1 = "0";
    String num2 = "0";
    String result = "0";
    String solution = new medium._0000_0099._043_multiply_strings.Solution()
        .multiply(num1, num2);
    Assert.assertTrue(result.equals(solution));
  }
}
