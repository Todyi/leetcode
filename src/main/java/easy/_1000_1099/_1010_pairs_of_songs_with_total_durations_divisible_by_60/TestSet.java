package easy._1000_1099._1010_pairs_of_songs_with_total_durations_divisible_by_60;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[] time = {30, 20, 150, 100, 40};
    Integer result = 3;
    int solution = new easy._1000_1099._1010_pairs_of_songs_with_total_durations_divisible_by_60.Solution()
        .numPairsDivisibleBy60(time);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    int[] time = {60, 60, 60};
    Integer result = 3;
    int solution = new easy._1000_1099._1010_pairs_of_songs_with_total_durations_divisible_by_60.Solution()
        .numPairsDivisibleBy60(time);
    Assert.assertTrue(result.equals(solution));
  }

}
