package medium._0100_0199._150_evaluate_reverse_polish_notation;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    String[] tokens = {"2", "1", "+", "3", "*"};
    Integer result = 9;
    int solution = new medium._0100_0199._150_evaluate_reverse_polish_notation.Solution()
        .evalRPN(tokens);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    String[] tokens = {"4", "13", "5", "/", "+"};
    Integer result = 6;
    int solution = new medium._0100_0199._150_evaluate_reverse_polish_notation.Solution()
        .evalRPN(tokens);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    String[] tokens = {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
    Integer result = 22;
    int solution = new medium._0100_0199._150_evaluate_reverse_polish_notation.Solution()
        .evalRPN(tokens);
    Assert.assertTrue(result.equals(solution));
  }


}
