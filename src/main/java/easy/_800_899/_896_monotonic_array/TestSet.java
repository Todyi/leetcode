package easy._800_899._896_monotonic_array;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[] A = {1, 2, 2, 3};
    Boolean result = true;
    boolean solution = new easy._800_899._896_monotonic_array.Solution()
        .isMonotonic(A);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    int[] A = {6, 5, 4, 4};
    Boolean result = true;
    boolean solution = new easy._800_899._896_monotonic_array.Solution()
        .isMonotonic(A);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    int[] A = {1, 3, 2};
    Boolean result = false;
    boolean solution = new easy._800_899._896_monotonic_array.Solution()
        .isMonotonic(A);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test3() {
    int[] A = {1, 2, 4, 5};
    Boolean result = true;
    boolean solution = new easy._800_899._896_monotonic_array.Solution()
        .isMonotonic(A);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test4() {
    int[] A = {1, 1, 1};
    Boolean result = true;
    boolean solution = new easy._800_899._896_monotonic_array.Solution()
        .isMonotonic(A);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test5() {
    int[] A = {5, 3, 2, 4, 1};
    Boolean result = false;
    boolean solution = new easy._800_899._896_monotonic_array.Solution()
        .isMonotonic(A);
    Assert.assertTrue(result.equals(solution));
  }

}
