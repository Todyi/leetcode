package easy._1300_1399._1380_lucky_numbers_in_a_matrix;


import common.Comparators;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[][] matrix = {{3, 7, 8}, {9, 11, 13}, {15, 16, 17}};
    Integer[] result = {15};
    List<Integer> solution = new easy._1300_1399._1380_lucky_numbers_in_a_matrix.Solution()
        .luckyNumbers(matrix);
    Integer[] solutionArr = new Integer[solution.size()];
    solution.toArray(solutionArr);
    Assert.assertTrue(Comparators.isSame(result, solutionArr));
  }

  @Test
  public void test1() {
    int[][] matrix = {{1, 10, 4, 2}, {9, 3, 8, 7}, {15, 16, 17, 12}};
    Integer[] result = {12};
    List<Integer> solution = new easy._1300_1399._1380_lucky_numbers_in_a_matrix.Solution()
        .luckyNumbers(matrix);
    Integer[] solutionArr = new Integer[solution.size()];
    solution.toArray(solutionArr);
    Assert.assertTrue(Comparators.isSame(result, solutionArr));
  }

  @Test
  public void test2() {
    int[][] matrix = {{7, 8}, {1, 2}};
    Integer[] result = {7};
    List<Integer> solution = new easy._1300_1399._1380_lucky_numbers_in_a_matrix.Solution()
        .luckyNumbers(matrix);
    Integer[] solutionArr = new Integer[solution.size()];
    solution.toArray(solutionArr);
    Assert.assertTrue(Comparators.isSame(result, solutionArr));
  }
  @Test
  public void test3() {
    int[][] matrix = {
        {36376,85652,21002,4510},
        {68246,64237,42962,9974},
        {32768,97721,47338,5841},
        {55103,18179,79062,46542}};
    Integer[] result = {};
    List<Integer> solution = new easy._1300_1399._1380_lucky_numbers_in_a_matrix.Solution()
        .luckyNumbers(matrix);
    Integer[] solutionArr = new Integer[solution.size()];
    solution.toArray(solutionArr);
    Assert.assertTrue(Comparators.isSame(result, solutionArr));
  }

}
