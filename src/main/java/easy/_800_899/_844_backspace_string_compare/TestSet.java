package easy._800_899._844_backspace_string_compare;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    String S = "ab#c";
    String T = "ad#c";
    Boolean result = true;
    boolean solution = new easy._800_899._844_backspace_string_compare.Solution()
        .backspaceCompare(S, T);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    String S = "ab##";
    String T = "c#d#";
    Boolean result = true;
    boolean solution = new easy._800_899._844_backspace_string_compare.Solution()
        .backspaceCompare(S, T);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    String S = "a##c";
    String T = "#a#c";
    Boolean result = true;
    boolean solution = new easy._800_899._844_backspace_string_compare.Solution()
        .backspaceCompare(S, T);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test3() {
    String S = "a#c";
    String T = "b";
    Boolean result = false;
    boolean solution = new easy._800_899._844_backspace_string_compare.Solution()
        .backspaceCompare(S, T);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test4() {
    String S = "y#fo##f";
    String T = "y#f#o##f";
    Boolean result = true;
    boolean solution = new easy._800_899._844_backspace_string_compare.Solution()
        .backspaceCompare(S, T);
    Assert.assertTrue(result.equals(solution));
  }

}
