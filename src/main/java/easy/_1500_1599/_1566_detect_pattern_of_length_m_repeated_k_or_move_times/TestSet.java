package easy._1500_1599._1566_detect_pattern_of_length_m_repeated_k_or_move_times;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[] arr = {1, 2, 4, 4, 4, 4};
    int m = 1;
    int k = 3;
    Boolean result = true;
    boolean solution = new easy._1500_1599._1566_detect_pattern_of_length_m_repeated_k_or_move_times.Solution()
        .containsPattern(arr, m, k);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    int[] arr = {1, 2, 1, 2, 1, 1, 1, 3};
    int m = 2;
    int k = 2;
    Boolean result = true;
    boolean solution = new easy._1500_1599._1566_detect_pattern_of_length_m_repeated_k_or_move_times.Solution()
        .containsPattern(arr, m, k);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    int[] arr = {1, 2, 1, 2, 1, 3};
    int m = 2;
    int k = 3;
    Boolean result = false;
    boolean solution = new easy._1500_1599._1566_detect_pattern_of_length_m_repeated_k_or_move_times.Solution()
        .containsPattern(arr, m, k);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test3() {
    int[] arr = {1, 2, 3, 1, 2};
    int m = 2;
    int k = 2;
    Boolean result = false;
    boolean solution = new easy._1500_1599._1566_detect_pattern_of_length_m_repeated_k_or_move_times.Solution()
        .containsPattern(arr, m, k);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test4() {
    int[] arr = {2, 2, 2, 2};
    int m = 2;
    int k = 3;
    Boolean result = false;
    boolean solution = new easy._1500_1599._1566_detect_pattern_of_length_m_repeated_k_or_move_times.Solution()
        .containsPattern(arr, m, k);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test5() {
    int[] arr = {2, 2};
    int m = 1;
    int k = 2;
    Boolean result = true;
    boolean solution = new easy._1500_1599._1566_detect_pattern_of_length_m_repeated_k_or_move_times.Solution()
        .containsPattern(arr, m, k);
    Assert.assertTrue(result.equals(solution));
  }

}
