package easy._500_599._520_detect_capital;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    String word = "USA";
    Boolean result = true;
    boolean solution = new easy._500_599._520_detect_capital.Solution()
        .detectCapitalUse(word);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    String word = "FlaG";
    Boolean result = false;
    boolean solution = new easy._500_599._520_detect_capital.Solution()
        .detectCapitalUse(word);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    String word = "G";
    Boolean result = true;
    boolean solution = new easy._500_599._520_detect_capital.Solution()
        .detectCapitalUse(word);
    Assert.assertTrue(result.equals(solution));
  }

}
