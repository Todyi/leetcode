package easy._0500_0599._520_detect_capital;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    String word = "USA";
    Boolean result = true;
    boolean solution = new easy._0500_0599._520_detect_capital.Solution()
        .detectCapitalUse(word);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    String word = "FlaG";
    Boolean result = false;
    boolean solution = new easy._0500_0599._520_detect_capital.Solution()
        .detectCapitalUse(word);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    String word = "G";
    Boolean result = true;
    boolean solution = new easy._0500_0599._520_detect_capital.Solution()
        .detectCapitalUse(word);
    Assert.assertTrue(result.equals(solution));
  }
  @Test
  public void test3() {
    String word = "Google";
    Boolean result = true;
    boolean solution = new easy._0500_0599._520_detect_capital.Solution()
        .detectCapitalUse(word);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test4() {
    String word = "FFFFFFFFf";
    Boolean result = false;
    boolean solution = new easy._0500_0599._520_detect_capital.Solution()
        .detectCapitalUse(word);
    Assert.assertTrue(result.equals(solution));
  }

}
