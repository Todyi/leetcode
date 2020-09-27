package easy._1200_1299._1281_subtract_the_product_and_sum_of_digits_of_an_integer;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int n = 234;
    Integer result = 15;
    int solution = new easy._1200_1299._1281_subtract_the_product_and_sum_of_digits_of_an_integer.Solution()
        .subtractProductAndSum(n);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    int n = 4421;
    Integer result = 21;
    int solution = new easy._1200_1299._1281_subtract_the_product_and_sum_of_digits_of_an_integer.Solution()
        .subtractProductAndSum(n);
    Assert.assertTrue(result.equals(solution));
  }

}
