package easy._1300_1399._1370_increasing_decreasing_string;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    String s = "aaaabbbbcccc";
    String result = "abccbaabccba";
    String solution = new easy._1300_1399._1370_increasing_decreasing_string.Solution()
        .sortString( s);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    String s = "rat";
    String result = "art";
    String solution = new easy._1300_1399._1370_increasing_decreasing_string.Solution()
        .sortString( s);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    String s = "leetcode";
    String result = "cdelotee";
    String solution = new easy._1300_1399._1370_increasing_decreasing_string.Solution()
        .sortString( s);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test3() {
    String s = "ggggggg";
    String result = "ggggggg";
    String solution = new easy._1300_1399._1370_increasing_decreasing_string.Solution()
        .sortString( s);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test4() {
    String s = "spo";
    String result = "ops";
    String solution = new easy._1300_1399._1370_increasing_decreasing_string.Solution()
        .sortString( s);
    Assert.assertTrue(result.equals(solution));
  }

}
