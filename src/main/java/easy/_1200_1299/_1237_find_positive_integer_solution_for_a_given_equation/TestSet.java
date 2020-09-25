package easy._1200_1299._1237_find_positive_integer_solution_for_a_given_equation;


import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  private void assertTrue(CustomFunction customfunction, int z, int[][] result) {
    List<List<Integer>> solution = new Solution()
        .findSolution(customfunction, z);
    for (int i = 0; i < result.length; i++) {
      for (int j = 0; j < result[i].length; j++) {
        if (solution.get(i).get(j) != result[i][j]) {
          Assert.assertTrue(false);
        }
      }
    }
    Assert.assertTrue(true);
  }

  @Test
  public void test0() {
    CustomFunction customfunction = new CustomFunction(1);
    int z = 5;
    int[][] result = {{1, 4}, {2, 3}, {3, 2}, {4, 1}};
    assertTrue(customfunction, z, result);
  }

  @Test
  public void test1() {
    CustomFunction customfunction = new CustomFunction(2);
    int z = 5;
    int[][] result = {{1, 5}, {5, 1}};
    assertTrue(customfunction, z, result);
  }

}
