package easy._1500_1599._1556_thousand_separator;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int n = 987;
    String result = "987";
    String solution = new easy._1500_1599._1556_thousand_separator.Solution()
        .thousandSeparator(n);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    int n = 1234;
    String result = "1.234";
    String solution = new easy._1500_1599._1556_thousand_separator.Solution()
        .thousandSeparator(n);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    int n = 123456789;
    String result = "123.456.789";
    String solution = new easy._1500_1599._1556_thousand_separator.Solution()
        .thousandSeparator(n);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test3() {
    int n = 0;
    String result = "0";
    String solution = new easy._1500_1599._1556_thousand_separator.Solution()
        .thousandSeparator(n);
    Assert.assertTrue(result.equals(solution));
  }

}
