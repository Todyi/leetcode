package medium._0000_0099._033_search_in_rotated_sorted_array;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[] nums = {4, 5, 6, 7, 0, 1, 2};
    int target = 0;
    Integer result = 4;
    int solution = new medium._0000_0099._033_search_in_rotated_sorted_array.Solution()
        .search(nums, target);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    int[] nums = {4, 5, 6, 7, 0, 1, 2};
    int target = 3;
    Integer result = -1;
    int solution = new medium._0000_0099._033_search_in_rotated_sorted_array.Solution()
        .search(nums, target);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    int[] nums = {1};
    int target = 0;
    Integer result = -1;
    int solution = new medium._0000_0099._033_search_in_rotated_sorted_array.Solution()
        .search(nums, target);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test3() {
    int[] nums = {1, 3};
    int target = 3;
    Integer result = 1;
    int solution = new medium._0000_0099._033_search_in_rotated_sorted_array.Solution()
        .search(nums, target);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test4() {
    int[] nums = {5, 1, 3};
    int target = 5;
    Integer result = 0;
    int solution = new medium._0000_0099._033_search_in_rotated_sorted_array.Solution()
        .search(nums, target);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test5() {
    int[] nums = {5,1,2,3,4};
    int target = 1;
    Integer result = 1;
    int solution = new medium._0000_0099._033_search_in_rotated_sorted_array.Solution()
        .search(nums, target);
    Assert.assertTrue(result.equals(solution));
  }
}
