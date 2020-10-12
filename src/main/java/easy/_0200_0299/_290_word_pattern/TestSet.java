package easy._0200_0299._290_word_pattern;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    String pattern = "abba";
    String str = "dog cat cat dog";
    Boolean result = true;
    boolean resolution = new easy._0200_0299._290_word_pattern.Solution().wordPattern(pattern,str);
    Assert.assertTrue(result.equals(resolution));
  }

  @Test
  public void test1() {
    String pattern = "abba";
    String str = "dog cat cat fish";
    Boolean result = false;
    boolean resolution = new easy._0200_0299._290_word_pattern.Solution().wordPattern(pattern,str);
    Assert.assertTrue(result.equals(resolution));
  }

  @Test
  public void test2() {
    String pattern = "aaaa";
    String str = "dog cat cat dog";
    Boolean result = false;
    boolean resolution = new easy._0200_0299._290_word_pattern.Solution().wordPattern(pattern,str);
    Assert.assertTrue(result.equals(resolution));
  }

  @Test
  public void test3() {
    String pattern = "abba";
    String str = "dog dog dog dog";
    Boolean result = false;
    boolean resolution = new easy._0200_0299._290_word_pattern.Solution().wordPattern(pattern,str);
    Assert.assertTrue(result.equals(resolution));
  }

  @Test
  public void test4() {
    String pattern = "aaa";
    String str = "aa aa aa aa";
    Boolean result = false;
    boolean resolution = new easy._0200_0299._290_word_pattern.Solution().wordPattern(pattern,str);
    Assert.assertTrue(result.equals(resolution));
  }
  @Test
  public void test5() {
    String pattern = "ccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccdd";
    String str = "s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s t t";
    Boolean result = true;
    boolean resolution = new easy._0200_0299._290_word_pattern.Solution().wordPattern(pattern,str);
    Assert.assertTrue(result.equals(resolution));
  }

}
