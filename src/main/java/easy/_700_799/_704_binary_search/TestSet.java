package easy._700_799._704_binary_search;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[] nums = {-1, 0, 3, 5, 9, 12};
    int target = 9;
    Integer result = 4;
    int solution = new easy._700_799._704_binary_search.Solution()
        .search(nums, target);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    int[] nums = {-1, 0, 3, 5, 9, 12};
    int target = 2;
    Integer result = -1;
    int solution = new easy._700_799._704_binary_search.Solution()
        .search(nums, target);
    Assert.assertTrue(result.equals(solution));
  }

}
