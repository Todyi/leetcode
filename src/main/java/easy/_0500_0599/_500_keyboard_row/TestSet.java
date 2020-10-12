package easy._0500_0599._500_keyboard_row;


import common.Comparators;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    String[] words = {"Hello", "Alaska", "Dad", "Peace"};
    String[] result = {"Alaska", "Dad"};
    String[] solution = new easy._0500_0599._500_keyboard_row.Solution().findWords(words);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

}
