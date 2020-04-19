package common;

/**
 * @program: leetcode
 * @description: ListNode
 * @author: hdy
 * @create: 2019-04-24
 **/

public class ListNode {

  public int val;
  public ListNode next;

  ListNode(int x) {
    val = x;
  }

  public int getVal() {
    return val;
  }

  public void setVal(int val) {
    this.val = val;
  }

  public ListNode getNext() {
    return next;
  }

  public void setNext(ListNode next) {
    this.next = next;
  }
}
