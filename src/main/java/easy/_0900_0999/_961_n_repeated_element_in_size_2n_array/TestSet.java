package easy._0900_0999._961_n_repeated_element_in_size_2n_array;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[] A = {1, 2, 3, 3};
    Integer result = 3;
    int solution = new easy._0900_0999._961_n_repeated_element_in_size_2n_array.Solution()
        .repeatedNTimes(A);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    int[] A = {2, 1, 2, 5, 3, 2};
    Integer result = 2;
    int solution = new easy._0900_0999._961_n_repeated_element_in_size_2n_array.Solution()
        .repeatedNTimes(A);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    int[] A = {5, 1, 5, 2, 5, 3, 5, 4};
    Integer result = 5;
    int solution = new easy._0900_0999._961_n_repeated_element_in_size_2n_array.Solution()
        .repeatedNTimes(A);
    Assert.assertTrue(result.equals(solution));
  }

}
