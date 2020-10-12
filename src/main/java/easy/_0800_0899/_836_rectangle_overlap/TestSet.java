package easy._0800_0899._836_rectangle_overlap;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[] rec1 = {0, 0, 2, 2};
    int[] rec2 = {1, 1, 3, 3};
    Boolean result = true;
    boolean solution = new easy._0800_0899._836_rectangle_overlap.Solution()
        .isRectangleOverlap(rec1, rec2);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    int[] rec1 = {0, 0, 1, 1};
    int[] rec2 = {1, 0, 2, 1};
    Boolean result = false;
    boolean solution = new easy._0800_0899._836_rectangle_overlap.Solution()
        .isRectangleOverlap(rec1, rec2);
    Assert.assertTrue(result.equals(solution));
  }

}
