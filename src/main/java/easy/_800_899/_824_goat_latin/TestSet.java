package easy._800_899._824_goat_latin;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    String S = "I speak Goat Latin";
    String result = "Imaa peaksmaaa oatGmaaaa atinLmaaaaa";
    String solution = new easy._800_899._824_goat_latin.Solution()
        .toGoatLatin(S);
    Assert.assertTrue(result.equals(solution));
  }

}
