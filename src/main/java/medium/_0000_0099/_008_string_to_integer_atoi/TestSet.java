package medium._0000_0099._008_string_to_integer_atoi;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    String s = "42";
    Integer result = 42;
    int solution = new medium._0000_0099._008_string_to_integer_atoi.Solution()
        .myAtoi(s);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    String s = "   -42";
    Integer result = -42;
    int solution = new medium._0000_0099._008_string_to_integer_atoi.Solution()
        .myAtoi(s);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    String s = "4193 with words";
    Integer result = 4193;
    int solution = new medium._0000_0099._008_string_to_integer_atoi.Solution()
        .myAtoi(s);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test3() {
    String s = "words and 987";
    Integer result = 0;
    int solution = new medium._0000_0099._008_string_to_integer_atoi.Solution()
        .myAtoi(s);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test4() {
    String s = "-91283472332";
    Integer result = -2147483648;
    int solution = new medium._0000_0099._008_string_to_integer_atoi.Solution()
        .myAtoi(s);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test5() {
    String s = "+1";
    Integer result = 1;
    int solution = new medium._0000_0099._008_string_to_integer_atoi.Solution()
        .myAtoi(s);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test6() {
    String s = "   +0 123";
    Integer result = 0;
    int solution = new medium._0000_0099._008_string_to_integer_atoi.Solution()
        .myAtoi(s);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test7() {
    String s = "9223372036854775808";
    Integer result = 2147483647;
    int solution = new medium._0000_0099._008_string_to_integer_atoi.Solution()
        .myAtoi(s);
    Assert.assertTrue(result.equals(solution));
  }
}
