package easy._201_400._217_contains_duplicate;


import common.Comparators;
import common.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[] input = {1,2,3,1};
    Boolean result = true;
    boolean resolution = new easy._201_400._217_contains_duplicate.Solution().containsDuplicate(input);
    Assert.assertTrue(result.equals(resolution));
  }

  @Test
  public void test1() {
    int[] input = {1,2,3,4};
    Boolean result = false;
    boolean resolution = new easy._201_400._217_contains_duplicate.Solution().containsDuplicate(input);
    Assert.assertTrue(result.equals(resolution));
  }

  @Test
  public void test2() {
    int[] input = {1,1,1,3,3,4,3,2,4,2};
    Boolean result = true;
    boolean resolution = new easy._201_400._217_contains_duplicate.Solution().containsDuplicate(input);
    Assert.assertTrue(result.equals(resolution));
  }
}
