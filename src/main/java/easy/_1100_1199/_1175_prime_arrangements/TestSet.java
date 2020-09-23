package easy._1100_1199._1175_prime_arrangements;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int n = 5;
    Integer result = 12;
    int solution = new easy._1100_1199._1175_prime_arrangements.Solution()
        .numPrimeArrangements(n);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    int n = 100;
    Integer result = 682289015;
    int solution = new easy._1100_1199._1175_prime_arrangements.Solution()
        .numPrimeArrangements(n);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    int n = 1;
    Integer result = 1;
    int solution = new easy._1100_1199._1175_prime_arrangements.Solution()
        .numPrimeArrangements(n);
    Assert.assertTrue(result.equals(solution));
  }

}
