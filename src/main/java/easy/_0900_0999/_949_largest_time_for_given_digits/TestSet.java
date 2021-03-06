package easy._0900_0999._949_largest_time_for_given_digits;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[] A = {1, 2, 3, 4};
    String result = "23:41";
    String solution = new easy._0900_0999._949_largest_time_for_given_digits.Solution()
        .largestTimeFromDigits(A);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    int[] A = {5, 5, 5, 5};
    String result = "";
    String solution = new easy._0900_0999._949_largest_time_for_given_digits.Solution()
        .largestTimeFromDigits(A);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    int[] A = {0,0,0,0};
    String result = "00:00";
    String solution = new easy._0900_0999._949_largest_time_for_given_digits.Solution()
        .largestTimeFromDigits(A);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test3() {
    int[] A = {0,0,1,0};
    String result = "10:00";
    String solution = new easy._0900_0999._949_largest_time_for_given_digits.Solution()
        .largestTimeFromDigits(A);
    Assert.assertTrue(result.equals(solution));
  }

}
