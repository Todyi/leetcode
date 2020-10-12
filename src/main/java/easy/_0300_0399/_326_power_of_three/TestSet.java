package easy._0300_0399._326_power_of_three;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int input = 27;
    Boolean result = true;
    boolean resolution = new easy._0300_0399._326_power_of_three.Solution().isPowerOfThree(input);
    Assert.assertTrue(result.equals(resolution));
  }

  @Test
  public void test1() {
    int input = 0;
    Boolean result = false;
    boolean resolution = new easy._0300_0399._326_power_of_three.Solution().isPowerOfThree(input);
    Assert.assertTrue(result.equals(resolution));
  }

  @Test
  public void test2() {
    int input = 9;
    Boolean result = true;
    boolean resolution = new easy._0300_0399._326_power_of_three.Solution().isPowerOfThree(input);
    Assert.assertTrue(result.equals(resolution));
  }

  @Test
  public void test3() {
    int input = 45;
    Boolean result = false;
    boolean resolution = new easy._0300_0399._326_power_of_three.Solution().isPowerOfThree(input);
    Assert.assertTrue(result.equals(resolution));
  }

}
