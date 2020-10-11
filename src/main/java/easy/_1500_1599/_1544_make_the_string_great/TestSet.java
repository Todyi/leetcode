package easy._1500_1599._1544_make_the_string_great;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    String s = "leEeetcode";
    String result = "leetcode";
    String solution = new easy._1500_1599._1544_make_the_string_great.Solution()
        .makeGood(s);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    String s = "abBAcC";
    String result = "";
    String solution = new easy._1500_1599._1544_make_the_string_great.Solution()
        .makeGood(s);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    String s = "s";
    String result = "s";
    String solution = new easy._1500_1599._1544_make_the_string_great.Solution()
        .makeGood(s);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test3() {
    String s = "mC";
    String result = "mC";
    String solution = new easy._1500_1599._1544_make_the_string_great.Solution()
        .makeGood(s);
    Assert.assertTrue(result.equals(solution));
  }

}
