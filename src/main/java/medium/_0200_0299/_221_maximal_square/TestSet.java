package medium._0200_0299._221_maximal_square;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    char[][] matrix = {
        {'1', '0', '1', '0', '0'},
        {'1', '0', '1', '1', '1'},
        {'1', '1', '1', '1', '1'},
        {'1', '0', '0', '1', '0'}
    };
    Integer result = 4;
    int solution = new medium._0200_0299._221_maximal_square.Solution()
        .maximalSquare(matrix);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    char[][] matrix = {
        {'0', '1'},
        {'1', '0'}
    };
    Integer result = 1;
    int solution = new medium._0200_0299._221_maximal_square.Solution()
        .maximalSquare(matrix);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    char[][] matrix = {
        {'0'}
    };
    Integer result = 0;
    int solution = new medium._0200_0299._221_maximal_square.Solution()
        .maximalSquare(matrix);
    Assert.assertTrue(result.equals(solution));
  }


}
