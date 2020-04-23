package easy._125_valid_palindrome;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    String input = "A man, a plan, a canal: Panama";
    Boolean result = true;
    boolean solution = new easy._125_valid_palindrome.Solution().isPalindrome(input);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    String input = "race a car";
    Boolean result = false;
    boolean solution = new easy._125_valid_palindrome.Solution().isPalindrome(input);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    String input = "0P";
    Boolean result = false;
    boolean solution = new easy._125_valid_palindrome.Solution().isPalindrome(input);
    Assert.assertTrue(result.equals(solution));
  }

}
