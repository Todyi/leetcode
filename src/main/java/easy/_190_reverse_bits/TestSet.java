package easy._190_reverse_bits;


import common.Comparators;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int input = 43261596;
    Integer result = 964176192;
    int resolution = new easy._190_reverse_bits.Solution().reverseBits(input);
    Assert.assertTrue(result.equals(resolution));
  }

//  @Test
//  public void test1() {
//    int input = 4294967293;
//    Integer result = 3221225471;
//    int resolution = new easy._190_reverse_bits.Solution().reverseBits(input);
//    Assert.assertTrue(result.equals(resolution));
//  }

}
