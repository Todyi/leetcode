package easy._1500_1599._1560_most_visited_sector_in_a_circular_track;


import common.Comparators;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int n = 4;
    int[] rounds = {1, 3, 1, 2};
    Integer[] result = {1, 2};
    List<Integer> solution = new easy._1500_1599._1560_most_visited_sector_in_a_circular_track.Solution()
        .mostVisited(n, rounds);
    Integer[] solutionArr = new Integer[solution.size()];
    solution.toArray(solutionArr);
    Assert.assertTrue(Comparators.isSame(result, solutionArr));
  }

  @Test
  public void test1() {
    int n = 2;
    int[] rounds = {2, 1, 2, 1, 2, 1, 2, 1, 2};
    Integer[] result = {2};
    List<Integer> solution = new easy._1500_1599._1560_most_visited_sector_in_a_circular_track.Solution()
        .mostVisited(n, rounds);
    Integer[] solutionArr = new Integer[solution.size()];
    solution.toArray(solutionArr);
    Assert.assertTrue(Comparators.isSame(result, solutionArr));
  }

  @Test
  public void test2() {
    int n = 7;
    int[] rounds = {1, 3, 5, 7};
    Integer[] result = {1, 2, 3, 4, 5, 6, 7};
    List<Integer> solution = new easy._1500_1599._1560_most_visited_sector_in_a_circular_track.Solution()
        .mostVisited(n, rounds);
    Integer[] solutionArr = new Integer[solution.size()];
    solution.toArray(solutionArr);
    Assert.assertTrue(Comparators.isSame(result, solutionArr));
  }

}
