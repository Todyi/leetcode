package easy._1000_1099._1033_moving_stones_until_consecutive;


import common.Comparators;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int a = 1;
    int b = 2;
    int c = 5;
    int[] result = {1, 2};
    int[] solution = new easy._1000_1099._1033_moving_stones_until_consecutive.Solution()
        .numMovesStones(a, b, c);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

  @Test
  public void test1() {
    int a = 4;
    int b = 3;
    int c = 2;
    int[] result = {0, 0};
    int[] solution = new easy._1000_1099._1033_moving_stones_until_consecutive.Solution()
        .numMovesStones(a, b, c);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

  @Test
  public void test2() {
    int a = 3;
    int b = 5;
    int c = 1;
    int[] result = {1, 2};
    int[] solution = new easy._1000_1099._1033_moving_stones_until_consecutive.Solution()
        .numMovesStones(a, b, c);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

  @Test
  public void test3() {
    int a = 1;
    int b = 9;
    int c = 5;
    int[] result = {2, 6};
    int[] solution = new easy._1000_1099._1033_moving_stones_until_consecutive.Solution()
        .numMovesStones(a, b, c);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

}
