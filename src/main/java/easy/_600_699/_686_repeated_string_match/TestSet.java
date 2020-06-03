package easy._600_699._686_repeated_string_match;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    String A = "abcd";
    String B = "cdabcdab";
    Integer result = 3;
    int solution = new easy._600_699._686_repeated_string_match.Solution()
        .repeatedStringMatch(A, B);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    String A = "abc";
    String B = "cabcabca";
    Integer result = 4;
    int solution = new easy._600_699._686_repeated_string_match.Solution()
        .repeatedStringMatch(A, B);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    String A = "a";
    String B = "aa";
    Integer result = 2;
    int solution = new easy._600_699._686_repeated_string_match.Solution()
        .repeatedStringMatch(A, B);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test3() {
    String A = "aa";
    String B = "a";
    Integer result = 1;
    int solution = new easy._600_699._686_repeated_string_match.Solution()
        .repeatedStringMatch(A, B);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test4() {
    String A = "aaaaaaaaaaaaaaaaaaaaaab";
    String B = "ba";
    Integer result = 2;
    int solution = new easy._600_699._686_repeated_string_match.Solution()
        .repeatedStringMatch(A, B);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test5() {
    String A = "bb";
    String B = "bbbbbbb";
    Integer result = 4;
    int solution = new easy._600_699._686_repeated_string_match.Solution()
        .repeatedStringMatch(A, B);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test6() {
    String A = "abcd";
    String B = "abcdb";
    Integer result = -1;
    int solution = new easy._600_699._686_repeated_string_match.Solution()
        .repeatedStringMatch(A, B);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test7() {
    String A = "abcd";
    String B = "bcdab";
    Integer result = 2;
    int solution = new easy._600_699._686_repeated_string_match.Solution()
        .repeatedStringMatch(A, B);
    Assert.assertTrue(result.equals(solution));
  }

}
