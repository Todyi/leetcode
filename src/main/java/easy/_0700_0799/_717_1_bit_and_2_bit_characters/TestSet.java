package easy._0700_0799._717_1_bit_and_2_bit_characters;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[] bits = {1, 0, 0};
    Boolean result = true;
    boolean solution = new easy._0700_0799._717_1_bit_and_2_bit_characters.Solution()
        .isOneBitCharacter(bits);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    int[] bits = {1, 1, 1, 0};
    Boolean result = false;
    boolean solution = new easy._0700_0799._717_1_bit_and_2_bit_characters.Solution()
        .isOneBitCharacter(bits);
    Assert.assertTrue(result.equals(solution));
  }

}
