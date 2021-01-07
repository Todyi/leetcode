package medium._0100_0199._129_sum_root_to_leaf_numbers;


import common.TreeNode;
import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    TreeNode root = TreeNode.buildTree(new Integer[]{1, 2, 3});
    Integer result = 25;
    int solution = new medium._0100_0199._129_sum_root_to_leaf_numbers.Solution()
        .sumNumbers(root);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    TreeNode root = TreeNode.buildTree(new Integer[]{4, 9, 0, 5, 1});
    Integer result = 1026;
    int solution = new medium._0100_0199._129_sum_root_to_leaf_numbers.Solution()
        .sumNumbers(root);
    Assert.assertTrue(result.equals(solution));
  }


}
