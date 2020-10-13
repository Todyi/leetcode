package medium._0000_0099._003_longest_substring_without_repeating_characters;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    String s = "abcabcbb";
    Integer result = 3;
    int solution = new medium._0000_0099._003_longest_substring_without_repeating_characters.Solution()
        .lengthOfLongestSubstring(s);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    String s = "bbbbb";
    Integer result = 1;
    int solution = new medium._0000_0099._003_longest_substring_without_repeating_characters.Solution()
        .lengthOfLongestSubstring(s);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    String s = "pwwkew";
    Integer result = 3;
    int solution = new medium._0000_0099._003_longest_substring_without_repeating_characters.Solution()
        .lengthOfLongestSubstring(s);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test3() {
    String s = "";
    Integer result = 0;
    int solution = new medium._0000_0099._003_longest_substring_without_repeating_characters.Solution()
        .lengthOfLongestSubstring(s);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test4() {
    String s = "   ";
    Integer result = 1;
    int solution = new medium._0000_0099._003_longest_substring_without_repeating_characters.Solution()
        .lengthOfLongestSubstring(s);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test5() {
    String s = "aab";
    Integer result = 2;
    int solution = new medium._0000_0099._003_longest_substring_without_repeating_characters.Solution()
        .lengthOfLongestSubstring(s);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test6() {
    String s = "dvdf";
    Integer result = 3;
    int solution = new medium._0000_0099._003_longest_substring_without_repeating_characters.Solution()
        .lengthOfLongestSubstring(s);
    Assert.assertTrue(result.equals(solution));
  }
}
