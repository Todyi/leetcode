package medium._0100_0199._116_populating_next_right_pointers_in_each_node;


import common.Comparators;
import common.Node;
import common.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  public void checkNext(Node head, Integer[] result) {
    int idx = 0;
    while (head != null) {
      Assert.assertTrue(head.val == result[idx++]);
      head = head.next;
    }
    Assert.assertTrue(idx == result.length);
  }

  @Test
  public void test0() {
    Node root = Node.buildTree(new Integer[]{1, 2, 3, 4, 5, 6, 7});
    Integer[][] result = {
        {1},
        {2, 3},
        {4, 5, 6, 7},
    };
    Node solution = new medium._0100_0199._116_populating_next_right_pointers_in_each_node.Solution()
        .connect(root);
    Node head = solution;
    int idx = 0;
    while (head != null) {
      checkNext(head, result[idx++]);
      head = head.left;
    }
    Assert.assertTrue(idx == result.length);
  }


}
