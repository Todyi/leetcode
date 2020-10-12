package easy._0900_0999._941_valid_mountain_array;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[] A = {2, 1};
    Boolean result = false;
    boolean solution = new easy._0900_0999._941_valid_mountain_array.Solution()
        .validMountainArray(A);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    int[] A = {3, 5, 5};
    Boolean result = false;
    boolean solution = new easy._0900_0999._941_valid_mountain_array.Solution()
        .validMountainArray(A);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    int[] A = {0, 3, 2, 1};
    Boolean result = true;
    boolean solution = new easy._0900_0999._941_valid_mountain_array.Solution()
        .validMountainArray(A);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test3() {
    int[] A = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
    Boolean result = false;
    boolean solution = new easy._0900_0999._941_valid_mountain_array.Solution()
        .validMountainArray(A);
    Assert.assertTrue(result.equals(solution));
  }

}
