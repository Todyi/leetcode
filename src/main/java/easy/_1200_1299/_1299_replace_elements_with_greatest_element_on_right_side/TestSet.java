package easy._1200_1299._1299_replace_elements_with_greatest_element_on_right_side;


import common.Comparators;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[] arr = {17, 18, 5, 4, 6, 1};
    int[] result = {18, 6, 6, 6, 1, -1};
    int[] solution = new easy._1200_1299._1299_replace_elements_with_greatest_element_on_right_side.Solution()
        .replaceElements(arr);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

}
