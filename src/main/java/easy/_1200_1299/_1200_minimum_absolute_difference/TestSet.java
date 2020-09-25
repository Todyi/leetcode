package easy._1200_1299._1200_minimum_absolute_difference;


import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  private void assertTrue(int[] arr, int[][] result) {
    List<List<Integer>> solution = new Solution()
        .minimumAbsDifference(arr);
    for (int i = 0; i < solution.size(); i++) {
      for (int j = 0; j < solution.get(i).size(); j++) {
        if (result[i][j] != solution.get(i).get(j)) {
          Assert.assertTrue(false);
        }
      }
    }
    Assert.assertTrue(true);
  }

  @Test
  public void test0() {
    int[] arr = {4, 2, 1, 3};
    int[][] result = {{1, 2}, {2, 3}, {3, 4}};
    assertTrue(arr, result);
  }

  @Test
  public void test1() {
    int[] arr = {1, 3, 6, 10, 15};
    int[][] result = {{1, 3}};
    assertTrue(arr, result);
  }

  @Test
  public void test2() {
    int[] arr = {3, 8, -10, 23, 19, -4, -14, 27};
    int[][] result = {{-14, -10}, {19, 23}, {23, 27}};
    assertTrue(arr, result);
  }
}
