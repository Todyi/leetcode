package medium._0200_0299._229_majority_element_ii;


import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[] nums = {3, 2, 3};
    Integer[] result = {3};
    List<Integer> solution = new medium._0200_0299._229_majority_element_ii.Solution()
        .majorityElement(nums);
    Assert.assertTrue(result.length == solution.size());
    for (int i = 0; i < result.length; i++) {
      Assert.assertTrue(result[i] == solution.get(i));
    }
  }

  @Test
  public void test1() {
    int[] nums = {1};
    Integer[] result = {1};
    List<Integer> solution = new medium._0200_0299._229_majority_element_ii.Solution()
        .majorityElement(nums);
    Assert.assertTrue(result.length == solution.size());
    for (int i = 0; i < result.length; i++) {
      Assert.assertTrue(result[i] == solution.get(i));
    }
  }

  @Test
  public void test2() {
    int[] nums = {1, 2};
    Integer[] result = {1, 2};
    List<Integer> solution = new medium._0200_0299._229_majority_element_ii.Solution()
        .majorityElement(nums);
    Assert.assertTrue(result.length == solution.size());
    for (int i = 0; i < result.length; i++) {
      Assert.assertTrue(result[i] == solution.get(i));
    }
  }


}
