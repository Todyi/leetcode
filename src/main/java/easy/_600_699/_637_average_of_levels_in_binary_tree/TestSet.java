package easy._600_699._637_average_of_levels_in_binary_tree;


import common.Comparators;
import common.TreeNode;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    TreeNode root = TreeNode.buildTree(new Integer[]{3, 9, 20, null, null, 15, 7});
    Double[] result = {3D, 14.5D, 11D};
    List<Double> solution = new easy._600_699._637_average_of_levels_in_binary_tree.Solution()
        .averageOfLevels(root);
    Double[] solutionArr = new Double[solution.size()];
    solution.toArray(solutionArr);
    Assert.assertTrue(Comparators.isSame(result, solutionArr));
  }

}
