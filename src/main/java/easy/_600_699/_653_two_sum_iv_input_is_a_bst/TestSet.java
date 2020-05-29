package easy._600_699._653_two_sum_iv_input_is_a_bst;


import common.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    TreeNode root = TreeNode.buildTree(new Integer[]{5, 3, 6, 2, 4, 7});
    int k = 9;
    Boolean result = true;
    boolean solution = new easy._600_699._653_two_sum_iv_input_is_a_bst.Solution()
        .findTarget(root, k);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    TreeNode root = TreeNode.buildTree(new Integer[]{5, 3, 6, 2, 4, 7});
    int k = 28;
    Boolean result = false;
    boolean solution = new easy._600_699._653_two_sum_iv_input_is_a_bst.Solution()
        .findTarget(root, k);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    TreeNode root = TreeNode.buildTree(new Integer[]{2,1,3});
    int k = 4;
    Boolean result = true;
    boolean solution = new easy._600_699._653_two_sum_iv_input_is_a_bst.Solution()
        .findTarget(root, k);
    Assert.assertTrue(result.equals(solution));
  }
  @Test
  public void test3() {
    TreeNode root = TreeNode.buildTree(new Integer[]{5,4,7});
    int k = 11;
    Boolean result = true;
    boolean solution = new easy._600_699._653_two_sum_iv_input_is_a_bst.Solution()
        .findTarget(root, k);
    Assert.assertTrue(result.equals(solution));
  }

}
