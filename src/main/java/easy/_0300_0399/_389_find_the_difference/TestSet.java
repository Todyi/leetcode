package easy._0300_0399._389_find_the_difference;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    String s = "abcd";
    String t = "abcde";
    Character result = 'e';
    char solution = new easy._0300_0399._389_find_the_difference.Solution()
        .findTheDifference(s,t);
    Assert.assertTrue(result.equals(solution));
  }

}
