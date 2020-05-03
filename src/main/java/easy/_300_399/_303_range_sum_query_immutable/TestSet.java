package easy._300_399._303_range_sum_query_immutable;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[] input = {-2,0,3,-5,2,-1};
    NumArray numArray = new easy._300_399._303_range_sum_query_immutable.NumArray(input);
    int resolution = numArray.sumRange(0,2);
    int result = 1;
    Assert.assertEquals(result,resolution);
    result = -1;
    resolution=numArray.sumRange(2,5);
    Assert.assertEquals(result,resolution);
    result = -3;
    resolution = numArray.sumRange(0,5);
    Assert.assertEquals(result,resolution);
  }


}
