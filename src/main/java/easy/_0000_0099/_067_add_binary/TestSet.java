package easy._0000_0099._067_add_binary;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test() {
    String a = "11";
    String b = "1";
    String result = "100";
    Assert.assertEquals(result, new Solution().addBinary(a,b));
  }

  @Test
  public void test1() {
    String a = "1010";
    String b = "1011";
    String result = "10101";
    Assert.assertEquals(result, new Solution().addBinary(a,b));
  }

  @Test
  public void test2() {
    String a = "10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101";
    String b = "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011";
    String result = "110111101100010011000101110110100000011101000101011001000011011000001100011110011010010011000000000";
    Assert.assertEquals(result, new Solution().addBinary(a,b));
  }
  @Test
  public void test28() {
    String a = "11";
    String b = "1";
    String result = "100";
    Assert.assertEquals(result, new Solution().addBinary(a,b));
  }
}
