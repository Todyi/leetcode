package easy._0900_0999._942_di_string_match;


import common.Comparators;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    String S = "IDID";
    int[] result = {0, 4, 1, 3, 2};
    int[] solution = new easy._0900_0999._942_di_string_match.Solution()
        .diStringMatch(S);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

  @Test
  public void test1() {
    String S = "III";
    int[] result = {0, 1, 2, 3};
    int[] solution = new easy._0900_0999._942_di_string_match.Solution()
        .diStringMatch(S);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

  @Test
  public void test2() {
    String S = "DDI";
    int[] result = {3, 2, 0, 1};
    int[] solution = new easy._0900_0999._942_di_string_match.Solution()
        .diStringMatch(S);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

}
