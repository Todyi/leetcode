package easy._0900_0999._938_range_sum_of_bst;


import common.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    TreeNode root = TreeNode.buildTree(new Integer[]{10, 5, 15, 3, 7, null, 18});
    int L = 7;
    int R = 15;
    Integer result = 32;
    int solution = new easy._0900_0999._938_range_sum_of_bst.Solution()
        .rangeSumBST(root, L, R);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    TreeNode root = TreeNode.buildTree(new Integer[]{10, 5, 15, 3, 7, 13, 18, 1, null, 6});
    int L = 6;
    int R = 10;
    Integer result = 23;
    int solution = new easy._0900_0999._938_range_sum_of_bst.Solution()
        .rangeSumBST(root, L, R);
    Assert.assertTrue(result.equals(solution));
  }

}
