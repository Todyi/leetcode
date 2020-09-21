package easy._1100_1199._1103_distribute_candies_to_people;


import common.Comparators;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int candies = 7;
    int num_people = 4;
    int[] result = {1, 2, 3, 1};
    int[] solution = new easy._1100_1199._1103_distribute_candies_to_people.Solution()
        .distributeCandies(candies, num_people);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

  @Test
  public void test1() {
    int candies = 10;
    int num_people = 3;
    int[] result = {5, 2, 3};
    int[] solution = new easy._1100_1199._1103_distribute_candies_to_people.Solution()
        .distributeCandies(candies, num_people);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

  @Test
  public void test2() {
    int candies = 60;
    int num_people = 4;
    int[] result = {15, 18, 15, 12};
    /*
     *  1,2,3,4
     * +5,6,7,8   6,8,10,12
     * +9,10,11,12
     * */

    int[] solution = new easy._1100_1199._1103_distribute_candies_to_people.Solution()
        .distributeCandies(candies, num_people);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }
}
