package medium._0100_0199._179_largest_number;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[] nums = {10, 2};
    String result = "210";
    String solution = new medium._0100_0199._179_largest_number.Solution()
        .largestNumber(nums);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    int[] nums = {3, 30, 34, 5, 9};
    String result = "9534330";
    String solution = new medium._0100_0199._179_largest_number.Solution()
        .largestNumber(nums);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    int[] nums = {1};
    String result = "1";
    String solution = new medium._0100_0199._179_largest_number.Solution()
        .largestNumber(nums);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test3() {
    int[] nums = {10};
    String result = "10";
    String solution = new medium._0100_0199._179_largest_number.Solution()
        .largestNumber(nums);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test4() {
    int[] nums = {432, 43243};
    String result = "43243432";
    String solution = new medium._0100_0199._179_largest_number.Solution()
        .largestNumber(nums);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test5() {
    int[] nums = {111311, 1113};
    String result = "1113111311";
    String solution = new medium._0100_0199._179_largest_number.Solution()
        .largestNumber(nums);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test6() {
    int[] nums = {10, 2, 9, 39, 17};
    String result = "93921710";
    String solution = new medium._0100_0199._179_largest_number.Solution()
        .largestNumber(nums);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test7() {
    int[] nums = {0, 0};
    String result = "0";
    String solution = new medium._0100_0199._179_largest_number.Solution()
        .largestNumber(nums);
    Assert.assertTrue(result.equals(solution));
  }


}
