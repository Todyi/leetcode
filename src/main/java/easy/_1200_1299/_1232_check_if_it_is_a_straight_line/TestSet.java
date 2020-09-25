package easy._1200_1299._1232_check_if_it_is_a_straight_line;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[][] coordinates = {{1, 2}, {2, 3}, {3, 4}, {4, 5}, {5, 6}, {6, 7}};
    Boolean result = true;
    boolean solution = new easy._1200_1299._1232_check_if_it_is_a_straight_line.Solution()
        .checkStraightLine(coordinates);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    int[][] coordinates = {{1, 1}, {2, 2}, {3, 4}, {4, 5}, {5, 6}, {7, 7}};
    Boolean result = false;
    boolean solution = new easy._1200_1299._1232_check_if_it_is_a_straight_line.Solution()
        .checkStraightLine(coordinates);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    int[][] coordinates = {{0, 0}, {0, 1}, {0, -1}};
    Boolean result = true;
    boolean solution = new easy._1200_1299._1232_check_if_it_is_a_straight_line.Solution()
        .checkStraightLine(coordinates);
    Assert.assertTrue(result.equals(solution));
  }

}
