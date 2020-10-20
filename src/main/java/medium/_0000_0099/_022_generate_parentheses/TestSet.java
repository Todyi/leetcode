package medium._0000_0099._022_generate_parentheses;


import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  public int isParentheses(char[] s) {
    int idx = -1, lBracketNum = 0, n = 0;
    while (++idx < s.length) {
      if (s[idx] == '(') {
        lBracketNum++;
        n++;
      } else if (s[idx] == ')') {
        Assert.assertTrue(-1 < --lBracketNum);
      }
    }
    return n;
  }

  @Test
  public void test0() {
    int n = 1;
    Integer result = 1;
    List<String> solution = new medium._0000_0099._022_generate_parentheses.Solution()
        .generateParenthesis(n);
    Assert.assertTrue(result.equals(solution.size()));
    for (String s : solution) {
      Assert.assertTrue(n == isParentheses(s.toCharArray()));
    }
  }

  @Test
  public void test1() {
    int n = 3;
    Integer result = 5;
    List<String> solution = new medium._0000_0099._022_generate_parentheses.Solution()
        .generateParenthesis(n);
    Assert.assertTrue(result.equals(solution.size()));
    for (String s : solution) {
      Assert.assertTrue(n == isParentheses(s.toCharArray()));
    }
  }
}
