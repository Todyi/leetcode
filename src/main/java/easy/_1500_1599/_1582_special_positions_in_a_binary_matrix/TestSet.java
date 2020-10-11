package easy._1500_1599._1582_special_positions_in_a_binary_matrix;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[][] mat = {
        {1, 0, 0},
        {0, 0, 1},
        {1, 0, 0}
    };
    Integer result = 1;
    int solution = new easy._1500_1599._1582_special_positions_in_a_binary_matrix.Solution()
        .numSpecial(mat);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    int[][] mat = {
        {1, 0, 0},
        {0, 1, 0},
        {0, 0, 1
        }
    };
    Integer result = 3;
    int solution = new easy._1500_1599._1582_special_positions_in_a_binary_matrix.Solution()
        .numSpecial(mat);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    int[][] mat = {
        {0, 0, 0, 1},
        {1, 0, 0, 0},
        {0, 1, 1, 0},
        {0, 0, 0, 0}
    };
    Integer result = 2;
    int solution = new easy._1500_1599._1582_special_positions_in_a_binary_matrix.Solution()
        .numSpecial(mat);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test3() {
    int[][] mat = {
        {0, 0, 0, 0, 0},
        {1, 0, 0, 0, 0},
        {0, 1, 0, 0, 0},
        {0, 0, 1, 0, 0},
        {0, 0, 0, 1, 1}
    };
    Integer result = 3;
    int solution = new easy._1500_1599._1582_special_positions_in_a_binary_matrix.Solution()
        .numSpecial(mat);
    Assert.assertTrue(result.equals(solution));
  }

}
