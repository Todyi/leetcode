package medium._0100_0199._199_binary_tree_right_side_view;


import common.Comparators;
import common.TreeNode;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    TreeNode root = TreeNode.buildTree(new Integer[]{1,2,3,null,5,null,4});
    Integer[] result = {1,3,4};
    List<Integer> solution = new medium._0100_0199._199_binary_tree_right_side_view.Solution()
        .rightSideView(root);
    Integer[] solArr = new Integer[solution.size()];
    solution.toArray(solArr);
    Assert.assertTrue(Comparators.isSame(result, solArr));
  }

  @Test
  public void test1() {
    TreeNode root = TreeNode.buildTree(new Integer[]{1,2});
    Integer[] result = {1,2};
    List<Integer> solution = new medium._0100_0199._199_binary_tree_right_side_view.Solution()
        .rightSideView(root);
    Integer[] solArr = new Integer[solution.size()];
    solution.toArray(solArr);
    Assert.assertTrue(Comparators.isSame(result, solArr));
  }


}
