package easy._1200_1299._1295_find_numbers_with_even_number_of_digits;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[] nums = {12, 345, 2, 6, 7896};
    Integer result = 2;
    int solution = new easy._1200_1299._1295_find_numbers_with_even_number_of_digits.Solution()
        .findNumbers(nums);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    int[] nums = {555, 901, 482, 1771};
    Integer result = 1;
    int solution = new easy._1200_1299._1295_find_numbers_with_even_number_of_digits.Solution()
        .findNumbers(nums);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    int[] nums = {100000};
    Integer result = 1;
    int solution = new easy._1200_1299._1295_find_numbers_with_even_number_of_digits.Solution()
        .findNumbers(nums);
    Assert.assertTrue(result.equals(solution));
  }

}
