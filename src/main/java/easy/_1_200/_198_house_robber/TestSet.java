package easy._1_200._198_house_robber;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[] input = {1,2,3,1};
    Integer result = 4;
    int resolution = new Solution().rob(input);
    Assert.assertTrue(result.equals(resolution));
  }

  @Test
  public void test1() {
    int[] input = {2,7,9,3,1};
    Integer result = 12;
    int resolution = new Solution().rob(input);
    Assert.assertTrue(result.equals(resolution));
  }

  @Test
  public void test2() {
    int[] input = {2,1,1,2};
    Integer result = 4;
    int resolution = new Solution().rob(input);
    Assert.assertTrue(result.equals(resolution));
  }

  @Test
  public void test3() {
    int[] input = {
        0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0
    };
    Integer result = 0;
    int resolution = new Solution().rob(input);
    Assert.assertTrue(result.equals(resolution));
  }

}
