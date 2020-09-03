package easy._1000_1099._1005_maximize_sum_of_array_after_k_negations;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[] A = {4, 2, 3};
    int K = 1;
    Integer result = 5;
    int solution = new easy._1000_1099._1005_maximize_sum_of_array_after_k_negations.Solution()
        .largestSumAfterKNegations(A, K);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    int[] A = {3, -1, 0, 2};
    int K = 3;
    Integer result = 6;
    int solution = new easy._1000_1099._1005_maximize_sum_of_array_after_k_negations.Solution()
        .largestSumAfterKNegations(A, K);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    int[] A = {2, -3, -1, 5, -4};
    int K = 2;
    Integer result = 13;
    int solution = new easy._1000_1099._1005_maximize_sum_of_array_after_k_negations.Solution()
        .largestSumAfterKNegations(A, K);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test3() {
    int[] A = {-2, 5, 0, 2, -2};
    int K = 3;
    Integer result = 11;
    int solution = new easy._1000_1099._1005_maximize_sum_of_array_after_k_negations.Solution()
        .largestSumAfterKNegations(A, K);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test4() {
    int[] A = {-2, 9, 9, 8, 4};
    int K = 5;
    Integer result = 32;
    int solution = new easy._1000_1099._1005_maximize_sum_of_array_after_k_negations.Solution()
        .largestSumAfterKNegations(A, K);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test5() {
    int[] A = {-8, 3, -5, -3, -5, -2};
    int K = 6;
    Integer result = 22;
    int solution = new easy._1000_1099._1005_maximize_sum_of_array_after_k_negations.Solution()
        .largestSumAfterKNegations(A, K);
    Assert.assertTrue(result.equals(solution));
  }

}
