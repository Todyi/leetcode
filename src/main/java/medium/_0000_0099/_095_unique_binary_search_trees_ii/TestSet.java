package medium._0000_0099._095_unique_binary_search_trees_ii;


import common.Comparators;
import common.TreeNode;
import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  public List<TreeNode> buildResult(Integer[][] seq) {
    List<TreeNode> result = new ArrayList<>();
    for (Integer[] arr : seq) {
      result.add(TreeNode.buildTree(arr));
    }
    return result;
  }

  private void assertTrue(int n, List<TreeNode> result) {
    List<TreeNode> solution = new Solution()
        .generateTrees(n);
    Assert.assertEquals(result.size(), solution.size());
    for (int i = 0; i < result.size(); i++) {
      Assert.assertTrue(Comparators.isSame(result.get(i), solution.get(i)));
    }
  }

  @Test
  public void test0() {
    int n = 1;
    List<TreeNode> result = buildResult(
        new Integer[][]{
            {1}
        });
    assertTrue(n, result);
  }

  @Test
  public void test1() {
    int n = 2;
    List<TreeNode> result = buildResult(
        new Integer[][]{
            {1, null, 2},
            {2, 1}
        });
    assertTrue(n, result);
  }

  @Test
  public void test2() {
    int n = 3;
    List<TreeNode> result = buildResult(
        new Integer[][]{
            {1, null, 2, null, 3},
            {1, null, 3, 2},
            {2, 1, 3},
            {3, 1, null, null, 2},
            {3, 2, null, 1}
        });
    assertTrue(n, result);
  }

}
