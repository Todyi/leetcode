package medium._0000_0099._091_decode_ways;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    String s = "12";
    Integer result = 2;
    int solution = new medium._0000_0099._091_decode_ways.Solution()
        .numDecodings(s);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    String s = "226";
    Integer result = 3;
    int solution = new medium._0000_0099._091_decode_ways.Solution()
        .numDecodings(s);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    String s = "0";
    Integer result = 0;
    int solution = new medium._0000_0099._091_decode_ways.Solution()
        .numDecodings(s);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test3() {
    String s = "1";
    Integer result = 1;
    int solution = new medium._0000_0099._091_decode_ways.Solution()
        .numDecodings(s);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test4() {
    String s = "10";
    Integer result = 1;
    int solution = new medium._0000_0099._091_decode_ways.Solution()
        .numDecodings(s);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test5() {
    String s = "27";
    Integer result = 1;
    int solution = new medium._0000_0099._091_decode_ways.Solution()
        .numDecodings(s);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test6() {
    String s = "111111111111111111111111111111111111111111111";
    Integer result = 1836311903;
    int solution = new medium._0000_0099._091_decode_ways.Solution()
        .numDecodings(s);
    Assert.assertTrue(result.equals(solution));
  }


}
