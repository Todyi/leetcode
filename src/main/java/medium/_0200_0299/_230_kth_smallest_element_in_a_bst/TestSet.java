package medium._0200_0299._230_kth_smallest_element_in_a_bst;


import common.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    TreeNode root = TreeNode.buildTree(new Integer[]{3, 1, 4, null, 2});
    int k = 1;
    Integer result = 1;
    int solution = new medium._0200_0299._230_kth_smallest_element_in_a_bst.Solution()
        .kthSmallest(root, k);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    TreeNode root = TreeNode.buildTree(new Integer[]{5, 3, 6, 2, 4, null, null, 1});
    int k = 3;
    Integer result = 3;
    int solution = new medium._0200_0299._230_kth_smallest_element_in_a_bst.Solution()
        .kthSmallest(root, k);
    Assert.assertTrue(result.equals(solution));
  }

}
