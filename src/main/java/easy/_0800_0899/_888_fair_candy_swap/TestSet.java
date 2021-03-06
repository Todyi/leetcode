package easy._0800_0899._888_fair_candy_swap;


import common.Comparators;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[] A = {1, 1};
    int[] B = {2, 2};
    int[] result = {1, 2};
    int[] solution = new easy._0800_0899._888_fair_candy_swap.Solution()
        .fairCandySwap(A, B);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

  @Test
  public void test1() {
    int[] A = {1, 2};
    int[] B = {2, 3};
    int[] result = {1, 2};
    int[] solution = new easy._0800_0899._888_fair_candy_swap.Solution()
        .fairCandySwap(A, B);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

  @Test
  public void test2() {
    int[] A = {2};
    int[] B = {1, 3};
    int[] result = {2, 3};
    int[] solution = new easy._0800_0899._888_fair_candy_swap.Solution()
        .fairCandySwap(A, B);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

  @Test
  public void test3() {
    int[] A = {1, 2, 5};
    int[] B = {2, 4};
    int[] result = {5, 4};
    int[] solution = new easy._0800_0899._888_fair_candy_swap.Solution()
        .fairCandySwap(A, B);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

  @Test
  public void test4() {
    int[] A = {83606, 73932, 28518, 35795, 11606, 67609, 49478, 63085, 7200, 96161, 63417, 6127,
        66700, 28678, 76153, 18789, 36972, 86541, 9180, 72708, 21386, 46317, 35118, 51352, 92869,
        16101, 13079, 77149, 95994, 29722, 76297, 63605, 62914, 14108, 70429, 8354, 34336, 741,
        94923, 30270, 90082, 48402, 44277, 82397, 43608, 12342, 25357, 70757, 46885, 46648, 80604,
        11854, 26638, 41267, 44011, 52999, 62797, 6425, 57290, 69328, 93931, 27095, 68497, 26809,
        71749, 73372, 69117, 88671, 32909, 86493, 36028, 84658, 1707, 45588, 66851, 90144, 97125,
        71096, 59810, 98373, 27719, 96842, 97994, 30310, 46745, 6329, 79781, 53954, 40292, 31479,
        31355, 61946, 30626, 16246, 9206, 3469, 86309, 13291, 92960, 88304};
    int[] B = {69083, 61084, 66014, 81869, 38245, 59318, 95547, 7191, 32092, 38819, 45892, 76796,
        89708, 83089, 6257, 37135, 60522, 96061, 58315, 6821, 81472, 32412, 13108, 97328, 54104,
        63748, 43626, 46974, 44068, 30926, 76121, 58627, 52310, 16684, 8741, 4448, 73654, 42484,
        56608, 25517, 45454, 33763, 99475, 50138, 27288, 78106, 12420, 31543, 71525, 17793, 93101,
        37839, 43368, 31083, 49737, 49681, 16400, 88168, 76454, 43321, 60994, 42911, 98224, 25287,
        32441, 34241, 82285, 2038, 82336, 57869, 5912, 58824, 68456, 61419, 38179, 89675, 72957,
        15196, 80247, 97143, 74082, 85282, 51643, 51540, 41307, 60143, 18388, 69164, 83752, 58802,
        52115, 67931, 2807, 47452, 89302, 15730, 2708, 45916, 52722, 56230};
    int[] result = {26809, 50138};
    int[] solution = new easy._0800_0899._888_fair_candy_swap.Solution()
        .fairCandySwap(A, B);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

}
