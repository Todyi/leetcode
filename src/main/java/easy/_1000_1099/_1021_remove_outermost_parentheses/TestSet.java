package easy._1000_1099._1021_remove_outermost_parentheses;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    String S = "(()())(())";
    String result = "()()()";
    String solution = new easy._1000_1099._1021_remove_outermost_parentheses.Solution()
        .removeOuterParentheses(S);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    String S = "(()())(())(()(()))";
    String result = "()()()()(())";
    String solution = new easy._1000_1099._1021_remove_outermost_parentheses.Solution()
        .removeOuterParentheses(S);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    String S = "()()";
    String result = "";
    String solution = new easy._1000_1099._1021_remove_outermost_parentheses.Solution()
        .removeOuterParentheses(S);
    Assert.assertTrue(result.equals(solution));
  }

}
