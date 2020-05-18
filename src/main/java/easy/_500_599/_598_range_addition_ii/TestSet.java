package easy._500_599._598_range_addition_ii;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int m = 3;
    int n = 3;
    int[][] ops = {{2,2},{3,3}};
    Integer result = 4;
    int solution = new easy._500_599._598_range_addition_ii.Solution()
        .maxCount(m, n, ops);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    int m = 3;
    int n = 3;
    int[][] ops = {};
    Integer result = 9;
    int solution = new easy._500_599._598_range_addition_ii.Solution()
        .maxCount(m, n, ops);
    Assert.assertTrue(result.equals(solution));
  }

}
