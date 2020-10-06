package easy._1400_1499._1431_kids_with_the_greatest_number_of_candies;


import common.Comparators;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[] candies = {2, 3, 5, 1, 3};
    int extraCandies = 3;
    Boolean[] result = {true, true, true, false, true};
    List<Boolean> solution = new easy._1400_1499._1431_kids_with_the_greatest_number_of_candies.Solution()
        .kidsWithCandies(candies, extraCandies);
    Boolean[] solutionArr = new Boolean[solution.size()];
    solution.toArray(solutionArr);
    Assert.assertTrue(Comparators.isSame(result, solutionArr));
  }

  @Test
  public void test1() {
    int[] candies = {4, 2, 1, 1, 2};
    int extraCandies = 1;
    Boolean[] result = {true, false, false, false, false};
    List<Boolean> solution = new easy._1400_1499._1431_kids_with_the_greatest_number_of_candies.Solution()
        .kidsWithCandies(candies, extraCandies);
    Boolean[] solutionArr = new Boolean[solution.size()];
    solution.toArray(solutionArr);
    Assert.assertTrue(Comparators.isSame(result, solutionArr));
  }

  @Test
  public void test2() {
    int[] candies = {12, 1, 12};
    int extraCandies = 10;
    Boolean[] result = {true, false, true};
    List<Boolean> solution = new easy._1400_1499._1431_kids_with_the_greatest_number_of_candies.Solution()
        .kidsWithCandies(candies, extraCandies);
    Boolean[] solutionArr = new Boolean[solution.size()];
    solution.toArray(solutionArr);
    Assert.assertTrue(Comparators.isSame(result, solutionArr));
  }

}
