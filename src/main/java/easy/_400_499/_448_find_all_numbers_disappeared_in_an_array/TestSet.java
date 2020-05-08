package easy._400_499._448_find_all_numbers_disappeared_in_an_array;


import common.Comparators;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {


  @Test
  public void test0() {
    int[] points = {4, 3, 2, 7, 8, 2, 3, 1};
    Integer[] result = {5, 6};
    List<Integer> solution = new easy._400_499._448_find_all_numbers_disappeared_in_an_array.Solution()
        .findDisappearedNumbers(points);
    Integer[] solutionArr = new Integer[solution.size()];
    solution.toArray(solutionArr);
    Assert.assertTrue(Comparators.isSame(result, solutionArr));
  }

}
