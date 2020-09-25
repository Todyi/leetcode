package easy._1200_1299._1217_minimum_cost_to_move_chips_to_the_same_position;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[] position = {1, 2, 3};
    Integer result = 1;
    int solution = new easy._1200_1299._1217_minimum_cost_to_move_chips_to_the_same_position.Solution()
        .minCostToMoveChips(position);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    int[] position = {2, 2, 2, 3, 3};
    Integer result = 2;
    int solution = new easy._1200_1299._1217_minimum_cost_to_move_chips_to_the_same_position.Solution()
        .minCostToMoveChips(position);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    int[] position = {1,1000000000};
    Integer result = 1;
    int solution = new easy._1200_1299._1217_minimum_cost_to_move_chips_to_the_same_position.Solution()
        .minCostToMoveChips(position);
    Assert.assertTrue(result.equals(solution));
  }

}
