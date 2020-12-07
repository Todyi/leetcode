package medium._0000_0099._077_combinations;


import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  private void assertTrue(int n, int k, Integer result) {
    List<List<Integer>> solution = new Solution()
        .combine(n, k);
    Assert.assertTrue(result.equals(solution.size()));
    for (List<Integer> combination : solution) {
      Assert.assertTrue(k == combination.size());
    }
  }

  @Test
  public void test0() {
    int n = 4;
    int k = 2;
    Integer result = 6;
    assertTrue(n, k, result);
  }

  @Test
  public void test1() {
    int n = 1;
    int k = 1;
    Integer result = 1;
    assertTrue(n, k, result);
  }

  @Test
  public void test2() {
    int n = 3;
    int k = 3;
    Integer result = 1;
    assertTrue(n, k, result);
  }

}
