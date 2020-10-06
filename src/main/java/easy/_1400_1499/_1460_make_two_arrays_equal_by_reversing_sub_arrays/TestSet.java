package easy._1400_1499._1460_make_two_arrays_equal_by_reversing_sub_arrays;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[] target = {1, 2, 3, 4};
    int[] arr = {2, 4, 1, 3};
    Boolean result = true;
    boolean solution = new easy._1400_1499._1460_make_two_arrays_equal_by_reversing_sub_arrays.Solution()
        .canBeEqual(target, arr);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    int[] target = {7};
    int[] arr = {7};
    Boolean result = true;
    boolean solution = new easy._1400_1499._1460_make_two_arrays_equal_by_reversing_sub_arrays.Solution()
        .canBeEqual(target, arr);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    int[] target = {1, 12};
    int[] arr = {12, 1};
    Boolean result = true;
    boolean solution = new easy._1400_1499._1460_make_two_arrays_equal_by_reversing_sub_arrays.Solution()
        .canBeEqual(target, arr);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test3() {
    int[] target = {3, 7, 9};
    int[] arr = {3, 7, 11};
    Boolean result = false;
    boolean solution = new easy._1400_1499._1460_make_two_arrays_equal_by_reversing_sub_arrays.Solution()
        .canBeEqual(target, arr);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test4() {
    int[] target = {1, 1, 1, 1, 1};
    int[] arr = {1, 1, 1, 1, 1};
    Boolean result = true;
    boolean solution = new easy._1400_1499._1460_make_two_arrays_equal_by_reversing_sub_arrays.Solution()
        .canBeEqual(target, arr);
    Assert.assertTrue(result.equals(solution));
  }

}
