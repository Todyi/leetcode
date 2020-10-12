package easy._0900_0999._977_squares_of_a_sorted_array;


import common.Comparators;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[] A = {-4, -1, 0, 3, 10};
    int[] result = {0, 1, 9, 16, 100};
    int[] solution = new easy._0900_0999._977_squares_of_a_sorted_array.Solution()
        .sortedSquares(A);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

  @Test
  public void test1() {
    int[] A = {-7, -3, 2, 3, 11};
    int[] result = {4, 9, 9, 49, 121};
    int[] solution = new easy._0900_0999._977_squares_of_a_sorted_array.Solution()
        .sortedSquares(A);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

}
