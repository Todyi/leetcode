package easy._0500_0599._581_shortest_unsorted_continuous_subarray;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[] nums = new int[]{2, 6, 4, 8, 10, 9, 15};
    Integer result = 5;
    int solution = new easy._0500_0599._581_shortest_unsorted_continuous_subarray.Solution()
        .findUnsortedSubarray(nums);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    int[] nums = new int[]{1, 2, 3, 4, 5, 4, 3, 2, 1};
    Integer result = 8;
    int solution = new easy._0500_0599._581_shortest_unsorted_continuous_subarray.Solution()
        .findUnsortedSubarray(nums);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    int[] nums = new int[]{2, 1};
    Integer result = 2;
    int solution = new easy._0500_0599._581_shortest_unsorted_continuous_subarray.Solution()
        .findUnsortedSubarray(nums);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test3() {
    int[] nums = new int[]{3, 2, 1};
    Integer result = 3;
    int solution = new easy._0500_0599._581_shortest_unsorted_continuous_subarray.Solution()
        .findUnsortedSubarray(nums);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test4() {
    int[] nums = new int[]{3, 2, 2, 1};
    Integer result = 4;
    int solution = new easy._0500_0599._581_shortest_unsorted_continuous_subarray.Solution()
        .findUnsortedSubarray(nums);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test5() {
    int[] nums = new int[]{1,2,3,4,10,0,6,7,8,9};
    Integer result = 10;
    int solution = new easy._0500_0599._581_shortest_unsorted_continuous_subarray.Solution()
        .findUnsortedSubarray(nums);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test6() {
    int[] nums = new int[]{1,2,3,4};
    Integer result = 0;
    int solution = new easy._0500_0599._581_shortest_unsorted_continuous_subarray.Solution()
        .findUnsortedSubarray(nums);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test7() {
    int[] nums = new int[]{2,1,5,3,4};
    Integer result = 5;
    int solution = new easy._0500_0599._581_shortest_unsorted_continuous_subarray.Solution()
        .findUnsortedSubarray(nums);
    Assert.assertTrue(result.equals(solution));
  }

}
