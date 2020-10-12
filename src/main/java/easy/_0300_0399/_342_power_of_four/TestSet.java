package easy._0300_0399._342_power_of_four;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int input = 4;
    Boolean result = true;
    boolean resolution = new easy._0300_0399._342_power_of_four.Solution().isPowerOfFour(input);
    Assert.assertTrue(result.equals(resolution));
  }

  @Test
  public void test1() {
    int input = 16;
    Boolean result = true;
    boolean resolution = new easy._0300_0399._342_power_of_four.Solution().isPowerOfFour(input);
    Assert.assertTrue(result.equals(resolution));
  }

  @Test
  public void test2() {
    int input = 5;
    Boolean result = false;
    boolean resolution = new easy._0300_0399._342_power_of_four.Solution().isPowerOfFour(input);
    Assert.assertTrue(result.equals(resolution));
  }

}
