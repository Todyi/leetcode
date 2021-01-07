package medium._0100_0199._120_triangle;


import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  public List<List<Integer>> toList(int[][] vector) {
    List<List<Integer>> result = new ArrayList<>();
    for (int[] v : vector) {
      List<Integer> list = new ArrayList<>();
      result.add(list);
      for (int i : v) {
        list.add(i);
      }
    }
    return result;
  }

  @Test
  public void test0() {
    List<List<Integer>> triangle = toList(new int[][]{{2}, {3, 4}, {6, 5, 7}, {4, 1, 8, 3}});
    Integer result = 11;
    int solution = new medium._0100_0199._120_triangle.Solution()
        .minimumTotal(triangle);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    List<List<Integer>> triangle = toList(new int[][]{{-10}});
    Integer result = -10;
    int solution = new medium._0100_0199._120_triangle.Solution()
        .minimumTotal(triangle);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    List<List<Integer>> triangle = toList(new int[][]{{-1}, {-2, -3}});
    Integer result = -4;
    int solution = new medium._0100_0199._120_triangle.Solution()
        .minimumTotal(triangle);
    Assert.assertTrue(result.equals(solution));
  }


}
