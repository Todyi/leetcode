package medium._0100_0199._166_fraction_to_recurring_decimal;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int numerator = 1;
    int denominator = 2;
    String result = "0.5";
    String solution = new medium._0100_0199._166_fraction_to_recurring_decimal.Solution()
        .fractionToDecimal(numerator, denominator);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    int numerator = 2;
    int denominator = 1;
    String result = "2";
    String solution = new medium._0100_0199._166_fraction_to_recurring_decimal.Solution()
        .fractionToDecimal(numerator, denominator);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    int numerator = 2;
    int denominator = 3;
    String result = "0.(6)";
    String solution = new medium._0100_0199._166_fraction_to_recurring_decimal.Solution()
        .fractionToDecimal(numerator, denominator);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test3() {
    int numerator = 4;
    int denominator = 333;
    String result = "0.(012)";
    String solution = new medium._0100_0199._166_fraction_to_recurring_decimal.Solution()
        .fractionToDecimal(numerator, denominator);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test4() {
    int numerator = 1;
    int denominator = 5;
    String result = "0.2";
    String solution = new medium._0100_0199._166_fraction_to_recurring_decimal.Solution()
        .fractionToDecimal(numerator, denominator);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test5() {
    int numerator = 1;
    int denominator = 6;
    String result = "0.1(6)";
    String solution = new medium._0100_0199._166_fraction_to_recurring_decimal.Solution()
        .fractionToDecimal(numerator, denominator);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test6() {
    int numerator = 0;
    int denominator = 3;
    String result = "0";
    String solution = new medium._0100_0199._166_fraction_to_recurring_decimal.Solution()
        .fractionToDecimal(numerator, denominator);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test7() {
    int numerator = -50;
    int denominator = 8;
    String result = "-6.25";
    String solution = new medium._0100_0199._166_fraction_to_recurring_decimal.Solution()
        .fractionToDecimal(numerator, denominator);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test8() {
    int numerator = -22;
    int denominator = -2;
    String result = "11";
    String solution = new medium._0100_0199._166_fraction_to_recurring_decimal.Solution()
        .fractionToDecimal(numerator, denominator);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test9() {
    int numerator = -1;
    int denominator = -2147483648;
    String result = "0.0000000004656612873077392578125";
    String solution = new medium._0100_0199._166_fraction_to_recurring_decimal.Solution()
        .fractionToDecimal(numerator, denominator);
    Assert.assertTrue(result.equals(solution));
  }


}
