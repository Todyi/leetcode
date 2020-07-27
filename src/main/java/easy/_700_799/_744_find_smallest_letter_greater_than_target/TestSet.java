package easy._700_799._744_find_smallest_letter_greater_than_target;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    char[] letters = {'c', 'f', 'j'};
    char target = 'a';
    Character result = 'c';
    char solution = new easy._700_799._744_find_smallest_letter_greater_than_target.Solution()
        .nextGreatestLetter(letters, target);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    char[] letters = {'c', 'f', 'j'};
    char target = 'c';
    Character result = 'f';
    char solution = new easy._700_799._744_find_smallest_letter_greater_than_target.Solution()
        .nextGreatestLetter(letters, target);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    char[] letters = {'c', 'f', 'j'};
    char target = 'd';
    Character result = 'f';
    char solution = new easy._700_799._744_find_smallest_letter_greater_than_target.Solution()
        .nextGreatestLetter(letters, target);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test3() {
    char[] letters = {'c', 'f', 'j'};
    char target = 'g';
    Character result = 'j';
    char solution = new easy._700_799._744_find_smallest_letter_greater_than_target.Solution()
        .nextGreatestLetter(letters, target);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test4() {
    char[] letters = {'c', 'f', 'j'};
    char target = 'j';
    Character result = 'c';
    char solution = new easy._700_799._744_find_smallest_letter_greater_than_target.Solution()
        .nextGreatestLetter(letters, target);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test5() {
    char[] letters = {'c', 'f', 'j'};
    char target = 'k';
    Character result = 'c';
    char solution = new easy._700_799._744_find_smallest_letter_greater_than_target.Solution()
        .nextGreatestLetter(letters, target);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test6() {
    char[] letters = {'e', 'e', 'e', 'e', 'e', 'e', 'n', 'n', 'n', 'n'};
    char target = 'e';
    Character result = 'n';
    char solution = new easy._700_799._744_find_smallest_letter_greater_than_target.Solution()
        .nextGreatestLetter(letters, target);
    Assert.assertTrue(result.equals(solution));
  }

}
