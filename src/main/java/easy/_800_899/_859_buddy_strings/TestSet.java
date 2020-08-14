package easy._800_899._859_buddy_strings;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    String A = "ab";
    String B = "ba";
    Boolean result = true;
    boolean solution = new easy._800_899._859_buddy_strings.Solution().buddyStrings(A, B);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    String A = "ab";
    String B = "ab";
    Boolean result = false;
    boolean solution = new easy._800_899._859_buddy_strings.Solution().buddyStrings(A, B);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    String A = "aa";
    String B = "aa";
    Boolean result = true;
    boolean solution = new easy._800_899._859_buddy_strings.Solution().buddyStrings(A, B);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test3() {
    String A = "aaaaaaabc";
    String B = "aaaaaaacb";
    Boolean result = true;
    boolean solution = new easy._800_899._859_buddy_strings.Solution().buddyStrings(A, B);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test4() {
    String A = "";
    String B = "aa";
    Boolean result = false;
    boolean solution = new easy._800_899._859_buddy_strings.Solution().buddyStrings(A, B);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test5() {
    String A = "abcaa";
    String B = "abcbb";
    Boolean result = false;
    boolean solution = new easy._800_899._859_buddy_strings.Solution().buddyStrings(A, B);
    Assert.assertTrue(result.equals(solution));
  }

}
