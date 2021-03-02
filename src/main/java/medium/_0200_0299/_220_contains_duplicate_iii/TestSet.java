package medium._0200_0299._220_contains_duplicate_iii;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[] nums = {1, 2, 3, 1};
    int k = 3;
    int t = 0;
    Boolean result = true;
    boolean solution = new medium._0200_0299._220_contains_duplicate_iii.Solution()
        .containsNearbyAlmostDuplicate(nums, k, t);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    int[] nums = {1, 0, 1, 1};
    int k = 1;
    int t = 2;
    Boolean result = true;
    boolean solution = new medium._0200_0299._220_contains_duplicate_iii.Solution()
        .containsNearbyAlmostDuplicate(nums, k, t);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    int[] nums = {1, 5, 9, 1, 5, 9};
    int k = 2;
    int t = 3;
    Boolean result = false;
    boolean solution = new medium._0200_0299._220_contains_duplicate_iii.Solution()
        .containsNearbyAlmostDuplicate(nums, k, t);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test3() {
    int[] nums = {-2147483648, 2147483647};
    int k = 1;
    int t = 1;
    Boolean result = false;
    boolean solution = new medium._0200_0299._220_contains_duplicate_iii.Solution()
        .containsNearbyAlmostDuplicate(nums, k, t);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test4() {
    int[] nums = {2147483646, 2147483647};
    int k = 3;
    int t = 3;
    Boolean result = true;
    boolean solution = new medium._0200_0299._220_contains_duplicate_iii.Solution()
        .containsNearbyAlmostDuplicate(nums, k, t);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test5() {
    int[] nums = {1, 2, 2, 3, 4, 5};
    int k = 3;
    int t = 0;
    Boolean result = true;
    boolean solution = new medium._0200_0299._220_contains_duplicate_iii.Solution()
        .containsNearbyAlmostDuplicate(nums, k, t);
    Assert.assertTrue(result.equals(solution));
  }

}
