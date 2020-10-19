package medium._0000_0099._017_letter_combinations_of_a_phone_number;


import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  int[] map = {
      2, 2, 2,
      3, 3, 3,
      4, 4, 4,
      5, 5, 5,
      6, 6, 6,
      7, 7, 7, 7,
      8, 8, 8,
      9, 9, 9, 9
  };

  public String str2Digits(String s) {
    char[] arr = s.toCharArray();
    StringBuilder sb = new StringBuilder();
    for (char c : arr) {
      sb.append(map[c - 'a']);
    }
    return sb.toString();
  }

  @Test
  public void test0() {
    String digits = "23";
    Integer result = 9;
    List<String> solution = new medium._0000_0099._017_letter_combinations_of_a_phone_number.Solution()
        .letterCombinations(digits);
    Assert.assertTrue(result.equals(solution.size()));
    for (String s : solution) {
      Assert.assertTrue(digits.endsWith(str2Digits(s)));
    }
  }

  @Test
  public void test1() {
    String digits = "";
    Integer result = 0;
    List<String> solution = new medium._0000_0099._017_letter_combinations_of_a_phone_number.Solution()
        .letterCombinations(digits);
    Assert.assertTrue(result.equals(solution.size()));
    for (String s : solution) {
      Assert.assertTrue(digits.endsWith(str2Digits(s)));
    }
  }

  @Test
  public void test2() {
    String digits = "2";
    Integer result = 3;
    List<String> solution = new medium._0000_0099._017_letter_combinations_of_a_phone_number.Solution()
        .letterCombinations(digits);
    Assert.assertTrue(result.equals(solution.size()));
    for (String s : solution) {
      Assert.assertTrue(digits.endsWith(str2Digits(s)));
    }
  }

  @Test
  public void test3() {
    String digits = "234";
    Integer result = 27;
    List<String> solution = new medium._0000_0099._017_letter_combinations_of_a_phone_number.Solution()
        .letterCombinations(digits);
    Assert.assertTrue(result.equals(solution.size()));
    for (String s : solution) {
      Assert.assertTrue(digits.endsWith(str2Digits(s)));
    }
  }
}
