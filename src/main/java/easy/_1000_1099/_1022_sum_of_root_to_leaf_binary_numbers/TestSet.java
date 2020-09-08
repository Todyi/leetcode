package easy._1000_1099._1022_sum_of_root_to_leaf_binary_numbers;


import common.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    TreeNode root = TreeNode.buildTree(new Integer[]{1, 0, 1, 0, 1, 0, 1});
    Integer result = 22;
    int solution = new easy._1000_1099._1022_sum_of_root_to_leaf_binary_numbers.Solution()
        .sumRootToLeaf(root);
    Assert.assertTrue(result.equals(solution));
  }

}
