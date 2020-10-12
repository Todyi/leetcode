package easy._0600_0699._606_construct_string_from_binary_tree;


import common.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    TreeNode t = TreeNode.buildTree(new Integer[]{1, 2, 3, 4});
    int n = 1;
    String result = "1(2(4))(3)";
    String solution = new easy._0600_0699._606_construct_string_from_binary_tree.Solution()
        .tree2str(t);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    TreeNode t = TreeNode.buildTree(new Integer[]{1, 2, 3, null, 4});
    int n = 1;
    String result = "1(2()(4))(3)";
    String solution = new easy._0600_0699._606_construct_string_from_binary_tree.Solution()
        .tree2str(t);
    Assert.assertTrue(result.equals(solution));
  }

}
