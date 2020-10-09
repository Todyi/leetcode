package easy._1500_1599._1523_count_odd_numbers_in_an_interval_range;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int low = 3;
    int high = 7;
    Integer result = 3;
    int solution = new easy._1500_1599._1523_count_odd_numbers_in_an_interval_range.Solution()
        .countOdds(low, high);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    int low = 8;
    int high = 10;
    Integer result = 1;
    int solution = new easy._1500_1599._1523_count_odd_numbers_in_an_interval_range.Solution()
        .countOdds(low, high);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    int low = 14;
    int high = 17;
    Integer result = 2;
    int solution = new easy._1500_1599._1523_count_odd_numbers_in_an_interval_range.Solution()
        .countOdds(low, high);
    Assert.assertTrue(result.equals(solution));
  }

}
