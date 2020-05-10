package easy._400_499._475_heaters;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[] houses = {1, 2, 3};
    int[] heaters = {2};
    Integer result = 1;
    int solution = new easy._400_499._475_heaters.Solution()
        .findRadius(houses, heaters);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    int[] houses = {1, 2, 3, 4};
    int[] heaters = {1, 4};
    Integer result = 1;
    int solution = new easy._400_499._475_heaters.Solution()
        .findRadius(houses, heaters);
    Assert.assertTrue(result.equals(solution));
  }
  @Test
  public void test2() {
    int[] houses = {282475249,622650073,984943658,144108930,470211272,101027544,457850878,458777923};
    int[] heaters = {823564440,115438165,784484492,74243042,114807987,137522503,441282327,16531729,823378840,143542612};
    Integer result = 161834419;
    int solution = new easy._400_499._475_heaters.Solution()
        .findRadius(houses, heaters);
    Assert.assertTrue(result.equals(solution));
  }

}
