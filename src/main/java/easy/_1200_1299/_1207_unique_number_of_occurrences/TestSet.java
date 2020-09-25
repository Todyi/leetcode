package easy._1200_1299._1207_unique_number_of_occurrences;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[] arr = {1, 2, 2, 1, 1, 3};
    Boolean result = true;
    boolean solution = new easy._1200_1299._1207_unique_number_of_occurrences.Solution()
        .uniqueOccurrences(arr);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    int[] arr = {1, 2};
    Boolean result = false;
    boolean solution = new easy._1200_1299._1207_unique_number_of_occurrences.Solution()
        .uniqueOccurrences(arr);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    int[] arr = {-3, 0, 1, -3, 1, 1, 1, -3, 10, 0};
    Boolean result = true;
    boolean solution = new easy._1200_1299._1207_unique_number_of_occurrences.Solution()
        .uniqueOccurrences(arr);
    Assert.assertTrue(result.equals(solution));
  }

}
