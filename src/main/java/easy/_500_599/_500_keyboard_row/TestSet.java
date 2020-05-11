package easy._500_599._500_keyboard_row;


import com.alibaba.fastjson.JSON;
import common.Comparators;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    String[] words = {"Hello", "Alaska", "Dad", "Peace"};
    String[] result = {"Alaska", "Dad"};
    String[] solution = new easy._500_599._500_keyboard_row.Solution().findWords(words);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

}
