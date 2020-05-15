package easy._500_599._561_array_partition_i;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[] nums = {1,4,3,2};
    Integer result = 4;
    int solution = new easy._500_599._561_array_partition_i.Solution()
        .arrayPairSum(nums);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    int[] nums = {1,1,2,2,3,3,4,5};
    Integer result = 10;
    int solution = new easy._500_599._561_array_partition_i.Solution()
        .arrayPairSum(nums);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    int[] nums = {1,2,3,2};
    Integer result = 3;
    int solution = new easy._500_599._561_array_partition_i.Solution()
        .arrayPairSum(nums);
    Assert.assertTrue(result.equals(solution));
  }

}
