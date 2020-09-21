package easy._1100_1199._1138_n_th_tribonacci_number;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int n = 4;
    Integer result = 4;
    int solution = new easy._1100_1199._1138_n_th_tribonacci_number.Solution()
        . tribonacci(n);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    int n = 25;
    Integer result = 1389537;
    int solution = new easy._1100_1199._1138_n_th_tribonacci_number.Solution()
        . tribonacci(n);
    Assert.assertTrue(result.equals(solution));
  }

}
