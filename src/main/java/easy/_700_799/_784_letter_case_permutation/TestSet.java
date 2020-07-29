package easy._700_799._784_letter_case_permutation;


import common.Comparators;
import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  private void assertTure(String s, String[] result) {
    List<String> solution = new Solution()
        .letterCasePermutation(s);
    String[] soArr = new String[solution.size()];
    solution.toArray(soArr);
    Arrays.sort(result);
    Arrays.sort(soArr);
    Assert.assertTrue(Comparators.isSame(result, soArr));
  }

  @Test
  public void test0() {
    String S = "a1b2";
    String[] result = {"a1b2", "a1B2", "A1b2", "A1B2"};
    assertTure(S, result);
  }

  @Test
  public void test1() {
    String S = "3z4";
    String[] result = {"3z4", "3Z4"};
    assertTure(S, result);
  }

  @Test
  public void test2() {
    String S = "12345";
    String[] result = {"12345"};
    assertTure(S, result);
  }

  @Test
  public void test3() {
    String S = "abc";
    String[] result = {"abc", "abC", "aBc", "aBC", "Abc", "AbC", "ABc", "ABC"};
    assertTure(S, result);
  }

  @Test
  public void test4() {
    String S = "C";
    String[] result = {"c", "C"};
    assertTure(S, result);
  }

  @Test
  public void test5() {
    String S = "J";
    String[] result = {"j", "J"};
    assertTure(S, result);
  }

  @Test
  public void test6() {
    String S = "RmR";
    String[] result = {"rmr", "rmR", "rMr", "rMR", "Rmr", "RmR", "RMr", "RMR"};
    assertTure(S, result);
  }

}
