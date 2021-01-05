package medium._0100_0199._113_path_sum_ii;


import common.Comparators;
import common.TreeNode;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    TreeNode root = TreeNode
        .buildTree(new Integer[]{5, 4, 8, 11, null, 13, 4, 7, 2, null, null, 5, 1});
    int sum = 22;
    Integer[][] result = {
        {5, 4, 11, 2},
        {5, 8, 4, 5}
    };
    List<List<Integer>> solution = new medium._0100_0199._113_path_sum_ii.Solution()
        .pathSum(root, sum);
    Assert.assertTrue(result.length == solution.size());
    for (int i = 0; i < result.length; i++) {
      List<Integer> list = solution.get(i);
      Integer[] tmp = new Integer[list.size()];
      list.toArray(tmp);
      Assert.assertTrue(Comparators.isSame(result[i], tmp));
    }
  }


}
