package easy._0900_0999._985_sum_of_even_numbers_after_queries;


import common.Comparators;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[] A = {1, 2, 3, 4};
    int[][] queries = {{1, 0}, {-3, 1}, {-4, 0}, {2, 3}};
    int[] result = {8, 6, 2, 4};
    int[] solution = new easy._0900_0999._985_sum_of_even_numbers_after_queries.Solution()
        .sumEvenAfterQueries(A, queries);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

}
