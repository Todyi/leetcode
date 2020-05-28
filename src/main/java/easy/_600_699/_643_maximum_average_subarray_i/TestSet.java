package easy._600_699._643_maximum_average_subarray_i;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[] nums = {1,12,-5,-6,50,3};
    int k = 4;
    Double result = 12.75D;
    double solution = new easy._600_699._643_maximum_average_subarray_i.Solution()
        .findMaxAverage(nums,k);
    Assert.assertTrue(result.equals(solution));
  }

}
