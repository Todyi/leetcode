package medium._0100_0199._139_word_break;


import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  public List<String> buildList(String[] arr) {
    List<String> list = new ArrayList<>();
    for (String s : arr) {
      list.add(s);
    }
    return list;
  }

  @Test
  public void test0() {
    String s = "leetcode";
    List<String> wordDict = buildList(new String[]{"leet", "code"});
    Boolean result = true;
    boolean solution = new medium._0100_0199._139_word_break.Solution()
        .wordBreak(s, wordDict);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    String s = "applepenapple";
    List<String> wordDict = buildList(new String[]{"apple", "pen"});
    Boolean result = true;
    boolean solution = new medium._0100_0199._139_word_break.Solution()
        .wordBreak(s, wordDict);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    String s = "catsandog";
    List<String> wordDict = buildList(new String[]{"cats", "dog", "sand", "and", "cat"});
    Boolean result = false;
    boolean solution = new medium._0100_0199._139_word_break.Solution()
        .wordBreak(s, wordDict);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test3() {
    String s = "a";
    List<String> wordDict = buildList(new String[]{});
    Boolean result = false;
    boolean solution = new medium._0100_0199._139_word_break.Solution()
        .wordBreak(s, wordDict);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test4() {
    String s = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab";
    List<String> wordDict = buildList(
        new String[]{"a", "aa", "aaa", "aaaa", "aaaaa", "aaaaaa", "aaaaaaa", "aaaaaaaa",
            "aaaaaaaaa", "aaaaaaaaaa"});
    Boolean result = false;
    boolean solution = new medium._0100_0199._139_word_break.Solution()
        .wordBreak(s, wordDict);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test5() {
    String s = "baaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
    List<String> wordDict = buildList(
        new String[]{"a", "aa", "aaa", "aaaa", "aaaaa", "aaaaaa", "aaaaaaa", "aaaaaaaa",
            "aaaaaaaaa", "aaaaaaaaaa"});
    Boolean result = false;
    boolean solution = new medium._0100_0199._139_word_break.Solution()
        .wordBreak(s, wordDict);
    Assert.assertTrue(result.equals(solution));
  }


}
