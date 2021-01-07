package medium._0100_0199._130_surrounded_regions;


import common.Comparators;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    char[][] board = {
        {'X', 'X', 'X', 'X'},
        {'X', 'O', 'O', 'X'},
        {'X', 'X', 'O', 'X'},
        {'X', 'O', 'X', 'X'}
    };
    char[][] result = {
        {'X', 'X', 'X', 'X'},
        {'X', 'X', 'X', 'X'},
        {'X', 'X', 'X', 'X'},
        {'X', 'O', 'X', 'X'}
    };
    new medium._0100_0199._130_surrounded_regions.Solution()
        .solve(board);
    for (int i = 0; i < board.length; i++) {
      Assert.assertTrue(Comparators.isSame(board[i], result[i]));
    }
  }

  @Test
  public void test1() {
    char[][] board = {
        {'X', 'O', 'X', 'O', 'X', 'O'},
        {'O', 'X', 'O', 'X', 'O', 'X'},
        {'X', 'O', 'X', 'O', 'X', 'O'},
        {'O', 'X', 'O', 'X', 'O', 'X'}
    };
    char[][] result = {
        {'X', 'O', 'X', 'O', 'X', 'O'},
        {'O', 'X', 'X', 'X', 'X', 'X'},
        {'X', 'X', 'X', 'X', 'X', 'O'},
        {'O', 'X', 'O', 'X', 'O', 'X'}
    };
    new medium._0100_0199._130_surrounded_regions.Solution()
        .solve(board);
    for (int i = 0; i < board.length; i++) {
      Assert.assertTrue(Comparators.isSame(board[i], result[i]));
    }
  }

  @Test
  public void test2() {
    char[][] board = {};
    char[][] result = {};
    new medium._0100_0199._130_surrounded_regions.Solution()
        .solve(board);
    for (int i = 0; i < board.length; i++) {
      Assert.assertTrue(Comparators.isSame(board[i], result[i]));
    }
  }


}
