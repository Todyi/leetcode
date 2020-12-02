package medium._0000_0099._071_simplify_path;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    String path = "/home/";
    String result = "/home";
    String solution = new medium._0000_0099._071_simplify_path.Solution()
        .simplifyPath(path);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    String path = "/../";
    String result = "/";
    String solution = new medium._0000_0099._071_simplify_path.Solution()
        .simplifyPath(path);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    String path = "/home//foo/";
    String result = "/home/foo";
    String solution = new medium._0000_0099._071_simplify_path.Solution()
        .simplifyPath(path);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test3() {
    String path = "/a/./b/../../c/";
    String result = "/c";
    String solution = new medium._0000_0099._071_simplify_path.Solution()
        .simplifyPath(path);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test4() {
    String path = "/...";
    String result = "/...";
    String solution = new medium._0000_0099._071_simplify_path.Solution()
        .simplifyPath(path);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test5() {
    String path = "/..hidden";
    String result = "/..hidden";
    String solution = new medium._0000_0099._071_simplify_path.Solution()
        .simplifyPath(path);
    Assert.assertTrue(result.equals(solution));
  }
}
