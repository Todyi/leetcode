package easy._1_200._13_roman_to_integer;

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
  public void test1() {
    String s = "III";
    int result = 3;
    Assert.assertEquals(result, RomanToInt.anotherRomanToInt(s));
  }

  @Test
  public void test2() {
    String s = "IV";
    int result = 4;
    Assert.assertEquals(result, RomanToInt.anotherRomanToInt(s));
  }

  @Test
  public void test3() {
    String s = "IX";
    int result = 9;
    Assert.assertEquals(result, RomanToInt.anotherRomanToInt(s));
  }

  @Test
  public void test4() {
    String s = "LVIII";
    int result = 58;
    Assert.assertEquals(result, RomanToInt.anotherRomanToInt(s));
  }

  @Test
  public void test5() {
    String s = "MCMXCIV";
    int result = 1994;
    Assert.assertEquals(result, RomanToInt.anotherRomanToInt(s));
  }


}
