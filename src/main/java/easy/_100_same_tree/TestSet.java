package easy._100_same_tree;


import static common.TreeNode.buildTree;

import common.TreeNode;
import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {


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
