package medium._0000_0099._048_rotate_image;


import common.Comparators;
import java.util.Comparator;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    int[][] result = {{7, 4, 1}, {8, 5, 2}, {9, 6, 3}};
    new medium._0000_0099._048_rotate_image.Solution()
        .rotate(matrix);
    for (int i = 0; i < result.length; i++) {
      Assert.assertTrue(Comparators.isSame(result[i], matrix[i]));
    }
  }

  @Test
  public void test1() {
    int[][] matrix = {{5, 1, 9, 11}, {2, 4, 8, 10}, {13, 3, 6, 7}, {15, 14, 12, 16}};
    int[][] result = {{15, 13, 2, 5}, {14, 3, 4, 1}, {12, 6, 8, 9}, {16, 7, 10, 11}};
    new medium._0000_0099._048_rotate_image.Solution()
        .rotate(matrix);
    for (int i = 0; i < result.length; i++) {
      Assert.assertTrue(Comparators.isSame(result[i], matrix[i]));
    }
  }

  @Test
  public void test2() {
    int[][] matrix = {{1}};
    int[][] result = {{1}};
    new medium._0000_0099._048_rotate_image.Solution()
        .rotate(matrix);
    for (int i = 0; i < result.length; i++) {
      Assert.assertTrue(Comparators.isSame(result[i], matrix[i]));
    }
  }

  @Test
  public void test3() {
    int[][] matrix = {{1, 2}, {3, 4}};
    int[][] result = {{3, 1}, {4, 2}};
    new medium._0000_0099._048_rotate_image.Solution()
        .rotate(matrix);
    for (int i = 0; i < result.length; i++) {
      Assert.assertTrue(Comparators.isSame(result[i], matrix[i]));
    }
  }
}
