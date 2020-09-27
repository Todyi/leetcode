package easy._1200_1299._1275_find_winner_on_a_tic_tac_toe_game;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[][] moves = {{0, 0}, {2, 0}, {1, 1}, {2, 1}, {2, 2}};
    String result = "A";
    String solution = new easy._1200_1299._1275_find_winner_on_a_tic_tac_toe_game.Solution()
        .tictactoe(moves);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    int[][] moves = {{0, 0}, {1, 1}, {0, 1}, {0, 2}, {1, 0}, {2, 0}};
    String result = "B";
    String solution = new easy._1200_1299._1275_find_winner_on_a_tic_tac_toe_game.Solution()
        .tictactoe(moves);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    int[][] moves = {{0, 0}, {1, 1}, {2, 0}, {1, 0}, {1, 2}, {2, 1}, {0, 1}, {0, 2}, {2, 2}};
    String result = "Draw";
    String solution = new easy._1200_1299._1275_find_winner_on_a_tic_tac_toe_game.Solution()
        .tictactoe(moves);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test3() {
    int[][] moves = {{0, 0}, {1, 1}};
    String result = "Pending";
    String solution = new easy._1200_1299._1275_find_winner_on_a_tic_tac_toe_game.Solution()
        .tictactoe(moves);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test4() {
    int[][] moves = {{1, 0}, {2, 2}, {2, 0}, {0, 1}, {1, 1}};
    String result = "Pending";
    String solution = new easy._1200_1299._1275_find_winner_on_a_tic_tac_toe_game.Solution()
        .tictactoe(moves);
    Assert.assertTrue(result.equals(solution));
  }

}
