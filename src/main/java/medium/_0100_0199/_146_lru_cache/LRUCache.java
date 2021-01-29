package medium._0100_0199._146_lru_cache;

//Design a data structure that follows the constraints of a Least Recently Used(LRU) cache.
//
// Implement the LRUCache class:
//
//
// LRUCache(int capacity) Initialize the LRU cache with positive size capacity.
//
// int get(int key) Return the value of the key if the key exists, otherwise return -1.
// void put(int key, int value) Update the value of the key if the key exists.
// Otherwise, add the key-value pair to the cache. If the number of keys exceeds the
// capacity from this operation, evict the least recently used key.
//
//
// Follow up:
//Could you do get and put in O(1) time complexity?
//
//
// Example 1:
//
//
//Input
//["LRUCache", "put", "put", "get", "put", "get", "put", "get", "get", "get"]
//[[2], [1, 1], [2, 2], [1], [3, 3], [2], [4, 4], [1], [3], [4]]
//Output
//[null, null, null, 1, null, -1, null, -1, 3, 4]
//
//Explanation
//LRUCache lRUCache = new LRUCache(2);
//lRUCache.put(1, 1); // cache is {1=1}
//lRUCache.put(2, 2); // cache is {1=1, 2=2}
//lRUCache.get(1);    // return 1
//lRUCache.put(3, 3); // LRU key was 2, evicts key 2, cache is {1=1, 3=3}
//lRUCache.get(2);    // returns -1 (not found)
//lRUCache.put(4, 4); // LRU key was 1, evicts key 1, cache is {4=4, 3=3}
//lRUCache.get(1);    // return -1 (not found)
//lRUCache.get(3);    // return 3
//lRUCache.get(4);    // return 4
//
//
//
// Constraints:
//
//
// 1 <= capacity <= 3000
// 0 <= key <= 3000
// 0 <= value <= 10^4
// At most 3 * 10^4 calls will be made to get and put.
//
// Related Topics Design
// 👍 7627 👎 315


//leetcode submit region begin(Prohibit modification and deletion)
class LRUCache {

  //  Runtime: 10 ms, faster than 99.91% of Java online submissions for LRU Cache.
  //  Memory Usage: 48.3 MB, less than 17.80% of Java online submissions for LRU Cache.
  class Node {

    int key;
    int val;
    Node pre;
    Node next;

    public Node(int key, int val) {
      this.key = key;
      this.val = val;
    }
  }

  int capacity, count = 0;
  Node[] map = new Node[3001];
  Node head, tail;

  public LRUCache(int capacity) {
    this.capacity = capacity;
  }

  public int get(int key) {
    if (map[key] != null) {
      up(map[key]);
      return map[key].val;
    }
    return -1;
  }

  public void put(int key, int value) {
    if (map[key] == null) {
      map[key] = new Node(key, value);
      if (head == null) {
        head = map[key];
        tail = head;
      } else {
        map[key].next = head;
        head.pre = map[key];
        head = map[key];
      }
      if (capacity < ++count) {
        count--;
        Node tmp = tail;
        tail = tail.pre;
        tail.next = null;
        map[tmp.key] = null;
      }
    } else {
      map[key].val = value;
      up(map[key]);
    }

  }

  private void up(Node p) {
    if (p == head) {
      return;
    }
    Node pre = p.pre, next = p.next;
    if (pre != null) {
      pre.next = next;
    }
    if (next != null) {
      next.pre = pre;
    } else {
      tail = pre;
    }
    head.pre = p;
    p.next = head;
    p.pre = null;
    head = p;
  }
}

/**
 * Your LRUCache object will be instantiated and called as such: LRUCache obj = new
 * LRUCache(capacity); int param_1 = obj.get(key); obj.put(key,value);
 */
//leetcode submit region end(Prohibit modification and deletion)
