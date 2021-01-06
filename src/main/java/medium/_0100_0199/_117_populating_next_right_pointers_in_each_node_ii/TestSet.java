package medium._0100_0199._117_populating_next_right_pointers_in_each_node_ii;


import common.Node;
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
    Node root = Node.buildTree(new Integer[]{1, 2, 3, 4, 5, null, 7});
    Integer[][] result = {
        {1},
        {2, 3},
        {4, 5, 7},
    };
    Node solution = new medium._0100_0199._117_populating_next_right_pointers_in_each_node_ii.Solution()
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
