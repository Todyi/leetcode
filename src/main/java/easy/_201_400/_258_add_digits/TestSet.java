package easy._201_400._258_add_digits;


import common.Comparators;
import common.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int input = 38;
    Integer result = 2;
    int resolution = new easy._201_400._258_add_digits.Solution().addDigits(input);
    Assert.assertTrue(result.equals(resolution));
  }

}
