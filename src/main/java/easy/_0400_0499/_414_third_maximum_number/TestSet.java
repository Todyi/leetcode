package easy._0400_0499._414_third_maximum_number;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[] nums = {3, 2, 1};
    Integer result = 1;
    int solution = new easy._0400_0499._414_third_maximum_number.Solution().thirdMax(nums);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    int[] nums = {2, 1};
    Integer result = 2;
    int solution = new easy._0400_0499._414_third_maximum_number.Solution().thirdMax(nums);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    int[] nums = {2, 2, 3, 1};
    Integer result = 1;
    int solution = new easy._0400_0499._414_third_maximum_number.Solution().thirdMax(nums);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test3() {
    int[] nums = {1, 2, -2147483648};
    Integer result = -2147483648;
    int solution = new easy._0400_0499._414_third_maximum_number.Solution().thirdMax(nums);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test4() {
    int[] nums = {2, -2147483648};
    Integer result = 2;
    int solution = new easy._0400_0499._414_third_maximum_number.Solution().thirdMax(nums);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test5() {
    int[] nums = {-2147483648, 1, 2};
    Integer result = -2147483648;
    int solution = new easy._0400_0499._414_third_maximum_number.Solution().thirdMax(nums);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test6() {
    int[] nums = {-2147483648, 1, 1};
    Integer result = 1;
    int solution = new easy._0400_0499._414_third_maximum_number.Solution().thirdMax(nums);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test7() {
    int[] nums = {1,1,2};
    Integer result = 2;
    int solution = new easy._0400_0499._414_third_maximum_number.Solution().thirdMax(nums);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test8() {
    int[] nums = {1,2,2,5,3,5};
    Integer result = 2;
    int solution = new easy._0400_0499._414_third_maximum_number.Solution().thirdMax(nums);
    Assert.assertTrue(result.equals(solution));
  }

}
