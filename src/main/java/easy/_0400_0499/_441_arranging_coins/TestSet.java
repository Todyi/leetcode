package easy._0400_0499._441_arranging_coins;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {


  @Test
  public void test0() {
    int n = 5;
    Integer result = 2;
    int solution = new easy._0400_0499._441_arranging_coins.Solution().arrangeCoins(n);
    Assert.assertTrue(result.equals(solution));
  }


  @Test
  public void test1() {
    int n = 8;
    Integer result = 3;
    int solution = new easy._0400_0499._441_arranging_coins.Solution().arrangeCoins(n);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    int n = 1804289383;
    Integer result = 60070;
    int solution = new easy._0400_0499._441_arranging_coins.Solution().arrangeCoins(n);
    Assert.assertTrue(result.equals(solution));
  }

}
