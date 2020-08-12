package easy._800_899._821_shortest_distance_to_a_character;


import common.Comparators;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    String S = "loveleetcode";
    char C = 'e';
    int[] result = {3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0};
    int[] solution = new easy._800_899._821_shortest_distance_to_a_character.Solution()
        .shortestToChar(S, C);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

}
