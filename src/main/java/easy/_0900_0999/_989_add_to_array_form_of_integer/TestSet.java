package easy._0900_0999._989_add_to_array_form_of_integer;


import common.Comparators;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  private void assertTrue(int[] a, int k, Integer[] result) {
    List<Integer> solution = new Solution()
        .addToArrayForm(a, k);
    Integer[] solutionArr = new Integer[solution.size()];
    solution.toArray(solutionArr);
    Assert.assertTrue(Comparators.isSame(result, solutionArr));
  }

  @Test
  public void test0() {
    int[] A = {1, 2, 0, 0};
    int K = 34;
    Integer[] result = {1, 2, 3, 4};
    assertTrue(A, K, result);
  }

  @Test
  public void test1() {
    int[] A = {2, 7, 4};
    int K = 181;
    Integer[] result = {4, 5, 5};
    assertTrue(A, K, result);
  }

  @Test
  public void test2() {
    int[] A = {2, 1, 5};
    int K = 806;
    Integer[] result = {1, 0, 2, 1};
    assertTrue(A, K, result);
  }

  @Test
  public void test3() {
    int[] A = {9, 9, 9, 9, 9, 9, 9, 9, 9, 9};
    int K = 1;
    Integer[] result = {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    assertTrue(A, K, result);
  }

  @Test
  public void test4() {
    int[] A = {1};
    int K = 999;
    Integer[] result = {1, 0, 0, 0};
    assertTrue(A, K, result);
  }


}
