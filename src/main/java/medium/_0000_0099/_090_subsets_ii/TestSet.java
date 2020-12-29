package medium._0000_0099._090_subsets_ii;


import common.Comparators;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[] n = {1, 2, 2};
//    Integer[][] result = {
//        {},
//        {1},
//        {2},
//        {1, 2},
//        {2, 2},
//        {1, 2, 2},
//    };
    Integer[][] result = {
        {},
        {2},
        {2, 2},
        {1},
        {1, 2},
        {1, 2, 2},
    };
    List<List<Integer>> solution = new medium._0000_0099._090_subsets_ii.Solution()
        .subsetsWithDup(n);
    Assert.assertTrue(result.length == solution.size());
    for (int i = 0; i < result.length; i++) {
      Integer[] solutionArr = new Integer[result[i].length];
      solution.get(i).toArray(solutionArr);
      Assert.assertTrue(Comparators.isSame(result[i], solutionArr));
    }

  }


}
