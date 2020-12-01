package medium._0000_0099._062_unique_paths;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int m = 3;
    int n = 7;
    Integer result = 28;
    int solution = new medium._0000_0099._062_unique_paths.Solution()
        .uniquePaths(m, n);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    int m = 3;
    int n = 2;
    Integer result = 3;
    int solution = new medium._0000_0099._062_unique_paths.Solution()
        .uniquePaths(m, n);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    int m = 7;
    int n = 3;
    Integer result = 28;
    int solution = new medium._0000_0099._062_unique_paths.Solution()
        .uniquePaths(m, n);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test3() {
    int m = 3;
    int n = 3;
    Integer result = 6;
    int solution = new medium._0000_0099._062_unique_paths.Solution()
        .uniquePaths(m, n);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test4() {
    int m = 51;
    int n = 9;
    Integer result = 1916797311;
    int solution = new medium._0000_0099._062_unique_paths.Solution()
        .uniquePaths(m, n);
    Assert.assertTrue(result.equals(solution));
  }
}
