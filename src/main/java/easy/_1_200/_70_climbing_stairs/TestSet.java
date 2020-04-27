package easy._1_200._70_climbing_stairs;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test() {
    int x = 2;
    int result = 2;
    Assert.assertEquals(result, new Solution().climbStairs(x));
  }

  @Test
  public void test1() {
    int x = 3;
    int result = 3;
    Assert.assertEquals(result, new Solution().climbStairs(x));
  }

  @Test
  public void test2() {
    int x = 4;
    int result = 5;
    Assert.assertEquals(result, new Solution().climbStairs(x));
  }
}
