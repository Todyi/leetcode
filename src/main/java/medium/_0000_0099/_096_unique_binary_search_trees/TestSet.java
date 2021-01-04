package medium._0000_0099._096_unique_binary_search_trees;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int n = 1;
    Integer result = 1;
    int solution = new medium._0000_0099._096_unique_binary_search_trees.Solution()
        .numTrees(n);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    int n = 2;
    Integer result = 2;
    int solution = new medium._0000_0099._096_unique_binary_search_trees.Solution()
        .numTrees(n);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    int n = 3;
    Integer result = 5;
    int solution = new medium._0000_0099._096_unique_binary_search_trees.Solution()
        .numTrees(n);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test3() {
    int n = 19;
    Integer result = 1767263190;
    int solution = new medium._0000_0099._096_unique_binary_search_trees.Solution()
        .numTrees(n);
    Assert.assertTrue(result.equals(solution));
  }


}
