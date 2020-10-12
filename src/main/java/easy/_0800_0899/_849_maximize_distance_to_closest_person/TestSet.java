package easy._0800_0899._849_maximize_distance_to_closest_person;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[] seats = {1, 0, 0, 0, 1, 0, 1};
    Integer result = 2;
    int solution = new easy._0800_0899._849_maximize_distance_to_closest_person.Solution()
        .maxDistToClosest(seats);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    int[] seats = {1, 0, 0, 0};
    Integer result = 3;
    int solution = new easy._0800_0899._849_maximize_distance_to_closest_person.Solution()
        .maxDistToClosest(seats);
    Assert.assertTrue(result.equals(solution));
  }

}
