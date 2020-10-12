package easy._0900_0999._917_reverse_only_letters;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    String S = "ab-cd";
    String result = "dc-ba";
    String solution = new easy._0900_0999._917_reverse_only_letters.Solution()
        .reverseOnlyLetters(S);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    String S = "a-bC-dEf-ghIj";
    String result = "j-Ih-gfE-dCba";
    String solution = new easy._0900_0999._917_reverse_only_letters.Solution()
        .reverseOnlyLetters(S);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    String S = "Test1ng-Leet=code-Q!";
    String result = "Qedo1ct-eeLg=ntse-T!";
    String solution = new easy._0900_0999._917_reverse_only_letters.Solution()
        .reverseOnlyLetters(S);
    Assert.assertTrue(result.equals(solution));
  }

}
