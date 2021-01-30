package medium._0100_0199._162_find_peak_element;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[] nums = {1, 2, 3, 1};
    Integer[] result = {2};
    int solution = new medium._0100_0199._162_find_peak_element.Solution()
        .findPeakElement(nums);
    for (Integer i : result) {
      if (i.equals(solution)) {
        return;
      }
    }
    Assert.assertTrue(false);
  }

  @Test
  public void test1() {
    int[] nums = {1, 2, 1, 3, 5, 6, 4};
    Integer[] result = {1, 5};
    int solution = new medium._0100_0199._162_find_peak_element.Solution()
        .findPeakElement(nums);
    for (Integer i : result) {
      if (i.equals(solution)) {
        return;
      }
    }
    Assert.assertTrue(false);
  }

  @Test
  public void test2() {
    int[] nums = {1};
    Integer[] result = {0};
    int solution = new medium._0100_0199._162_find_peak_element.Solution()
        .findPeakElement(nums);
    for (Integer i : result) {
      if (i.equals(solution)) {
        return;
      }
    }
    Assert.assertTrue(false);
  }

  @Test
  public void test3() {
    int[] nums = {2, 1};
    Integer[] result = {0};
    int solution = new medium._0100_0199._162_find_peak_element.Solution()
        .findPeakElement(nums);
    for (Integer i : result) {
      if (i.equals(solution)) {
        return;
      }
    }
    Assert.assertTrue(false);
  }


}
