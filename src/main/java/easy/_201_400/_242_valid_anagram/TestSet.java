package easy._201_400._242_valid_anagram;


import common.Comparators;
import common.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    String s = "anagram";
    String t = "nagaram";
    Boolean result = true;
    boolean solution = new easy._201_400._242_valid_anagram.Solution().isAnagram(s, t);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    String s = "rat";
    String t = "cat";
    Boolean result = false;
    boolean solution = new easy._201_400._242_valid_anagram.Solution().isAnagram(s, t);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    String s = "a";
    String t = "ab";
    Boolean result = false;
    boolean solution = new easy._201_400._242_valid_anagram.Solution().isAnagram(s, t);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test3() {
    String s = "xaaddy";
    String t = "xbbccy";
    Boolean result = false;
    boolean solution = new easy._201_400._242_valid_anagram.Solution().isAnagram(s, t);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test4() {
    String s = "axadyd";
    String t = "xbbccy";
    Boolean result = false;
    boolean solution = new easy._201_400._242_valid_anagram.Solution().isAnagram(s, t);
    Assert.assertTrue(result.equals(solution));
  }

}
