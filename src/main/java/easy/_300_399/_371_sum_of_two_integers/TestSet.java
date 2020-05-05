package easy._300_399._371_sum_of_two_integers;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int a = 1;
    int b = 2;
    Integer result = 3;
    int solution = new easy._300_399._371_sum_of_two_integers.Solution().getSum(a,b);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    int a = -2;
    int b = 3;
    Integer result = 1;
    int solution = new easy._300_399._371_sum_of_two_integers.Solution().getSum(a,b);
    Assert.assertTrue(result.equals(solution));
  }

}
