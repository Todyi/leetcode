package medium._0200_0299._241_different_ways_to_add_parentheses;


import common.Comparators;
import common.TreeNode;
import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {


  @Test
  public void test0() {
    String input = "2-1-1";
    Integer[] result = {0, 2};
    List<Integer> solution = new medium._0200_0299._241_different_ways_to_add_parentheses.Solution()
        .diffWaysToCompute(input);
    Assert.assertTrue(result.length == solution.size());
    Integer[] arr = new Integer[solution.size()];
    solution.toArray(arr);
    Arrays.sort(result);
    Arrays.sort(arr);
    Assert.assertTrue(Comparators.isSame(result, arr));
  }

  @Test
  public void test1() {
    String input = "2*3-4*5";
    Integer[] result = {-34, -14, -10, -10, 10};
    List<Integer> solution = new medium._0200_0299._241_different_ways_to_add_parentheses.Solution()
        .diffWaysToCompute(input);
    Assert.assertTrue(result.length == solution.size());
    Integer[] arr = new Integer[solution.size()];
    solution.toArray(arr);
    Arrays.sort(result);
    Arrays.sort(arr);
    Assert.assertTrue(Comparators.isSame(result, arr));
  }

  @Test
  public void test2() {
    String input = "23-4*5";
    Integer[] result = {95,3};
    List<Integer> solution = new medium._0200_0299._241_different_ways_to_add_parentheses.Solution()
        .diffWaysToCompute(input);
    Assert.assertTrue(result.length == solution.size());
    Integer[] arr = new Integer[solution.size()];
    solution.toArray(arr);
    Arrays.sort(result);
    Arrays.sort(arr);
    Assert.assertTrue(Comparators.isSame(result, arr));
  }


}
