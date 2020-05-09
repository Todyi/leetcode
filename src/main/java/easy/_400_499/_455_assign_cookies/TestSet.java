package easy._400_499._455_assign_cookies;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[] g = {1, 2, 3};
    int[] s = {1, 1};
    Integer result = 1;
    int solution = new easy._400_499._455_assign_cookies.Solution()
        .findContentChildren(g, s);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    int[] g = {1, 2};
    int[] s = {1, 2, 3};
    Integer result = 2;
    int solution = new easy._400_499._455_assign_cookies.Solution()
        .findContentChildren(g, s);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test3() {
    int[] g = {10, 9, 8, 7};
    int[] s = {5, 6, 7, 8};
    Integer result = 2;
    int solution = new easy._400_499._455_assign_cookies.Solution()
        .findContentChildren(g, s);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test4() {
    int[] g = {1,2,3};
    int[] s = {};
    Integer result = 0;
    int solution = new easy._400_499._455_assign_cookies.Solution()
        .findContentChildren(g, s);
    Assert.assertTrue(result.equals(solution));
  }

}
