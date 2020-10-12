package easy._0700_0799._783_minimum_distance_between_bst_nodes;


import common.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    TreeNode root = TreeNode.buildTree(new Integer[]{4, 2, 6, 1, 3});
    Integer result = 1;
    int solution = new easy._0700_0799._783_minimum_distance_between_bst_nodes.Solution()
        .minDiffInBST(root);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    TreeNode root = TreeNode.buildTree(new Integer[]{90,69,null,49,89,null,52});
    Integer result = 1;
    int solution = new easy._0700_0799._783_minimum_distance_between_bst_nodes.Solution()
        .minDiffInBST(root);
    Assert.assertTrue(result.equals(solution));
  }

}
