package medium._0200_0299._260_single_number_iii;


import common.Comparators;
import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {


  @Test
  public void test0() {
    int[] nums = {1, 2, 1, 3, 2, 5};
    int[] result = {3, 5};
    int[] solution = new medium._0200_0299._260_single_number_iii.Solution()
        .singleNumber(nums);
    Assert.assertTrue(result.length == solution.length);
    Arrays.sort(solution);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

  @Test
  public void test1() {
    int[] nums = {-1, 0};
    int[] result = {-1, 0};
    int[] solution = new medium._0200_0299._260_single_number_iii.Solution()
        .singleNumber(nums);
    Assert.assertTrue(result.length == solution.length);
    Arrays.sort(result);
    Arrays.sort(solution);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

  @Test
  public void test2() {
    int[] nums = {0, 1};
    int[] result = {0, 1};
    int[] solution = new medium._0200_0299._260_single_number_iii.Solution()
        .singleNumber(nums);
    Assert.assertTrue(result.length == solution.length);
    Arrays.sort(result);
    Arrays.sort(solution);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }


}
