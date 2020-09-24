package easy._1100_1199._1184_distance_between_bus_stops;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[] distance = {1, 2, 3, 4};
    int start = 0;
    int destination = 1;
    Integer result = 1;
    int solution = new easy._1100_1199._1184_distance_between_bus_stops.Solution()
        .distanceBetweenBusStops(distance, start, destination);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    int[] distance = {1, 2, 3, 4};
    int start = 0;
    int destination = 2;
    Integer result = 3;
    int solution = new easy._1100_1199._1184_distance_between_bus_stops.Solution()
        .distanceBetweenBusStops(distance, start, destination);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    int[] distance = {1, 2, 3, 4};
    int start = 0;
    int destination = 3;
    Integer result = 4;
    int solution = new easy._1100_1199._1184_distance_between_bus_stops.Solution()
        .distanceBetweenBusStops(distance, start, destination);
    Assert.assertTrue(result.equals(solution));
  }

}
