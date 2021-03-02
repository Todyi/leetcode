package medium._0200_0299._215_kth_largest_element_in_an_array;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[] nums = {3, 2, 1, 5, 6, 4};
    int k = 2;
    Integer result = 5;
    int solution = new medium._0200_0299._215_kth_largest_element_in_an_array.Solution()
        .findKthLargest(nums, k);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    int[] nums = {3, 2, 3, 1, 2, 4, 5, 5, 6};
    int k = 4;
    Integer result = 4;
    int solution = new medium._0200_0299._215_kth_largest_element_in_an_array.Solution()
        .findKthLargest(nums, k);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    int[] nums = {-1, 2, 0};
    int k = 2;
    Integer result = 0;
    int solution = new medium._0200_0299._215_kth_largest_element_in_an_array.Solution()
        .findKthLargest(nums, k);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test3() {
    int[] nums = {3, 1, 2, 4};
    int k = 2;
    Integer result = 3;
    int solution = new medium._0200_0299._215_kth_largest_element_in_an_array.Solution()
        .findKthLargest(nums, k);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test4() {
    int[] nums = {5, 2, 4, 1, 3, 6, 0};
    int k = 2;
    Integer result = 5;
    int solution = new medium._0200_0299._215_kth_largest_element_in_an_array.Solution()
        .findKthLargest(nums, k);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test5() {
    int[] nums = {2, 1};
    int k = 2;
    Integer result = 1;
    int solution = new medium._0200_0299._215_kth_largest_element_in_an_array.Solution()
        .findKthLargest(nums, k);
    Assert.assertTrue(result.equals(solution));
  }

}
