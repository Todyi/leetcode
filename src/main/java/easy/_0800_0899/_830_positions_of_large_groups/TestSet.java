package easy._0800_0899._830_positions_of_large_groups;


import common.Comparators;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  private void assertTrue(String s, int[][] result) {
    List<List<Integer>> solution = new Solution().largeGroupPositions(s);
    int[][] solutionArr = new int[solution.size()][2];
    format(solution, solutionArr);
    for (int i = 0; i < result.length; i++) {
      Assert.assertTrue(Comparators.isSame(result[i], solutionArr[i]));
    }
  }

  private void format(List<List<Integer>> solution, int[][] solutionArr) {
    for (int i = 0; i < solution.size(); i++) {
      List<Integer> list = solution.get(i);
      for (int j = 0; j < list.size(); j++) {
        solutionArr[i][j] = list.get(j);
      }
    }
  }


  @Test
  public void test0() {
    String S = "abbxxxxzzy";
    int[][] result = {{3, 6}};
    assertTrue(S, result);
  }

  @Test
  public void test1() {
    String S = "abc";
    int[][] result = {};
    assertTrue(S, result);
  }

  @Test
  public void test2() {
    String S = "abcdddeeeeaabbbcd";
    int[][] result = {{3, 5}, {6, 9}, {12, 14}};
    assertTrue(S, result);
  }


}
