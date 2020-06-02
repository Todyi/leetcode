package easy._600_699._680_valid_palindrome_ii;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    String s = "aba";
    Boolean result = true;
    boolean solution = new easy._600_699._680_valid_palindrome_ii.Solution()
        .validPalindrome(s);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    String s = "abca";
    Boolean result = true;
    boolean solution = new easy._600_699._680_valid_palindrome_ii.Solution()
        .validPalindrome(s);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    String s = "aebca";
    Boolean result = false;
    boolean solution = new easy._600_699._680_valid_palindrome_ii.Solution()
        .validPalindrome(s);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test3() {
    String s = "aecbca";
    Boolean result = true;
    boolean solution = new easy._600_699._680_valid_palindrome_ii.Solution()
        .validPalindrome(s);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test4() {
    String s = "ebcbbececabbacecbbcbe";
    Boolean result = true;
    boolean solution = new easy._600_699._680_valid_palindrome_ii.Solution()
        .validPalindrome(s);
    Assert.assertTrue(result.equals(solution));
  }

}
