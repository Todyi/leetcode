package easy._1200_1299._1287_element_appearing_more_than_25_in_sorted_array;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[] arr = {1,2,2,6,6,6,6,7,10};
    Integer result = 6;
    int solution = new easy._1200_1299._1287_element_appearing_more_than_25_in_sorted_array.Solution()
        .findSpecialInteger(arr);
    Assert.assertTrue(result.equals(solution));
  }

}
