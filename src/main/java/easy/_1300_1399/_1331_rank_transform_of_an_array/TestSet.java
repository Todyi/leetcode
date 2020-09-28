package easy._1300_1399._1331_rank_transform_of_an_array;


import common.Comparators;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[] arr = {40, 10, 20, 30};
    int[] result = {4, 1, 2, 3};
    int[] solution = new easy._1300_1399._1331_rank_transform_of_an_array.Solution()
        .arrayRankTransform(arr);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

  @Test
  public void test1() {
    int[] arr = {100, 100, 100};
    int[] result = {1, 1, 1};
    int[] solution = new easy._1300_1399._1331_rank_transform_of_an_array.Solution()
        .arrayRankTransform(arr);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

  @Test
  public void test2() {
    int[] arr = {37, 12, 28, 9, 100, 56, 80, 5, 12};
    int[] result = {5, 3, 4, 2, 8, 6, 7, 1, 3};
    int[] solution = new easy._1300_1399._1331_rank_transform_of_an_array.Solution()
        .arrayRankTransform(arr);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

  @Test
  public void test3() {
    int[] arr = {};
    int[] result = {};
    int[] solution = new easy._1300_1399._1331_rank_transform_of_an_array.Solution()
        .arrayRankTransform(arr);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }


}
