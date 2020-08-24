package easy._900_999._905_sort_array_by_parity;


import common.Comparators;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[] A = {3, 1, 2, 4};
    int[] result = {2, 4, 3, 1};
    int[] solution = new easy._900_999._905_sort_array_by_parity.Solution()
        .sortArrayByParity(A);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

  @Test
  public void test1() {
    int[] A = {0, 2, 1};
    int[] result = {0, 2, 1};
    int[] solution = new easy._900_999._905_sort_array_by_parity.Solution()
        .sortArrayByParity(A);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

}
