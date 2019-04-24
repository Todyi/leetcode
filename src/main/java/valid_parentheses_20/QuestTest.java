package valid_parentheses_20;

import org.junit.Assert;
import org.junit.Test;

/**
 * @program: leetcode
 * @description:
 * @author: hdy
 * @create: 2019-04-23
 **/

public class QuestTest {

  @Test
  public void test1() {
    String s = "()";
    Boolean result = true;
    Assert.assertEquals(result, ValidParentheses.anotherIsValid(s));
  }

  @Test
  public void test2() {
    String s = "()[]{}";
    Boolean result = true;
    Assert.assertEquals(result, ValidParentheses.anotherIsValid(s));
  }

  @Test
  public void test3() {
    String s = "(]";
    Boolean result = false;
    Assert.assertEquals(result, ValidParentheses.anotherIsValid(s));
  }

  @Test
  public void test4() {
    String s = "([)]";
    Boolean result = false;
    Assert.assertEquals(result, ValidParentheses.anotherIsValid(s));
  }

  @Test
  public void test5() {
    String s = "{[]}";
    Boolean result = true;
    Assert.assertEquals(result, ValidParentheses.anotherIsValid(s));
  }
  @Test
  public void test7() {
    String s = "\"){\"";
    Boolean result = false;
    Assert.assertEquals(result, ValidParentheses.anotherIsValid(s));
  }
  @Test
  public void test71() {
    String s = "\"\"";
    Boolean result = true;
    Assert.assertEquals(result, ValidParentheses.anotherIsValid(s));
  }
}
