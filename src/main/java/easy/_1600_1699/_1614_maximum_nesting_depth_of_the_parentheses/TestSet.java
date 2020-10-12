package easy._1600_1699._1614_maximum_nesting_depth_of_the_parentheses;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    String s = "(1+(2*3)+((8)/4))+1";
    Integer result = 3;
    int solution = new easy._1600_1699._1614_maximum_nesting_depth_of_the_parentheses.Solution()
        .maxDepth(s);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    String s = "(1)+((2))+(((3)))";
    Integer result = 3;
    int solution = new easy._1600_1699._1614_maximum_nesting_depth_of_the_parentheses.Solution()
        .maxDepth(s);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    String s = "1+(2*3)/(2-1)";
    Integer result = 1;
    int solution = new easy._1600_1699._1614_maximum_nesting_depth_of_the_parentheses.Solution()
        .maxDepth(s);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test3() {
    String s = "1";
    Integer result = 0;
    int solution = new easy._1600_1699._1614_maximum_nesting_depth_of_the_parentheses.Solution()
        .maxDepth(s);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test4() {
    String s = "8*((1*(5+6))*(8/6))";
    Integer result = 3;
    int solution = new easy._1600_1699._1614_maximum_nesting_depth_of_the_parentheses.Solution()
        .maxDepth(s);
    Assert.assertTrue(result.equals(solution));
  }

}
