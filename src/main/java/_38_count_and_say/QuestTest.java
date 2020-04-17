package _38_count_and_say;

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
  public void test1() {
    Integer i = 1;
    String result = "1";
    Assert.assertEquals(result, CountAndSay.countAndSay(i));
  }
  @Test
  public void test2() {
    Integer i = 2;
    String result = "11";
    Assert.assertEquals(result, CountAndSay.countAndSay(i));
  }
  @Test
  public void test3() {
    Integer i = 3;
    String result = "21";
    Assert.assertEquals(result, CountAndSay.countAndSay(i));
  }

  @Test
  public void test4() {
    Integer i = 4;
    String result = "1211";
    Assert.assertEquals(result, CountAndSay.countAndSay(i));
  }
  @Test
  public void test5() {
    Integer i = 5;
    String result = "111221";
    Assert.assertEquals(result, CountAndSay.countAndSay(i));
  }
  @Test
  public void test6() {
    Integer i = 6;
    String result = "312211";
    Assert.assertEquals(result, CountAndSay.countAndSay(i));
  }

  @Test
  public void test7() {
    Integer i = 7;
    String result = "13112221";
    Assert.assertEquals(result, CountAndSay.countAndSay(i));
  }


}
