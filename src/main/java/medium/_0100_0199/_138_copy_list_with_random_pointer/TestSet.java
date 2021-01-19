package medium._0100_0199._138_copy_list_with_random_pointer;


import common.Node;
import java.util.HashMap;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  public Node buildNode(Integer[][] seq) {
    if (seq == null || seq.length < 1) {
      return null;
    }
    HashMap<Integer, Node> nodeMap = new HashMap<>();
    Node head = new Node(seq[0][0]);
    nodeMap.put(head.val, head);
    Node pointer = head;
    for (int i = 1; i < seq.length; i++) {
      Node tmp = new Node(seq[i][0]);
      nodeMap.put(tmp.val, tmp);
      pointer.next = tmp;
      pointer = tmp;
    }
    for (Integer[] i : seq) {
      Node cur = nodeMap.get(i[0]);
      if (i[1] != null) {
        Node random = nodeMap.get(seq[i[1]][0]);
        cur.random = random;
      }
    }
    return head;
  }

  private void assertTrue(Node head) {
    Node solution = new Solution().copyRandomList(head);
    while (head != null) {
      Assert.assertTrue(head.val == solution.val);
      Assert.assertTrue("same object", head != solution);
      if (head.random != null) {
        Assert.assertTrue((solution.random != null) && (head.random.val == solution.random.val));
      } else {
        Assert.assertTrue(solution.random == null);
      }
      head = head.next;
      solution = solution.next;
    }
  }

  @Test
  public void test0() {
    Node head = buildNode(new Integer[][]{{7, null}, {13, 0}, {11, 4}, {10, 2}, {1, 0}});
    assertTrue(head);
  }

  @Test
  public void test1() {
    Node head = buildNode(new Integer[][]{{1, 1}, {2, 1}});
    assertTrue(head);
  }

  @Test
  public void test2() {
    Node head = buildNode(new Integer[][]{{3, null}, {3, 0}, {3, null}});
    assertTrue(head);
  }

  @Test
  public void test3() {
    Node head = buildNode(new Integer[][]{});
    assertTrue(head);
  }


}
