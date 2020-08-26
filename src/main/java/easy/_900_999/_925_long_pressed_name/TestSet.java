package easy._900_999._925_long_pressed_name;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    String name = "alex";
    String typed = "aaleex";
    Boolean result = true;
    boolean solution = new easy._900_999._925_long_pressed_name.Solution()
        .isLongPressedName(name, typed);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    String name = "saeed";
    String typed = "ssaaedd";
    Boolean result = false;
    boolean solution = new easy._900_999._925_long_pressed_name.Solution()
        .isLongPressedName(name, typed);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    String name = "leelee";
    String typed = "lleeelee";
    Boolean result = true;
    boolean solution = new easy._900_999._925_long_pressed_name.Solution()
        .isLongPressedName(name, typed);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test3() {
    String name = "laiden";
    String typed = "laiden";
    Boolean result = true;
    boolean solution = new easy._900_999._925_long_pressed_name.Solution()
        .isLongPressedName(name, typed);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test4() {
    String name = "alex";
    String typed = "aaleelx";
    Boolean result = false;
    boolean solution = new easy._900_999._925_long_pressed_name.Solution()
        .isLongPressedName(name, typed);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test5() {
    String name = "alex";
    String typed = "alexxr";
    Boolean result = false;
    boolean solution = new easy._900_999._925_long_pressed_name.Solution()
        .isLongPressedName(name, typed);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test6() {
    String name = "pyplrz";
    String typed = "ppyypllr";
    Boolean result = false;
    boolean solution = new easy._900_999._925_long_pressed_name.Solution()
        .isLongPressedName(name, typed);
    Assert.assertTrue(result.equals(solution));
  }

}
