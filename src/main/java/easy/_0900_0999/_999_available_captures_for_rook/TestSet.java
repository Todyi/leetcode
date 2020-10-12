package easy._0900_0999._999_available_captures_for_rook;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    char[][] board = {
        {'.', '.', '.', '.', '.', '.', '.', '.'},
        {'.', '.', '.', 'p', '.', '.', '.', '.'},
        {'.', '.', '.', 'R', '.', '.', '.', 'p'},
        {'.', '.', '.', '.', '.', '.', '.', '.'},
        {'.', '.', '.', '.', '.', '.', '.', '.'},
        {'.', '.', '.', 'p', '.', '.', '.', '.'},
        {'.', '.', '.', '.', '.', '.', '.', '.'},
        {'.', '.', '.', '.', '.', '.', '.', '.'}};
    Integer result = 3;
    int solution = new easy._0900_0999._999_available_captures_for_rook.Solution()
        .numRookCaptures(board);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    char[][] board = {
        {'.', '.', '.', '.', '.', '.', '.', '.'},
        {'.', 'p', 'p', 'p', 'p', 'p', '.', '.'},
        {'.', 'p', 'p', 'B', 'p', 'p', '.', '.'},
        {'.', 'p', 'B', 'R', 'B', 'p', '.', '.'},
        {'.', 'p', 'p', 'B', 'p', 'p', '.', '.'},
        {'.', 'p', 'p', 'p', 'p', 'p', '.', '.'},
        {'.', '.', '.', '.', '.', '.', '.', '.'},
        {'.', '.', '.', '.', '.', '.', '.', '.'}};
    Integer result = 0;
    int solution = new easy._0900_0999._999_available_captures_for_rook.Solution()
        .numRookCaptures(board);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    char[][] board = {
        {'.', '.', '.', '.', '.', '.', '.', '.'},
        {'.', '.', '.', 'p', '.', '.', '.', '.'},
        {'.', '.', '.', 'p', '.', '.', '.', '.'},
        {'p', 'p', '.', 'R', '.', 'p', 'B', '.'},
        {'.', '.', '.', '.', '.', '.', '.', '.'},
        {'.', '.', '.', 'B', '.', '.', '.', '.'},
        {'.', '.', '.', 'p', '.', '.', '.', '.'},
        {'.', '.', '.', '.', '.', '.', '.', '.'}};
    Integer result = 3;
    int solution = new easy._0900_0999._999_available_captures_for_rook.Solution()
        .numRookCaptures(board);
    Assert.assertTrue(result.equals(solution));
  }
}
