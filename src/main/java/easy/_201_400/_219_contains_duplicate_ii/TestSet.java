package easy._201_400._219_contains_duplicate_ii;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[] input = {1,2,3,1};
    int k = 3;
    Boolean result = true;
    boolean resolution = new easy._201_400._219_contains_duplicate_ii.Solution().containsNearbyDuplicate(input,k);
    Assert.assertTrue(result.equals(resolution));
  }

  @Test
  public void test1() {
    int[] input = {1,0,1,1};
    int k = 1;
    Boolean result = true;
    boolean resolution = new easy._201_400._219_contains_duplicate_ii.Solution().containsNearbyDuplicate(input,k);
    Assert.assertTrue(result.equals(resolution));
  }

  @Test
  public void test2() {
    int[] input = {1,2,3,1,2,3};
    int k = 2;
    Boolean result = false;
    boolean resolution = new easy._201_400._219_contains_duplicate_ii.Solution().containsNearbyDuplicate(input,k);
    Assert.assertTrue(result.equals(resolution));
  }
}
