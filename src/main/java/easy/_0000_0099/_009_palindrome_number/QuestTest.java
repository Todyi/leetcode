package easy._0000_0099._009_palindrome_number;

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
    int x = 121;
    Boolean result = true;
    Assert.assertEquals(result, PalindromeNumber.anotherIsPalindrome(x));
  }

  @Test
  public void test2() {
    int x = -121;
    Boolean result = false;
    Assert.assertEquals(result, PalindromeNumber.anotherIsPalindrome(x));
  }

  @Test
  public void test3() {
    int x = 10;
    Boolean result = false;
    Assert.assertEquals(result, PalindromeNumber.anotherIsPalindrome(x));
  }
}
