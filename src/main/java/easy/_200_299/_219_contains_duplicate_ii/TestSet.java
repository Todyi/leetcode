package easy._200_299._219_contains_duplicate_ii;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[] input = {1,2,3,1};
    int k = 3;
    Boolean result = true;
    boolean resolution = new easy._200_299._219_contains_duplicate_ii.Solution().containsNearbyDuplicate(input,k);
    Assert.assertTrue(result.equals(resolution));
  }

  @Test
  public void test1() {
    int[] input = {1,0,1,1};
    int k = 1;
    Boolean result = true;
    boolean resolution = new easy._200_299._219_contains_duplicate_ii.Solution().containsNearbyDuplicate(input,k);
    Assert.assertTrue(result.equals(resolution));
  }

  @Test
  public void test2() {
    int[] input = {1,2,3,1,2,3};
    int k = 2;
    Boolean result = false;
    boolean resolution = new easy._200_299._219_contains_duplicate_ii.Solution().containsNearbyDuplicate(input,k);
    Assert.assertTrue(result.equals(resolution));
  }

  @Test
  public void test3() {
    int[] input = {1,2,1};
    int k = 0;
    Boolean result = false;
    boolean resolution = new easy._200_299._219_contains_duplicate_ii.Solution().containsNearbyDuplicate(input,k);
    Assert.assertTrue(result.equals(resolution));
  }

  @Test
  public void test4() {
    int[] input = {0,1,2,3,2,5};
    int k = 3;
    Boolean result = true;
    boolean resolution = new easy._200_299._219_contains_duplicate_ii.Solution().containsNearbyDuplicate(input,k);
    Assert.assertTrue(result.equals(resolution));
  }

  @Test
  public void test5() {
    int[] input = {1,2,3,4,5,6,7,8,9,9};
    int k = 3;
    Boolean result = true;
    boolean resolution = new easy._200_299._219_contains_duplicate_ii.Solution().containsNearbyDuplicate(input,k);
    Assert.assertTrue(result.equals(resolution));
  }
}
