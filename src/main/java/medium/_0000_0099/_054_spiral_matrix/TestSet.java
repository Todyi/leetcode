package medium._0000_0099._054_spiral_matrix;


import common.Comparators;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    Integer[] result = {1, 2, 3, 6, 9, 8, 7, 4, 5};
    List<Integer> solution = new medium._0000_0099._054_spiral_matrix.Solution()
        .spiralOrder(matrix);
    Integer[] solutionArr = new Integer[solution.size()];
    solution.toArray(solutionArr);
    Assert.assertTrue(Comparators.isSame(result, solutionArr));
  }

  @Test
  public void test1() {
    int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
    Integer[] result = {1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7};
    List<Integer> solution = new medium._0000_0099._054_spiral_matrix.Solution()
        .spiralOrder(matrix);
    Integer[] solutionArr = new Integer[solution.size()];
    solution.toArray(solutionArr);
    Assert.assertTrue(Comparators.isSame(result, solutionArr));
  }

  @Test
  public void test2() {
    int[][] matrix = {};
    Integer[] result = {};
    List<Integer> solution = new medium._0000_0099._054_spiral_matrix.Solution()
        .spiralOrder(matrix);
    Integer[] solutionArr = new Integer[solution.size()];
    solution.toArray(solutionArr);
    Assert.assertTrue(Comparators.isSame(result, solutionArr));
  }

  @Test
  public void test3() {
    int[][] matrix = {{7}, {9}, {6}};
    Integer[] result = {7, 9, 6};
    List<Integer> solution = new medium._0000_0099._054_spiral_matrix.Solution()
        .spiralOrder(matrix);
    Integer[] solutionArr = new Integer[solution.size()];
    solution.toArray(solutionArr);
    Assert.assertTrue(Comparators.isSame(result, solutionArr));
  }

  @Test
  public void test4() {
    int[][] matrix = {{2, 5, 8}, {4, 0, -1}};
    Integer[] result = {2, 5, 8, -1, 0, 4};
    List<Integer> solution = new medium._0000_0099._054_spiral_matrix.Solution()
        .spiralOrder(matrix);
    Integer[] solutionArr = new Integer[solution.size()];
    solution.toArray(solutionArr);
    Assert.assertTrue(Comparators.isSame(result, solutionArr));
  }

  @Test
  public void test5() {
    int[][] matrix = {{2, 5, 8}};
    Integer[] result = {2, 5, 8};
    List<Integer> solution = new medium._0000_0099._054_spiral_matrix.Solution()
        .spiralOrder(matrix);
    Integer[] solutionArr = new Integer[solution.size()];
    solution.toArray(solutionArr);
    Assert.assertTrue(Comparators.isSame(result, solutionArr));
  }

  @Test
  public void test6() {
    int[][] matrix = {{1, 11}, {2, 12}, {3, 13}, {4, 14}, {5, 15}, {6, 16}, {7, 17}, {8, 18},
        {9, 19}, {10, 20}};
    Integer[] result = {1, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 10, 9, 8, 7, 6, 5, 4, 3, 2};
    List<Integer> solution = new medium._0000_0099._054_spiral_matrix.Solution()
        .spiralOrder(matrix);
    Integer[] solutionArr = new Integer[solution.size()];
    solution.toArray(solutionArr);
    Assert.assertTrue(Comparators.isSame(result, solutionArr));
  }
}
