package easy._800_899._852_peak_index_in_a_mountain_array;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[] A = {0, 1, 0};
    Integer result = 1;
    int solution = new easy._800_899._852_peak_index_in_a_mountain_array.Solution()
        .peakIndexInMountainArray(A);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    int[] A = {0, 2, 1, 0};
    Integer result = 1;
    int solution = new easy._800_899._852_peak_index_in_a_mountain_array.Solution()
        .peakIndexInMountainArray(A);
    Assert.assertTrue(result.equals(solution));
  }

}
