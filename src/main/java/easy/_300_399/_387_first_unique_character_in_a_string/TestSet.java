package easy._300_399._387_first_unique_character_in_a_string;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    String s = "leetcode";
    Integer result = 0;
    int solution = new easy._300_399._387_first_unique_character_in_a_string.Solution()
        .firstUniqChar(s);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    String s = "loveleetcode";
    Integer result = 2;
    int solution = new easy._300_399._387_first_unique_character_in_a_string.Solution()
        .firstUniqChar(s);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    String s = "aabbccdd";
    Integer result = -1;
    int solution = new easy._300_399._387_first_unique_character_in_a_string.Solution()
        .firstUniqChar(s);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test3() {
    String s = "aadadaad";
    Integer result = -1;
    int solution = new easy._300_399._387_first_unique_character_in_a_string.Solution()
        .firstUniqChar(s);
    Assert.assertTrue(result.equals(solution));
  }

}
