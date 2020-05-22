package easy._500_599._590_n_ary_tree_postorder_traversal;


import common.Comparators;
import common.Node;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    Node root = Node.buildNode(new Integer[]{1, null, 3, 2, 4, null, 5, 6});
    Integer[] result = {5, 6, 3, 2, 4, 1};
    List<Integer> solution = new easy._500_599._590_n_ary_tree_postorder_traversal.Solution()
        .postorder(root);
    Integer[] solutionArr = new Integer[solution.size()];
    solution.toArray(solutionArr);
    Assert.assertTrue(Comparators.isSame(result, solutionArr));
  }

  @Test
  public void test1() {
    Node root = Node.buildNode(
        new Integer[]{1, null, 2, 3, 4, 5, null, null, 6, 7, null, 8, null, 9, 10, null, null, 11,
            null, 12, null, 13, null, null, 14});
    Integer[] result = {2, 6, 14, 11, 7, 3, 12, 8, 4, 13, 9, 10, 5, 1};
    List<Integer> solution = new easy._500_599._590_n_ary_tree_postorder_traversal.Solution()
        .postorder(root);
    Integer[] solutionArr = new Integer[solution.size()];
    solution.toArray(solutionArr);
    Assert.assertTrue(Comparators.isSame(result, solutionArr));
  }


}
