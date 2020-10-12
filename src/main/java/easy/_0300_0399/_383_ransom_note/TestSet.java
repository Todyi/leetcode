package easy._0300_0399._383_ransom_note;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    String ransomNote = "a";
    String magazine = "b";
    Boolean result = false;
    boolean solution = new easy._0300_0399._383_ransom_note.Solution()
        .canConstruct(ransomNote, magazine);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    String ransomNote = "aa";
    String magazine = "ab";
    Boolean result = false;
    boolean solution = new easy._0300_0399._383_ransom_note.Solution()
        .canConstruct(ransomNote, magazine);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    String ransomNote = "aa";
    String magazine = "aab";
    Boolean result = true;
    boolean solution = new easy._0300_0399._383_ransom_note.Solution()
        .canConstruct(ransomNote, magazine);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test3() {
    String ransomNote = "fihjjjjei";
    String magazine = "hjibagacbhadfaefdjaeaebgi";
    Boolean result = false;
    boolean solution = new easy._0300_0399._383_ransom_note.Solution()
        .canConstruct(ransomNote, magazine);
    Assert.assertTrue(result.equals(solution));
  }
}
