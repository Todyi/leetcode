package easy._1500_1599._1518_water_bottles;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int numBottles = 9;
    int numExchange = 3;
    Integer result = 13;
    int solution = new easy._1500_1599._1518_water_bottles.Solution()
        .numWaterBottles(numBottles, numExchange);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    int numBottles = 15;
    int numExchange = 4;
    Integer result = 19;
    int solution = new easy._1500_1599._1518_water_bottles.Solution()
        .numWaterBottles(numBottles, numExchange);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    int numBottles = 5;
    int numExchange = 5;
    Integer result = 6;
    int solution = new easy._1500_1599._1518_water_bottles.Solution()
        .numWaterBottles(numBottles, numExchange);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test3() {
    int numBottles = 2;
    int numExchange = 3;
    Integer result = 2;
    int solution = new easy._1500_1599._1518_water_bottles.Solution()
        .numWaterBottles(numBottles, numExchange);
    Assert.assertTrue(result.equals(solution));
  }

}
