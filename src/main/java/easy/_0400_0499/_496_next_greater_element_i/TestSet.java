package easy._0400_0499._496_next_greater_element_i;


import common.Comparators;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[] nums1 = {4, 1, 2};
    int[] nums2 = {1, 3, 4, 2};
    int[] result = {-1, 3, -1};
    int[] solution = new easy._0400_0499._496_next_greater_element_i.Solution()
        .nextGreaterElement(nums1, nums2);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

  @Test
  public void test1() {
    int[] nums1 = {};
    int[] nums2 = {};
    int[] result = {};
    int[] solution = new easy._0400_0499._496_next_greater_element_i.Solution()
        .nextGreaterElement(nums1, nums2);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

  @Test
  public void test2() {
    int[] nums1 = {1,3,5,2,4};
    int[] nums2 = {6,5,4,3,2,1,7};
    int[] result = {7,7,7,7,7};
    int[] solution = new easy._0400_0499._496_next_greater_element_i.Solution()
        .nextGreaterElement(nums1, nums2);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }
}
