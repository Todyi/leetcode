package easy._0900_0999._922_sort_array_by_parity_ii;


import common.Comparators;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[] A = {4, 2, 5, 7};
    int[] result = {4, 5, 2, 7};
    int[] solution = new easy._0900_0999._922_sort_array_by_parity_ii.Solution()
        .sortArrayByParityII(A);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

  @Test
  public void test1() {
    int[] A = {2, 3, 1, 1, 4, 0, 0, 4, 3, 3};
    int[] result = {2, 3, 0, 1, 4, 1, 0, 3, 4, 3};
//    int[] result = {2, 3, 4, 1, 4, 3, 0, 1, 0, 3};
    int[] solution = new easy._0900_0999._922_sort_array_by_parity_ii.Solution()
        .sortArrayByParityII(A);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

}
