package easy._800_899._872_leaf_similar_trees;


import common.Comparators;
import common.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    TreeNode root1 = TreeNode.buildTree(new Integer[]{0, 1, 2, 6, 7, 3, 8, 4, 9});
    TreeNode root2 = TreeNode.buildTree(new Integer[]{0, 1, 2, 6, 7, 3, 8, 4, 9});
    Boolean result = true;
    boolean solution = new easy._800_899._872_leaf_similar_trees.Solution()
        .leafSimilar(root1, root2);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    TreeNode root1 = TreeNode.buildTree(new Integer[]{3, 5, 1, 6, 2, 9, 8, null, null, 7, 4});
    TreeNode root2 = TreeNode
        .buildTree(new Integer[]{3, 5, 1, 6, 7, 4, 2, null, null, null, null, null, null, 9, 8});
    Boolean result = true;
    boolean solution = new easy._800_899._872_leaf_similar_trees.Solution()
        .leafSimilar(root1, root2);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    TreeNode root1 = TreeNode.buildTree(new Integer[]{3, 5, 1, 6, 2, 9, 8, null, null, 7, 4});
    TreeNode root2 = TreeNode
        .buildTree(
            new Integer[]{3, 5, 1, 6, 7, 4, 2, null, null, null, null, null, null, 9, 11, null,
                null, 8, 10});
    Boolean result = false;
    boolean solution = new easy._800_899._872_leaf_similar_trees.Solution()
        .leafSimilar(root1, root2);
    Assert.assertTrue(result.equals(solution));
  }

}
