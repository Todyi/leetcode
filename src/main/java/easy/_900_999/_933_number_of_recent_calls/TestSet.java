package easy._900_999._933_number_of_recent_calls;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    RecentCounter rc = new RecentCounter();
    int[] ping = {1, 100, 3001, 3002};
    int[] output = {1, 2, 3, 3};
    for (int i = 0; i < ping.length; i++) {
      Assert.assertTrue(output[i] == rc.ping(ping[i]));
    }
  }

  @Test
  public void test1() {
    RecentCounter rc = new RecentCounter();
    int[] ping = {1178, 1483, 1563, 4054, 4152};
    int[] output = {1, 2, 3, 4, 5};
    for (int i = 0; i < ping.length; i++) {
      Assert.assertTrue(output[i] == rc.ping(ping[i]));
    }
  }

  @Test
  public void test2() {
    RecentCounter rc = new RecentCounter();
    int[] ping = {642, 1849, 4921, 5936, 5957};
    int[] output = {1, 2, 1, 2, 3};
    for (int i = 0; i < ping.length; i++) {
      Assert.assertTrue(output[i] == rc.ping(ping[i]));
    }
  }

}
