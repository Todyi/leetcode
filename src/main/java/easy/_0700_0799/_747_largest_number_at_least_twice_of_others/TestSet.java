package easy._0700_0799._747_largest_number_at_least_twice_of_others;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[] nums = {3, 6, 1, 0};
    Integer result = 1;
    int solution = new easy._0700_0799._747_largest_number_at_least_twice_of_others.Solution()
        .dominantIndex(nums);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    int[] nums = {1, 2, 3, 4};
    Integer result = -1;
    int solution = new easy._0700_0799._747_largest_number_at_least_twice_of_others.Solution()
        .dominantIndex(nums);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test3() {
    int[] nums = {0, 0, 0, 1};
    Integer result = 3;
    int solution = new easy._0700_0799._747_largest_number_at_least_twice_of_others.Solution()
        .dominantIndex(nums);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test4() {
    int[] nums = {1, 0};
    Integer result = 0;
    int solution = new easy._0700_0799._747_largest_number_at_least_twice_of_others.Solution()
        .dominantIndex(nums);
    Assert.assertTrue(result.equals(solution));
  }


}
