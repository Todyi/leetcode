package easy._107_binary_tree_level_order_traversal_ii;


import static common.TreeNode.buildTree;

import com.alibaba.fastjson.JSON;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    Integer[] input = {3, 9, 20, null, null, 15, 7};
    String result = "[[15,7],[9,20],[3]]";
    String resolution = JSON.toJSONString(new easy._107_binary_tree_level_order_traversal_ii.Solution()
        .levelOrderBottom(buildTree(input)));
    Assert.assertTrue(result.equals(resolution));
  }


}
