package easy._0600_0699._693_binary_number_with_alternating_bits;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int n = 5;
    Boolean result = true;
    boolean solution = new easy._0600_0699._693_binary_number_with_alternating_bits.Solution()
        .hasAlternatingBits(n);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    int n = 7;
    Boolean result = false;
    boolean solution = new easy._0600_0699._693_binary_number_with_alternating_bits.Solution()
        .hasAlternatingBits(n);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    int n = 11;
    Boolean result = false;
    boolean solution = new easy._0600_0699._693_binary_number_with_alternating_bits.Solution()
        .hasAlternatingBits(n);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test3() {
    int n = 10;
    Boolean result = true;
    boolean solution = new easy._0600_0699._693_binary_number_with_alternating_bits.Solution()
        .hasAlternatingBits(n);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test4() {
    int n = 4;
    Boolean result = false;
    boolean solution = new easy._0600_0699._693_binary_number_with_alternating_bits.Solution()
        .hasAlternatingBits(n);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test5() {
    int n = 17;
    Boolean result = false;
    boolean solution = new easy._0600_0699._693_binary_number_with_alternating_bits.Solution()
        .hasAlternatingBits(n);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test6() {
    int n = 715827882;
    Boolean result = true;
    boolean solution = new easy._0600_0699._693_binary_number_with_alternating_bits.Solution()
        .hasAlternatingBits(n);
    Assert.assertTrue(result.equals(solution));
  }

}
