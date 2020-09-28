package easy._1300_1399._1313_decompress_run_length_encoded_list;


import common.Comparators;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[] nums = {1, 2, 3, 4};
    int[] result = {2, 4, 4, 4};
    int[] solution = new easy._1300_1399._1313_decompress_run_length_encoded_list.Solution()
        .decompressRLElist(nums);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

  @Test
  public void test1() {
    int[] nums = {1, 1, 2, 3};
    int[] result = {1, 3, 3};
    int[] solution = new easy._1300_1399._1313_decompress_run_length_encoded_list.Solution()
        .decompressRLElist(nums);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }


}
