package easy._700_799._724_find_privot_index;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[] nums = {1, 7, 3, 6, 5, 6};
    Integer result = 3;
    int solution = new easy._700_799._724_find_privot_index.Solution()
        .pivotIndex(nums);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    int[] nums = {1, 2, 3};
    Integer result = -1;
    int solution = new easy._700_799._724_find_privot_index.Solution()
        .pivotIndex(nums);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    int[] nums = {};
    Integer result = -1;
    int solution = new easy._700_799._724_find_privot_index.Solution()
        .pivotIndex(nums);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test3() {
    int[] nums = {-1, -1, -1, -1, -1, 0};
    Integer result = 2;
    int solution = new easy._700_799._724_find_privot_index.Solution()
        .pivotIndex(nums);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test4() {
    int[] nums = {-1, -1, -1, 0, 1, 1};
    Integer result = 0;
    int solution = new easy._700_799._724_find_privot_index.Solution()
        .pivotIndex(nums);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test5() {
    int[] nums = {-1, -1, -1, 0, 1, 0};
    Integer result = -1;
    int solution = new easy._700_799._724_find_privot_index.Solution()
        .pivotIndex(nums);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test6() {
    int[] nums = {-1, -1, 0, -1, -1, -1};
    Integer result = 3;
    int solution = new easy._700_799._724_find_privot_index.Solution()
        .pivotIndex(nums);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test7() {
    int[] nums = {-1, -1, -1, -1, 0, 1};
    Integer result = 1;
    int solution = new easy._700_799._724_find_privot_index.Solution()
        .pivotIndex(nums);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test8() {
    int[] nums = {-1, -1, -1, -1, 0, -1};
    Integer result = 2;
    int solution = new easy._700_799._724_find_privot_index.Solution()
        .pivotIndex(nums);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test9() {
    int[] nums = {-1, -1, -1, 1, 1, 1};
    Integer result = -1;
    int solution = new easy._700_799._724_find_privot_index.Solution()
        .pivotIndex(nums);
    Assert.assertTrue(result.equals(solution));
  }

}
