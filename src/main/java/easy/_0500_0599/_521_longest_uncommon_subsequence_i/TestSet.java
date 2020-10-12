package easy._0500_0599._521_longest_uncommon_subsequence_i;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    String a = "aba";
    String b = "cdc";
    Integer result = 3;
    int solution = new easy._0500_0599._521_longest_uncommon_subsequence_i.Solution()
        .findLUSlength(a,b);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    String a = "aaa";
    String b = "bbb";
    Integer result = 3;
    int solution = new easy._0500_0599._521_longest_uncommon_subsequence_i.Solution()
        .findLUSlength(a,b);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    String a = "aaa";
    String b = "aaa";
    Integer result = -1;
    int solution = new easy._0500_0599._521_longest_uncommon_subsequence_i.Solution()
        .findLUSlength(a,b);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test3() {
    String a = "aefawfawfawfaw";
    String b = "aefawfeawfwafwaef";
    Integer result = 17;
    int solution = new easy._0500_0599._521_longest_uncommon_subsequence_i.Solution()
        .findLUSlength(a,b);
    Assert.assertTrue(result.equals(solution));
  }

}
