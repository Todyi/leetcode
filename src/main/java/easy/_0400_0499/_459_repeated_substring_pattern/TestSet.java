package easy._0400_0499._459_repeated_substring_pattern;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    String s = "abab";
    Boolean result = true;
    boolean solution = new easy._0400_0499._459_repeated_substring_pattern.Solution()
        .repeatedSubstringPattern(s);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    String s = "aba";
    Boolean result = false;
    boolean solution = new easy._0400_0499._459_repeated_substring_pattern.Solution()
        .repeatedSubstringPattern(s);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    String s = "abcabcabcabc";
    Boolean result = true;
    boolean solution = new easy._0400_0499._459_repeated_substring_pattern.Solution()
        .repeatedSubstringPattern(s);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test3() {
    String s = "aaa";
    Boolean result = true;
    boolean solution = new easy._0400_0499._459_repeated_substring_pattern.Solution()
        .repeatedSubstringPattern(s);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test4() {
    String s = "abac";
    Boolean result = false;
    boolean solution = new easy._0400_0499._459_repeated_substring_pattern.Solution()
        .repeatedSubstringPattern(s);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test5() {
    String s = "a";
    Boolean result = false;
    boolean solution = new easy._0400_0499._459_repeated_substring_pattern.Solution()
        .repeatedSubstringPattern(s);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test6() {
    String s = "abaabaa";
    Boolean result = false;
    boolean solution = new easy._0400_0499._459_repeated_substring_pattern.Solution()
        .repeatedSubstringPattern(s);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test7() {
    String s = "abaababaab";
    Boolean result = true;
    boolean solution = new easy._0400_0499._459_repeated_substring_pattern.Solution()
        .repeatedSubstringPattern(s);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test8() {
    String s = "abacababacab";
    Boolean result = true;
    boolean solution = new easy._0400_0499._459_repeated_substring_pattern.Solution()
        .repeatedSubstringPattern(s);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test9() {
    String s = "ababba";
    Boolean result = false;
    boolean solution = new easy._0400_0499._459_repeated_substring_pattern.Solution()
        .repeatedSubstringPattern(s);
    Assert.assertTrue(result.equals(solution));
  }


}
