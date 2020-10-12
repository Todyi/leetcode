package easy._0700_0799._705_design_hashset;

//Design a HashSet without using any built-in hash table libraries.
//
// To be specific, your design should include these functions:
//
//
// add(value): Insert a value into the HashSet.
// contains(value) : Return whether the value exists in the HashSet or not.
// remove(value): Remove a value in the HashSet.
// If the value does not exist in the HashSet, do nothing.
//
//
//
//Example:
//
//
//MyHashSet hashSet = new MyHashSet();
//hashSet.add(1);        
//hashSet.add(2);        
//hashSet.contains(1);    // returns true
//hashSet.contains(3);    // returns false (not found)
//hashSet.add(2);          
//hashSet.contains(2);    // returns true
//hashSet.remove(2);          
//hashSet.contains(2);    // returns false (already removed)
//
//
//
//Note:
//
//
// All values will be in the range of [0, 1000000].
// The number of operations will be in the range of [1, 10000].
// Please do not use the built-in HashSet library.
//
// Related Topics Hash Table Design


//leetcode submit region begin(Prohibit modification and deletion)
class MyHashSet {

  //  解答成功:
  //  执行耗时:9 ms,击败了100.00% 的Java用户
  //  内存消耗:48.2 MB,击败了31.38% 的Java用户
  boolean[] hashSet = new boolean[1000001];

  /**
   * Initialize your data structure here.
   */
  public MyHashSet() {

  }

  public void add(int key) {
    hashSet[key] = true;
  }

  public void remove(int key) {
    hashSet[key] = false;
  }

  /**
   * Returns true if this set contains the specified element
   */
  public boolean contains(int key) {
    return hashSet[key];
  }
}

/**
 * Your MyHashSet object will be instantiated and called as such: MyHashSet obj = new MyHashSet();
 * obj.add(key); obj.remove(key); boolean param_3 = obj.contains(key);
 */
//leetcode submit region end(Prohibit modification and deletion)

