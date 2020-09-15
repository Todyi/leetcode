package easy._1000_1099._1046_last_stone_weight;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[] stones = {2, 7, 4, 1, 8, 1};
    Integer result = 1;
    int solution = new easy._1000_1099._1046_last_stone_weight.Solution()
        .lastStoneWeight(stones);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    int[] stones = {2, 2};
    Integer result = 0;
    int solution = new easy._1000_1099._1046_last_stone_weight.Solution()
        .lastStoneWeight(stones);
    Assert.assertTrue(result.equals(solution));
  }

}
