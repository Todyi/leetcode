package easy._400_499._492_construct_the_rectangle;


import common.Comparators;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int area = 4;
    int[] result = {2, 2};
    int[] solution = new easy._400_499._492_construct_the_rectangle.Solution()
        .constructRectangle(area);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

  @Test
  public void test1() {
    int area = 16;
    int[] result = {4, 4};
    int[] solution = new easy._400_499._492_construct_the_rectangle.Solution()
        .constructRectangle(area);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

  @Test
  public void test2() {
    int area = 17;
    int[] result = {17, 1};
    int[] solution = new easy._400_499._492_construct_the_rectangle.Solution()
        .constructRectangle(area);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

  @Test
  public void test3() {
    int area = 10000000;
    int[] result = {3200, 3125};
    int[] solution = new easy._400_499._492_construct_the_rectangle.Solution()
        .constructRectangle(area);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

  @Test
  public void test4() {
    int area = 2;
    int[] result = {2, 1};
    int[] solution = new easy._400_499._492_construct_the_rectangle.Solution()
        .constructRectangle(area);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }
}
