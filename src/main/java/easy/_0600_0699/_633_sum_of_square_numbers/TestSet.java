package easy._0600_0699._633_sum_of_square_numbers;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int c = 5;
    Boolean result = true;
    boolean solution = new easy._0600_0699._633_sum_of_square_numbers.Solution()
        .judgeSquareSum(c);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    int c = 3;
    Boolean result = false;
    boolean solution = new easy._0600_0699._633_sum_of_square_numbers.Solution()
        .judgeSquareSum(c);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    int c = 9801;
    Boolean result = true;
    boolean solution = new easy._0600_0699._633_sum_of_square_numbers.Solution()
        .judgeSquareSum(c);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test3() {
    int c = 4;
    Boolean result = true;
    boolean solution = new easy._0600_0699._633_sum_of_square_numbers.Solution()
        .judgeSquareSum(c);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test4() {
    int c = 2147483642;
    Boolean result = false;
    boolean solution = new easy._0600_0699._633_sum_of_square_numbers.Solution()
        .judgeSquareSum(c);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test5() {
    int c = 2;
    Boolean result = true;
    boolean solution = new easy._0600_0699._633_sum_of_square_numbers.Solution()
        .judgeSquareSum(c);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test6() {
    int c = 1000;
    Boolean result = true;
    boolean solution = new easy._0600_0699._633_sum_of_square_numbers.Solution()
        .judgeSquareSum(c);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test7() {
    int c = 900000;
    Boolean result = true;
    boolean solution = new easy._0600_0699._633_sum_of_square_numbers.Solution()
        .judgeSquareSum(c);
    Assert.assertTrue(result.equals(solution));
  }

}
