package easy._0700_0799._705_design_hashset;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    MyHashSet hashSet = new MyHashSet();
    hashSet.add(1);
    hashSet.add(2);
    Assert.assertTrue(hashSet.contains(1) == true);// returns true
    Assert.assertTrue(hashSet.contains(3) == false);// returns false (not found)
    hashSet.add(2);
    Assert.assertTrue(hashSet.contains(2) == true);// returns true
    hashSet.remove(2); 
    hashSet.contains(2);
    Assert.assertTrue(hashSet.contains(2) == false);// returns false (already removed)
  }

}
