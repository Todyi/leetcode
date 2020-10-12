package easy._0400_0499._404_sum_of_left_leaves;


import common.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    TreeNode root = TreeNode.buildTree(new Integer[]{3, 9, 20, null, null, 15, 7});
    Integer result = 24;
    int solution = new easy._0400_0499._404_sum_of_left_leaves.Solution().sumOfLeftLeaves(root);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    TreeNode root = TreeNode.buildTree(new Integer[]{1});
    Integer result = 0;
    int solution = new easy._0400_0499._404_sum_of_left_leaves.Solution().sumOfLeftLeaves(root);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    TreeNode root = TreeNode.buildTree(new Integer[]{1,null,2});
    Integer result = 0;
    int solution = new easy._0400_0499._404_sum_of_left_leaves.Solution().sumOfLeftLeaves(root);
    Assert.assertTrue(result.equals(solution));
  }

}
