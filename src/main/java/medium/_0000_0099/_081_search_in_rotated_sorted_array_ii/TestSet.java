package medium._0000_0099._081_search_in_rotated_sorted_array_ii;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[] nums = {2, 5, 6, 0, 0, 1, 2};
    int target = 0;
    Boolean result = true;
    boolean solution = new Solution()
        .search(nums, target);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    int[] nums = {2, 5, 6, 0, 0, 1, 2};
    int target = 3;
    Boolean result = false;
    boolean solution = new Solution()
        .search(nums, target);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    int[] nums = {3, 1};
    int target = 3;
    Boolean result = true;
    boolean solution = new Solution()
        .search(nums, target);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test3() {
    int[] nums = {};
    int target = 5;
    Boolean result = false;
    boolean solution = new Solution()
        .search(nums, target);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test4() {
    int[] nums = {1, 2, 1};
    int target = 2;
    Boolean result = true;
    boolean solution = new Solution()
        .search(nums, target);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test5() {
    int[] nums = {1};
    int target = 0;
    Boolean result = false;
    boolean solution = new Solution()
        .search(nums, target);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test6() {
    int[] nums = {1, 3};
    int target = 0;
    Boolean result = false;
    boolean solution = new Solution()
        .search(nums, target);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test7() {
    int[] nums = {1, 1, 3, 1};
    int target = 3;
    Boolean result = true;
    boolean solution = new Solution()
        .search(nums, target);
    Assert.assertTrue(result.equals(solution));
  }

}
