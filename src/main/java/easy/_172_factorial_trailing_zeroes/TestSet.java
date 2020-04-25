package easy._172_factorial_trailing_zeroes;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int input = 3;
    Integer result = 0;
    int solution = new easy._172_factorial_trailing_zeroes.Solution().trailingZeroes(input);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    int input = 5;
    Integer result = 1;
    int solution = new easy._172_factorial_trailing_zeroes.Solution().trailingZeroes(input);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    int input = 7;
    Integer result = 1;
    int solution = new easy._172_factorial_trailing_zeroes.Solution().trailingZeroes(input);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test3() {
    int input = 13;
    Integer result = 2;
    int solution = new easy._172_factorial_trailing_zeroes.Solution().trailingZeroes(input);
    Assert.assertTrue(result.equals(solution));
  }
  @Test
  public void test4() {
    int input = 30;
    Integer result = 7;
    int solution = new easy._172_factorial_trailing_zeroes.Solution().trailingZeroes(input);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test5() {
    int input = 625;
    Integer result = 156;
    int solution = new easy._172_factorial_trailing_zeroes.Solution().trailingZeroes(input);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test6() {
    int input = 1808548329;
    Integer result = 452137076;
    int solution = new easy._172_factorial_trailing_zeroes.Solution().trailingZeroes(input);
    Assert.assertTrue(result.equals(solution));
  }

}
