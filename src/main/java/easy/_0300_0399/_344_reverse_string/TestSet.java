package easy._0300_0399._344_reverse_string;


import common.Comparators;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    char[] input = {'h','e','l','l','o'};
    char[] result = {'o','l','l','e','h'};
    new easy._0300_0399._344_reverse_string.Solution().reverseString(input);
    Assert.assertTrue(Comparators.isSame(result,input));
  }
  
  @Test
  public void test1() {
    char[] input = {'H','a','n','n','a','h'};
    char[] result = {'h','a','n','n','a','H'};
    new easy._0300_0399._344_reverse_string.Solution().reverseString(input);
    Assert.assertTrue(Comparators.isSame(result,input));
  }

}
