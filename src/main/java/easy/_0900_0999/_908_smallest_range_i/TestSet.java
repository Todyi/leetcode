package easy._0900_0999._908_smallest_range_i;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[] A = {1};
    int K = 0;
    Integer result = 0;
    int solution = new easy._0900_0999._908_smallest_range_i.Solution()
        .smallestRangeI(A, K);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    int[] A = {0, 10};
    int K = 2;
    Integer result = 6;
    int solution = new easy._0900_0999._908_smallest_range_i.Solution()
        .smallestRangeI(A, K);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    int[] A = {1, 3, 6};
    int K = 3;
    Integer result = 0;
    int solution = new easy._0900_0999._908_smallest_range_i.Solution()
        .smallestRangeI(A, K);
    Assert.assertTrue(result.equals(solution));
  }

}
