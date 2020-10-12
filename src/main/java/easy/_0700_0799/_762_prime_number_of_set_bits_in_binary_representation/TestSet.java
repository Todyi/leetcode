package easy._0700_0799._762_prime_number_of_set_bits_in_binary_representation;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int L = 6;
    int R = 10;
    Integer result = 4;
    int solution = new easy._0700_0799._762_prime_number_of_set_bits_in_binary_representation.Solution()
        .countPrimeSetBits(L, R);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    int L = 10;
    int R = 15;
    Integer result = 5;
    int solution = new easy._0700_0799._762_prime_number_of_set_bits_in_binary_representation.Solution()
        .countPrimeSetBits(L, R);
    Assert.assertTrue(result.equals(solution));
  }


}
