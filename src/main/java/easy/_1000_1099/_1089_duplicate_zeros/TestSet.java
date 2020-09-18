package easy._1000_1099._1089_duplicate_zeros;


import common.Comparators;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[] arr = {1, 0, 2, 3, 0, 4, 5, 0};
    int[] result = {1, 0, 0, 2, 3, 0, 0, 4};
    new easy._1000_1099._1089_duplicate_zeros.Solution().duplicateZeros(arr);
    Assert.assertTrue(Comparators.isSame(result, arr));
  }

  @Test
  public void test1() {
    int[] arr = {1, 2, 3};
    int[] result = {1, 2, 3};
    new easy._1000_1099._1089_duplicate_zeros.Solution().duplicateZeros(arr);
    Assert.assertTrue(Comparators.isSame(result, arr));
  }

}
