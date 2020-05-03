package easy._100_199._189_rotate_array;


import common.Comparators;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[] input = {1,2,3,4,5,6,7};
    int k = 3;
    int[] result = {5,6,7,1,2,3,4};
    new Solution().rotate(input,k);
    Assert.assertTrue(Comparators.isSame(result,input));
  }

  @Test
  public void test1() {
    int[] input = {-1,-100,3,99};
    int k = 2;
    int[] result = {3,99,-1,-100};
    new Solution().rotate(input,k);
    Assert.assertTrue(Comparators.isSame(result,input));
  }

  @Test
  public void test2() {
    int[] input = {1,2};
    int k = 3;
    int[] result = {2,1};
    new Solution().rotate(input,k);
    Assert.assertTrue(Comparators.isSame(result,input));
  }

}
