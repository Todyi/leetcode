package medium._0100_0199._109_convert_sorted_list_to_binary_search_tree;


import common.Comparators;
import common.ListNode;
import common.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    ListNode head = ListNode.buildList(new Integer[]{-10, -3, 0, 5, 9});
    TreeNode result = TreeNode.buildTree(new Integer[]{0, -3, 9, -10, null, 5});
    TreeNode solution = new medium._0100_0199._109_convert_sorted_list_to_binary_search_tree.Solution()
        .sortedListToBST(head);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

  @Test
  public void test1() {
    ListNode head = ListNode.buildList(new Integer[]{});
    TreeNode result = TreeNode.buildTree(new Integer[]{});
    TreeNode solution = new medium._0100_0199._109_convert_sorted_list_to_binary_search_tree.Solution()
        .sortedListToBST(head);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

  @Test
  public void test2() {
    ListNode head = ListNode.buildList(new Integer[]{0});
    TreeNode result = TreeNode.buildTree(new Integer[]{0});
    TreeNode solution = new medium._0100_0199._109_convert_sorted_list_to_binary_search_tree.Solution()
        .sortedListToBST(head);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

  @Test
  public void test3() {
    ListNode head = ListNode.buildList(new Integer[]{1, 3});
    TreeNode result = TreeNode.buildTree(new Integer[]{3, 1});
    TreeNode solution = new medium._0100_0199._109_convert_sorted_list_to_binary_search_tree.Solution()
        .sortedListToBST(head);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }


}
