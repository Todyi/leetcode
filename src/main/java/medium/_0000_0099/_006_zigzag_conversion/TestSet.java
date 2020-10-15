package medium._0000_0099._006_zigzag_conversion;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    String s = "PAYPALISHIRING";
    int numRows = 3;
    String result = "PAHNAPLSIIGYIR";
    String solution = new medium._0000_0099._006_zigzag_conversion.Solution()
        .convert(s, numRows);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    String s = "PAYPALISHIRING";
    int numRows = 4;
    String result = "PINALSIGYAHRPI";
    String solution = new medium._0000_0099._006_zigzag_conversion.Solution()
        .convert(s, numRows);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    String s = "A";
    int numRows = 1;
    String result = "A";
    String solution = new medium._0000_0099._006_zigzag_conversion.Solution()
        .convert(s, numRows);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test3() {
    String s = "ABC";
    int numRows = 2;
    String result = "ACB";
    String solution = new medium._0000_0099._006_zigzag_conversion.Solution()
        .convert(s, numRows);
    Assert.assertTrue(result.equals(solution));
  }
}
