package easy._0700_0799._788_rotated_digits;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int N = 10;
    Integer result = 4;
    int solution = new easy._0700_0799._788_rotated_digits.Solution()
        .rotatedDigits(N);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    int N = 20;//2,5,6,9,12,15,16,19,20
    Integer result = 9;
    int solution = new easy._0700_0799._788_rotated_digits.Solution()
        .rotatedDigits(N);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    int N = 15;//2,5,6,9,12,15
    Integer result = 6;
    int solution = new easy._0700_0799._788_rotated_digits.Solution()
        .rotatedDigits(N);
    Assert.assertTrue(result.equals(solution));
  }

}
