package easy._800_899._840_magic_squares_in_grid;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[][] grid = {{4, 3, 8, 4}, {9, 5, 1, 9}, {2, 7, 6, 2}};
    Integer result = 1;
    int solution = new easy._800_899._840_magic_squares_in_grid.Solution()
        .numMagicSquaresInside(grid);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    int[][] grid = {{5, 5, 5}, {5, 5, 5}, {5, 5, 5}};
    Integer result = 0;
    int solution = new easy._800_899._840_magic_squares_in_grid.Solution()
        .numMagicSquaresInside(grid);
    Assert.assertTrue(result.equals(solution));
  }

}
