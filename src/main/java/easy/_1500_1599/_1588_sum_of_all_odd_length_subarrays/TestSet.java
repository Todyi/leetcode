package easy._1500_1599._1588_sum_of_all_odd_length_subarrays;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[] arr = {1, 4, 2, 5, 3};
    Integer result = 58;
    int solution = new easy._1500_1599._1588_sum_of_all_odd_length_subarrays.Solution()
        .sumOddLengthSubarrays(arr);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    int[] arr = {1, 2};
    Integer result = 3;
    int solution = new easy._1500_1599._1588_sum_of_all_odd_length_subarrays.Solution()
        .sumOddLengthSubarrays(arr);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    int[] arr = {10, 11, 12};
    Integer result = 66;
    int solution = new easy._1500_1599._1588_sum_of_all_odd_length_subarrays.Solution()
        .sumOddLengthSubarrays(arr);
    Assert.assertTrue(result.equals(solution));
  }

}
