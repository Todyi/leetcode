package easy._201_400._226_invert_binary_tree;


import common.Comparators;
import common.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    TreeNode input = TreeNode.buildTree(new Integer[]{4,2,7,1,3,6,9});
    TreeNode result = TreeNode.buildTree(new Integer[]{4,7,2,9,6,3,1});
    TreeNode resolution = new easy._201_400._226_invert_binary_tree.Solution().invertTree(input);
    Assert.assertTrue(Comparators.isSame(result,resolution));
  }
}
