package easy._0200_0299._263_ugly_number;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int input = 6;
    Boolean result = true;
    boolean resolution = new easy._0200_0299._263_ugly_number.Solution().isUgly(input);
    Assert.assertTrue(result.equals(resolution));
  }

  @Test
  public void test1() {
    int input = 8;
    Boolean result = true;
    boolean resolution = new easy._0200_0299._263_ugly_number.Solution().isUgly(input);
    Assert.assertTrue(result.equals(resolution));
  }

  @Test
  public void test2() {
    int input = 14;
    Boolean result = false;
    boolean resolution = new easy._0200_0299._263_ugly_number.Solution().isUgly(input);
    Assert.assertTrue(result.equals(resolution));
  }

  @Test
  public void test3() {
    int input = -2147483648;
    Boolean result = false;
    boolean resolution = new easy._0200_0299._263_ugly_number.Solution().isUgly(input);
    Assert.assertTrue(result.equals(resolution));
  }

}
