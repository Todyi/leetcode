package easy._0200_0299._231_power_of_two;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int input = 1;
    Boolean result = true;
    boolean resolution = new easy._0200_0299._231_power_of_two.Solution().isPowerOfTwo(input);
    Assert.assertTrue(result.equals(resolution));
  }

  @Test
  public void test1() {
    int input = 16;
    Boolean result = true;
    boolean resolution = new easy._0200_0299._231_power_of_two.Solution().isPowerOfTwo(input);
    Assert.assertTrue(result.equals(resolution));
  }

  @Test
  public void test2() {
    int input = 218;
    Boolean result = false;
    boolean resolution = new easy._0200_0299._231_power_of_two.Solution().isPowerOfTwo(input);
    Assert.assertTrue(result.equals(resolution));
  }
}
