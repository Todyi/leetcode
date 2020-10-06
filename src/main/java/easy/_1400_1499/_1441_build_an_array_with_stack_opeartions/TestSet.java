package easy._1400_1499._1441_build_an_array_with_stack_opeartions;


import common.Comparators;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[] target = {1, 3};
    int n = 3;
    String[] result = {"Push", "Push", "Pop", "Push"};
    List<String> solution = new easy._1400_1499._1441_build_an_array_with_stack_opeartions.Solution()
        .buildArray(target, n);
    String[] solutionArr = new String[solution.size()];
    solution.toArray(solutionArr);
    Assert.assertTrue(Comparators.isSame(result, solutionArr));
  }

  @Test
  public void test1() {
    int[] target = {1, 2, 3};
    int n = 3;
    String[] result = {"Push", "Push", "Push"};
    List<String> solution = new easy._1400_1499._1441_build_an_array_with_stack_opeartions.Solution()
        .buildArray(target, n);
    String[] solutionArr = new String[solution.size()];
    solution.toArray(solutionArr);
    Assert.assertTrue(Comparators.isSame(result, solutionArr));
  }

  @Test
  public void test2() {
    int[] target = {1, 2};
    int n = 4;
    String[] result = {"Push", "Push"};
    List<String> solution = new easy._1400_1499._1441_build_an_array_with_stack_opeartions.Solution()
        .buildArray(target, n);
    String[] solutionArr = new String[solution.size()];
    solution.toArray(solutionArr);
    Assert.assertTrue(Comparators.isSame(result, solutionArr));
  }

  @Test
  public void test3() {
    int[] target = {2, 3, 4};
    int n = 4;
    String[] result = {"Push", "Pop", "Push", "Push", "Push"};
    List<String> solution = new easy._1400_1499._1441_build_an_array_with_stack_opeartions.Solution()
        .buildArray(target, n);
    String[] solutionArr = new String[solution.size()];
    solution.toArray(solutionArr);
    Assert.assertTrue(Comparators.isSame(result, solutionArr));
  }

}
