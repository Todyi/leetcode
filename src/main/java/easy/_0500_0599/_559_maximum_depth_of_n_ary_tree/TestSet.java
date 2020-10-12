package easy._0500_0599._559_maximum_depth_of_n_ary_tree;


import common.Node;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    Node s = Node.buildNode(new Integer[]{1, null, 3, 2, 4, null, 5, 6});
    Integer result = 3;
    int solution = new easy._0500_0599._559_maximum_depth_of_n_ary_tree.Solution()
        .maxDepth(s);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    Node s = Node.buildNode(
        new Integer[]{1, null, 2, 3, 4, 5, null, null, 6, 7, null, 8, null, 9, 10, null, null, 11,
            null, 12, null, 13, null, null, 14});
    Integer result = 5;
    int solution = new easy._0500_0599._559_maximum_depth_of_n_ary_tree.Solution()
        .maxDepth(s);
    Assert.assertTrue(result.equals(solution));
  }

}
