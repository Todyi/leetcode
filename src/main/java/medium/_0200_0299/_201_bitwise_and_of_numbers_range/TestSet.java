package medium._0200_0299._201_bitwise_and_of_numbers_range;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int m = 5;
    int n = 7;
    Integer result = 4;
    int solution = new medium._0200_0299._201_bitwise_and_of_numbers_range.Solution()
        .rangeBitwiseAnd(m, n);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    int m = 0;
    int n = 1;
    Integer result = 0;
    int solution = new medium._0200_0299._201_bitwise_and_of_numbers_range.Solution()
        .rangeBitwiseAnd(m, n);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    int m = 1;
    int n = 8;
    Integer result = 1&2&3&4&5&6&7&8;
    int solution = new medium._0200_0299._201_bitwise_and_of_numbers_range.Solution()
        .rangeBitwiseAnd(m, n);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test3() {
    int m = 5;
    int n = 6;
    Integer result = 5&6;
    int solution = new medium._0200_0299._201_bitwise_and_of_numbers_range.Solution()
        .rangeBitwiseAnd(m, n);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test4() {
    int m = 600000000;
    int n = 2147483645;
    Integer result = 0;
    int solution = new medium._0200_0299._201_bitwise_and_of_numbers_range.Solution()
        .rangeBitwiseAnd(m, n);
    Assert.assertTrue(result.equals(solution));
  }

}
