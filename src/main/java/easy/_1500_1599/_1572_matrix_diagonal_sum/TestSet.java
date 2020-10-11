package easy._1500_1599._1572_matrix_diagonal_sum;


import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[][] mat = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
    };
    Integer result = 25;
    int solution = new easy._1500_1599._1572_matrix_diagonal_sum.Solution()
        .diagonalSum(mat);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    int[][] mat = {
        {1, 1, 1, 1},
        {1, 1, 1, 1},
        {1, 1, 1, 1},
        {1, 1, 1, 1}
    };
    Integer result = 8;
    int solution = new easy._1500_1599._1572_matrix_diagonal_sum.Solution()
        .diagonalSum(mat);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    int[][] mat = {
        {5}
    };
    Integer result = 5;
    int solution = new easy._1500_1599._1572_matrix_diagonal_sum.Solution()
        .diagonalSum(mat);
    Assert.assertTrue(result.equals(solution));
  }

}
