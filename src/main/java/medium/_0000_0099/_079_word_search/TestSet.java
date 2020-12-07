package medium._0000_0099._079_word_search;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    char[][] board = {
        {'A', 'B', 'C', 'E'},
        {'S', 'F', 'C', 'S'},
        {'A', 'D', 'E', 'E'}};
    String word = "ABCCED";
    Boolean result = true;
    boolean solution = new medium._0000_0099._079_word_search.Solution()
        .exist(board, word);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    char[][] board = {
        {'A', 'B', 'C', 'E'},
        {'S', 'F', 'C', 'S'},
        {'A', 'D', 'E', 'E'}};
    String word = "SEE";
    Boolean result = true;
    boolean solution = new medium._0000_0099._079_word_search.Solution()
        .exist(board, word);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    char[][] board = {
        {'A', 'B', 'C', 'E'},
        {'S', 'F', 'C', 'S'},
        {'A', 'D', 'E', 'E'}
    };
    String word = "ABCB";
    Boolean result = false;
    boolean solution = new medium._0000_0099._079_word_search.Solution()
        .exist(board, word);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test3() {
    char[][] board = {
        {'a', 'a', 'a', 'a'}, {'a', 'a', 'a', 'a'}, {'a', 'a', 'a', 'a'}
    };
    String word = "aaaaaaaaaaaaa";
    Boolean result = false;
    boolean solution = new medium._0000_0099._079_word_search.Solution()
        .exist(board, word);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test4() {
    char[][] board = {
        {'a', 'a', 'a'},
        {'a', 'b', 'b'},
        {'a', 'b', 'b'},
        {'b', 'b', 'b'},
        {'b', 'b', 'b'},
        {'a', 'a', 'a'},
        {'b', 'b', 'b'},
        {'a', 'b', 'b'},
        {'a', 'a', 'b'},
        {'a', 'b', 'a'}
    };
    String word = "aabaaaabbb";
    Boolean result = false;
    boolean solution = new medium._0000_0099._079_word_search.Solution()
        .exist(board, word);
    Assert.assertTrue(result.equals(solution));
  }


  @Test
  public void test5() {
    char[][] board = {
        {'a'}
    };
    String word = "a";
    Boolean result = true;
    boolean solution = new medium._0000_0099._079_word_search.Solution()
        .exist(board, word);
    Assert.assertTrue(result.equals(solution));
  }

}
