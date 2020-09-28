package easy._1300_1399._1317_convert_integer_to_the_sum_of_two_no_zero_integers;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  public boolean intWithNoZero(int n) {
    while (0 < n) {
      if (n % 10 == 0) {
        return false;
      }
      n /= 10;
    }
    return true;
  }

  @Test
  public void test0() {
    int n = 2;
    int[] solution = new easy._1300_1399._1317_convert_integer_to_the_sum_of_two_no_zero_integers.Solution()
        .getNoZeroIntegers(n);
    Assert.assertTrue(solution[0] + solution[1] == n);
    Assert.assertTrue(intWithNoZero(solution[0]));
    Assert.assertTrue(intWithNoZero(solution[1]));
  }

  @Test
  public void test1() {
    int n = 11;
    int[] solution = new easy._1300_1399._1317_convert_integer_to_the_sum_of_two_no_zero_integers.Solution()
        .getNoZeroIntegers(n);
    Assert.assertTrue(solution[0] + solution[1] == n);
    Assert.assertTrue(intWithNoZero(solution[0]));
    Assert.assertTrue(intWithNoZero(solution[1]));
  }

  @Test
  public void test2() {
    int n = 10000;
    int[] solution = new easy._1300_1399._1317_convert_integer_to_the_sum_of_two_no_zero_integers.Solution()
        .getNoZeroIntegers(n);
    Assert.assertTrue(solution[0] + solution[1] == n);
    Assert.assertTrue(intWithNoZero(solution[0]));
    Assert.assertTrue(intWithNoZero(solution[1]));
  }

  @Test
  public void test3() {
    int n = 69;
    int[] solution = new easy._1300_1399._1317_convert_integer_to_the_sum_of_two_no_zero_integers.Solution()
        .getNoZeroIntegers(n);
    Assert.assertTrue(solution[0] + solution[1] == n);
    Assert.assertTrue(intWithNoZero(solution[0]));
    Assert.assertTrue(intWithNoZero(solution[1]));
  }

  @Test
  public void test4() {
    int n = 1010;
    int[] solution = new easy._1300_1399._1317_convert_integer_to_the_sum_of_two_no_zero_integers.Solution()
        .getNoZeroIntegers(n);
    Assert.assertTrue(solution[0] + solution[1] == n);
    Assert.assertTrue(intWithNoZero(solution[0]));
    Assert.assertTrue(intWithNoZero(solution[1]));
  }
}
