package easy._0000_0099._028_Implement_str_str;

import org.junit.Assert;
import org.junit.Test;

/**
 * @program: leetcode
 * @description:
 * @author: hdy
 * @create: 2019-04-24
 **/

public class QuestTest {

  @Test
  public void test(){
    String haystack = "hello";
    String needle = "ll";
    int result = 2;
    Assert.assertEquals(result,ImplementStrStr.anotherSolution(haystack,needle));
  }

  @Test
  public void test1(){
    String haystack = "aaaaa";
    String needle = "bba";
    int result = -1;
    Assert.assertEquals(result,ImplementStrStr.anotherSolution(haystack,needle));
  }
  @Test
  public void test9(){
    String haystack = "aaa";
    String needle = "aaaa";
    int result = -1;
    Assert.assertEquals(result,ImplementStrStr.anotherSolution(haystack,needle));
  }
  @Test
  public void test59(){
    String haystack = "mississippi";
    String needle = "issip";
    int result = 4;
    Assert.assertEquals(result,ImplementStrStr.anotherSolution(haystack,needle));
  }
  @Test
  public void test67(){
    String haystack = "a";
    String needle = "a";
    int result = 0;
    Assert.assertEquals(result,ImplementStrStr.anotherSolution(haystack,needle));
  }

}
