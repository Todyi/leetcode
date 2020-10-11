package easy._1500_1599._1550_three_consecutive_odds;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[] arr = {2, 6, 4, 1};
    Boolean result = false;
    boolean solution = new easy._1500_1599._1550_three_consecutive_odds.Solution()
        .threeConsecutiveOdds(arr);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    int[] arr = {1, 2, 34, 3, 4, 5, 7, 23, 12};
    Boolean result = true;
    boolean solution = new easy._1500_1599._1550_three_consecutive_odds.Solution()
        .threeConsecutiveOdds(arr);
    Assert.assertTrue(result.equals(solution));
  }

}
