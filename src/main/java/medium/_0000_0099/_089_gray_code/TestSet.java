package medium._0000_0099._089_gray_code;


import common.Comparators;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int n = 2;
    Integer[] result = {0, 1, 3, 2};
    List<Integer> solution = new medium._0000_0099._089_gray_code.Solution()
        .grayCode(n);
    Integer[] solutionArr = new Integer[result.length];
    solution.toArray(solutionArr);
    Assert.assertTrue(Comparators.isSame(result, solutionArr));
  }

  @Test
  public void test1() {
    int n = 0;
    Integer[] result = {0};
    List<Integer> solution = new medium._0000_0099._089_gray_code.Solution()
        .grayCode(n);
    Integer[] solutionArr = new Integer[result.length];
    solution.toArray(solutionArr);
    Assert.assertTrue(Comparators.isSame(result, solutionArr));
  }

  @Test
  public void test3() {
    int n = 3;
    Integer[] result = {0, 1, 3, 2, 6, 7, 5, 4};
    List<Integer> solution = new medium._0000_0099._089_gray_code.Solution()
        .grayCode(n);
    Integer[] solutionArr = new Integer[result.length];
    solution.toArray(solutionArr);
    Assert.assertTrue(Comparators.isSame(result, solutionArr));
  }


}
