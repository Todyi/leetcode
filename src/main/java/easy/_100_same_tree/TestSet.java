package easy._100_same_tree;


import common.TreeNode;
import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  public TreeNode buildTree(Integer[] treeArr) {
    if (treeArr.length == 0) {
      return null;
    }
    TreeNode root = new TreeNode(treeArr[0]);
    List<TreeNode> queue = new ArrayList<>();
    boolean left = true;
    TreeNode pointer = root;
    for (int i = 1; i < treeArr.length; i++) {
      if (left) {
        if (treeArr[i] != null) {
          pointer.left = new TreeNode(treeArr[i]);
          queue.add(pointer.left);
        }
      } else {
        if (treeArr[i] != null) {
          pointer.right = new TreeNode(treeArr[i]);
          queue.add(pointer.right);
        }
        pointer = queue.get(0);
        queue.remove(0);
      }
      left = !left;
    }
    return root;
  }

  @Test
  public void test() {
    Integer[] pArr = {1, 2, 3};
    Integer[] qArr = {1, 2, 3};
    TreeNode p = buildTree(pArr);
    TreeNode q = buildTree(qArr);
    Boolean result = true;
    Assert.assertTrue(result.equals(new Solution().isSameTree(p, q)));
  }

  @Test
  public void test1() {
    Integer[] pArr = {1, 2, 3};
    Integer[] qArr = {1, null, 2};
    TreeNode p = buildTree(pArr);
    TreeNode q = buildTree(qArr);
    Boolean result = false;
    Assert.assertTrue(result.equals(new Solution().isSameTree(p, q)));
  }

  @Test
  public void test2() {
    Integer[] pArr = {1, 2, 3, 4, 5};
    Integer[] qArr = {1, null, 2};
    TreeNode p = buildTree(pArr);
    TreeNode q = buildTree(qArr);
    Boolean result = false;
    Assert.assertTrue(result.equals(new Solution().isSameTree(p, q)));
  }

  @Test
  public void test3() {
    Integer[] pArr = {1, null, 3, 4, 5};
    Integer[] qArr = {1, null, 3, 4, 5};
    TreeNode p = buildTree(pArr);
    TreeNode q = buildTree(qArr);
    Boolean result = true;
    Assert.assertTrue(result.equals(new Solution().isSameTree(p, q)));
  }

}
