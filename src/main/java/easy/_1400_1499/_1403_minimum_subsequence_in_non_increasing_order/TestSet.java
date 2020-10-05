package easy._1400_1499._1403_minimum_subsequence_in_non_increasing_order;


import common.Comparators;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[] nums = {4, 3, 10, 9, 8};
    Integer[] result = {10, 9};
    List<Integer> solution = new easy._1400_1499._1403_minimum_subsequence_in_non_increasing_order.Solution()
        .minSubsequence(nums);
    Integer[] solutionArr = new Integer[solution.size()];
    solution.toArray(solutionArr);
    Assert.assertTrue(Comparators.isSame(result, solutionArr));
  }

  @Test
  public void test1() {
    int[] nums = {4, 4, 7, 6, 7};
    Integer[] result = {7, 7, 6};
    List<Integer> solution = new easy._1400_1499._1403_minimum_subsequence_in_non_increasing_order.Solution()
        .minSubsequence(nums);
    Integer[] solutionArr = new Integer[solution.size()];
    solution.toArray(solutionArr);
    Assert.assertTrue(Comparators.isSame(result, solutionArr));
  }

  @Test
  public void test2() {
    int[] nums = {6};
    Integer[] result = {6};
    List<Integer> solution = new easy._1400_1499._1403_minimum_subsequence_in_non_increasing_order.Solution()
        .minSubsequence(nums);
    Integer[] solutionArr = new Integer[solution.size()];
    solution.toArray(solutionArr);
    Assert.assertTrue(Comparators.isSame(result, solutionArr));
  }

}
