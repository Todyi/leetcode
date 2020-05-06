package easy._400_499._405_convert_a_number_to_hexadecimal;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int num = 26;
    String result = "1a";
    String solution = new easy._400_499._405_convert_a_number_to_hexadecimal.Solution().toHex(num);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    int num = -1;
    String result = "ffffffff";
    String solution = new easy._400_499._405_convert_a_number_to_hexadecimal.Solution().toHex(num);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    int num = 0;
    String result = "0";
    String solution = new easy._400_499._405_convert_a_number_to_hexadecimal.Solution().toHex(num);
    Assert.assertTrue(result.equals(solution));
  }

}
