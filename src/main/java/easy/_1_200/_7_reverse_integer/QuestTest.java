package easy._1_200._7_reverse_integer;

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
    long x = 123;
    int result = 321;
    Assert.assertEquals(result, ReverseInteger.anotherReverse(x));
  }

  @Test
  public void test1() {
    long x = -123;
    int result = -321;
    Assert.assertEquals(result, ReverseInteger.anotherReverse(x));
  }

  @Test
  public void test2() {
    long x = 120;
    int result = 21;
    Assert.assertEquals(result, ReverseInteger.anotherReverse(x));
  }
  @Test
  public void test12() {
    long x = 9646324351L;
    int result = 1534236469;
    Assert.assertEquals(result, ReverseInteger.anotherReverse(x));
  }
}
