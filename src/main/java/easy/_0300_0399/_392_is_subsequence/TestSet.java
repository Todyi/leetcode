package easy._0300_0399._392_is_subsequence;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    String s = "abc";
    String t = "ahbgdc";
    Boolean result = true;
    boolean solution = new easy._0300_0399._392_is_subsequence.Solution().isSubsequence(s, t);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    String s = "axc";
    String t = "ahbgdc";
    Boolean result = false;
    boolean solution = new easy._0300_0399._392_is_subsequence.Solution().isSubsequence(s, t);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    String s = "ace";
    String t = "abcde";
    Boolean result = true;
    boolean solution = new easy._0300_0399._392_is_subsequence.Solution().isSubsequence(s, t);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test3() {
    String s = "aec";
    String t = "abcde";
    Boolean result = false;
    boolean solution = new easy._0300_0399._392_is_subsequence.Solution().isSubsequence(s, t);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test4() {
    String s = "abc";
    String t = "";
    Boolean result = false;
    boolean solution = new easy._0300_0399._392_is_subsequence.Solution().isSubsequence(s, t);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test5() {
    String s = "";
    String t = "";
    Boolean result = true;
    boolean solution = new easy._0300_0399._392_is_subsequence.Solution().isSubsequence(s, t);
    Assert.assertTrue(result.equals(solution));
  }

}
