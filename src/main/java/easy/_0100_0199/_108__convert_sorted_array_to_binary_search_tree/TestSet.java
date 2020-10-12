package easy._0100_0199._108__convert_sorted_array_to_binary_search_tree;


import static common.TreeNode.buildTree;

import common.Comparators;
import common.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[] input = {-10, -3, 0, 5, 9};
    Integer[] resultArr = {0, -3, 9, -10, null, 5};
    TreeNode result = buildTree(resultArr);
    TreeNode resolution = new Solution()
        .sortedArrayToBST(input);
    Assert.assertTrue(Comparators.isSame(result,resolution));
  }


}
