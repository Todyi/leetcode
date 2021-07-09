package easy._0200_0299._228_summary_ranges;


import common.Comparators;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  private void assertTrue(int[] nums, String[] result) {
    List<String> resolution = new Solution()
        .summaryRanges(nums);
    Assert.assertTrue(result.length == resolution.size());
    String[] resArr = new String[result.length];
    resolution.toArray(resArr);
    Assert.assertTrue(Comparators.isSame(result, resArr));
  }

  @Test
  public void test0() {
    int[] nums = {0, 1, 2, 4, 5, 7};
    String[] result = {"0->2", "4->5", "7"};
    assertTrue(nums, result);
  }

  @Test
  public void test1() {
    int[] nums = {0, 2, 3, 4, 6, 8, 9};
    String[] result = {"0", "2->4", "6", "8->9"};
    assertTrue(nums, result);
  }

  @Test
  public void test2() {
    int[] nums = {};
    String[] result = {};
    assertTrue(nums, result);
  }

  @Test
  public void test3() {
    int[] nums = {-1};
    String[] result = {"-1"};
    assertTrue(nums, result);
  }

  @Test
  public void test4() {
    int[] nums = {0};
    String[] result = {"0"};
    assertTrue(nums, result);
  }

}
