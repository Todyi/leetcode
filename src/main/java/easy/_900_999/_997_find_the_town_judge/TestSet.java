package easy._900_999._997_find_the_town_judge;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int N = 2;
    int[][] trust = {{1, 2}};
    Integer result = 2;
    int solution = new easy._900_999._997_find_the_town_judge.Solution()
        .findJudge(N, trust);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    int N = 3;
    int[][] trust = {{1, 3}, {2, 3}};
    Integer result = 3;
    int solution = new easy._900_999._997_find_the_town_judge.Solution()
        .findJudge(N, trust);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    int N = 3;
    int[][] trust = {{1, 3}, {2, 3}, {3, 1}};
    Integer result = -1;
    int solution = new easy._900_999._997_find_the_town_judge.Solution()
        .findJudge(N, trust);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test3() {
    int N = 3;
    int[][] trust = {{1, 2}, {2, 3}};
    Integer result = -1;
    int solution = new easy._900_999._997_find_the_town_judge.Solution()
        .findJudge(N, trust);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test4() {
    int N = 4;
    int[][] trust = {{1, 3}, {1, 4}, {2, 3}, {2, 4}, {4, 3}};
    Integer result = 3;
    int solution = new easy._900_999._997_find_the_town_judge.Solution()
        .findJudge(N, trust);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test5() {
    int N = 1;
    int[][] trust = {};
    Integer result = 1;
    int solution = new easy._900_999._997_find_the_town_judge.Solution()
        .findJudge(N, trust);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test6() {
    int N = 2;
    int[][] trust = {{1,2},{2,1}};
    Integer result = -1;
    int solution = new easy._900_999._997_find_the_town_judge.Solution()
        .findJudge(N, trust);
    Assert.assertTrue(result.equals(solution));
  }
}
