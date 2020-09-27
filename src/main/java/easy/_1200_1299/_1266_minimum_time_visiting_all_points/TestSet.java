package easy._1200_1299._1266_minimum_time_visiting_all_points;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[][] points = {{1, 1}, {3, 4}, {-1, 0}};
    Integer result = 7;
    int solution = new easy._1200_1299._1266_minimum_time_visiting_all_points.Solution()
        .minTimeToVisitAllPoints(points);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    int[][] points = {{3, 2}, {-2, 2}};
    Integer result = 5;
    int solution = new easy._1200_1299._1266_minimum_time_visiting_all_points.Solution()
        .minTimeToVisitAllPoints(points);
    Assert.assertTrue(result.equals(solution));
  }

}
