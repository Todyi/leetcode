package easy._1500_1599._1592_rearrange_spaces_between_words;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    String text = "  this   is  a sentence ";
    String result = "this   is   a   sentence";
    String solution = new easy._1500_1599._1592_rearrange_spaces_between_words.Solution()
        .reorderSpaces(text);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    String text = " practice   makes   perfect";
    String result = "practice   makes   perfect ";
    String solution = new easy._1500_1599._1592_rearrange_spaces_between_words.Solution()
        .reorderSpaces(text);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    String text = "hello   world";
    String result = "hello   world";
    String solution = new easy._1500_1599._1592_rearrange_spaces_between_words.Solution()
        .reorderSpaces(text);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test3() {
    String text = "  walks  udp package   into  bar a";
    String result = "walks  udp  package  into  bar  a ";
    String solution = new easy._1500_1599._1592_rearrange_spaces_between_words.Solution()
        .reorderSpaces(text);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test4() {
    String text = "a";
    String result = "a";
    String solution = new easy._1500_1599._1592_rearrange_spaces_between_words.Solution()
        .reorderSpaces(text);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test5() {
    String text = "  hello";
    String result = "hello  ";
    String solution = new easy._1500_1599._1592_rearrange_spaces_between_words.Solution()
        .reorderSpaces(text);
    Assert.assertTrue(result.equals(solution));
  }

}
