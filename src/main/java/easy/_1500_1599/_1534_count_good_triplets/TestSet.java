package easy._1500_1599._1534_count_good_triplets;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[] arr = {3,0,1,1,9,7};
    int a = 7;
    int b = 2;
    int c = 3;
    Integer result = 4;
    int solution = new easy._1500_1599._1534_count_good_triplets.Solution()
        .countGoodTriplets(arr, a, b, c);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    int[] arr = {1,1,2,2,3};
    int a = 0;
    int b = 0;
    int c = 1;
    Integer result = 0;
    int solution = new easy._1500_1599._1534_count_good_triplets.Solution()
        .countGoodTriplets(arr, a, b, c);
    Assert.assertTrue(result.equals(solution));
  }

}
