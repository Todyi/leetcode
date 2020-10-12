package easy._0400_0499._447_number_of_boomeranges;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {


  @Test
  public void test0() {
    int[][] points = {{0, 0}, {1, 0}, {2, 0}};
    Integer result = 2;
    int solution = new easy._0400_0499._447_number_of_boomeranges.Solution()
        .numberOfBoomerangs(points);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    int[][] points = {{0, 0}, {1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    Integer result = 20;
    int solution = new easy._0400_0499._447_number_of_boomeranges.Solution()
        .numberOfBoomerangs(points);
    Assert.assertTrue(result.equals(solution));
  }

}
