package common;

import java.util.ArrayList;
import java.util.List;

/**
 * Copyright (c) 2020 by tody.cc
 *
 * @ClassName: Node
 * @Description:
 * @author: tody
 * @version: V1.0
 * @Date: 2020-05-20 14:51:13
 */


public class Node {

  public int val;
  public List<Node> children;

  public Node() {
  }

  public Node(int _val) {
    val = _val;
  }

  public Node(int _val, List<Node> _children) {
    val = _val;
    children = _children;
  }

  public static Node buildNode(Integer[] listArr) {
    if (listArr == null || listArr.length == 0) {
      return null;
    }
    Node pointer = null;
    List<Node> children = null;

    List<Node> queue = new ArrayList<>();
    Node root = new Node(listArr[0]);
    queue.add(root);
    for (int i = 1; i < listArr.length; i++) {
      if (listArr[i] != null) {
        Node child = new Node(listArr[i]);
        children.add(child);
        queue.add(child);
      } else {
        pointer = queue.get(0);
        children = new ArrayList<>();
        pointer.children = children;
        queue.remove(0);
      }
    }
    return root;
  }
}
