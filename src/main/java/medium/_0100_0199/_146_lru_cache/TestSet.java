package medium._0100_0199._146_lru_cache;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    LRUCache lRUCache = new LRUCache(2);
    lRUCache.put(1, 1); // cache is {1=1}
    lRUCache.put(2, 2); // cache is {1=1, 2=2}
    Assert.assertTrue(lRUCache.get(1) == 1);// return 1
    lRUCache.put(3, 3); // LRU key was 2, evicts key 2, cache is {1=1, 3=3}
    Assert.assertTrue(lRUCache.get(2) == -1);// returns -1 (not found)
    lRUCache.put(4, 4); // LRU key was 1, evicts key 1, cache is {4=4, 3=3}
    Assert.assertTrue(lRUCache.get(1) == -1);// return -1 (not found)
    Assert.assertTrue(lRUCache.get(3) == 3);// return 3
    Assert.assertTrue(lRUCache.get(4) == 4);// return 4
  }

  @Test
  public void test1() {
    LRUCache lRUCache = new LRUCache(2);
    lRUCache.put(2, 1);
    lRUCache.put(2, 2);
    Assert.assertTrue(lRUCache.get(2) == 2);
    lRUCache.put(1, 1);
    lRUCache.put(4, 1);
    Assert.assertTrue(lRUCache.get(2) == -1);
  }

  @Test
  public void test2() {
    LRUCache lRUCache = new LRUCache(2);
    lRUCache.put(2, 1);
    lRUCache.put(1, 1);
    lRUCache.put(2, 3);
    lRUCache.put(4, 1);
    Assert.assertTrue(lRUCache.get(1) == -1);
    Assert.assertTrue(lRUCache.get(2) == 3);
  }

  @Test
  public void test3() {
    LRUCache lRUCache = new LRUCache(2);
    Assert.assertTrue(lRUCache.get(2) == -1);
    lRUCache.put(2, 6);
    Assert.assertTrue(lRUCache.get(1) == -1);
    lRUCache.put(1, 5);
    lRUCache.put(1, 2);
    Assert.assertTrue(lRUCache.get(1) == 2);
    Assert.assertTrue(lRUCache.get(2) == 6);
  }

  @Test
  public void test4() {
    LRUCache lRUCache = new LRUCache(3);
    lRUCache.put(1, 1);
    lRUCache.put(2, 2);
    lRUCache.put(3, 3);
    lRUCache.put(4, 4);
    Assert.assertTrue(lRUCache.get(4) == 4);
    Assert.assertTrue(lRUCache.get(3) == 3);
    Assert.assertTrue(lRUCache.get(2) == 2);
    Assert.assertTrue(lRUCache.get(1) == -1);
    lRUCache.put(5, 5);
    Assert.assertTrue(lRUCache.get(1) == -1);
    Assert.assertTrue(lRUCache.get(2) == 2);
    Assert.assertTrue(lRUCache.get(3) == 3);
    Assert.assertTrue(lRUCache.get(4) == -1);
    Assert.assertTrue(lRUCache.get(5) == 5);
  }

  @Test
  public void test5() {
    LRUCache lRUCache = new LRUCache(4);
    lRUCache.put(1, 1);
    lRUCache.put(2, 2);
    lRUCache.put(3, 3);
    lRUCache.put(3, 3);
    lRUCache.put(3, 3);
    lRUCache.put(3, 3);
    lRUCache.put(4, 4);
    Assert.assertTrue(lRUCache.get(2) == 2);
  }

  @Test
  public void test6() {
    LRUCache lRUCache = new LRUCache(10);
    lRUCache.put(7, 28);
    lRUCache.put(7, 1);
    lRUCache.put(8, 15);
    Assert.assertTrue(lRUCache.get(6) == -1);
    lRUCache.put(10, 27);
    lRUCache.put(8, 10);
    Assert.assertTrue(lRUCache.get(8) == 10);
    lRUCache.put(6, 29);
    lRUCache.put(1, 9);
    Assert.assertTrue(lRUCache.get(6) == 29);
    lRUCache.put(10, 7);
    Assert.assertTrue(lRUCache.get(1) == 9);
    Assert.assertTrue(lRUCache.get(2) == -1);
    Assert.assertTrue(lRUCache.get(13) == -1);
    lRUCache.put(8, 30);
    lRUCache.put(1, 5);
    Assert.assertTrue(lRUCache.get(1) == 5);
    lRUCache.put(13, 2);
    Assert.assertTrue(lRUCache.get(12) == -1);
  }

}
