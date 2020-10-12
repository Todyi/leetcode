package easy._0400_0499._437_path_sum_iii;


import common.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {


  @Test
  public void test0() {
    TreeNode root = TreeNode.buildTree(new Integer[]{10, 5, -3, 3, 2, null, 11, 3, -2, null, 1});
    int num = 8;
    Integer result = 3;
    int solution = new easy._0400_0499._437_path_sum_iii.Solution().pathSum(root, num);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    TreeNode root = TreeNode.buildTree(new Integer[]{-1000000, 1000000});
    int num = 0;
    Integer result = 1;
    int solution = new easy._0400_0499._437_path_sum_iii.Solution().pathSum(root, num);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    TreeNode root = TreeNode.buildTree(new Integer[]{1,null,2,null,3,null,4,null,5});
    int num = 3;
    Integer result = 2;
    int solution = new easy._0400_0499._437_path_sum_iii.Solution().pathSum(root, num);
    Assert.assertTrue(result.equals(solution));
  }

}
