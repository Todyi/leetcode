package easy._0600_0699._696_count_binary_substrings;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    String s = "00110011";
    Integer result = 6;
    int solution = new easy._0600_0699._696_count_binary_substrings.Solution()
        .countBinarySubstrings(s);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    String s = "10101";
    Integer result = 4;
    int solution = new easy._0600_0699._696_count_binary_substrings.Solution()
        .countBinarySubstrings(s);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    String s = "0001110011";
    Integer result = 7;
    int solution = new easy._0600_0699._696_count_binary_substrings.Solution()
        .countBinarySubstrings(s);
    Assert.assertTrue(result.equals(solution));
  }

}
