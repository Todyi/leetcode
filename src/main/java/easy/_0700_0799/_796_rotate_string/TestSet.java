package easy._0700_0799._796_rotate_string;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    String A = "abcde";
    String B = "cdeab";
    Boolean result = true;
    boolean solution = new easy._0700_0799._796_rotate_string.Solution()
        .rotateString(A, B);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    String A = "abcde";
    String B = "abced";
    Boolean result = false;
    boolean solution = new easy._0700_0799._796_rotate_string.Solution()
        .rotateString(A, B);
    Assert.assertTrue(result.equals(solution));
  }

}
