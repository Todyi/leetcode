package easy._201_400._257_binary_tree_paths;


import com.alibaba.fastjson.JSON;
import common.Comparators;
import common.ListNode;
import common.TreeNode;
import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    TreeNode root = TreeNode.buildTree(new Integer[]{4,5,1,9});
    List<String> resolution = new easy._201_400._257_binary_tree_paths.Solution().binaryTreePaths(root);
    System.out.println(JSON.toJSONString(resolution));
  }

  @Test
  public void test1() {
    TreeNode root = TreeNode.buildTree(new Integer[]{1,2,3,null,null,4});
    List<String> resolution = new easy._201_400._257_binary_tree_paths.Solution().binaryTreePaths(root);
    System.out.println(JSON.toJSONString(resolution));
  }

}
