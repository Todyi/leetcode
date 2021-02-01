package medium._0100_0199._173_binary_search_tree_iterator;


import common.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    BSTIterator bSTIterator = new BSTIterator(
        TreeNode.buildTree(new Integer[]{7, 3, 15, null, null, 9, 20}));
    Assert.assertTrue(bSTIterator.next() == 3);// return 3
    Assert.assertTrue(bSTIterator.next() == 7);// return 7
    Assert.assertTrue(bSTIterator.hasNext()); // return True
    Assert.assertTrue(bSTIterator.next() == 9);// return 9
    Assert.assertTrue(bSTIterator.hasNext()); // return True
    Assert.assertTrue(bSTIterator.next() == 15);// return 15
    Assert.assertTrue(bSTIterator.hasNext()); // return True
    Assert.assertTrue(bSTIterator.next() == 20);// return 20
    Assert.assertTrue(!bSTIterator.hasNext()); // return False
  }


}
