package easy._1000_1099._1025_divisor_game;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int N = 2;
    Boolean result = true;
    boolean solution = new easy._1000_1099._1025_divisor_game.Solution()
        .divisorGame(N);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    int N = 3;
    Boolean result = false;
    boolean solution = new easy._1000_1099._1025_divisor_game.Solution()
        .divisorGame(N);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    int N = 1;
    Boolean result = false;
    boolean solution = new easy._1000_1099._1025_divisor_game.Solution()
        .divisorGame(N);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test3() {
    int N = 4;
    Boolean result = true;
    boolean solution = new easy._1000_1099._1025_divisor_game.Solution()
        .divisorGame(N);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test4() {
    int N = 5;
    Boolean result = false;
    boolean solution = new easy._1000_1099._1025_divisor_game.Solution()
        .divisorGame(N);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test5() {
    int N = 12;
    Boolean result = true;
    boolean solution = new easy._1000_1099._1025_divisor_game.Solution()
        .divisorGame(N);
    Assert.assertTrue(result.equals(solution));
  }

}
