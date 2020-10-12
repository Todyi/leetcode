package easy._0500_0599._589_n_ary_tree_preorder_traversal;


import common.Comparators;
import common.Node;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    Node root = Node.buildNode(new Integer[]{1, null, 3, 2, 4, null, 5, 6});
    Integer[] result = {1, 3, 5, 6, 2, 4};
    List<Integer> solution = new easy._0500_0599._589_n_ary_tree_preorder_traversal.Solution()
        .preorder(root);
    Integer[] solutionArr = new Integer[solution.size()];
    solution.toArray(solutionArr);
    Assert.assertTrue(Comparators.isSame(result, solutionArr));
  }
  @Test
  public void test1() {
    Node root = Node.buildNode(new Integer[]{});
    Integer[] result = {};
    List<Integer> solution = new easy._0500_0599._589_n_ary_tree_preorder_traversal.Solution()
        .preorder(root);
    Integer[] solutionArr = new Integer[solution.size()];
    solution.toArray(solutionArr);
    Assert.assertTrue(Comparators.isSame(result, solutionArr));
  }


}
