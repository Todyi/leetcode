package easy._1000_1099._1013_partition_array_into_three_parts_with_equal_sum;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[] A = {0, 2, 1, -6, 6, -7, 9, 1, 2, 0, 1};
    Boolean result = true;
    boolean solution = new easy._1000_1099._1013_partition_array_into_three_parts_with_equal_sum.Solution()
        .canThreePartsEqualSum(A);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    int[] A = {0, 2, 1, -6, 6, 7, 9, -1, 2, 0, 1};
    Boolean result = false;
    boolean solution = new easy._1000_1099._1013_partition_array_into_three_parts_with_equal_sum.Solution()
        .canThreePartsEqualSum(A);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    int[] A = {3, 3, 6, 5, -2, 2, 5, 1, -9, 4};
    Boolean result = true;
    boolean solution = new easy._1000_1099._1013_partition_array_into_three_parts_with_equal_sum.Solution()
        .canThreePartsEqualSum(A);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test3() {
    int[] A = {10, -10, 10, -10, 10, -10, 10, -10};
    Boolean result = true;
    boolean solution = new easy._1000_1099._1013_partition_array_into_three_parts_with_equal_sum.Solution()
        .canThreePartsEqualSum(A);
    Assert.assertTrue(result.equals(solution));
  }

}
