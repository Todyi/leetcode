package easy._0300_0399._367_valid_perfect_square;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int num1 = 16;
    Boolean result = true;
    boolean solution = new easy._0300_0399._367_valid_perfect_square.Solution().isPerfectSquare(num1);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    int num1 = 14;
    Boolean result = false;
    boolean solution = new easy._0300_0399._367_valid_perfect_square.Solution().isPerfectSquare(num1);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    int num1 = 1;
    Boolean result = true;
    boolean solution = new easy._0300_0399._367_valid_perfect_square.Solution().isPerfectSquare(num1);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test3() {
    int num1 = 4;
    Boolean result = true;
    boolean solution = new easy._0300_0399._367_valid_perfect_square.Solution().isPerfectSquare(num1);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test4() {
    int num1 = 0x7ffea810;
    Boolean result = true;
    boolean solution = new easy._0300_0399._367_valid_perfect_square.Solution().isPerfectSquare(num1);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test5() {
//    int num1 = 0x7fffffff;
    int num1 = 0x7ffea811;
    Boolean result = false;
    boolean solution = new easy._0300_0399._367_valid_perfect_square.Solution().isPerfectSquare(num1);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test6() {
    int num1 = 5;
    Boolean result = false;
    boolean solution = new easy._0300_0399._367_valid_perfect_square.Solution().isPerfectSquare(num1);
    Assert.assertTrue(result.equals(solution));
  }

}
