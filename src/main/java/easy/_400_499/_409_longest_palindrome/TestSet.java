package easy._400_499._409_longest_palindrome;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    String s = "abccccdd";
    Integer result = 7;
    int solution = new easy._400_499._409_longest_palindrome.Solution().longestPalindrome(s);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    String s = "Aa";
    Integer result = 1;
    int solution = new easy._400_499._409_longest_palindrome.Solution().longestPalindrome(s);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    String s = "ccc";
    Integer result = 3;
    int solution = new easy._400_499._409_longest_palindrome.Solution().longestPalindrome(s);
    Assert.assertTrue(result.equals(solution));
  }

}
