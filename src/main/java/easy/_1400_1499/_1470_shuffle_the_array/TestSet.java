package easy._1400_1499._1470_shuffle_the_array;


import common.Comparators;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[] nums = {2, 5, 1, 3, 4, 7};
    int n = 3;
    int[] result = {2, 3, 5, 4, 1, 7};
    int[] solution = new easy._1400_1499._1470_shuffle_the_array.Solution()
        .shuffle(nums, n);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

  @Test
  public void test1() {
    int[] nums = {1, 2, 3, 4, 4, 3, 2, 1};
    int n = 4;
    int[] result = {1, 4, 2, 3, 3, 2, 4, 1};
    int[] solution = new easy._1400_1499._1470_shuffle_the_array.Solution()
        .shuffle(nums, n);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

  @Test
  public void test2() {
    int[] nums = {1, 1, 2, 2};
    int n = 2;
    int[] result = {1, 2, 1, 2};
    int[] solution = new easy._1400_1499._1470_shuffle_the_array.Solution()
        .shuffle(nums, n);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

}
