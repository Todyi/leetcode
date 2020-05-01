package common;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: leetcode
 * @description: ListNode
 * @author: hdy
 * @create: 2019-04-24
 **/

public class ListNode {

  public int val;
  public ListNode next;

  public ListNode(int x) {
    val = x;
  }

  public ListNode(int val, ListNode next) {
    this.val = val;
    this.next = next;
  }

  public static ListNode buildList(Integer[] listArr) {
    if (listArr == null || listArr.length == 0) {
      return null;
    }
    ListNode header = new ListNode(listArr[0]);
    ListNode point = header;
    for (int i = 1; i < listArr.length; i++) {
      ListNode node = new ListNode(listArr[i]);
      point.next = node;
      point = node;
    }
    return header;
  }

  public static ListNode buildListAppend(Integer[] listArr, ListNode appendNode) {
    if (listArr == null || listArr.length == 0) {
      return null;
    }
    ListNode header = new ListNode(listArr[0]);
    ListNode point = header;
    for (int i = 1; i < listArr.length; i++) {
      ListNode node = new ListNode(listArr[i]);
      point.next = node;
      point = node;
      if (i == listArr.length - 1) {
        node.next = appendNode;
      }
    }
    if (listArr.length == 1) {
      header.next = appendNode;
    }
    return header;
  }

  public static ListNode buildList(Integer[] listArr, Integer pos) {
    if (listArr == null || listArr.length == 0) {
      return null;
    }
    ListNode header = new ListNode(listArr[0]);
    ListNode point = header;
    ListNode posNode = pos != null && pos == 0 ? header : null;
    ListNode lastNode = null;
    for (int i = 1; i < listArr.length; i++) {
      ListNode node = new ListNode(listArr[i]);
      point.next = node;
      point = node;
      if (i == listArr.length - 1) {
        lastNode = node;
      }
      if (pos != null && i == pos) {
        posNode = node;
      }
    }
    if (posNode != null) {
      lastNode.next = posNode;
    }

    return header;
  }
}
