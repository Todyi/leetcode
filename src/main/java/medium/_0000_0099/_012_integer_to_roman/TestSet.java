package medium._0000_0099._012_integer_to_roman;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int num = 3;
    String result = "III";
    String solution = new medium._0000_0099._012_integer_to_roman.Solution()
        .intToRoman(num);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    int num = 4;
    String result = "IV";
    String solution = new medium._0000_0099._012_integer_to_roman.Solution()
        .intToRoman(num);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    int num = 9;
    String result = "IX";
    String solution = new medium._0000_0099._012_integer_to_roman.Solution()
        .intToRoman(num);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test3() {
    int num = 58;
    String result = "LVIII";
    String solution = new medium._0000_0099._012_integer_to_roman.Solution()
        .intToRoman(num);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test4() {
    int num = 1994;
    String result = "MCMXCIV";
    String solution = new medium._0000_0099._012_integer_to_roman.Solution()
        .intToRoman(num);
    Assert.assertTrue(result.equals(solution));
  }
}
