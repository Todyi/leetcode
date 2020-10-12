package easy._0600_0699._605_can_place_flowers;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[] flowerbed = {1,0,0,0,1};
    int n = 1;
    Boolean result = true;
    boolean solution = new easy._0600_0699._605_can_place_flowers.Solution()
        .canPlaceFlowers(flowerbed, n);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    int[] flowerbed = {1,0,0,0,1};
    int n = 2;
    Boolean result = false;
    boolean solution = new easy._0600_0699._605_can_place_flowers.Solution()
        .canPlaceFlowers(flowerbed, n);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    int[] flowerbed = {0,0,1,0,1};
    int n = 1;
    Boolean result = true;
    boolean solution = new easy._0600_0699._605_can_place_flowers.Solution()
        .canPlaceFlowers(flowerbed, n);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test3() {
    int[] flowerbed = {0};
    int n = 1;
    Boolean result = true;
    boolean solution = new easy._0600_0699._605_can_place_flowers.Solution()
        .canPlaceFlowers(flowerbed, n);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test4() {
    int[] flowerbed = {1,0,0,0,1,0,0};
    int n = 2;
    Boolean result = true;
    boolean solution = new easy._0600_0699._605_can_place_flowers.Solution()
        .canPlaceFlowers(flowerbed, n);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test5() {
    int[] flowerbed = {0,0,1,0,0};
    int n = 1;
    Boolean result = true;
    boolean solution = new easy._0600_0699._605_can_place_flowers.Solution()
        .canPlaceFlowers(flowerbed, n);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test6() {
    int[] flowerbed = {1,0,0,1,0};
    int n = 1;
    Boolean result = false;
    boolean solution = new easy._0600_0699._605_can_place_flowers.Solution()
        .canPlaceFlowers(flowerbed, n);
    Assert.assertTrue(result.equals(solution));
  }

}
