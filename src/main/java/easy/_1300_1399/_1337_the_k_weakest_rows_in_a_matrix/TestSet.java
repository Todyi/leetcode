package easy._1300_1399._1337_the_k_weakest_rows_in_a_matrix;


import common.Comparators;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[][] mat = {{1, 1, 0, 0, 0}, {1, 1, 1, 1, 0}, {1, 0, 0, 0, 0}, {1, 1, 0, 0, 0},
        {1, 1, 1, 1, 1}};
    int k = 3;
    int[] result = {2, 0, 3};
    int[] solution = new easy._1300_1399._1337_the_k_weakest_rows_in_a_matrix.Solution()
        .kWeakestRows(mat, k);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

  @Test
  public void test1() {
    int[][] mat = {{1, 0, 0, 0}, {1, 1, 1, 1}, {1, 0, 0, 0}, {1, 0, 0, 0}};
    int k = 2;
    int[] result = {0, 2};
    int[] solution = new easy._1300_1399._1337_the_k_weakest_rows_in_a_matrix.Solution()
        .kWeakestRows(mat, k);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

}
