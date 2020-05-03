package easy._000_099._69_sqrt_x;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test() {
    int x = 4;
    int result = 2;
    Assert.assertEquals(result, new Solution().mySqrt(x));
  }

  @Test
  public void test1() {
    int x = 8;
    int result = 2;
    Assert.assertEquals(result, new Solution().mySqrt(x));
  }

  @Test
  public void test6() {
    int x = 6;
    int result = 2;
    Assert.assertEquals(result, new Solution().mySqrt(x));
  }

  @Test
  public void test2147395600() {
    int x = 2147395600;
    int result = 46340;
    Assert.assertEquals(result, new Solution().mySqrt(x));
  }
  @Test
  public void test2147483647() {
    int x = 2147483647;
    int result = 46340;
    Assert.assertEquals(result, new Solution().mySqrt(x));
  }
}
