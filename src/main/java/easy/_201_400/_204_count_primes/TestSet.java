package easy._201_400._204_count_primes;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int input = 10;
    Integer result = 4;
    int resolution = new easy._201_400._204_count_primes.Solution().countPrimes(input);
    Assert.assertTrue(result.equals(resolution));
  }

  @Test
  public void test1() {
    int input = 2;
    Integer result = 0;
    int resolution = new easy._201_400._204_count_primes.Solution().countPrimes(input);
    Assert.assertTrue(result.equals(resolution));
  }

  @Test
  public void test2() {
    int input = 3;
    Integer result = 1;
    int resolution = new easy._201_400._204_count_primes.Solution().countPrimes(input);
    Assert.assertTrue(result.equals(resolution));
  }

  @Test
  public void test4() {
    int input = 499979;
    Integer result = 41537;
    int resolution = new easy._201_400._204_count_primes.Solution().countPrimes(input);
    Assert.assertTrue(result.equals(resolution));
  }

  @Test
  public void test5() {
    int input = 999983;
    Integer result = 78497;
    int resolution = new easy._201_400._204_count_primes.Solution().countPrimes(input);
    Assert.assertTrue(result.equals(resolution));
  }

  @Test
  public void test6() {
    int input = 1500000;
    Integer result = 114155;
    int resolution = new easy._201_400._204_count_primes.Solution().countPrimes(input);
    Assert.assertTrue(result.equals(resolution));
  }

}
