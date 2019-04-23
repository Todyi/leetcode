package longest_common_prefix_14;

import org.junit.Assert;
import org.junit.Test;

/**
 * @program: leetcode
 * @description: main
 * @author: hdy
 * @create: 2019-04-23
 **/

public class QuestTest {

  @Test
  public void test0() {
    String[] x = {"flower","flow","flight"};
    String result = "fl";
    Assert.assertEquals(result, LongestCommonPrefix.anotherLongestCommonPrefix(x));
  }

  @Test
  public void test1() {
    String[] x = {"dog","racecar","car"};
    String result = "";
    Assert.assertEquals(result, LongestCommonPrefix.anotherLongestCommonPrefix(x));
  }
  @Test
  public void test2() {
    String[] x = {"oog","oracoecarg","ocoarg"};
    String result = "o";
    Assert.assertEquals(result, LongestCommonPrefix.anotherLongestCommonPrefix(x));
  }
  @Test
  public void test3() {
    String[] x = {};
    String result = "";
    Assert.assertEquals(result, LongestCommonPrefix.anotherLongestCommonPrefix(x));
  }
  @Test
  public void test4() {
    String[] x = {"a"};
    String result = "a";
    Assert.assertEquals(result, LongestCommonPrefix.anotherLongestCommonPrefix(x));
  }
  @Test
  public void test98() {
    String[] x = {"aa","aa"};
    String result = "aa";
    Assert.assertEquals(result, LongestCommonPrefix.anotherLongestCommonPrefix(x));
  }
  @Test
  public void test106() {
    String[] x = {"ca","a"};
    String result = "";
    Assert.assertEquals(result, LongestCommonPrefix.anotherLongestCommonPrefix(x));
  }
  @Test
  public void test109() {
    String[] x = {"c","acc","ccc"};
    String result = "";
    Assert.assertEquals(result, LongestCommonPrefix.anotherLongestCommonPrefix(x));
  }
  @Test
  public void test115() {
    String[] x = {"babb","caa"};
    String result = "";
    Assert.assertEquals(result, LongestCommonPrefix.anotherLongestCommonPrefix(x));
  }
  @Test
  public void test116() {
    String[] x = {"abca","aba","aaab"};
    String result = "a";
    Assert.assertEquals(result, LongestCommonPrefix.anotherLongestCommonPrefix(x));
  }

}
