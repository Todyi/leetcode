package easy._600_699._665_non_decreasing_array;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[] M = {4, 2, 3};
    Boolean result = true;
    boolean solution = new easy._600_699._665_non_decreasing_array.Solution()
        .checkPossibility(M);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    int[] M = {4, 2, 1};
    Boolean result = false;
    boolean solution = new easy._600_699._665_non_decreasing_array.Solution()
        .checkPossibility(M);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    int[] M = {4, 1, 2, 3, 4, 5};
    Boolean result = true;
    boolean solution = new easy._600_699._665_non_decreasing_array.Solution()
        .checkPossibility(M);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test3() {
    int[] M = {1, 2, 7, 4, 5};
    Boolean result = true;
    boolean solution = new easy._600_699._665_non_decreasing_array.Solution()
        .checkPossibility(M);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test4() {
    int[] M = {1, 1, 1};
    Boolean result = true;
    boolean solution = new easy._600_699._665_non_decreasing_array.Solution()
        .checkPossibility(M);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test5() {
    int[] M = {2, 3, 3, 2, 4};
    Boolean result = true;
    boolean solution = new easy._600_699._665_non_decreasing_array.Solution()
        .checkPossibility(M);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test6() {
    int[] M = {3, 4, 2, 3};
    Boolean result = false;
    boolean solution = new easy._600_699._665_non_decreasing_array.Solution()
        .checkPossibility(M);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test7() {
    int[] M = {1, 5, 4, 6, 7, 10, 8, 9};
    Boolean result = false;
    boolean solution = new easy._600_699._665_non_decreasing_array.Solution()
        .checkPossibility(M);
    Assert.assertTrue(result.equals(solution));
  }

}
