package easy._0700_0799._706_design_hashmap;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    MyHashMap hashMap = new MyHashMap();
    hashMap.put(1, 1);
    hashMap.put(2, 2);
    Assert.assertEquals(hashMap.get(1), 1);   // returns 1
    Assert.assertEquals(hashMap.get(3), -1);  // returns -1 (not found)
    hashMap.put(2, 1);                               // update the existing value
    Assert.assertEquals(hashMap.get(2), 1);   // returns 1
    hashMap.remove(2);                          // remove the mapping for 2
    Assert.assertEquals(hashMap.get(2), -1);  // returns -1 (not found)
  }

}
