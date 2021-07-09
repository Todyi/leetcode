package medium._0200_0299._264_ugly_number_ii;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int n = 10;
    Integer result = 12;
    int solution = new medium._0200_0299._264_ugly_number_ii.Solution()
        .nthUglyNumber(n);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    int n = 1;
    Integer result = 1;
    int solution = new medium._0200_0299._264_ugly_number_ii.Solution()
        .nthUglyNumber(n);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    int n = 1407;
    Integer result = 536870912;
    int solution = new medium._0200_0299._264_ugly_number_ii.Solution()
        .nthUglyNumber(n);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test3() {
    int n = 37;
    Integer result = 125;
    int solution = new medium._0200_0299._264_ugly_number_ii.Solution()
        .nthUglyNumber(n);
    Assert.assertTrue(result.equals(solution));
  }


}
